/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import pos.mvc.db.DBconnection;
import pos.mvc.model.ItemModel;

/**
 *
 * @author Thisura
 */
public class ItemController {

    public String saveItem2IC(ItemModel itemModel) throws SQLException {
        Connection connection = DBconnection.getInstance().getConnection();

        String query = "INSERT INTO Item VALUES(?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, itemModel.getItemCode());
        preparedStatement.setString(2, itemModel.getItemDescription());
        preparedStatement.setString(3, itemModel.getItemPackSize());
        preparedStatement.setDouble(4, itemModel.getItemUnitPrice());
        preparedStatement.setInt(5, itemModel.getItemQtyOnHand());

        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public ArrayList<ItemModel> getAllItems2IC() throws SQLException {
        Connection connection = DBconnection.getInstance().getConnection();

        String query = "SELECT * FROM Item";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<ItemModel> itemModels = new ArrayList<>();

        while (resultSet.next()) {
            ItemModel im = new ItemModel(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getDouble(5));
            itemModels.add(im);
        }

        return itemModels;

    }

    public ItemModel searchItems2IC(String ItemID) throws SQLException {
        Connection connection = DBconnection.getInstance().getConnection();

        String query = "SELECT * FROM Item WHERE ItemCode = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, ItemID);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            ItemModel itemModel = new ItemModel(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getDouble(5));
            return itemModel;
        }

        return null;
    }

    public String updateItems2IC(ItemModel itemModel) throws SQLException {

        Connection connection = DBconnection.getInstance().getConnection();

        String query = "UPDATE Item SET Description=?, PackSize=?, UnitPrice=?, QtyOnHand =? WHERE ItemCode = ?  ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, itemModel.getItemDescription());
        preparedStatement.setString(2, itemModel.getItemPackSize());
        preparedStatement.setString(3, Double.toString(itemModel.getItemUnitPrice()));
        preparedStatement.setString(4, Integer.toString(itemModel.getItemQtyOnHand()));
        preparedStatement.setString(5, itemModel.getItemCode());

        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }

    }

    public String deleteItem(String ItemCode) throws SQLException {

        Connection connection = DBconnection.getInstance().getConnection();

        String query = "DELETE FROM Item WHERE ItemCode = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, ItemCode);

        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }

    }

}
