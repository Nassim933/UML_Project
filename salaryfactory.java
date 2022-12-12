package fr.efrei.factory;

import fr.efrei.domain.Salary;
import fr.efrei.util.Helper;

public class SalaryFactory {
    public static Salary creatSalary(int Salary){
        String id = Helper.generateId();

        if (Helper.isNullOrEmpty(Salary)){
            return null;
        }

        Salary Salary = new Salary.Builder()
                .setId(id)
                .setSalary(Salary)
                .build();

        return Salary;
    }
}