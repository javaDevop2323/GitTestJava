package models;

import java.util.UUID;

public class GeneratorID {


        public static String generateUniqueID() {
            return UUID.randomUUID().toString();
        }

        public static void main(String[] args) {
            String uniqueID = GeneratorID.generateUniqueID();
            System.out.println("Generated Unique ID: " + uniqueID);
        }
    }




