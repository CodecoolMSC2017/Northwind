package com.codecool.web.servlet;

import com.codecool.web.service.FilterService;
import com.codecool.web.service.HeadersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/result")
public class ResultServlet extends AbstractServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilterService fserv = new FilterService();
        String criteria = req.getParameter("criteria");
        int column = Integer.parseInt(req.getParameter("column"));
        String task = req.getParameter("id");
        HeadersService head = new HeadersService();

        List<String> headers = head.getHeaders(task);
        List<List> filtered = fserv.filterResults(column, criteria);


        req.setAttribute("headers", headers);
        req.setAttribute("results", filtered);
        req.setAttribute("task", task);

        req.getRequestDispatcher("results.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
