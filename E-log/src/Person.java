import java.util.ArrayList;

public class Person implements Comparable<Person> {
	private String firstName, lastName, idType;
	private char mInitial;
	private int idNum;
	private ArrayList<String> stories = new ArrayList<String>();
	
	public Person(String fName, String lName, char m, int id, String type, String story)
	{
		this.firstName=fName;
		this.lastName=lName;
		this.mInitial=m;
		this.idNum=id;
		this.idType=type;
		this.stories.add(story);
	}
	
	public Person(String fName, String lName, char m, String story)
	{
		this.firstName=fName;
		this.lastName=lName;
		this.mInitial=m;
		this.stories.add(story);
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public char getInitial() {
		return this.mInitial;
	}
	
	public int getID() {
		return this.idNum;
	}
	
	public String getType() {
		return this.idType;
	}
	
	public void addID(int id, String type) {
		this.idNum=id;
		this.idType=type;
	}
	
	public void addStory(String s) {
		this.stories.add(s);
	}
	
	public String getStory(int index) {
		return stories.get(index);
	}
	
	public int compareTo(Person other){
		int last = this.lastName.compareTo(other.getLastName());
		return last == 0 ? this.firstName.compareTo(other.getFirstName()) : last;
	}
	
}
