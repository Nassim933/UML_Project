package fr.efrei.repository;

import fr.efrei.domain.Salary;
import java.util.ArrayList;
import java.util.List;

public class SalaryRepository implements ISalaryRepositoryy{
    private static SalaryRepository repository = null;
    private List<Salary> salaryDB = null;

    private SalaryRepository() {
        salaryDB = new ArraySalary<Salary>();
    }


    public static SalaryRepository getRepository() {
        if (repository == null){
            return new SalaryRepository();
        }
        return repository;
    }

    @Override
    public Salary create(Salary salary) {
        boolean success = salaryDB.add(salary);
        if (success){
            return salary;
        }
        else {
            return null;
        }
    }

    @Override
    public Salary read(String s) {
        for (Salary r : salaryDB){
            if (r.getId().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Salary update(Salary salary) {
        Salary oldSalary = read(salary.getId());
        if (salary != null){
            salaryDB.remove(oldSalary);
            salaryDB.add(salary);
            return salary;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Salary salaryToDelete = read(s);
        if (salaryToDelete == null) {
            return false;
        }
        salaryDB.remove(salaryToDelete);
        return true;
    }

    @Override
    public List<Salary> getAll() {
        return salaryDB;
    }
}