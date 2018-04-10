import java.text.DecimalFormat;//imports java decimal format api.

public class Member { //body of the public class member.
	private int memberId; //declares the private integer memberId.
	private String memberName; //declares private string memberName.
	private String memberAddress; //declares private string memberAddress.
	private double height; //declares private double height.
	private double startingWeight; //declares private double staringWeight.
	private String gender; //declares private string gender.
	
	//constructor
	Member(int memberId, String memberName, String memberAddress,double height, double startingWeight, String gender){//constructor that allows values to inputed 
	
		//id parameters
		if (memberId<100001){//checks if ID is less than 100001
            memberId=100000;//if it is, it is then set to a default of 100000
            this.memberId = memberId;
            System.out.println("please enter a larger number that exceeds 100001");//tells the user that it must be larger.
         }
          if (memberId>999999){//checks if the number entered is less than 999999
            memberId=100000;//if it is, it is then set to the default 100000
            this.memberId = memberId;
            System.out.println("please enter a smaller number that is below 999999");//tells the user it must be smaller.
            }
          else if((memberId>100000) && (memberId<999999)) {//checks that the input is between the two numbers
            this.memberId = memberId;//if so that input is set to the id variable
            System.out.println("This ID is eligible.");//tells the user its eligible
            }
          
          //member name
          if(memberName.length()>30){//checks if the name is larger than 30
 			 memberName = memberName.substring(0,30) + "...";//if it is then a substring that only has the first 30 characters is made 
 		      } else{
 			    if(memberName.length()<30) { //checks if the string member name is less than 30
 		        memberName="" + memberName ;//if it is less than 30 member name is member name.
 		            }
 	                  this.memberName = memberName;//saves the string to the variable.
 		                }
          
	    //member height parameters
	     if (height<1.00){//checks if the height is less than 1
	            System.out.println("Please enter a larger height that is above one meter"); //tells the user that the height must be larger than a meter 
	         }
	         if (height>3.00){//checks if the height is larger than three meters
	            System.out.println("Please enter a smaller value that is below three meters");//tells the user that the height must be larger than three meters
	         }
	         else {
	        	 System.out.println("That is a valid height");//prints out the height is valid to the user
	        	 this.height = height;//saves the height to the height variable
	         }
	    //member weight parameters
	     if (startingWeight<25.00){//checks if staring weight is less than 25kg
	            System.out.println("Please enter a larger weight that is above 25kg"); //prints to enter a larger weight
	         }
	         else if (startingWeight>250.00){//checks if the weight is above 250kg
	            System.out.println("Please enter a smaller weight that is below 250kg");// prints to enter an smaller weight
	         }
	         else {
	                this.startingWeight = startingWeight;//if it doesn't meet the if statements criteria it will be saved to  the variable
	              }
	
	   //gender validation
	 	if (gender == "M"||gender == "F") {//checks if the input is a capital m or f
		
		 this.gender = gender;//if so the gender is saved to gender
	 	}
	 	else {
	 		this.gender = "Unspecified";//if it doesn't meet the criteria its unspecified
	 	}
	 	
	 	this.memberAddress = memberAddress;//sets the member address
	}
	         
	//getters
	public double getHeight(){//gets the height variable from the constructor
		return height;//returns the height variable
	}
	
	public int getMemberId(){//gets the id variable from the constructor
		return memberId;//returns the member id variable
	}
	
	public String getMemberAddress() {//gets the member address variable from the constructor
		return memberAddress;//returns the member member address variable
	}
	
	public String getMemberGender() {//gets the member gender variable 
		return gender;//returns the gender variable
	}
	
	public String getMemberName()//gets the member name variable 
	{
		return memberName;//returns the memberName variable
	}
	
	public double getStartingWeight()//gets the startingWeight variable
	{
		return startingWeight;//returns the startingWeight variable
	}
	

