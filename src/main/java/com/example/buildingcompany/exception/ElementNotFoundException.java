package com.example.buildingcompany.exception;

//TODO написать простое исключение
public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException(String message) {
        super(message);
    }
}
