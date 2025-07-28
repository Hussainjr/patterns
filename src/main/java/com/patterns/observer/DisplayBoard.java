package com.patterns.observer;

public class DisplayBoard implements Observer{

    @Override
    public void update(Stock stock) {
        System.out.println("DisplayBoard-The Price of "+stock.getStockName()+ " has changed: "+stock.getStockPrice());
    }
    
}
