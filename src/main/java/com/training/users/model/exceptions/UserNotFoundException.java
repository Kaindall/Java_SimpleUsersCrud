package com.training.users.model.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException () {super("Usuário inexistente.");}
}
