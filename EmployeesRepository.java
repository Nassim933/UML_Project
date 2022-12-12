package fr.efrei.repository;

import fr.efrei.domain.Employees;
import java.util.ArrayList;
import java.util.List;

public class EmployeesRepository implements IEmployeesRepositoryy{
    private static EmployeesRepository repository = null;
    private List<Employees> employeesDB = null;

    private EmployeesRepository() {
        employeesDB = new ArrayEmployees<Employees>();
    }


    public static EmployeesRepository getRepository() {
        if (repository == null){
            return new EmployeesRepository();
        }
        return repository;
    }

    @Override
    public Employees create(Employees employees) {
        boolean success = employeesDB.add(employees);
        if (success){
            return employees;
        }
        else {
            return null;
        }
    }

    @Override
    public Employees read(String s) {
        for (Employees r : employeesDB){
            if (r.getId().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Employees update(Employees employees) {
        Employees oldEmployees = read(employees.getId());
        if (employees != null){
            employeesDB.remove(oldEmployees);
            employeesDB.add(employees);
            return employees;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Employees employeesToDelete = read(s);
        if (employeesToDelete == null) {
            return false;
        }
        employeesDB.remove(employeesToDelete);
        return true;
    }

    @Override
    public List<Employees> getAll() {
        return employeesDB;
    }
}
