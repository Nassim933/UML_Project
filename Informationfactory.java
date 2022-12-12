package fr.efrei.factory;

import fr.efrei.domain.Information;
import fr.efrei.util.Helper;

public class InformationFactory {
    public static Information creatInformation(String Postal_adress, String Email_adress, int Phone_number){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(Postal_adress)) || Helper.isNullOrEmpty(Email_adress) || Helper.isNullOrEmpty(Phone_number)){
            return null;
        }

        Information Information = new Information.Builder()
                .setId(id)
                .setPostal_adress(Postal_adress)
                .setEmail_adress(Email_adress)
                .setPhone_number(Phone_number)
                .build();

        return Information;
    }
}