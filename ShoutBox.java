/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rahul vedavyasan
 */
public class ShoutBox {
        static Scanner sc = new Scanner(System.in);// Scanner object to take input from user.
    static int numberOfMessages = 5;	//Integer number of messages will store 5
      //ArrayList to store subjects, objects, verbs, adverbs and adjectives.
		ArrayList subjects = null;
                ArrayList objects = null;
                ArrayList verbs = null;
                ArrayList adverbs = null;
                ArrayList adjectives = null;
        public ShoutBox(){
        //Insert data into array lists
        //subjects
        subjects=new ArrayList();
        subjects.add("I");   
        subjects.add("We");
        subjects.add("You");
        subjects.add("They");
        subjects.add("she");
        //verb
        verbs=new ArrayList();
        verbs.add("work");  
        verbs.add("listen");
        verbs.add("play");
        verbs.add("crush");
        verbs.add("beat");
        //adjective
        adjectives=new ArrayList();
        adjectives.add("high");  
        adjectives.add("elated");
        adjectives.add("auspicious");
        adjectives.add("beautiful");
        adjectives.add("gorgeous");
        //object
        objects=new ArrayList();
        objects.add("car");   
        objects.add("table");
        objects.add("fridge");
        objects.add("Bus");
        objects.add("lady");
        //adverb
        adverbs=new ArrayList();
        adverbs.add("slowly");  
        adverbs.add("especially");
        adverbs.add("pleasantly");
        adverbs.add("furiously");

        
	}
	/**
	 * this method is used to print the messages stored in array list and will prompt user to enter message number to select adn returns the selected message
	 * @param messages
	 * @return select message from array list messages
	 */
	public static String shoutOutCannedMessage(HashMap<Integer, String> messages) {
		for(int i = 0; i < messages.size(); i++) {//iterating through hash map of messages
			System.out.println("Message " + (i + 1) + " : " + messages.get(i));//printing each message from hash map messages using key
		}
		int selectedNumber = 0;
		boolean validNumber = false;
		while(!validNumber) {//looping until valid number is entered
			System.out.print("\nEnter number to select a message : ");//prompting for a number
			try {
				selectedNumber = Integer.parseInt(sc.next());//parsing the entered text to integer number
				validNumber = true;
				
                                        if(validNumber && (selectedNumber > numberOfMessages || selectedNumber < 1)) { //If entered a valid number but if the entered number is greater than number of messages 
					validNumber = false;//making valid number as false
				}
			} catch(NumberFormatException e) { // if entered is not a valid number then again prompt for number
				validNumber = false;
			}
		}
		return messages.get(selectedNumber - 1);//returning the message from hash map messages
	}
	
	public String shoutOutRandomMessage(){
	//using RandomNumberGenrator() , we are selecting random value from ArrayList subjects that value assigning to submsg variable
	String sub=this.randomMessage(subjects);
	//using RandomNumberGenrator() , we are selecting random value from ArrayList Verbs that value assigning to vebmsg variable
	String veb=this.randomMessage(verbs);
	//using RandomNumberGenrator() , we are selecting random value from ArrayList Adjective that value assigning to adjmsg variable
	String adj=this.randomMessage(adjectives);
	//using RandomNumberGenrator() , we are selecting random value from ArrayList Adverb that value assigning to advmsg variable
	String adv=this.randomMessage(adverbs);
	//using RandomNumberGenrator() , we are selecting random value from ArrayList Object that value assigning to objmsg variable
	String obj=this.randomMessage(objects);
	
	//return String to form like  Subject - Verb - Adjective - Object - Adverb. 
		return sub+"-"+veb+"-"+ adj+"-"+ obj+"-"+adv;
	}
	
	public static String randomMessage(ArrayList al) {
		//Generating random number using Random class, creating object and calling nextInt(int max) method
		int randomnumber=new Random().nextInt(numberOfMessages);
		//passing index value to arrayList getting String value
		String msg=(String)al.get(randomnumber);
		//returning String message
		return msg;
	}

}

