package ttw.com.sandbox.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ttw.com.sandbox.service.LogicService;

public class SomeUnitTest {

    @Test
    public void test(){
        LogicService logicService = new LogicService();
        assertEquals(6, logicService.doMath(new int[] {1, 2, 3}));
    }
}