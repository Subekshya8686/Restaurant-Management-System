/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class DrinksModel {
    String ItemNo, ItemName,Quantity, Price;
    
    public DrinksModel(String itemNo,String itemName, String quantity,String price){
        this.ItemNo = itemNo;
        this.ItemName = itemName;
        this.Quantity = quantity;
        this.Price = price;
    }
    
    public String getItemNo() {
        return ItemNo;
    }

    public void setItemNo(String itemNo) {
        this.ItemNo = itemNo;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        this.Quantity = quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice (String price) {
        this.Price = price;
    }    
}

 
