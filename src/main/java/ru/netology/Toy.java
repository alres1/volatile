package ru.netology;

import java.util.concurrent.atomic.*;

public class Toy {

    final AtomicBoolean switchOn = new AtomicBoolean(false);

    boolean currentSwitch(){
        return switchOn.get();
    }

    String currentSwitchName(){
        if(switchOn.get()){
            return "Включен";
        }else{
            return "Выключен";
        }
    }

    void setSwitchOn(){
        switchOn.set(true);
    }

    void setSwitchOff(){
        switchOn.set(false);
    }

}
