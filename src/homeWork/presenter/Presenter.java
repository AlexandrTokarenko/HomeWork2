package homeWork.presenter;

import homeWork.broadcast.Broadcast;

import java.util.List;

public class Presenter {

    private String name;
    private int workExperience;
    private String resume;
    private List<Broadcast> broadcastList;

    private Presenter() {

    }

    public static class Builder {

        private String name;
        private int workExperience;
        private String resume;
        private List<Broadcast> broadcastList;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder workExperience(int workExperience) {
            this.workExperience = workExperience;
            return this;
        }

        public Builder resume(String resume) {
            this.resume = resume;
            return this;
        }

        public Builder broadcastList(List<Broadcast> broadcastList) {
            this.broadcastList = broadcastList;
            return this;
        }

        public Presenter build() {
            Presenter presenter = new Presenter();
            presenter.name = name;
            presenter.workExperience = workExperience;
            presenter.resume = resume;
            presenter.broadcastList = broadcastList;
            return presenter;
        }
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
