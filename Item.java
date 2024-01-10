package Hibernate;

import java.util.List;

public class Item 
{
	private int itemid, price;
	private String name;
	private List<Customer>cust;
	
	public int getItemid() 
	{
		return itemid;
	}
	
	public void setItemid(int itemid) 
	{
		this.itemid = itemid;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<Customer> getCust() 
	{
		return cust;
	}
	
	public void setCust(List<Customer> cust)
	{
		this.cust = cust;
	}
}
