package com.HANK;

import com.hank.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void BmiTest(){
        Person person=new Person(66.5f,1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi());

    }
}
