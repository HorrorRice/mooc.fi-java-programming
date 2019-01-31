
public class Clock {

    private BoundedCounter hours = new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {

        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);

    }

    public void tick() {

        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
        }
        if (minutes.getValue() == 0 && seconds.getValue() == 0) {
            hours.next();
        }

    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
