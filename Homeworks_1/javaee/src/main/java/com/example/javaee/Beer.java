package com.example.javaee;

public class Beer {
    private String name;
    private int price;
    private int degree;
    private String brand;
    private int year_of_birth;


    Beer(String name,int price,int degree,String brand,int year_of_birth){
        this.name=name;
        this.price=price;
        this.degree=degree;
        this.brand=brand;
        this.year_of_birth=year_of_birth;
    }
    public String toString(){
        return (name+"<br>"+"price is:"+price+"<br>"+"degree is:"+degree+"<br>"+"brand is:"+brand+"<br>"+" birth year is:"+year_of_birth);
    }
}
