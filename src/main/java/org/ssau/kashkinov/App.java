package org.ssau.kashkinov;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class App 
{
    public static void main( String[] args )
    {
        TimerTask timerTask = new Task();
        Timer timer = new Timer();
        
        Date date = new Date();

        timer.schedule(timerTask, date, 5000);
    }
}
