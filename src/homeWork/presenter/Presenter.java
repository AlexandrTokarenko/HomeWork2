package homeWork.presenter;

import homeWork.broadcast.Broadcast;

import java.util.List;

// паттерн Builder
public class Presenter {

    private String name;
    private int workExperience;
    private String resume;
    private List<Broadcast> broadcastList;

    public Presenter(String name, int workExperience, List<Broadcast> list) {

        this.name = name;
        this.workExperience = workExperience;
        this.broadcastList = list;
    }

    public Presenter(String name,List<Broadcast> list, String resume) {

        this.name = name;
        this.broadcastList = list;
        this.resume = resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<Broadcast> getBroadcastList() {
        return broadcastList;
    }

    public void setBroadcastList(List<Broadcast> broadcastList) {
        this.broadcastList = broadcastList;
    }

    @Override
    public String toString() {
        return "Presenter{" +
                "name='" + name + '\'' +
                ", workExperience=" + workExperience +
                ", resume='" + resume + '\'' +
                ", broadcastList=" + broadcastList +
                '}';
    }
}
