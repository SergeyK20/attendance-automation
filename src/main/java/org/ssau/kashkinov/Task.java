package org.ssau.kashkinov;

import java.util.TimerTask;

public class Task extends TimerTask {

    private int count;

    @Override
    public void run() {
        System.out.println("Hello!!! " + count++);
    }
}
