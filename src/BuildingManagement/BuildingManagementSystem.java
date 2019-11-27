/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingManagement;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author YASMINE
 */
public class BuildingManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Contract{
    private String contractId;
    private static int globalContractID = 0;
    private Person tenant;
    private String roomId;
    private GregorianCalendar dateOfPayment;
    private boolean isContractValid;
    private int duration;
    private GregorianCalendar expirationDate;

    public Contract( Person tenant, String roomId, int duration) {
        this.contractId = "CONT"+(++globalContractID);
        this.tenant = tenant;
        this.roomId = roomId;
        this.dateOfPayment = new GregorianCalendar();
        this.duration = duration;
       
    }

    public String getContractId() {
        return contractId;
    }

    public Person getTenant() {
        return tenant;
    }

    public String getRoomId() {
        return roomId;
    }

    public GregorianCalendar getDateOfPayment() {
        return dateOfPayment;
    }

    public boolean isContractValid(GregorianCalendar dateOfPayment,GregorianCalendar expirationDate) {
        return( dateOfPayment.compareTo(expirationDate)<=0);
    }

    public boolean isIsContractValid() {
        return isContractValid;
    }

    public void setIsContractValid(boolean isContractValid) {
        this.isContractValid = isContractValid;
    }

    public GregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(GregorianCalendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setDateOfPayment(GregorianCalendar dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public void setIsContract(boolean isContract) {
        this.isContractValid = isContract;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    


}