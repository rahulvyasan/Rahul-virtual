/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 *
 * @author Rahul vedavyasan
 */
public class MyClone {
    //three private variables firstName,lastName and gender
	private String firstName;
	private String lastName;
        private String gender;
	
	//adding defaultConstructor
	public MyClone(){
		super();
	}
	
	//adding parameter Constructor as a parameter of firstName,lastName and gender
	public MyClone(String firstName, String lastName, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
                this.gender=gender;
	}
	
	//the below methods are accessor methods, mutator methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        public String getGender(){
            return gender;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
	
//business logic Method
public void introduction(){
	//greeting Message  Using properties firstName,lastName and gender
	System.out.println("Hello folks this is "+this.getFirstName()+" "+this.getLastName()+"and my gender is"+this.getGender());
}
	
	}

