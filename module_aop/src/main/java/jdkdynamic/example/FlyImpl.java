package jdkdynamic.example;

import org.springframework.stereotype.Component;

@Component
public class FlyImpl implements Fly{

    @Override
    public boolean canFly() {
        return true;
    }
}


