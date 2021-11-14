package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int teeth;

    public Dentist(String name, String surname,
                   String education, String birthday, int experience, int teeth) {
        super(name, surname, education, birthday, experience);
        this.teeth = teeth;
    }

    public void drills() {
    }
}
