
public class Location {
	private Region reg;
	private Address addr;
	
	public Location(Region r, Address addr)
	{
		this.reg = r;
		this.addr=addr;
	}
	
	public Region getRegion()
	{
		return this.reg;
	}
	
	public Address getAddress() 
	{
		return this.addr;
	}

}
