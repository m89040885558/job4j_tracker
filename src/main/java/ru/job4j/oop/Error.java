package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

     public Error() {
     }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Доступ: " + active);
        System.out.println("Код ощибки: " + status + " GB");
        System.out.println("Сообщение: " + message);
        }

    public static void main(String[] args) {
        Error error = new Error(true, 10406, "Critical ERrOR");
        Error errorDefault = new Error();
        error.printInfo();
        errorDefault.printInfo();
    }
}
