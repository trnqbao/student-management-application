package com.tqbao.studentmanagement.Model;

public class Certificate {
    private int id;
    private String name;

    public Certificate() {}

    public Certificate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Certificate(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
