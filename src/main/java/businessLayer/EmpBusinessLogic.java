package businessLayer;

import model.Employee;

public class EmpBusinessLogic {
    public double calculateYearlySalary (Employee employee){
        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary()*12;
        return yearlySalary;
    }

    public double calculateAppraisal(Employee employee) {

        double appraisal = 0;

        if(employee.getMonthlySalary() < 10000) {
            appraisal = 500;

        } else {
            appraisal = 1000;
        }

        return appraisal;
    }
}
