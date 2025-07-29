package com.patterns.proxy;

public class Vodafone implements ISP{

    @Override
    public String getResource(String site) {
        switch (site) {
            case"www.google.com":
                return "Google";
            case"www.yahoo.com":
                return "Yahoo";
            default:
                return "sorry no resource found";

        }
    }
    
}
