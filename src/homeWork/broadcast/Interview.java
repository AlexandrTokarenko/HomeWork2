package homeWork.broadcast;

public class Interview implements Broadcast {

    private String nameInterviewer;
    private final int pricePerMinute = 30;

    private int timeInSeconds;

    public Interview(String nameInterviewer,int timeInSeconds) {

        this.nameInterviewer = nameInterviewer;
        this.timeInSeconds = timeInSeconds;
    }

    public String getNameInterviewer() {
        return nameInterviewer;
    }

    public int getPricePerMinute() {
        return pricePerMinute;
    }

    @Override
    public int getDuration() {
        return (int) Math.ceil(timeInSeconds/60.);
    }

    @Override
    public int getPrice() {
        return pricePerMinute;
    }

    @Override
    public double getIncome() {

        return  timeInSeconds * pricePerMinute/60;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "nameInterviewer='" + nameInterviewer + '\'' +
                ", pricePerMinute=" + pricePerMinute +
                ", timeInSeconds=" + timeInSeconds +
                '}';
    }
}
