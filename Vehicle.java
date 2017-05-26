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
public class Vehicle {
    //Three private variables
    private String vehicleType;	//vehicle type
    private String vehicleName;  //vehicle name
    private String companyName; //company name
    //Adding default constructor
    public Vehicle() {
        super();
    }
        
    //adding parameter Constructor as a parameter of vehicleType, vehicleName, Companyname
    public Vehicle(String vehicleType, String vehicleName,String companyName) {
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
                this.companyName= companyName;
	}
  //the below methods are accessor methods, mutator methods
	public String getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}
	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
        // gets properties of vehicle
public void retrieve() {
		System.out.println(this.getVehicleType() + " " + this.getVehicleName() + "  " + 
				this.getCompanyName()+" ");
}
}

