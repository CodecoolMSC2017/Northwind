package com.codecool.web.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class QueryDao extends AbstractDao {

    public QueryDao(Connection connection) {
        super(connection);
    }

    public List<List> execute(String query) throws SQLException {
        List<List> results = new ArrayList<>();
        String sql = query;
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                List<String> temp = new ArrayList<>();
                for (int i = 1;i<=resultSet.getMetaData().getColumnCount();i++) {
                    temp.add(resultSet.getString(i));
                }
                results.add(temp);
            }
        }
        return results;
    }
}