package com.service;

import com.dao.ProductDao;

public class ProductService {
	ProductDao pd=new ProductDao();
	
	public String getProductInfo() {
		// coding...
		// This method calling dao method 
		// return method 
		return pd.getProducts();
	}
	
	
}
