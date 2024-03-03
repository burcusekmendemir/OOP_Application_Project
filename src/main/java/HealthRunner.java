import entity.Doctor;
import entity.NormalPerson;
import entity.Person;
import entity.SuperPerson;
import enums.Gender;
import utility.Databases;

import java.util.Scanner;

public class HealthRunner {
    public static void main(String[] args) {

        Person normalPerson = new NormalPerson("Burcu Sekmen", "12345678987",26,"Pendik","05123456798", Gender.FEMALE,false,false,false);
        Person normalPerson2 = new NormalPerson("Sude Kaya", "12345678908", 28,"Kartal","05489652325", Gender.FEMALE, false,false,false);
        Person normalPerson3 = new NormalPerson("Ahmet Can", "123454213", 35,"Kadıköy","052658487856", Gender.MALE,true, true,false);
        Person superPerson=new SuperPerson("Burcu Demir", "45871245466", 26,"Pendik","05236584846", Gender.MALE,false,true,false);
        Person doctor=new Doctor("Ali Kaya", "4556123487",45,"Maltepe","05648215765", Gender.MALE,false,false,true, "Dahiliye");

        addToPersonList(normalPerson);
        addToPersonList(normalPerson2);
        addToPersonList(normalPerson3);
        addToPersonList(superPerson);
        addToPersonList(doctor);

        addListOfVaccinatedPerson(doctor);

        vaccinate(normalPerson,doctor);
        vaccinate(normalPerson2,doctor);
        vaccinate(normalPerson3,doctor);
        vaccinate(superPerson,doctor);

        doChoose();

    }




    public static void vaccinate(Person person, Person doctor){
        System.out.println();
        System.out.println("Aşılama işlemi için şartlar kontrol ediliyor...");

        for (int i = 0; i < Databases.personIndex; i++) {
            if (Databases.personList[i].equals(person)){
                //Bulaştırma özelliği sadece doktora aittir. Bu sebeple doktor bulaştırıcı ve insan hem hasta değil hem de taşıyıcı değilse aşılama şartı sağlar.
                if (doctor.isInfect() && !person.isPatient() && !person.isCarrier()){
                    System.out.println(person.getNameSurname() + " adlı kişi için hastalığın bulaşabileceği şartlar mevcuttur. Normal insana aşılama yapılması gerekmektedir.");
                    System.out.println("Aşılama için ortam hazırlanmıştır.");
                    System.out.println(person.getNameSurname() + " adlı normal insan  aşılandı.");

                    addListOfVaccinatedPerson(person);

                }else{
                    System.out.println(person.getNameSurname() + " adlı kişi hastalığın bulaşabileceği koşullara sahip değildir. ");
                    System.out.println(person.getNameSurname() + " adlı kişiye aşı yapılmasına gerek yoktur.");
                }
            }
        }
    }

    public static void addListOfVaccinatedPerson(Person person){
        Databases.vaccinatedPersonList[Databases.indexOfVaccinatedPeople]=person;
        System.out.println();
        System.out.println(Databases.vaccinatedPersonList[Databases.indexOfVaccinatedPeople].getNameSurname() + " adlı kişi aşılı listesine eklenmişitr.");
        Databases.indexOfVaccinatedPeople++;
    }


    public static void viewListOfVaccinatedPerson(){
        System.out.println("Aşı Olanların Listesi:");
        Person[] asililar=Databases.vaccinatedPersonList;
        for (Person person:asililar){
            if (person!=null){
                System.out.println(person.getTcID() + " TC Kimlik Numaralı: " + person.getNameSurname());
            }
        }
    }


    public static void addToPersonList(Person person){
        Databases.personList[Databases.personIndex]=person;
        System.out.println(Databases.personList[Databases.personIndex].getNameSurname() + " adlı kişi 'Kişi Listesine' eklenmiştir.");
        Databases.personIndex++;
    }


    public static void viewPersonList(){
        System.out.println("Kişi Listesi:");
        Person [] kisiler=Databases.personList;
        for (Person person: kisiler){
            if (person!=null){
                System.out.println(person.getTcID() + " TC Kimlik Numaralı: " + person.getNameSurname());
            }
        }
    }

    public static void printToScreen(){
        System.out.println();
        System.out.println("********************************");
        System.out.println("***** HASTANE RAPOR EKRANI *****");
        System.out.println("********************************");
        System.out.println();
        System.out.println(" 1- Kişileri Listele");
        System.out.println(" 2- Aşılı Kişileri Listele");
        System.out.println(" 3- Çıkış");
    }
    public static void doChoose (){
        printToScreen();
        int secim;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            secim=scanner.nextInt();
            switch (secim){
                case 1: viewPersonList();break;
                case 2: viewListOfVaccinatedPerson();break;
                case 3: System.out.println("Çıkış Yapıldı.");break;
                default: System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");break;
            }
        } while (secim!=3);
    }



}
