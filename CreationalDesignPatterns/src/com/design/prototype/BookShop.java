package com.design.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

//cloneable interface is a marker interface

public class BookShop implements Cloneable{

	private String shopName;
	
	List<Book> books = new ArrayList<>();
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	//suppose this is loading data from database and setting inside bookshop ...books
	
	public void loadData() {
		for(int i =1;i<=10;i++) {
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book "+i);
			getBooks().add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	
	//to acheive the cloning we have to ovverride the clone method
	//this is for shallow cloning
/*	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
*/	
	//this is for deep cloning
	
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		
		//for this second object we are not fetching the data from the database just we are fetching the data from above obejct and setting inside it
		
		BookShop shop = new BookShop();
		
		for(Book b:this.getBooks()) {
			shop.getBooks().add(b);
		}
		
		return shop;
	}
	
}
