package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String name;

    private int yearOfPublish;

    private List<Actor> actors = new ArrayList<>();

    public Movie(String name, int yearOfPublish) {
        this.name = name;
        this.yearOfPublish = yearOfPublish;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    int actorsInTheirTwenites() {
        int result = 0;
        for (Actor actor : actors) {
            int age = yearOfPublish - actor.getYearOfBirth();
            if (age >= 20 && age < 30) {
                result++;
            }
        }
        return result;
    }
}
