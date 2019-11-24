/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingManagement;

import java.util.*;

/**
 *
 * @author flori
 */
public abstract class Room {
    //TODO think about identifier to remove a bill
    //should write function to remove last added bill? Discuss with Yas.
    private static int globalId = 1;
    private String Id;
    //private String roomType; I dont think that this is necessary now if we have sub classes
    private String buildingID;
    private int levelNumber;
    private boolean isOccupied;
    private Set<String> setOfFurniture;
    private double price;
    private double caution;
    private String paintColor;
    private Map<String, Double> additionalRooms;
    private Set<Person> setOfPersons;
    private List<Bill> waterBills;
    private List<Bill> electricityBills;

    protected Room() {

    }

    protected Room(double price, double caution, String paintColor, String buildinID, int levelNumber) {
        this.price = price;
        this.caution = caution;
        this.paintColor = paintColor;
        this.buildingID = buildinID;
        this.levelNumber = levelNumber;

        Id = "R" + globalId; // in the program we may ask user to enter room in format
        // B#L#R# for us to search

        globalId++;
    }

    public String getId() {
        return Id;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCaution() {
        return caution;
    }

    public void setCaution(double caution) {
        this.caution = caution;
    }

    public Set<String> getSetOfFurniture() {

        return Collections.unmodifiableSet(setOfFurniture);
    }

    public Map<String, Double> getAdditionalRooms() {
        return Collections.unmodifiableMap(additionalRooms);
    }

    public Set<Person> getSetOfPersons() {
        return Collections.unmodifiableSet(setOfPersons);
    }

    public List<Bill> getWaterBills() {
        return Collections.unmodifiableList(waterBills);
    }

    public List<Bill> getElectricityBills() {
        return Collections.unmodifiableList(electricityBills);
    }

    public boolean isFurnished() {
        return !setOfFurniture.isEmpty();
    }

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public void addAdditionalRoom(String name, double area) {
        additionalRooms.put(name, area);// provide error management for if the name already exists
    }

    public void addPerson(Person person) {
        setOfPersons.add(person);
    }
    
    public void addWaterBill(Bill waterBill){
        waterBills.add(waterBill);
    }
    
    public void addElectricityBill(Bill electricityBill){
        electricityBills.add(electricityBill);
    }
    
    public void addFurniture(String furniture){
        setOfFurniture.add(furniture);
    }

    public void removeAdditionalRoom(String name){
        additionalRooms.remove(name);
    }
    
    public void removeFurniture(String furniture){
        setOfFurniture.remove(furniture);
    }
    //Do this method after having taken Yasmine's method
    /*public void removePerson(String name){
   
    }*/
}
