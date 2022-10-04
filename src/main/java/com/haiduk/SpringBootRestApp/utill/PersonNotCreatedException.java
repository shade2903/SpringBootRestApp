package com.haiduk.SpringBootRestApp.utill;

public class PersonNotCreatedException extends RuntimeException {
    public  PersonNotCreatedException(String msg){
        super(msg);
    }
}
