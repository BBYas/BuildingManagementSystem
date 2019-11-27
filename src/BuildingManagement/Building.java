/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingManagement;

import java.util.*;
import java.util.Collections;
import java.util.Set;

/**
 *
 * @author flori
 */
public class Building {

    /*TODO funtions to get buildings with available rooms
      also to add and remove rooms in building
      add level
     */
    private static List<Building> listOfBuildings = new ArrayList<>();
    private static int globalBuildingID = 1;
    private int numberOflevels;
    private String buildingID;
    private String buildingName;
    private String location;
    private List<Level> listOfLevels;
    private Set<String> buildingExtra;

    public Building(String buildingName, String location) {
        listOfLevels = new ArrayList<>();
        this.buildingName = buildingName;
        this.location = location;
        buildingID = "BUILD" + globalBuildingID;
        globalBuildingID++;
        numberOflevels = 0;

    }

    public static void addBuilding(Building building) {
        listOfBuildings.add(building);
    }

    public void addLevel() {
        numberOflevels++;
        Level newLevel = new Level(numberOflevels);
        listOfLevels.add(newLevel);

    }

    public void addRoom(int levelNumber, Room room) {
        listOfLevels.get(levelNumber - 1).addRoom(room);
    }

    public static void removeBuilding(String buildingId) {
        listOfBuildings.removeIf((building) -> {
            return building.getBuildingID().equals(buildingId);
        });

    }

    public void removeBuilding() {
        listOfBuildings.remove(this);
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static List<Building> getListOfBuildings() {
        return Collections.unmodifiableList(listOfBuildings);
    }

    public int getNumberOflevels() {
        return numberOflevels;
    }

    public String getBuildingID() {
        return buildingID;
    }

    public List<Level> getListOfLevels() {
        return Collections.unmodifiableList(listOfLevels);
    }

    public Set<String> getBuildingExtra() {
        return Collections.unmodifiableSet(buildingExtra);
    }

    public void addExtra(String extra) {
        buildingExtra.add(extra);
    }

    public void removeExtra(String extra) {
        buildingExtra.remove(extra);
    }

    public static Building researchBuildingById(String ID) {
        for (Building building : listOfBuildings) {
            if (building.getBuildingID().equals(ID)) {
                return building;
            }
        }
        return null;
    }

    public static HashSet<Building> researchBuildingByLocation(String location) {
        HashSet<Building> setOfBuildings = new HashSet<>();
        listOfBuildings.forEach((building) -> {
            if (building.getLocation().equals(location)) {
                setOfBuildings.add(building);
            }
        });
        return setOfBuildings;
    }

    public static HashSet<Building> researchBuildingByLevels(int numberOfLevels) {
        HashSet<Building> setOfBuildings = new HashSet<>();
        listOfBuildings.forEach((building) -> {
            if (building.getNumberOflevels() == numberOfLevels) {
                setOfBuildings.add(building);
            }
        });
        return setOfBuildings;

    }

    public static Building researchBuildingByName(String name) {
        for (Building building : listOfBuildings) {
            if (building.getBuildingName().equals(name)) {
                return building;
            }
        }
        return null;
    }
    
    

}
