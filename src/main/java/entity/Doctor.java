package entity;

import enums.Gender;

public class Doctor extends Person  {

    public final String departmentName;

    public Doctor(String departmentName){
        this.departmentName= departmentName;
    }

    public Doctor(String nameSurname, String tcID, int age, String address, String phone, Gender gender, boolean isPatient, boolean isCarrier, boolean isInfect, String departmentName) {
        super(nameSurname, tcID, age, address, phone, gender, isPatient, isCarrier, isInfect);
        this.departmentName = departmentName;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "departmentName='" + departmentName + '\'' +
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




}
