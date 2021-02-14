package java2hw3;

import java.util.*;

public class Phonebook {
    private  HashMap<String,ArrayList<String> > phBook = new HashMap<>();

    public HashMap<String, ArrayList<String>> getPhBook() {
        return phBook;
    }


    public ArrayList<String> get(String surname) {
        return phBook.get(surname);
    }


    public void add(String surname, String number) {

            ArrayList<String> numbers = phBook.getOrDefault(surname,new ArrayList<>());
            numbers.add(number);
            phBook.put(surname,numbers);
            }



}
