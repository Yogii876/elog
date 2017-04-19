
public class Region {
	private int area;
	private String parish;
	
	public Region(int ar, String par)
	{
		this.area = ar;
		this.parish=par;
	}
	
	public int getArea()
	{
		return this.area;
	}
	
	public String getParish()
	{
		return this.parish;
	}
}
