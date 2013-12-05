package com.thoughtworks.yafei;

public class Strawberry {
    private String taste;

    @Override
    public String toString() {
        return "The strawberry has a taste of " + taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
