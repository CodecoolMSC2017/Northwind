package com.codecool.web.servlet;

import com.codecool.web.service.HeadersService;
import com.codecool.web.service.ListingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/index")
public class IndexServlet extends AbstractServlet {

    // https://www.postgresql.org/docs/current/static/errcodes-appendix.html
    private static final String SQL_ERROR_CODE_UNIQUE_VIOLATION = "23505";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (Connection connection = getConnection(req.getServletContext())) {
            String id = req.getParameter("id");

            ListingService lister = new ListingService(connection);
            HeadersService head = new HeadersService();

            List<String> headers = head.getHeaders(id);
            List<List> results = lister.runQuery(id);

            req.setAttribute("headers", headers);
            req.setAttribute("results", results);
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
        req.getRequestDispatcher("results.jsp").forward(req, resp);
    }

}
