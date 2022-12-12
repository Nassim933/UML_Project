package fr.efrei.factory;

import fr.efrei.domain.Position;
import fr.efrei.util.Helper;

public class PositionFactory {
    public static Position creatPosition(String Statue, int ID_Position){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(Statue)) || Helper.isNullOrEmpty(ID_Position)){
            return null;
        }

        Position Position = new Position.Builder()
                .setId(id)
                .setStatue(Statue)
                .setID_Position(ID_Position)
                .build();

        return Position;
    }
}