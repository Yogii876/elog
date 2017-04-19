import java.util.ArrayList;

public class Report {
	private Location loc;
	private ArrayList<Person> reporters = new ArrayList<Person>();
	private ArrayList<Suspect> suspects = new ArrayList<Suspect>();
	private Case ca;
	
	public Report(Location l, Person p, Suspect s) {
		this.loc=l;
		this.reporters.add(p);
		this.suspects.add(s);
	}
	
	public Report(Location l, Person rep) {
		this.loc = l;
		this.reporters.add(rep);	
	}
	
	public void addComplainant(Person p) {
		reporters.add(p);
	}
	
	public void modifyLocation(String comm, String str) {
		loc.getAddress().setStreet(str);
		loc.getAddress().setCommunity(comm);
	}
	
	public boolean generateCase() {
		return true;
	}
	
	public Case getCase() {
		return ca;
	}
}
