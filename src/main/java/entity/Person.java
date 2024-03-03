package entity;

import enums.Gender;

import java.util.UUID;

public abstract class Person {
    String id;
    String nameSurname;
    String tcID;
    int age;
    String address;
    String phone;
    Gender gender;
    boolean isPatient;
    boolean isCarrier;
    boolean isInfect;

    public abstract void takeVitamins();
    public abstract void goToTheHospital();


    public Person() {
        this.id= UUID.randomUUID().toString();
    }

    public Person(String nameSurname, String tcID, int age, String address, String phone, Gender gender, boolean isPatient, boolean isCarrier, boolean isInfect) {
        this();
        this.nameSurname = nameSurname;
        this.tcID = tcID;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.isPatient = isPatient;
        this.isCarrier = isCarrier;
        this.isInfect = isInfect;
    }

    public String getId() {
        return id;
    }


    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getTcID() {
        return tcID;
    }

    public void setTcID(String tcID) {
        this.tcID = tcID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isPatient() {
        return isPatient;
    }

    public void setPatient(boolean patient) {
        isPatient = patient;
    }

    public boolean isCarrier() {
        return isCarrier;
    }

    public void setCarrier(boolean carrier) {
        isCarrier = carrier;
    }

    public boolean isInfect() {
        return isInfect;
    }

    public void setInfect(boolean infect) {
        isInfect = infect;
    }
}
