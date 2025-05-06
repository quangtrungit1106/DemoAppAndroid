package com.example.demogirdviewnangcao;

import java.io.Serializable;

public class Image implements Serializable {
    private int number;
    private String name;

    public Image(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
