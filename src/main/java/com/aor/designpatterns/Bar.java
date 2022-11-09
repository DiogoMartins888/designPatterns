package com.aor.designpatterns;

import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    protected boolean happyHour;
    List<BarObserver> observers;

    protected Bar() {
        this.happyHour = false;
        this.observers = new ArrayList<>();
    }

    public void addObserver(BarObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : this.observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();
}
