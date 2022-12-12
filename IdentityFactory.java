package fr.efrei.factory;

import fr.efrei.domain.Identity;
import fr.efrei.util.Helper;

public class IdentityFactory {
    public static Identity creatIdentity(String IdentityName, String IdentityValue){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(IdentityName)) || Helper.isNullOrEmpty(IdentityValue)){
            return null;
        }

        Identity Identity = new Identity.Builder()
                .setId(id)
                .setIdentityName(IdentityName)
                .setIdentityValue(IdentityValue)
                .build();

        return Identity;
    }
}