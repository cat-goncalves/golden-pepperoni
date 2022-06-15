package com.games.pizzaquest.objects;

import com.google.gson.Gson;


public class Item {
    String name;

    Gson gson = new Gson();

    public void convertItem() {
        String itemJson = gson.toJson(this.getName());
        System.out.println(itemJson);
    }


    public Item(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "This is a " + getName() + ".";
    }
}