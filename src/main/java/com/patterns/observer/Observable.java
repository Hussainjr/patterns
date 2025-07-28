package com.patterns.observer;

public interface Observable {
    public void registerObserver(Observer observer);
    public void notifyObsers();
    public void removeObserver(Observer observer);
}
