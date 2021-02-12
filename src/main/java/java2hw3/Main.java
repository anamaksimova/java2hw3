package java2hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //пункт 1
        String [] array = {"tiger", "unicorn", "cat", "dog", "pig", "tiger","fox", "cat", "horse", "hamster", "cat",
                "bear", "wolf","dog", "sheep", "duck", "woodpecker", "cat", "rat","dog"};
        System.out.println("Изначальный список слов: " + Arrays.toString(array));

        Set<String> set=new LinkedHashSet<String>(Arrays.asList(array));
        System.out.println("Уникальный список слов "+ set);

        List<String> list = Arrays.asList(array);
        Map<String, Integer> map= new LinkedHashMap<>();
        for (String l:list) {
        int count = map.getOrDefault(l,0);
        map.put(l,count+1);
        }
        System.out.println("Число повторов каждого слова: " + map);

        //Пункт 2
        Phonebook phoneBook = new Phonebook();

        phoneBook.add("Петров","+7893666666");
        phoneBook.add("Пеньков","+7893555555");
        phoneBook.add("Иванов","+7893222222");
        phoneBook.add("Иванов","+7893225555");
        System.out.println(phoneBook.getPhBook());
        String name = "Петров";
        System.out.println(name + ": " + phoneBook.get(name));






    }
}
