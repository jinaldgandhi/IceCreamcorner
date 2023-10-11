package com.example.icecreamcorner;

public class Icecream {


    private String name;
    private String desc;
    private Double price;
    private int imageID;



    public static final Icecream[] icecreams={
            new Icecream("Small", "icecream", 7.50,R.drawable.icecream),
            new Icecream("Medium", "icecream", 9.50,R.drawable.images),
            new Icecream("Large", "icecream", 11.50,R.drawable.ladiperie)
    };
    private Icecream(String name, String desc, double price, int imageID){
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imageID = imageID;
    }
    public String getName() {
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public double getPrice(){
        return price;
    }
    public int getImageID(){
        return imageID;
    }

    public String toString(){
        return name;
    }




}


