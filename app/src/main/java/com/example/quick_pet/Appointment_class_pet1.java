package com.example.quick_pet;

public class Appointment_class_pet1 {
    private int id;
    private String type;
    private String Name;
    private String date;
    private String time;
    private String direction;
    private String reminder;

    public Appointment_class_pet1(int id, String type, String name, String date, String time, String direction, String reminder) {
        this.id = id;
        this.type = type;
        this.Name = name;
        this.date = date;
        this.time = time;
        this.direction = direction;
        this.reminder = reminder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Appointment_class_pet1{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", Name='" + Name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", direction='" + direction + '\'' +
                ", reminder='" + reminder + '\'' +
                '}';
    }
}
