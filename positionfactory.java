package fr.efrei.factory;

import fr.efrei.domain.Type;
import fr.efrei.util.Helper;

public class PositionFactory {
    public static Type creatType(String String, int ID_Position){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(String)) || Helper.isNullOrEmpty(ID_Position)){
            return null;
        }

        Type type = new Type.Builder()
                .setId(id)
                .setString(String)
                .setID_Position(ID_Position)
                .build();

        return type;
    }
}