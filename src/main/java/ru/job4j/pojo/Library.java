package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book master =  new Book("Мастер и Маргарита", 500);
        Book war = new Book("Война и мир", 1270);
        Book ball = new Book("Колобок", 15);
        Book cleanCode = new Book("Clean code", 1150);
        Book[] lib = new Book[] {master, war, ball, cleanCode};
        for (int index = 0; index < lib.length; index++) {
            Book lb = lib[index];
            System.out.println(lb.getName() + " - " + lb.getPages());
        }
        Book n = lib[3];
        lib[3] = lib[0];
        lib[0] = n;
        for (int index = 0; index < lib.length; index++) {
            Book lb = lib[index];
            System.out.println(lb.getName() + " - " + lb.getPages());
        }
        for (int index = 0; index < lib.length; index++) {
            Book lb = lib[index];
            if ("Clean code".equals(lb.getName())) {
                System.out.println(lb.getName()
                        + ", " + lb.getPages() + " страниц.");
            }
        }
    }
}
