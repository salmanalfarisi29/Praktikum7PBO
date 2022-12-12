package StudiKasus1_AnotherTypeofEmployee;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;

	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
	    super(eName, eAddress, ePhone);
	    
	    socialSecurityNumber = socSecNumber;
        payRate = rate;
	}

	@Override
	public String toString(){
	   String result = super.toString();
	        
	   String socialSecurityNumber = null;
	result += "\nSocial Security Number: " + socialSecurityNumber;
	        
	   return result;
	}
	    
	public double pay(){
	    double payRate = 0;
		return payRate;
	 }

}
