import java.io.FileReader; //group of api imports mainly used for xml 
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class Gym {//declares public class gym
	
	private ArrayList<Member> members;//creates a ArrayList of the member class called members
	
	private String gymName;//declares string gymName
	private String managerName;//declare string managerName
	private String phoneNumber;//declare string phoneNumber
	
	//constructor 1
	public Gym(String gymName, String managerName){//constructor takes in two strings

		try {
		if(gymName.length()>30) {//checks if the gymName is more than 30 characters
			System.out.println("name must be less than 30 characters");//prints out the name must be less then 30 characters
		}
		else
		{
			this.gymName=gymName;//sets the gymName		
}
		setManagerName(managerName);//sets managerName
		members = new ArrayList<Member>();//declares the members array
		}
		catch(Exception e){
			System.out.println("Error validating variables: " + e);
			       }
	}

	//constructor 2
	public Gym(String gymName, String mnagerName, String phoneNumber) {//constructor takes in three strings
		try {
		
		if(gymName.length()>30) {//checks if the string is more than 30 characters
			System.out.println("name must be less than 30 characters");//prints out the name must be less then 30 characters
		}
		else
		{
			this.gymName=gymName;//sets the gymName	
}
		
		this.managerName = managerName;//sets managerName
        members=new ArrayList<Member>();//declares the array list  in the constructor
		
		if ((phoneNumber.matches("[a-zA-Z]+"))) {//checks if the phoneNumber string is a capital or lower case letter
		    System.out.println("Is not number");//if a letter is detected a warning is printed
		      setPhoneNumber(null);//string is set to invalid
		} else {
		    System.out.println("Is a number");//if none are detected the number goes through
		    this.phoneNumber=phoneNumber;
		}
		}
		catch(Exception e){
		System.out.println("Error validating variables: " + e);
		       }
	}
	
	//getters
	
	public void add(Member obj)//gets the object member from the members arrayList
	{
		members.add(obj);//adds object from members
	}
	public String getGymName() {
		return gymName;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public String getPoneNumber() {
		return phoneNumber;
	}
	
	//setters
	public void setGymName(String gymName)
	{
		try {
	  this.gymName = gymName;
		
		 if(gymName.length()>30){//if gym name is more than 30
	     gymName =  gymName.substring(0,30) + "...";//gets substring of the first thirty characters
		 } else{
		 gymName="Name entered is  " + gymName ;//prints the name
		 }
	     this.gymName = gymName;//saves to variable
	}
		catch(Exception e){
		    System.out.println("Error setting gym name: " + e);
		    }
	}
	
	public void setManagerName(String managerName)
	{
		try{
	  this.managerName = managerName;
	}
      catch(Exception e){
	  System.out.println("Error setting manager name: " + e);
		   }
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		try {
		if ((phoneNumber.matches("[a-zA-Z]+"))) {//checks if the phoneNumber string is a capital or lower case letter
		    System.out.println("Is not number");//if a letter is detected a warning is printed
		      setPhoneNumber("invalid");//string is set to invalid
		} else {
		    System.out.println("Is a number");//if none are detected the number goes through
		    this.phoneNumber=phoneNumber;
		}
		}
		catch(Exception e){
		    System.out.println("Error setting phonenumber: " + e);
		    }
	}
	
	public String gymtoString()
	{
    	return " Gym name: " + gymName + "," + " Manager: " + managerName + "," + " Phone Number: " + phoneNumber+".";
    }
	
    public String listBySpecificBMICategory(String category) {
		try {
		for (int i = 0; i < members.size(); i++)  {//a for loop that goes around the amount of times that there are number of members
		switch(category) {//switch statement for bmi called category
			case "VERY SEVERELY OBESE":// the case for entered bmi category
				System.out.println("the following people are very severely obese");//prints out a string saying whats being printed
				searchFunction("VERY SEVERELY OBESE");//the string the user must enter
				break;//closes the case
			case "SEVERELY OBESE":
				System.out.println("the following people are severly obese");
				searchFunction("SEVERELY OBESE");
				break;
			case "MODERATELY OBESE":
				System.out.println("the following people are moderatly obese");
				searchFunction("MODERATELY OBESE");
				break;
			case "OVERWEIGHT":
				System.out.println("the following people are overweight");
				searchFunction("OVERWEIGHT");
				break;
			case "NORMAL":
				System.out.println("the following people are normal");
				searchFunction("NORMAL");
				break;
			case "UNDERWEIGHT":
				System.out.println("the following people are underweight");
				searchFunction("UNDERWEIGHT");
				break;
			case "SEVERELY UNDERWEIGHT":
				System.out.println("the following people are severly underweight");
				searchFunction("SEVERELY UNDERWEIGHT");
				break;
			case "VERY SEVERELY UNDERWEIGHT":
				System.out.println("the following people are very severly underweight");
				searchFunction("VERY SEVERELY UNDERWEIGHT");
				break;
			case "OBESE":
				System.out.println("the following people are obese");
				searchFunction("OBESE");
				break;
		}
		 
    }
		return "The list of the members with the requested category has been displayed returning to menu";//string thats display when the operation is done
	}  
		catch(Exception e){
	    System.out.println("Error searching BMI: " + e);
	    return "no result";
	    }
    }
	
	public String listMemberDetailsImperialAndMetric()//lists member details in imperial and metric
	{
		try{
		for (Member m : members){//enhanced for loop:sets m to the members arrayList
		     System.out.println(m.getMemberId() + ":       " + m.getStartingWeight() + " (" + m.convertWeightKGtoPounds() + ")     " + m.getHeight() + " meters" + " (" + m.convertHeightMetersToInches() + ").");//string to display the information          
			}
		    return "placeholder";//default placeholder
            }
		catch(Exception e){
		    System.out.println("Error lisitng member weights: " + e);
		    return "placeholder";
		    }
	}

	public String listMembers() {//string that lists members
		try {
		int m = 0;//creates integer m equal to 0
		for (Member i: members) {//enhanced for loop:member count assigned to i
			System.out.println(m+":  "+i.toString());//console prints the details from the i variable 
			m++;//m increases by one every loop thus printing the members from i
		}
		return "list of members";//string telling the user whats happening
	}
		catch(Exception e){
		    System.out.println("Error lisitng members: " + e);
		    return "placeholder";
		    }
	}
	
	public String listMembersWithIdealWeight()//method that lists members who's weight is ideal
	{
		try {
		if(members.size()<=0)//if the member array is at zero
		{ 
			return "there are no members";//returns string saying theres no members
		}
		else {
			int m=0;//creates integer m = 0
			for (Member i: members) {//enhanced for loop: assigns members array to i
				if (i.determineBMICategory()=="NORMAL") {//if any members in the array have a bmi of normal 
					System.out.println(i.getMemberName()+"bodyweight is ideal");//print that those members have a ideal weight
					m++;//increases m by one every loop 
				}
			}
			if(m<=0) {//if m is less than one 
				System.out.println("no one has an ideal body weight");//no one has a ideal weight
			}
			return "placeholder";//default placeholder
		}
	}catch(Exception e){
	    System.out.println("Error listing members with ideal weight: " + e);
	    return "placeholder";
	    }
	}
	
	public void remove(int index)//creates the remove method that takes in a integer called index
	{
		try {
		if (index>members.size())//if the index is higher than the array size 
		{
			System.out.println("there is no member for this index number");//tells the user there's no user to remove
		}
		else {
			members.remove(index);//deletes the index number entered from the corresponding slot on the array
			System.out.println("member deleted");//tells user the member was deleted
		}
	    }
		catch(Exception e){
	    System.out.println("Error removing a member: " + e);
	    }
	}
	
	public int numberOfMembers() {//creates method number of members
		try{
		if(members.size()==0)//if members equal zero
		{
			System.out.println("there are no members ");//says theres no members
			return members.size();//return the array size
		}
		else
		{
			return members.size();//sets the array size
		}
	}catch(Exception e){
	    System.out.println("Error listing number of members: " + e);
	    return 0;
	    }
	}
	
	private void searchFunction(String category)//method for searching bmi
    {
		for(Member m :members)//enhanced for loop:assigns m to members
		try{
			if(m.determineBMICategory()==category)//if the bmi category that is searched matches the category switch statements
			{
				System.out.println(m.getMemberName()+" ");//the corresponding category is printed to the console
			}
			else
			{
				System.out.println("place holder");//default placeholder
			}
		}
	catch(Exception e){
		 System.out.println("Error searching for BMI: " + e);
		    }
		
	    }
	
	
	@SuppressWarnings("unchecked")//warnings are not blocked
	public void load() throws Exception{
		XStream xstream = new XStream(new DomDriver());
		ObjectInputStream is = xstream.createObjectInputStream(new FileReader("Gymapp.xml"));
		members = (ArrayList<Member>) is.readObject();		
		is.close();
	}
	
	public void save() throws Exception{
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("Gymapp.xml"));
        out.writeObject(members);
        out.close();
	}
	
}
