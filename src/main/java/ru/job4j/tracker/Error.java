package ru.job4j.tracker;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активная: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error e = new Error();
        Error e2 = new Error(true, 1, "Ошибка");
        Error e3 = new Error(false, 0, "Ok");
        e.printInfo();
        e2.printInfo();
        e3.printInfo();
    }

}
