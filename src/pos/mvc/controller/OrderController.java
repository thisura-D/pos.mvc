/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.mvc.db.DBconnection;
import pos.mvc.model.CustomerModel;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;

/**
 *
 * @author Thisura
 */
public class OrderController {

    public String placeOrder2OC(ArrayList<OrderDetailModel> orderDetailModels, OrderModel orderModel) throws SQLException {
        Connection connection = DBconnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            String OrderQuery = "INSERT INTO orders VALUES (?,?,?)";
            PreparedStatement ordersStatement = connection.prepareStatement(OrderQuery);
            ordersStatement.setString(1, orderModel.getOrderID());
            ordersStatement.setString(2, orderModel.getOrderDate());
            ordersStatement.setString(3, orderModel.getCustID());

            if (ordersStatement.executeUpdate() > 0) {

                boolean isOrderDetailSaved = true;
                for (OrderDetailModel odm : orderDetailModels) {
                    String OrderDetailQuery = "INSERT INTO orderdetail VALUES (?,?,?,?)";

                    PreparedStatement orderDetailStatement = connection.prepareCall(OrderDetailQuery);
                    orderDetailStatement.setString(1, orderModel.getOrderID());
                    orderDetailStatement.setString(2, odm.getItemCode());
                    orderDetailStatement.setString(3, Integer.toString(odm.getOrderQty()));
                    orderDetailStatement.setString(4, Double.toString(odm.getDiscount()));

                    if (!(orderDetailStatement.executeUpdate() > 0)) {

                        isOrderDetailSaved = false;

                    }
                }

                if (isOrderDetailSaved) {

                    boolean isItemUpdated = true;

                    for (OrderDetailModel odm : orderDetailModels) {
                        String itemUpdateQuery = "UPDATE Item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                        PreparedStatement itemQtyQuery = connection.prepareStatement(itemUpdateQuery);
                        itemQtyQuery.setInt(1, odm.getOrderQty());
                        itemQtyQuery.setString(2, odm.getItemCode());

                        if (!(itemQtyQuery.executeUpdate() > 0)) {
                            isItemUpdated = false;
                        }

                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Success";
                    }else{
                        connection.rollback();
                        return "Order was not Saved";
                    }

                } else {
                    connection.rollback();
                    return "Order was not Saved";
                }

            } else {
                connection.rollback();
                return "Order was not Saved";
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }finally{
            connection.setAutoCommit(true);
        }

    }

}
