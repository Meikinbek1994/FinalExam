package Model;

import java.util.Calendar;

public class Phone {
    private long Id;
    private String model;
    private int memory;
    private int yearOfIssue;
    private int price;
    //Constructor


    public Phone(long id, String model, int memory, int yearOfIssue, int price)  throws IllegalArgumentException {
        // Validate input
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        if (memory < 0) {
            throw new IllegalArgumentException("Memory cannot be negative");
        }
        if (yearOfIssue > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new IllegalArgumentException("Year of issue cannot be in the future");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        Id = id;
        this.model = model;
        this.memory = memory;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }
    //Getter&Setter

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Id=" + Id +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", yearOfIssue=" + yearOfIssue +
                ", price=" + price +
                '}';
    }
}
