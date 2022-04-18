package org.example;

import org.springframework.stereotype.Component;

@Component
public class Trombonist implements Musician{
    @Override
    public void doCoding() {
        System.out.println("Trombonist is codding");
    }
}
