package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String progLang;

    public Programmer(String name, String surname, String education,
                      String birthday, int category, String progLang) {
        super(name, surname, education, birthday, category);
        this.progLang = progLang;
    }

    public void writeCode() {
    }
}
