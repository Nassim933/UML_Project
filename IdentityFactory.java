package fr.efrei.factory;

import fr.efrei.domain.Type;
import fr.efrei.util.Helper;

public class IdentityFactory {
    public static Type creatType(String IdentityName, String IdentityValue){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(IdentityName)) || Helper.isNullOrEmpty(IdentityValue)){
            return null;
        }

        Type type = new Type.Builder()
                .setId(id)
                .setIdentityName(IdentityName)
                .setIdentityValue(IdentityValue)
                .build();

        return type;
    }
}