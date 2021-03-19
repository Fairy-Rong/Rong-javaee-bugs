package com.example.javaee;
import java.util.*;


public class BeerExpert {

    public List getBeer(String color){
        List<Beer> beer = new ArrayList<>();
        if(color.equals("amber")){
            beer.add(new Beer("桃花醉",100000,5,"Rong",2001));
            beer.add(new Beer("勇闯星兰",500000,40,"Zhu",1999));
        }
        else{
            beer.add(new Beer("猪铭浩老酿",8000000,68,"Thomas",1877));
            beer.add(new Beer("陈独酌",700000,17,"Stupid",800));
        }
        return(beer);
    }
}
