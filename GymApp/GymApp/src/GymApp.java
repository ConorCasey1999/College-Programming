
import java.util.Scanner;//imports scanner


public class GymApp {//makes constructor gymApp

	private Scanner input;	//makes private scanner input
	private Gym gym;//carries over gym variables
	private String gymName;//declares gymName
	private String managerName;//declares managerName
	private String phoneNo;//declares String phoneNo
	
	public GymApp(){
		
		input = new Scanner(System.in);//takes new scanner input    
        System.out.println("Please enter the Gym...");//prints out telling the user to the enter the gym name
        System.out.print("Name: ");
        gymName = input.nextLine();//takes in input
        System.out.print("Manager Name: ");
        managerName = input.nextLine();
        System.out.print("phone number: ");
        phoneNo = input.nextLine();
        gym = new Gym(gymName,managerName,phoneNo);// stores gym details
		
	}
	
	public static void main (String[] args)//creates main method
	{
		GymApp app = new GymApp();//makes gymapp instance runable
		app.run();
	}
	
	//prints options
	private int mainMenu() 
	{
		System.out.println("Gym Menu");
		
		System.out.println("---------");
		System.out.println("  1) Add a member");
		System.out.println("  2) List all members");
		System.out.println("  3) remove a member (by index)");
		System.out.println("  4) Number of members in the gym");
		System.out.println("---------");
		System.out.println("  5) List gym details");
		System.out.println("  6) List members with ideal starting weight");
		System.out.println("  7) List members with a specific BMI category");
		System.out.println("  8) List all members stats imperically and metrically");
		System.out.println("  9) Save");
		System.out.println("  10) Load");
		System.out.println("  0) Exit");
		System.out.println("==>> ");
		
		return input.nextInt();
	}
	
	//stores input and shows users the constraints they must input within
	private void addMember()
	{
		
		System.out.println("id (between 100001 and 999999): ");
		int id = input.nextInt();
		
		System.out.println("Name (max 30 chars): ");
		String name = input.nextLine();
		name = input.nextLine();
		
		System.out.println("Address: ");
		String memberAddress = input.nextLine();
		
		System.out.println("Height (between 1 and 3 metres): ");
		double height = input.nextDouble();
		
		System.out.println("Starting weight (between 35kg and 250kg): ");
		double weight = input.nextDouble();
		
		System.out.println("Gender (M/F): ");
		String gender = input.nextLine();
		gender = input.nextLine();
		
		//adds new member 
		gym.add(new Member(id,name,memberAddress,height,weight,gender));
	}
	
	//switch statement for the menu that lets input be done to and by the methods
	
	private void run()
	{
		int option = mainMenu();
		while (option != 0)
		{
			switch(option)
			{
			case 1:try {
				addMember();
			    }
			     catch(Exception e){
			    System.out.println("Error adding members: " + e);
			    }
				break;
			case 2:try {
				gym.listMembers();
			    }
			    catch(Exception e){
			    System.out.println("Error listing members: " + e);
			    }
				break;
			case 3:try {
				System.out.println("select the member you want to remove: ");
				gym.listMembers();
				int index = input.nextInt();
				gym.remove(index);
			    }
			    catch(Exception e){
			    System.out.println("Error removing memebers: " + e);
			    }
				break;
			case 4:try {
				System.out.println("there are " + gym.numberOfMembers() + " members in the gym");
			    }
			    catch(Exception e){
			    System.out.println("Error printing number of members: " + e);
			    }
				break;
			case 5:try {
				System.out.println(gym.gymtoString());
			    }
			    catch(Exception e){
			    System.out.println("Error printing gym details: " + e);
			    }
				break;
			case 6:try {
				gym.listMembersWithIdealWeight();
			    }
			    catch(Exception e){
			    System.out.println("Error listing ideal weight: " + e);
			    }
				break;
			case 7:try {
				System.out.println("use caps when searching eg.(OBESE): ");
				String category = input.nextLine();
				category = input.nextLine();
				gym.listBySpecificBMICategory(category);
			    }
				catch(Exception e){
				System.out.println("Error searching for BMI: " + e);
				    }
				break;
			case 8:try {
				gym.listMemberDetailsImperialAndMetric();
			    }
				catch(Exception e){
				System.out.println("Error listing details: " + e);
				    }
				break;
			case 9:	try {
				gym.save();
			    }
			    catch(Exception e){
			    System.out.println("Error writing to file: " + e);
			    }
		        break;
	        case 10:	
	            try {
				gym.load();
				}
				catch(Exception e) {
				System.out.println("Error reading from file: " + e);
				}
		        break;
			case 0:
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			
			//Output the menu again
			System.out.println("");
			option = mainMenu();
		}
		//allows the user to exit
		System.out.println("Exiting... bye");
		System.exit(0);
	}
}