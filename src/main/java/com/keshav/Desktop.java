package com.keshav;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Object created desktop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling by Desktop");
    }
}
