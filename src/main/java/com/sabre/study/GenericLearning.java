package com.sabre.study;

import java.util.ArrayList;
import java.util.List;

public class GenericLearning {

    public void tryOutGenerics() {
        List<Human> personRamus = new ArrayList<>();
        personRamus.add(new PersonRamu());
        personRamus.add(new PersonSita());
        tryOutExtends(personRamus);
    }

    public void tryOutExtends(List<?> persons) {
        for(Object person : persons) {
            if(person instanceof PersonRamu)
                System.out.println(person);
        }
    }
}
