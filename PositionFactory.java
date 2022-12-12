package fr.efrei.factory;

import fr.efrei.domain.Position;
import fr.efrei.util.Helper;

public class PositionFactory {
    public static Position creatPosition(String ID_Position, String Statue){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(ID_Position)) || Helper.isNullOrEmpty(Statue)){
            return null;
        }

        Position Position = new Position.Builder()
                .setId(id)
                .setID_Position(ID_Position)
                .setStatue(Statue)
                .build();

        return Position;
    }
}