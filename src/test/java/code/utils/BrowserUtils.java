package code.utils;

import java.util.concurrent.TimeUnit;

public class BrowserUtils extends Driver{

    //We creating browserutils to store useful methods to achive more understanable coding experience
    //for coding reausibility

    public static void staticWait(int second){

        try{
            Thread.sleep(1000*second);

        }
        catch (InterruptedException e){
            e.printStackTrace();

        }

    }
    public static void setWaitTime(){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
