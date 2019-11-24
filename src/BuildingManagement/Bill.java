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
public class Bill {
    private Date dateOfIssue;
    private Date dateOfDue;
    private Date dateOfPayment;
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateOfIssue() {
        return (Date)dateOfIssue.clone();
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = (Date)dateOfIssue.clone();
    }

    public Date getDateOfDue() {
        return (Date)dateOfDue.clone();
    }

    public void setDateOfDue(Date dateOfDue) {
        this.dateOfDue = (Date)dateOfDue.clone();
    }

    public Date getDateOfPayment() {
        return (Date)dateOfPayment.clone();
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = (Date)dateOfPayment.clone();
    }
    
    
}
