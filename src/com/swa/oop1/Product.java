package com.swa.oop1;

public class Product {
	private String productID;
    private String productName;
    Product(String pid, String p_name){
      productID = pid;
      productName = p_name;
    }
    public String getDetail(){
      return "Product ID : "+productID+" and Product Name : "+productName;
    }
}
