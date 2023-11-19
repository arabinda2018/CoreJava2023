package oop_Interface;

public interface USMedical {
	
	//vars are static and final by default:
	int bill_amount = 10;

	// a method with no body -- only method declaration
	// method prototype
	// Abstract Method
	//can not create the object of Interface
	public void physioServices();
	
	public void cardioServices();

	public void neuroServices();
	
	public void emergencyServices();

}

