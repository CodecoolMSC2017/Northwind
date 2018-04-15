package com.codecool.web.model;

import java.util.ArrayList;
import java.util.List;

public class QueryResult {
    private List<List> results = new ArrayList<>();

    private static QueryResult ourInstance = new QueryResult();

    public static QueryResult getInstance() {
        return ourInstance;
    }

    private QueryResult() {
    }

    public List<List> getResults() {
        return results;
    }

    public void setResults(List<List> results) {
        this.results = results;
    }
}
