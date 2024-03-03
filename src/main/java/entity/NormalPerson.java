package entity;

import enums.Gender;

public class NormalPerson extends Person {

    String illness;



    public NormalPerson(String nameSurname, String tcID, int age, String address, String phone, Gender gender, boolean isPatient, boolean isCarrier, boolean isInfect) {
        super(nameSurname, tcID, age, address, phone, gender, isPatient, isCarrier, isInfect);
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "NormalPerson{" +
                "illness='" + illness + '\'' +
                '}';
    }
    @Override
    public void takeVitamins() {
        System.out.println(getClass().getSimpleName() + " took vitamins.");
    }

    @Override
    public void goToTheHospital() {
        System.out.println(getClass().getSimpleName() + " went to hospital.");
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
