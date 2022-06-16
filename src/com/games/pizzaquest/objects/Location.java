package com.games.pizzaquest.objects;

import java.util.*;

public class Location {
    private final String name;
    public NonPlayerCharacter npc = null;
    private String north;
    private String east;
    private String south;
    private String west;

    public String getNorth() {
        return north;
    }

    public String getEast() {
        return east;
    }

    public String getSouth() {
        return south;
    }

    public String getWest() {
        return west;
    }

    public Location (String name, String north, String south, String east, String west ){
        this.name = name;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public Location (String name, NonPlayerCharacter NPC,String north, String south, String east, String west ){
        this.name = name;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
        this.npc = NPC;
    }

    public String getNextLocation(String direction){
        String nextLoc = null;
        switch (direction.toLowerCase()){
            case "north":
                nextLoc = getNorth();
                break;
            case "east":
                nextLoc = getEast();
                break;
            case "south":
                nextLoc = getSouth();
                break;
            case "west":
                nextLoc = getWest();
                break;
            default:
                break;
        }
        return nextLoc;
    }

    private String printBoarders(){
        return "\nTo the north we have " + getNorth() + ",\nTo the east we have " + getEast()+
                ",\nTo the south we have " + getSouth() + ",\nTo the west we have " + getWest()+".";
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString(){
        return "You are in the " + getName() + "." + printBoarders() +"\n" +
                (npc != null?npc.getName()+" is standing in the room": "there is no one in the room");
    }


}