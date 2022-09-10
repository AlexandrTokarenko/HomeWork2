package homeWork;

import homeWork.broadcast.Advertising;
import homeWork.broadcast.Interview;
import homeWork.broadcast.Song;

public class Main {

    public static void main(String[] args) {

        WorkWithBroadcast workWithBroadcast = new WorkWithBroadcast(10);
        workWithBroadcast.addPart(new Interview("Oleg",200));
        workWithBroadcast.addPart(new Advertising("Coca Cola",40));
        workWithBroadcast.addPart(new Song("Hostel","Timati",130));

        workWithBroadcast.addPart(new Interview("Gosha",180)); // не войдет в трансляцию

        workWithBroadcast.addPart(new Song("Original ba","Guf",150));
        workWithBroadcast.addPart(new Song("Original ba","Guf",200));
        workWithBroadcast.print();
    }
}
