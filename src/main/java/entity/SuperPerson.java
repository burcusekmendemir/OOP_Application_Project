package entity;

import enums.Gender;

public class SuperPerson extends Person {


    public SuperPerson() {
    }

    public SuperPerson(String nameSurname, String tcID, int age, String address, String phone, Gender gender, boolean isPatient, boolean isCarrier, boolean isInfect) {
        super(nameSurname, tcID, age, address, phone, gender, isPatient, isCarrier, isInfect);
    }

    @Override
    public void takeVitamins() {
        System.out.println(getClass().getSimpleName() + " took vitamins.");
    }

    @Override
    public void goToTheHospital() {
        System.out.println(getClass().getSimpleName() + " went to hospital.");
    }





}
