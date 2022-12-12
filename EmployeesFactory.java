package fr.efrei.factory;


import fr.efrei.domain.Employees;
import fr.efrei.util.Helper;

public class EmployeesFactory {
    public static Employees createEmployees(String LastName, String FirstName, String ID_Employees){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(LastName)) || Helper.isNullOrEmpty(FirstName) || Helper.isNullOrEmpty(ID_Employees)){
            return null;
        }

        Employees employees = new Employees.Builder()
                .setId(id)
                .setLastName(LastName)
                .setFirstName(FirstName)
                .setID_Employees(ID_Employees)
                .build();

        return employees;
    }
}