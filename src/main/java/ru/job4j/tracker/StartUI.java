package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime time = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentTime = time.format(formatter);
        System.out.println(currentTime);
        System.out.println();
        Item dateIt = new Item(24011, "Date Item");
        System.out.println(dateIt);
    }
}