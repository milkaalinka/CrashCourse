package OOPhomeworkEmployee;

public class ContractEmployee extends Employee implements Salary {
    private String federalTaxIdMember;
    @Override
    public float calculatePay(float hoursWorked) {
        return 0;
    }
    public void calculatePay(){
        float salary ;
        float fixedMontlyPayment = 2000;
        salary = fixedMontlyPayment;
    }

    public ContractEmployee(String employeeId, String name) {
        super(employeeId,name);
    }
}
