package ru.job4j.inheritance;

public class Surgeon extends  Doctor {
    private String degree;

    public Surgeon(String name, String surname, String education, String birthday, int experience, String degree) {
        super(name, surname, education, birthday, experience);
        this.degree = degree;
    }
    public void openIt(){
    }
}
