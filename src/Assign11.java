import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TransferQueue;

public class Assign11 {

    private String color;
    private int duration;
    private Timer timer;
    public String getColor() {
        return color;
    }

    public Assign11(String initialColor, int initialDuration){

        color = initialColor;
        duration = initialDuration;
        timer = new Timer();
        schedulColorChange();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void changeColor(){

        if("Red".equalsIgnoreCase(getColor())){
            setColor("Green");
            setDuration(5);
            System.out.println("Traffic light changed to Green for " + 5 + " seconds.");
        }
        else{
            setColor("Red");
            setDuration(5);
            System.out.println("Traffic light changed to Red for " + 5 + " seconds.");
        }
    }
    public void schedulColorChange(){

        int i;

        timer.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run(){

                changeColor();
            }
            }, 0, 5*1000);

    }

    public static void main(String args[]){

        Assign11 trafficLight = new Assign11("red", 5);

        System.out.println("inital traffic light color : "+ trafficLight.getColor()+ ", Duration: " + trafficLight.getDuration()+ " seconds");

        trafficLight.changeColor();
        System.out.println("Updated Traffic Light Color: " + trafficLight.getColor() +
                ", Duration: " + trafficLight.getDuration() + " seconds");


    }




}
