package com.practicejava;


public class Assignment2Q6 {
    public static void main(String[] args) {
        Client objclient =new Client();
        System.out.println(objclient.persobj.persist());
        System.out.println(new FilePersistence().persist());
        System.out.println(new DatabasePersistence().persist());

    }
}
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return ("this is file persistence class");
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return ("this is database persistence class");
    }
}
class Client {
    Persistence persobj= new Persistence() {
        @Override
        public String persist() {
            return ("this is persist method of persistence class override and invoked by client class");
        }
    };

}