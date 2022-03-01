package com.company;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(){

    }

    public InvalidAgeException(String e){

    }

    public static void message(String message){
        System.out.println(message);
    }


}
