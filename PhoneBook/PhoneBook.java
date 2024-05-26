package PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;

import users.User;

import java.util.*;


public class PhoneBook {

    public HashMap<User, ArrayList<Integer>> resList = new HashMap<>();



    public void addPhone(User user, Integer phone) {
        if(resList.containsKey(user)) {
            ArrayList<Integer> phoneNumbers = resList.get(user);
            phoneNumbers.add(phone);
        } else {
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phone);
            resList.put(user, phoneNumbers);
        }
    }


    public void printPhoneBook() {
        resList.entrySet().stream()
        .sorted(Comparator.comparingInt((Map.Entry<User, ArrayList<Integer>> entry) -> entry.getValue().size()).reversed())
        .forEach(entry -> {
            User user = entry.getKey();
            List<Integer> phoneNumbers = entry.getValue();
            System.out.println(user.getName() + " " + phoneNumbers);
        });
    }

}
