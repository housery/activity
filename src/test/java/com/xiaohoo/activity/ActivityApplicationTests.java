package com.xiaohoo.activity;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void activityStartTest() {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
    }

}
