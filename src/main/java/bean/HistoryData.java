package bean;

import java.util.Date;
import java.util.List;

public class HistoryData {
    private String id;
    private Date date;
    private List<Animal> animals;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }
}
