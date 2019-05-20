package com.example.humanoop;

import android.util.Log;

public class Anna extends Human  {
    public int height;

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public Anna(String name, int age, int weight) {
        super(name, age, weight);

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight = weight + 2;
        Log.d("Anna", "Your new weight is" + weight);
    }

    @Override
    public void birthday() {
//        super.birthday();
        age = age + 4;
        Log.d("Anna", "Your new age is" + age);
    }
}
