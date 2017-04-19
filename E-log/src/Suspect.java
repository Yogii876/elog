
public class Suspect extends Person {
	private String motive, alibi;

	public Suspect(String fName, String lName, char m, int id, String type, String story,String motive, String al) {
		super(fName, lName, m, id, type, story);
		this.motive=motive;
		this.alibi=al;
		// TODO Auto-generated constructor stub
	}

	public Suspect(String fName, String lName, char m, String story) {
		super(fName, lName, m, story);
		// TODO Auto-generated constructor stub
	}
	
	public void setMotive(String m){
		this.motive=m;
	}
	
	public void setAlibi(String al) {
		this.alibi=al;
	}
	
	public String getMotive() {
		return this.motive;
	}
	
	public String getAlibi() {
		return this.alibi;
	}

}
