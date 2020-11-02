package OOPhomeworkEmployee;

public class SalariedEmloyee extends Employee implements Salary {
    @Override
    public void calculatePay() {}

    public float calculatePay(float hoursWorked) {
        float salary;
        float hourlyRate = 10;
        salary = hourlyRate * hoursWorked;
        return salary;
    }

    private String socialSecurityNumber = "Lorem ipsum";

     public SalariedEmloyee(String emloyeeId, String name, String socialSecurityNumber) {
         super(emloyeeId, name);
         this.socialSecurityNumber = socialSecurityNumber;
     }

     public String getSocialSecurityNumber() {
         return  socialSecurityNumber;
     }
}
