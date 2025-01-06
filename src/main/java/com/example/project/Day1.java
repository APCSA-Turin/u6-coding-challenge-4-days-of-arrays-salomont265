package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if(name == null|| name.equals("")){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }else{
        String eName = elf_names[((int)(Math.random() *4)+1)];
        return eName + name;  
        }
    }

}