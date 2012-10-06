package com.stewsters.samurai.test;

import com.stewsters.samurai.model.enums.Gender;
import com.stewsters.samurai.model.enums.SocialClass;
import com.stewsters.samurai.model.world.NameGenerator;
import org.junit.Test;

public class TestNameGeneration {

    @Test
    public void generateSomeNames(){
        for (int i = 0; i < 10 ; i++)
            System.out.println(NameGenerator.getName(SocialClass.SAMURAI, Gender.MALE));

        for (int i = 0; i < 10 ; i++)
            System.out.println(NameGenerator.getName(SocialClass.SAMURAI, Gender.FEMALE));
    }

}
