package homeWork;

import homeWork.broadcast.Advertising;
import homeWork.broadcast.Broadcast;
import homeWork.broadcast.Interview;

import java.util.ArrayList;
import java.util.List;

public class WorkWithBroadcast {

    private List<Broadcast> arr;
    private int durationInMinutes;

    public WorkWithBroadcast(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        arr = new ArrayList<>();
    }

    public void addPart(Broadcast broadcast) {

        if (broadcast instanceof Advertising || broadcast instanceof Interview) {
            int dur = 0;
            for (Broadcast tr : arr) {
                if ((tr instanceof Advertising || tr instanceof Interview)) {
                    dur += tr.getDuration();
                }
            }
            if (dur + broadcast.getDuration() <= durationInMinutes / 2) {
                arr.add(broadcast);
            }
        } else if (arr.stream().mapToInt(Broadcast::getDuration).sum() < durationInMinutes) {
            arr.add(broadcast);
        }
    }

    public List<Broadcast> getArr() {
        return arr;
    }

    public int durationAllTranslation() {

        int res = 0;
        for (Broadcast tr : arr) {
            res += tr.getDuration();
        }
        return res;
    }

    public double getIncome() {

        return arr.stream().mapToDouble(Broadcast::getIncome).sum();
    }

    public void print() {

        arr.stream().forEach(System.out::println);
    }
}
