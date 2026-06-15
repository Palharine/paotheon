package org.pantheon.paotheon.exception;

    public class AccountDeactivatedException extends RuntimeException{
        public AccountDeactivatedException(String message){
            super(message);
        }
    }
