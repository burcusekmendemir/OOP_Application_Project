package repository;

import entity.Person;

public interface PersonInterface {

    void save(Person person);
    Person findByTcId(String tcId);
    Person findById(String id);
    Person findByNameSurname(String nameSurname);
}
