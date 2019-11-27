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
    private List<Room> listOfRooms;
    //YASMINA LOVES YOU 

    public Level(int levelNumber) {
        this.listOfRooms = new ArrayList<>();
        this.levelNumber = levelNumber;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public List<Room> getListOfRooms() {
        return Collections.unmodifiableList(listOfRooms);
    }

    public void addRoom(Room room){
        listOfRooms.add(room);
    }
    
    public  int getNumberOfRooms(){
        return listOfRooms.size();
    }
    
}
