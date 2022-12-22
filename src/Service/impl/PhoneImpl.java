package Service.impl;

import Dao.Database;
import Model.Phone;
import Service.PhoneService;

import java.util.*;

public class PhoneImpl implements PhoneService {
    private Database database;
    //Constructor

    public PhoneImpl(Database database) {
        this.database = database;
    }
    //Getter&Setter


    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public String addPhones(Set<Phone> phones) {
        database.getPhones().addAll(phones);
        return "Successfully added phones to database";
    }

    @Override
    public Queue<Phone> getPhonesByModel(String model) {
        Queue<Phone> phonesByModel = new LinkedList<>();
        for (Phone phone : database.getPhones()) {
            if (phone.getModel().equals(model)) {
                phonesByModel.add(phone);
            }
        }
        return phonesByModel;
    }

    @Override
    public String updatePhone(Long phoneId, Phone phone) {
        for (Phone p : database.getPhones()) {
            if (p.getId() == phoneId) {
                p.setModel(phone.getModel());
                p.setMemory(phone.getMemory());
                p.setYearOfIssue(phone.getYearOfIssue());
                p.setPrice(phone.getPrice());
                return "Successfully updated phone with ID " + phoneId;
            }
        }
        return "Phone with ID " + phoneId + " not found";
    }

    @Override
    public String removePhoneById(Long phoneId) {
        for (Phone p : database.getPhones()) {
            if (p.getId() == phoneId) {
                database.getPhones().remove(p);
                return "Successfully removed phone with ID " + phoneId;
            }
        }
        return "Phone with ID " + phoneId + " not found";
    }

    @Override
    public Deque<Phone> getAllPhones() {
        return new LinkedList<>(database.getPhones());
    }

    @Override
    public List<Phone> sortPhonesByYearOfIssue() {
        return null;
    }

    @Override
    public List<Phone> filterPhonesByPrice(int fromThisPrice, int upToThisPrice) {
        return null;
    }

    @Override
    public List<Phone> findPhonesWithLargeMemoryAndSmallMemory() {
        return null;
    }

    @Override
    public String deleteAllPhones() {
        return null;
    }
}
