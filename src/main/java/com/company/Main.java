package com.company;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Stream; //alt + enter


public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person("John Smith");

        String json = mapper.writeValueAsString(person);//Ctrl + alt + v
        System.out.println(json); //sout + Enter

        //Stream API
        //Lambda ->
        //Method Reference
        //LocalDate/LocalDateTime

    }

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}