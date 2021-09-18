package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
        public static void main(String[] args) {
            Student roman = new Student();
            roman.setName("Roman Jurievich Lennon");
            roman.setGroup("btl-21");
            roman.setEntered(LocalDate.of(2019,9,13));

            System.out.println("ФИО: " + roman.getName() + System.lineSeparator()
                    + "Группа: " + roman.getGroup() + System.lineSeparator()
                    + "Поступил: " + roman.getEntered());
        }
}
