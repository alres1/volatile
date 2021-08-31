package ru.netology;

public class ToyThread implements Runnable {

    private int repeatTime = 200;
    Toy toy;

    public ToyThread(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(repeatTime);
                if (toy.currentSwitch()) {
                    toy.setSwitchOff();
                    System.out.println(Thread.currentThread().getName() + " выключил тумблер");
                    System.out.println("Тумблер " + toy.currentSwitchName());
                }
            } catch (InterruptedException e) {
                if (toy.currentSwitch()) {
                    toy.setSwitchOff();
                    System.out.println(Thread.currentThread().getName() + " выключил тумблер");
                    System.out.println("Тумблер " + toy.currentSwitchName());
                }
                System.out.println("Поток закрыт");
                break;
            }
        }
    }

}
