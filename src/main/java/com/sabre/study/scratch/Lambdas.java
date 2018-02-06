package com.sabre.study.scratch;

import com.sabre.study.scratch.testclass.Gender;
import com.sabre.study.scratch.testclass.Person;
import com.sabre.study.scratch.testclass.TestPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class Lambdas {

    @Autowired
    private TestPerson testPerson;

    @RequestMapping(value = "/lambda", method = RequestMethod.GET, produces = "application/json")
    private List<Person> testLambdas(){

        List<Person> personList = Person.createShortList();
        Predicate<Person> maleDrivers = p -> (p.getAge() > 18 && p.getGender().equals(Gender.MALE));
        Function<Person, String> customName = p -> "Mr." + p.getGivenName();


        personList.stream().map(person -> "do noting" + person.getAge()).forEach(System.out::println);



        personList.stream().filter(maleDrivers::test).forEach(p -> System.out.println(p.printCustom(customName)));
        return personList.stream().filter(maleDrivers::test).collect(Collectors.toList());
    }

}
