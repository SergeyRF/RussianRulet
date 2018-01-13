package com.example.sergey.myapplication;

/**
 * Created by sergey on 1/13/18.
 */

public class Gun {
    int count=0;
    public boolean shoot(){
        int x=6;
        int t = (int)(Math.random()*x);
        count++;
        return t==0 ;
    }
    public  String fuck(){
        switch (count){
            case 1: return "Fuck you";
            case 2: return "The Good";
            case 6: return "You Luck is very BIG";
            default: return "Motherfucker";
        }

    }
    public int gun(){
        return R.drawable.in_face;
    }
}
