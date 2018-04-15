package com.codecool.web.service;

import com.codecool.web.dao.QueryDao;
import com.codecool.web.model.QueryResult;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public final class ListingService {

    private final Connection connection;


    public ListingService(Connection connection) {
        this.connection = connection;
    }

    public void runQuery(String task) throws SQLException {
        List<List> results;
        String sql = null;
        QueryResult qr = QueryResult.getInstance();

        switch (task) {
            case "task1":
                sql = "select products.productname as Product, suppliers.companyname as Company from products inner join suppliers on products.supplierid=suppliers.supplierid order by 1, 2";
                break;
            case "task2":
                sql = "select companyname as Company, count(*) as NumberOfProducts from suppliers group by companyname order by 2 DESC, 1";
                break;
            case "task3":
                sql = "select companyname as Company, count(products.productname) as NumberOfProducts from suppliers inner join products on suppliers.supplierid = products.supplierid group by companyname having count(products.productname)=5 order by 1";
                break;
            case "task4":
                sql = "select companyname, array_agg(orders.orderid) as orders from customers left join orders on customers.customerid=orders.customerid group by 1 order by 1";
                break;
            case "task5":
                sql = "select suppliers.companyname as Company, a.productname as Product, a.unitprice as Price from suppliers inner join products a on suppliers.supplierid=a.supplierid where not exists (select b.unitprice from products b where a.supplierid=b.supplierid and b.unitprice>a.unitprice) order by 3 DESC, 2, 1";
                break;
        }
            QueryDao queryDao = new QueryDao(connection);
            results = queryDao.execute(sql);

            qr.setResults(results);

    }

}
