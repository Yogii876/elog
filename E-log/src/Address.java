
public class Address {
	private String street, community;
	
	public Address(String comm, String street)
	{
		this.community=comm;
		this.street=street;
	}
	
	public Address(String comm){
		this.community=comm;
	}
	
	public Address(){
		this.community="";
		this.street="";
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public String getCommunity() {
		return this.community;
	}
	
	public void setStreet(String s) {
		this.street=s;
	}
	
	public void setCommunity(String comm) {
		this.community=comm;
	}
	

}
