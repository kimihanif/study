package com.sabre.study;

public class PersonSita implements Human {
    public PersonSita() {
    }

    @Override
    public String getName() {
        return "Sita";
    }

    @Override
    public String getAge() {
        return "23";
    }

    @Override
    public String getGender() {
        return "Female";
    }

    @Override
    public String toString() {
        return "PersonSita{}";
    }
}
