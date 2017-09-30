package com.company.外观模式;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner) {
        this.amp = amp;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        tuner.on();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        amp.off();
        tuner.off();
    }
}
