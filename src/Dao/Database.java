package Dao;

import Model.Phone;

import java.util.ArrayList;
import java.util.Set;

public class Database {
    private Set<Phone> phones;
    //Constructor


    public Database(Set<Phone> phones) {
        this.phones = phones;
    }
    //Getter&Setter

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }
}
