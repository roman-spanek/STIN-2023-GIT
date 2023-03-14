package cz.tul.roman.spanek.stin;

import cz.tul.roman.spanek.stin.impl.StinToTestImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StinToTestImplTest {

    private StinToTestImpl stinToTest = new StinToTestImpl();;

    @Test
    void sumMehodTest() {
        Assertions.assertEquals(13, stinToTest.sum(11 , 2));
    }

    @Test
    void sumMehodTest2(){
        Assertions.assertEquals(0, stinToTest.sum(0 , 0));
    }

    
    @Test
    void sumMehodTest3(){
        Assertions.assertEquals(-2, stinToTest.sum(-1 , -1));
    }

}
