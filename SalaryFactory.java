package fr.efrei.factory;

import fr.efrei.domain.Salary;
import fr.efrei.util.Helper;

public class SalaryFactory {
    public static Salary creatSalary(String salaryy){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(salaryy))){
            return null;
        }

        Salary salary = new Salary.Builder()
                .setId(id)
                .setSalaryy(salaryy)
                .build();

        return salary;
    }
}