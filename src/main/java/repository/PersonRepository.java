package repository;

import entity.Person;
import utility.Databases;

public class PersonRepository implements PersonInterface {

    /**
     * Kişi listesine yeni kayıtlar eklenmek istediğinde kullanılan method.
     * @param person
     */
    @Override
    public void save(Person person) {
        Databases.personList[Databases.personIndex]=person;
        Databases.personIndex++;
    }


    /**
     * Kişileri TC Kimlik numaralarına göre bulan method.
     * @param tcId
     * @return
     */
    @Override
    public Person findByTcId(String tcId) {
        for (Person person: Databases.personList){
            if (person.getTcID().contains(tcId))
                return person;
        }
        return null;
    }


    /**
     * Kişileri id numaralarına göre bulan method.
     * @param id
     * @return
     */
    @Override
    public Person findById(String id) {
        for (Person person: Databases.personList){
            if (person.getId().contains(id))
                return person;
        }
        return null;
    }


    /**
     * Kişileri ad soyadlarına göre bulan method.
     * @param nameSurname
     * @return
     */
    @Override
    public Person findByNameSurname(String nameSurname) {
        for (Person person: Databases.personList){
            if (person.getNameSurname().contains(nameSurname))
                return person;
        }
        return null;
    }
}
