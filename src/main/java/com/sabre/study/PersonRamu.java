package com.sabre.study;

public class PersonRamu implements Human {

    public PersonRamu() {
    }

    @Override
    public String getName() {
        return "Ramu";
    }

    @Override
    public String getAge() {
        return "25";
    }

    @Override
    public String getGender() {
        return "Male";
    }

    @Override
    public String toString() {
        return "PersonRamu{}";
    }
}
