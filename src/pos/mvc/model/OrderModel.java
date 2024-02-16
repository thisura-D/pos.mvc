/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Thisura
 */
public class OrderModel {

    private String OrderID;
    private String OrderDate;
    private String CustID;

    @Override
    public String toString() {
        return "OrderModel{" + "OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", CustID=" + CustID + '}';
    }

    public OrderModel() {
    }

    public OrderModel(String OrderID, String OrderDate, String CustID) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.CustID = CustID;
    }

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the OrderDate
     */
    public String getOrderDate() {
        return OrderDate;
    }

    /**
     * @param OrderDate the OrderDate to set
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

}
