package com.patterns.proxy;

public class NetworkSettings {
    public ISP getInternetProxy(){
        return new InternetProxy();
    }

    public ISP getISP(){
        return new Vodafone();
    }

}
