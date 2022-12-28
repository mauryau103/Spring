package com.design.prototype;

public class Demo {
	
public static void main(String[] args) throws CloneNotSupportedException {
	
	BookShop bs = new BookShop();
	
	bs.setShopName("Nova");
	
	bs.loadData();
//	bs.getBooks().remove(2); //in shallow cloning it will effect to both object
	System.out.println(bs);
	
	/*
	
	BookShop bs1 = new BookShop();
//	System.out.println(bs1); //we will get an empty bookshop..because there is no books in store
	
	bs1.setShopName("A1"); //so here we have diffrent shop but steal there is no books in that shop
	bs1.loadData(); //no we have again go to database and load the data means added the books again -->this will take some time 
	System.out.println(bs1);
	
	//now what if we can just copy the existing book into our new bookshop -->so we can do it by using clone() method
	 * 
	 * 
	 * */
	 
	//now bs1 will ask to bs --> can you provide me your data
	
	//clone()--> which can copy the data and create a new object from the old object. inside object class and it is protected so for using that we have to implement clonable
	//we have two types of cloning in java...
	//1.shallow cloning -->(By Default) -->if we delete some data from first object then it effect on second object too.
				//there is only one object and two references...
	//2.deep cloning --> // two object will be created 1.for iterating 2. for changing the value -->A deep copy is a copy of all elements of the original object. Changes made to the original object will not be reflected in the copy.
	//after this see BookShop class for reference reading 
	
	//clone method will give you object type --> covert it to BookShop
	//shallow cloning
	BookShop bs1 = (BookShop)bs.clone();
	bs1.setShopName("Krishna");
	//now same books will be stored in this store too.
	System.out.println(bs1);
	
	
	//deep cloning --> it does not need to convert the object
	BookShop bs2 = bs.clone(); //this bs is inside clone method
	bs.getBooks().remove(2);
	bs1.setShopName("Rama");
	System.out.println(bs2);
	
}
}
