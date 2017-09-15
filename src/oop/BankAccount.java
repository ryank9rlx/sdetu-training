package oop;

public class BankAccount {
	// Define variables  another note on variables you can define them locally but they will only be available inside that block of code.
	String accountNumber;
	// static belongs to the class and not the object instance
	// final constant (often static final) can not change its set will give an error if you try to change it.
	private static final String routingNumber = "013546";
	// Instance variable
	private String name;
	private String ssn;
	String accountType;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	double balance = 0;
	
	//Constructor definition: unique methods
	//1. They are used to define / setup/ initialize properties of an object
	//2. Constructors are IMPLICITLY called upon instantiation
	//3. The same name as the class itself
	//4. Constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same method name with different arguments.
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000){
			Msg = "ERROR; minimum deposit must be at least $1000";
		}
		else {
			Msg = "Thank You for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
	// Getters / Setters
	// Allow the user to define the name
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// Interface methods
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}
	
	//if it is defined as public then it is available any where in the project
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount){
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	// if it is defined as private it is only available in the class
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION; " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance(){
		System.out.println("Balance: " + balance);
	}
	
	void getStatus(){
		
	}
	@ Override 
	public String toString(){
		return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + ". ROUTING # " + routingNumber + ". BALANCE: $" + balance + " ]";
	}

}
