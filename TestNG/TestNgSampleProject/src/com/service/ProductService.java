package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import com.bean.Product;

public class ProductService {
	List<Product> listOfProduct;
	public ProductService() {
		// listOfProduct=Arrays.asList(new Product(1,"TV",12000),new Product(2,"Computer",30000),new Product(3,"Laptop",40000));
		listOfProduct=new ArrayList<>();
		listOfProduct.add(new Product(1,"TV",12000));
		listOfProduct.add(new Product(2,"Laptop",13000));
		listOfProduct.add(new Product(3,"Computer",40000));
	}
	public String storeProduct(Product pp) {
//		int flag=0;
//		ListIterator<Product>li =listOfProduct.listIterator();
//		while(li.hasNext()) {
//			Product p=li.next();
//			if(p.getPid()==p.getPid()) {
//				flag=1;
//				break;
//			}
//		}
//		if(flag==0) {
//			storeProduct(pp);
//			return "Record stored successfully";
//		}else {
//			return "Record id must be unique";
//		}
		boolean bb=listOfProduct.stream().filter(p->p.getPid()==pp.getPid()).findAny().isPresent();
		if(bb) {
			return "product id must be unique";
		}else {
			return "Product added successfully";
			
		}
	}
	public Product findProduct(int pid) {
		Product product =listOfProduct.stream().filter(p->p.getPid()==pid).findAny().get();
		return product;
	}

}
