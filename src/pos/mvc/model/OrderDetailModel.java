/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Thisura
 */
public class OrderDetailModel {
    
    private String OrderID;
    private String ItemCode;
    private Integer orderQty;
    private Double discount;

    public OrderDetailModel() {
    }

    public OrderDetailModel(String OrderID, String ItemCode, Integer orderQty, Double discount) {
        this.OrderID = OrderID;
        this.ItemCode = ItemCode;
        this.orderQty = orderQty;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailModel{" + "OrderID=" + getOrderID() + ", ItemCode=" + getItemCode() + ", orderQty=" + getOrderQty() + ", discount=" + getDiscount() + '}';
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
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the orderQty
     */
    public Integer getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    
    
    
    
}