	//setters
	public void setGender(String gender)//takes in the gender string
	{
		try {
		//gender validation
	 	if (gender == "M"||gender == "F") {//checks if the input is a capital m or f
		
		 this.gender = gender;//if so the gender is saved to gender
	 	}
	 	else {
	 		this.gender = "Unspecified";//if it doesn't meet the criteria its unspecified
	 	}
		}
		catch(Exception e){
			System.out.println("Error setting gender: " + e);
			       }
	}
	
	public void setHeight(double height)
	{
		try {
		 if (height<1.00){//checks if the height is less than 1
	            System.out.println("Please enter a larger height that is above one meter"); //tells the user that the height must be larger than a meter 
	         }
	         if (height>3.00){//checks if the height is larger than three meters
	            System.out.println("Please enter a smaller value that is below three meters");//tells the user that the height must be larger than three meters
	         }
	         else {
	        	 System.out.println("That is a valid height");//prints out the height is valid to the user
	        	 this.height = height;
	         }
		}
		catch(Exception e){
			System.out.println("Error setting height: " + e);
			       }
	}
	
	public void setMemberAddress(String memberAddress)//creates method that takes in a string that writes to the private member address variable
	{
	 this.memberAddress = memberAddress;//the input writes to the private variable
	}
	
	public void setMemberName(String memberName)//creates the method setMemberName that takes in the member name string
	{
		try {
		 if(memberName.length()>30){//checks if the memberName string is more than 30
			 memberName = memberName.substring(0,30) + "...";//if it is it will save a substring of the first 30 characters
		 } else{
		 memberName="" + memberName ;//if the name entered is less than 30 its saved to member name
	      this.memberName = memberName;	//sets the member name
	}
		}
		catch(Exception e){
			System.out.println("Error setting name: " + e);
			       }
	}
	public void setMemberId(int memberId)//creates the method member id that takes in the integer memberId.
	{
		try {
		if (memberId<100001){//checks if memberId is less than 100001
            memberId=100000;//if so then it is set to a default of 100000
            System.out.println("please enter a larger number that exceeds 100001");//prints out a warning to enter a larger number
         }
          if (memberId>999999){//checks if the memberId is less than 999999
            memberId=100000;//if it is, it sets the variable to 100000
            System.out.println("please enter a smaller number that is below 999999");//warns the user to enter a lower number
            }
          else if((memberId>100000) && (memberId<999999)) {//if it doesn't meet the first two criteria then the varible is checked if its between the two
            this.memberId = memberId;//the memberId is set to the one entered
            System.out.println("This ID is eligible.");//the user is told that the Id is valid
            }
		}
		catch(Exception e){
			System.out.println("Error setting idt: " + e);
			       }
		
	}
	
	public void setStartingWeight(double startingWeight)//takes in a double that changes the value of statingWeight
	{
		try {
	    if (startingWeight<25.00){//checks if startingWeight is less than 25.00
	         System.out.println("Please enter a larger weight that is above 25kg"); //tells the user to enter a larger weight
	         }
	       else if (startingWeight>250.00){//checks if the weight is more the 250.00
	            System.out.println("Please enter a smaller weight that is below 250kg");//tells the user to enter a larger weight
	          }
	       else {
	                this.startingWeight = startingWeight;//sets the starting weight as the one entered
	              }
		}
		catch(Exception e){
			System.out.println("Error setting weight: " + e);
			       }
	}
	
	
	public double calculateBMI()//creates method calculate BMI that returns a double
	{
		try{
		return (startingWeight/Math.pow(height, 2));//returns starting weight divides by height squared
	    }
		catch(Exception e){
			System.out.println("Error calculating BMI: " + e);
			return 0.0;
			       }		
	}
	
	
	public double convertHeightMetersToInches()//creates method convert height meters to inches witch returns a double
	{
		try {
		double heightInInches;//creates variable heightInInches
		heightInInches = height *= 39.37;//heightInInches is equal to height multiplied by 39.37
		new DecimalFormat("#.##").format(heightInInches);//uses decimal format api to format to decimal places
		return heightInInches;//returns the height in inches
	}
		catch(Exception e){
			System.out.println("Error converting height to meters: " + e);
			return 0.0;
			       }
	}
	
