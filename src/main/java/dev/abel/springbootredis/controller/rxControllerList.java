package dev.abel.springbootredis.controller;

public class rxControllerList {
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public rxControllerList(long id) {

        this.id = id;
    }

    @Override
    public String toString() {
        return "rxControllerList{" +
                "id=" + id +
                '}';
    }
}
