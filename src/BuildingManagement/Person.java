package BuildingManagement;

import java.util.Date;


class Person {
    private String name;
    private String personId;
    private Date dateOfBirth;
    private String nationalIdNumber;
    private char sex;
    private String maritalStatus;
    private String phoneNumber;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    public char getSex() {
        return sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNationalIdNumber(String nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
      
}
