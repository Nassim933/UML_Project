package fr.efrei.factory;

import fr.efrei.domain.Job;
import fr.efrei.util.Helper;

public class JobFactory {
    public static Job creatJob(String Title, String ID_Position){
        String id = Helper.generateId();

        if ((Helper.isNullOrEmpty(Title)) || Helper.isNullOrEmpty(ID_Position)){
            return null;
        }

        Job Job = new Job.Builder()
                .setId(id)
                .setTitle(Title)
                .setID_Position(ID_Position)
                .build();

        return Job;
    }
}