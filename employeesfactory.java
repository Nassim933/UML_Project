package fr.efrei.factory;

import fr.efrei.domain.Type;
import fr.efrei.util.Helper;

public class EmployeesFactory {
    public static Type creatType(String LastName, String FirstName, int ID_Employees){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(LastName)) || Helper.isNullOrEmpty(FirstName) || Helper.isNullOrEmpty(ID_Employees)){
            return null;
        }

        Type type = new Type.Builder()
                .setId(id)
                .setLastName(LastName)
                .setFirstName(FirstName)
                .setID_Employees(ID_Employees)
                .build();

        return type;
    }
}