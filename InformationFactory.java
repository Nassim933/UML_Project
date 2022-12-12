package fr.efrei.factory;

import fr.efrei.domain.Information;
import fr.efrei.util.Helper;

public class InformationFactory {
    public static Information creatInformation(String postal_adress, String Email_adress, String phone_number){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(postal_adress)) || Helper.isNullOrEmpty(Email_adress) || Helper.isNullOrEmpty(phone_number)){
            return null;
        }

        Information Information = new Information.Builder()
                .setId(id)
                .setpostal_adress(postal_adress)
                .setEmail_adress(Email_adress)
                .setphone_number(phone_number)
                .build();

        return Information;
    }
}