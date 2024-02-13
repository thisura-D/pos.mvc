/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import pos.mvc.model.CustomerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import pos.mvc.db.DBconnection;

/**
 *
 * @author Thisura
 */
public class CustomerController {

    public String saveCustomer2CC(CustomerModel customerModel) throws SQLException {

        Connection connection = DBconnection.getInstance().getConnection();

        String query = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, customerModel.getCustID());
        preparedStatement.setString(2, customerModel.getTitle());
        preparedStatement.setString(3, customerModel.getName());
        preparedStatement.setString(4, customerModel.getDate());

        preparedStatement.setDouble(5, customerModel.getSalary());
        preparedStatement.setString(6, customerModel.getAddress());
        preparedStatement.setString(7, customerModel.getCity());
        preparedStatement.setString(8, customerModel.getProvince());
        preparedStatement.setString(9, customerModel.getZip());

        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }

    }

    public ArrayList<CustomerModel> getAllCustomers() throws SQLException {
        Connection connection = DBconnection.getInstance().getConnection();

        String query = "SELECT * FROM Customer";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<CustomerModel> customerModels = new ArrayList<>();

        while (resultSet.next()) {

            CustomerModel cm = new CustomerModel(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9));
            customerModels.add(cm);
        }
        return customerModels;
    }
}
