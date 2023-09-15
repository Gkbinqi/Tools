import java.util.ArrayList;
import java.util.List;
public class Timer {
    private long start;
    private List<Double> timeRecords;

    public Timer() {
        start = System.currentTimeMillis();
        timeRecords = new ArrayList<>();
    }
    /** Reset the timer, set the start to current time */
    public void resetAll() {
        start = System.currentTimeMillis();
        timeRecords.clear();
    }

    public void reset() {
        start = System.currentTimeMillis();
    }

    public void click() {
        timeRecords.add(timeCountInSeconds());
    }

    public double getTimeNow() {
        return timeCountInSeconds();
    }

    public List<Double> getTimeRecords() {
        return timeRecords;
    }

    public void printTimeRecords () {
        System.out.printf("%6s %12s \n", "Index", "time (s)");
        System.out.println("-----------------------");
        for(int i = 0; i< timeRecords.size(); i++) {
            System.out.printf("%6s %12s \n", i, timeRecords.get(i));
        }
    }

    private double timeCountInSeconds() {
        long now = System.currentTimeMillis();
        return (now - start)/1000.0;
    }
}
