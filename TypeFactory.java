package fr.efrei.factory;

import fr.efrei.domain.Type;
import fr.efrei.util.Helper;

public class TypeFactory {
    public static Type creatType(String gender, String race){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(gender)) || Helper.isNullOrEmpty(race)){
            return null;
        }

        Type type = new Type.Builder()
                .setId(id)
                .setGender(gender)
                .setRace(race)
                .build();

        return type;
    }
}
