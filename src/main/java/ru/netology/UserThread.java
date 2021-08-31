package ru.netology;

public class UserThread implements Runnable {

    private int repeatCount = 5;
    private int repeatTime = 4000;
    Toy toy;

    public UserThread(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        for (int i = 1; i <= repeatCount; i++) {
            try {
                System.out.println("Тумблер " + toy.currentSwitchName());
                Thread.sleep(repeatTime);
                if (!toy.currentSwitch()) {
                    toy.setSwitchOn();
                    System.out.println(Thread.currentThread().getName() + " включил тумблер");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
