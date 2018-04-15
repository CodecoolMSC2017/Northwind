package com.codecool.web.service;

import com.codecool.web.model.QueryResult;

import java.util.ArrayList;
import java.util.List;

public class FilterService {
    QueryResult qr = QueryResult.getInstance();

    public List<List> filterResults(int column, String criteria) {
        List<List> filtered = new ArrayList<>();

        for (List<String> row : qr.getResults()) {
            if (row.get(column).equals(criteria)) {
                filtered.add(row);
            }
        }
        return filtered;
    }
}
