package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
      //  System.out.println(DummyDic.engToRus("cat"));
    }

    public static void main(String[] args) {
        String eng = "cat";
        System.out.println(engToRus(eng));
    }
}
