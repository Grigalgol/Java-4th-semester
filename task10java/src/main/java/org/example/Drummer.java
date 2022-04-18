package org.example;

import org.springframework.stereotype.Component;

@Component
public class Drummer implements Musician{

    @Override
    public void doCoding() {
        System.out.println("Drummer is codding");
    }
}
