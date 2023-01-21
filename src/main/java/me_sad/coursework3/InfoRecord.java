package me_sad.coursework3;

public class InfoRecord {
    private final String name;
    private final String description;


    public InfoRecord(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
