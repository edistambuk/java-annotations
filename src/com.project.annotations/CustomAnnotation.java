package com.project.annotations;

import com.project.annotations.exceptions.JsonSerializationException;

public class CustomAnnotation {

    public static void main(String[] args)
    {
        Person p = new Person();
        p.setFirstName("ivo");
        p.setLastName("ivica");
        p.setAddress("ilica");
        p.setAge("34");

        ObjectToJsonConverter ojc = new ObjectToJsonConverter();

        try {
            String json = ojc.convertToJson(p);

            System.out.println(json);
        } catch (JsonSerializationException e) {
            e.printStackTrace();
        }


    }
}