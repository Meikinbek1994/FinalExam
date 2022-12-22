import Dao.Database;
import Model.Phone;
import Service.impl.PhoneImpl;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Phone phone=new Phone(12,"Iphone X",64,2017,1300);
        Phone phone1=new Phone(13,"Iphone 11",128,2018,1400);
        Phone phone2=new Phone(14,"Iphone 12",256,2019,1500);
        Set<Phone>phones=new HashSet<>();
        phones.add(phone);
        phones.add(phone1);
        phones.add(phone2);
        Database database=new Database(phones);
        PhoneImpl phoneImpl=new PhoneImpl(database);

        System.out.println(phoneImpl.getPhonesByModel("Iphone X"));



    }
}