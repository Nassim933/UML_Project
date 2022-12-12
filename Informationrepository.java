package fr.efrei.repository;

import fr.efrei.domain.Information;
import java.util.ArrayList;
import java.util.List;

public class InformationRepository implements IInformationRepositoryy{
    private static InformationRepository repository = null;
    private List<Information> informationDB = null;

    private InformationRepository() {
        informationDB = new ArrayInformation<Information>();
    }


    public static InformationRepository getRepository() {
        if (repository == null){
            return new InformationRepository();
        }
        return repository;
    }

    @Override
    public Information create(Information information) {
        boolean success = informationDB.add(information);
        if (success){
            return information;
        }
        else {
            return null;
        }
    }

    @Override
    public Information read(String s) {
        for (Information r : informationDB){
            if (r.getId().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Information update(Information information) {
        Information oldInformation = read(information.getId());
        if (information != null){
            informationDB.remove(oldInformation);
            informationDB.add(information);
            return information;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Information informationToDelete = read(s);
        if (informationToDelete == null) {
            return false;
        }
        informationDB.remove(informationToDelete);
        return true;
    }

    @Override
    public List<Information> getAll() {
        return informationDB;
    }
}