package ru.job4j.inheritance;

public class Builder extends Engineer{
    private int project;

    public Builder(String name, String surname, String education, String birthday, int category, int project) {
        super(name, surname, education, birthday, category);
        this.project = project;
    }
    public void checkProject() {
    }
}
