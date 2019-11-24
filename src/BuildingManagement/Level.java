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
public class Level {
    private int levelNumber;
    private List<Bill> listOfRooms;

    public Level(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public List<Bill> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<Bill> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }
    
    
}
