package StudiKasus1_AnotherTypeofEmployee;

public class Executive extends Employee {
    private double bonus;
    
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(socSecNumber, socSecNumber, socSecNumber, socSecNumber, rate);
        
        bonus = 0;
    }
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }
    public double pay(){
        double payment = super.pay() + bonus;
        
        bonus = 0;
        
        return payment;
    }
}