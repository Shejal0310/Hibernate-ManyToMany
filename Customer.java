package Hibernate;

import java.util.List;

public class Customer 
{
	private int custid;
	private String custname, addr;
	private List<Item>itm;
	
	public int getCustid()
	{
		return custid;
	}
	
	public void setCustid(int custid)
	{
		this.custid = custid;
	}
	
	public String getCustname() 
	{
		return custname;
	}
	
	public void setCustname(String custname) 
	{
		this.custname = custname;
	}
	
	public String getAddr()
	{
		return addr;
	}
	
	public void setAddr(String addr) 
	{
		this.addr = addr;
	}
	
	public List<Item> getItm() 
	{
		return itm;
	}
	
	public void setItm(List<Item> itm) 
	{
		this.itm = itm;
	}	
}