	public double convertWeightKGtoPounds()//method that converts kg to pounds returning a double
	{
		try {
		double startingWeightPounds;//declares the variable 
	    startingWeightPounds = startingWeight /= 00.45;//the pounds weight is the staringWeight divided by 00.45
	    new DecimalFormat("#.##").format(startingWeightPounds);//decimal formated to two places
	    return  startingWeightPounds;//returns the starting weight in pounds
	}
		catch(Exception e){
			System.out.println("Error coverting weight to pounds: " + e);
			return 0.0;
			       }
	}
	public String determineBMICategory()//method that determines the bmi category outputting a string
	{
		try {
		if (calculateBMI() < 15)//checks if the bmi is less than 15
		{
			 return ("VERY SEVERELY UNDERWEIGHT");//prints out a string to the console
		}
		if (15 < calculateBMI() && calculateBMI() < 15.99)//checks if the bmi is less than 15.99 and more than 15
		{
			return ("SEVERELY UNDERWEIGHT");//prints out a string to the console
		}
		if (16 < calculateBMI() && calculateBMI() < 18.49)//checks if the bmi is more than 16 and less than 18.49
		{
			return ("UNDERWEIGHT");//prints out a string to the console
		}
		if (25 < calculateBMI() && calculateBMI() < 29.99)//checks if the bmi is more than 25 and less than 29.99
		{
			return ("OVERWEIGHT");//prints out a string to the console
		}
		if (30 < calculateBMI() && calculateBMI() < 34.99)//checks if the bmi is more than 30 and less than 34.99
		{
			return ("MODERATELY OBESE");//prints out a string to the console
		}
		if (35 < calculateBMI() && calculateBMI() < 39.99)//checks if bmi is more than 35 and less than 39.99
		{
			return ("SEVERELY OBESE");//prints out a string to the console
		}
		if (calculateBMI() > 40)//checks if bmi is more than 40
		{
		    return ("VERY SEVERELY OBESE");//prints out a string to the console
		}
		else
		{
			return ("NORMAL");//prints out a string to the console
		}
		}
		catch(Exception e){
			System.out.println("Error getting BMI: " + e);
			return "placeholder";
			       }	
	}
	
	public boolean isIdealBodyWeight() {//method that returns a boolean for ideal body weight
		boolean target;//declares boolean target
		try {
		switch(gender) {//declares switch statement based on gender variable
		    case"male"://the sum done to male
			double idealweight = (50+2.3)*(convertHeightMetersToInches()-60);//declares double called idealweight which is 50+2.3 multiplied by convert meters to inches -60
			if (startingWeight==idealweight) {//checks if the weight is equal to the ideal
				target=true;//returns they are ideal
				     break;//ends case
			}else {
				target=false;//returns they are not ideal
				      break;//ends case
			}
		    case "female"://case for sum for females
			idealweight = (45.5+2.3)*(convertHeightMetersToInches()-60);//idealweight is equal to 45+2.3 multiplied by convert height meters to inches -60
			if (startingWeight== idealweight) {//if they weight is idealweight
				target=true;//return true
				     break;//end case
			}else {
				target=false;//return not ideal
				      break;//end case
			}
		    default://automatic default if there isn't a gender
			idealweight = (45.5+2.3)*(convertHeightMetersToInches()-60);//idealweight is equal to 45+2.3 multiplied by convert height meters to inches -60
			if (startingWeight==idealweight) {//if the weight is ideal
				target=true;//return true
				     break;//end case
			}else {
				target=false;//return not ideal
				      break;//end case
			}
		    }	
		    return target;//returns the ideal variable
	    }
		catch(Exception e){
			System.out.println("Error getting ideal weight: " + e);
			return false;
	       }
	}
	public String toString()//toString method that makes multiple varibles into a string
    {
    	return " Member Id: " + memberId + " " + "Name: " + memberName + " " + "Address: " + memberAddress + " " + "Height: " + height + " " + "Stating Weight: " + startingWeight + " " +"BMI:"+calculateBMI()+" ("+determineBMICategory()+")";
    }  //returns a list of member details
	          
	              
	          } 
	
	
				
	

