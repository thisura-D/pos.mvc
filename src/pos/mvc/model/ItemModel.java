/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Thisura
 */
public class ItemModel {

    private String ItemCode;
    private String ItemDescription;
    private String ItemPackSize;
    private int ItemQtyOnHand;
    private double ItemUnitPrice;

    public ItemModel(String ItemCode, String ItemDescription, String ItemPackSize, int ItemQtyOnHand, double ItemUnitPrice) {
        this.ItemCode = ItemCode;
        this.ItemDescription = ItemDescription;
        this.ItemPackSize = ItemPackSize;
        this.ItemQtyOnHand = ItemQtyOnHand;
        this.ItemUnitPrice = ItemUnitPrice;
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
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return ItemDescription;
    }

    /**
     * @param ItemDescription the ItemDescription to set
     */
    public void setItemDescription(String ItemDescription) {
        this.ItemDescription = ItemDescription;
    }

    /**
     * @return the ItemPackSize
     */
    public String getItemPackSize() {
        return ItemPackSize;
    }

    /**
     * @param ItemPackSize the ItemPackSize to set
     */
    public void setItemPackSize(String ItemPackSize) {
        this.ItemPackSize = ItemPackSize;
    }

    /**
     * @return the ItemQtyOnHand
     */
    public int getItemQtyOnHand() {
        return ItemQtyOnHand;
    }

    /**
     * @param ItemQtyOnHand the ItemQtyOnHand to set
     */
    public void setItemQtyOnHand(int ItemQtyOnHand) {
        this.ItemQtyOnHand = ItemQtyOnHand;
    }

    /**
     * @return the ItemUnitPrice
     */
    public double getItemUnitPrice() {
        return ItemUnitPrice;
    }

    /**
     * @param ItemUnitPrice the ItemUnitPrice to set
     */
    public void setItemUnitPrice(double ItemUnitPrice) {
        this.ItemUnitPrice = ItemUnitPrice;
    }

    @Override
    public String toString() {
        return "ItemModel{" + "ItemCode=" + ItemCode + ", ItemDescription=" + ItemDescription + ", ItemPackSize=" + ItemPackSize + ", ItemQtyOnHand=" + ItemQtyOnHand + ", ItemUnitPrice=" + ItemUnitPrice + '}';
    }

    public ItemModel() {
    }

}
