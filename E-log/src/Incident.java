
public class Incident extends Report {
	private int degree;
	private String details;
	

	public Incident(Location l, Person p, Suspect s, String details) {
		super(l, p, s);
		this.details=details;
		// TODO Auto-generated constructor stub
	}

	public Incident(Location l, Person rep, String details) {
		super(l, rep);
		this.details=details;
		// TODO Auto-generated constructor stub
	}
	
	public void setDegree(int d) {
		this.degree=d;
	}
	
	public void changeDetails(String details) {
		this.details=details;
	}
	
	public String getDetails() {
		return this.details;
	}
}
