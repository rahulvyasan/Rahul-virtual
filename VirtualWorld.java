/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;
import java.util.HashMap;

/**
 *
 * @author Rahul vedavyasan
 */
public class VirtualWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyClone myClone = new MyClone();//Calling a default constructor
		//Here you cannot able to access firstName,lastName and gender instance variables as they are private.
		//But you can assign values to those instance variables using the mutator methods.
		myClone.setFirstName("Rahul vedavyasan");
		myClone.setLastName("Singiyala");
                myClone.setGender("Male");
		// introduction method is called
		myClone.introduction();
		//accessing instance variables by using getter methods.
		System.out.println(myClone.getFirstName() + " " + myClone.getLastName()+" "+myClone.getGender());
		System.out.println();
		myClone = new MyClone("Lyla", "Lopez","Female");//Calling a parameterized constructor
		//calling introduction method
		myClone.introduction();
		//we can access instance variables using getter methods.
		System.out.println(myClone.getFirstName() + " " + myClone.getLastName()+" "+myClone.getGender());
		System.out.println();
		//Changing the values of the variables using setter methods
		myClone.setFirstName("Rahul vedavyasan");
		myClone.setLastName("Singiryala");
                myClone.setGender("Male");
		//calling introduction method
		myClone.introduction();
		//Checking  whether new values are been assigned or not by using getter methods
		System.out.println(myClone.getFirstName() + " " + myClone.getLastName()+" "+myClone.getGender());

                ShoutBox shoutBox=new ShoutBox();
		//using ShoutBox class object creating its instance method shoutOutCannedMessage()
		HashMap<Integer, String> messages = new HashMap<>();//Declaration and Initialization of hash map messages for storing messages from user.
		
		System.out.println("Please enter " + shoutBox.numberOfMessages + " messages!");
		for(int i = 0; i < shoutBox.numberOfMessages; i++) {//asking user for number of messages
			System.out.print("Enter message " + (i + 1) + " : ");//prompting for entering a message
			messages.put(i, shoutBox.sc.nextLine());//storing the entered message from user into messages array list
		}
		System.out.println();//Testing shoutOutCannedMessage method
		String comment = shoutBox.shoutOutCannedMessage(messages);//Storing the selected comment in string variable string
		System.out.println("Selected comment : " + comment);//printing the selected comment
		System.out.println();
		//display result with respect to user input 
		
		String message=shoutBox.shoutOutRandomMessage();
		System.out.println(message);
		Vehicle vehicle = new Vehicle();//Default constructor
		//assigning values using  setter methods.
		vehicle.setVehicleType("Muscle");
		vehicle.setVehicleName("Mustang");
		vehicle.setCompanyName("Ford");
		//calling retrieve method
		vehicle.retrieve();
		//we can access instance variables using the getter methods.
		System.out.println(vehicle.getVehicleType() + " car " + vehicle.getVehicleName()
				+ " is manufactured by " + vehicle.getCompanyName());
		System.out.println();
		
		vehicle = new Vehicle("Sport", "Viper", "Dodge");//Parameterized Constructor
		//calling retrieve method
		vehicle.retrieve();
		//we can access the values of those instance variables using the getter methods.
		System.out.println(vehicle.getVehicleType() + " car " + vehicle.getVehicleName()
				+ " is manufactured by " + vehicle.getCompanyName());
		System.out.println();
		//Changing the values of the variables using setter method 
		vehicle.setVehicleType("HMV");
		vehicle.setVehicleName("Hummer");
		vehicle.setCompanyName("GM");
	
		//calling retrieve method
		vehicle.retrieve();
		//Checking to see whether new values are been assigned or not by using getter methods
		System.out.println(vehicle.getVehicleType() + " car " + vehicle.getVehicleName()
				+ " is manufactured by " + vehicle.getCompanyName());
	}
    }
