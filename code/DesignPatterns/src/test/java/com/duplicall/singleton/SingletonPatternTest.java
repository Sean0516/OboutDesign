package com.duplicall.singleton;

import com.duplicall.singleton.hungry.EnumSingletonPattern;
import com.duplicall.singleton.hungry.HungryPattern;
import com.duplicall.singleton.hungry.InnerClassSingletonPattern;
import com.duplicall.singleton.sluggard.OneLockSingletonPattern;
import com.duplicall.singleton.sluggard.SluggardSingletonPattern;
import com.duplicall.singleton.sluggard.TwoLockSingletonPattern;
import org.junit.Test;

public class SingletonPatternTest {

    @Test
    public void hungryPatternTest(){
        HungryPattern.getInstance();
    }
    @Test
    public void innerClassPattern(){
        InnerClassSingletonPattern.getInstance();
    }

    @Test
    public void enumPatternTest(){
        EnumSingletonPattern.INSTANCE.say();
    }
    @Test
    public void sluggardSingletonPatternTest(){
        SluggardSingletonPattern.getInstance();
    }
     @Test
    public void oneLockSingletonPattern(){
        OneLockSingletonPattern.getInstance();
     }
     @Test
    public void twoLockSingletonPattern(){
         TwoLockSingletonPattern.getInstance();
     }

}