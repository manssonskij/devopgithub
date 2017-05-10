package se.exjobb;

import org.springframework.stereotype.Component;

/**
 * Created by anton on 5/9/17.
 */

@Component
public class StringObject {

    private String string1;
    private String string2;

    public void TestableStringObject (String string1, String string2){
        this.string1 = string1;
        this.string2 = string2;
    }

    public String getStrings(){
        return string1 + string2;
    }

    public String getReversedStrings(){
       return new StringBuilder(getStrings()).reverse().toString();
    }

}
