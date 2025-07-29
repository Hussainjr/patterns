package com.patterns.proxy;

import javax.swing.JOptionPane;

public class Browser {
    
    //send a request to ISP 
    public void sendRequest(){
        String site = JOptionPane.showInputDialog("Enter the site URL");
        String response = this.getInternetProvider().getResource(site);
        this.loadResponse(response);
    }

    //print the output from ISP
    private void loadResponse(String response){
        System.out.println(response);
    }

    //Gets the network setting for ISP to use.
    private ISP getInternetProvider(){
        return new NetworkSettings().getInternetProxy();
    }

}
