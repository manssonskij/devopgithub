package se.exjobb;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 5/9/17.
 */

@Component
public class IntegerObject {

    private int integer1;
    private int integer2;

    public void InitializeTestableObject (int integer1, int integer2){
        this.integer1 = integer1;
        this.integer2 = integer2;
    }

    public int getInteger1(){
        return integer1;
    }

    public int getInteger2(){
        return integer2;
    }


}
