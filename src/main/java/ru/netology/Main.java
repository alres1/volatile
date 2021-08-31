package ru.netology;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Toy toy = new Toy();
        UserThread t1 = new UserThread(toy);
        ToyThread t2 = new ToyThread(toy);
        Thread userTh = new Thread(t1, "Поток-пользователь");
        Thread toyTh = new Thread(t2, "Поток-игрушка");

        toyTh.start();
        userTh.start();

        userTh.join();
        toyTh.interrupt();
    }

}