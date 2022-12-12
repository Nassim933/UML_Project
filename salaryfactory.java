package fr.efrei.factory;

import fr.efrei.domain.Type;
import fr.efrei.util.Helper;

public class SalaryFactory {
    public static Type creatType(int Salary){
        String id = Helper.generateId();

        if (Helper.isNullOrEmpty(Salary)){
            return null;
        }

        Type type = new Type.Builder()
                .setId(id)
                .setSalary(Salary)
                .build();

        return type;
    }
}