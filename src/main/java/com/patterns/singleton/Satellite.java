package com.patterns.singleton;

public class Satellite {

    private static Satellite _instance;

    private Satellite(){}

    private static class InnerSatellite {
        private static final Satellite _innerInstance = new Satellite();
    }

    public static Satellite getSatellite(){
        
        return InnerSatellite._innerInstance;
                
        // if(_instance == null){
        //     _instance = new Satellite();
        // }
        // return _instance;
    }

}
