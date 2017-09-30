package com.company.外观模式;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner);
        homeTheaterFacade.watchMovie("Hello");
        homeTheaterFacade.endMovie();
    }
}
