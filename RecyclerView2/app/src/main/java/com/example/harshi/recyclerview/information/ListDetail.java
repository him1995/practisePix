package com.example.harshi.recyclerview.information;

import com.example.harshi.recyclerview.R;

import java.util.ArrayList;



public class ListDetail {


    public static ArrayList<Information> getList() {

        ArrayList<Information> catList = new ArrayList();


        catList.add(new Information(R.drawable.cinema,"CINEMA"));
        catList.add(new Information(R.drawable.nature,"NATURE"));
        catList.add(new Information(R.drawable.sports,"SPORTS"));
        catList.add(new Information(R.drawable.relegion,"RELEGION"));
        catList.add(new Information(R.drawable.thoughts,"THOUGHTS"));
        catList.add(new Information(R.drawable.wildlife,"WILDLIFE"));
        catList.add(new Information(R.drawable.rides,"RIDES"));


        return catList;



    }
}