package homeWork.broadcast;

public class Advertising implements Broadcast {

    private final int pricePerSecond = 5;
    private String name;
    private int timeInSeconds;

    public Advertising(String name, int timeInSeconds) {

        this.name = name;
        this.timeInSeconds = timeInSeconds;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getDuration() {

        return (int) Math.ceil(timeInSeconds/60.);
    }

    @Override
    public int getPrice() {
        return pricePerSecond;
    }

    @Override
    public double getIncome() {

        return timeInSeconds * pricePerSecond;
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "pricePerSecond=" + pricePerSecond +
                ", name='" + name + '\'' +
                ", timeInSeconds=" + timeInSeconds +
                '}';
    }
}
