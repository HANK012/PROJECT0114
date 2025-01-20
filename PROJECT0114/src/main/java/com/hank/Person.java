package com.hank;
public class Person {

    String name;
    float weight;
    float height;
    public  Person(float weight,float height){
    this.weight=weight;
    this.height=height;
    }
    public float bmi(){
        float bmi= weight / (height * height);
        return bmi;
    }
    public void Hello(){
        System.out.println("Hello World");
    }
    }








