package com.xiaohoo.activity;

import com.xiaohoo.activity.service.TestService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityApplicationTests {

    @Autowired
    private TestService testService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void activityStartTest() {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
    }

    @Test
    public void testStartProcess() {
        System.out.println("start...");
        ProcessInstance pi = runtimeService.startProcessInstanceByKey("myProcess", "1");
        System.out.println("流程启动成功，流程id：" + pi.getId());
    }

    @Test
    public void findTasksByUserId() {
        String userId = "xiaoming";
        List<Task> resultTask = taskService.createTaskQuery().processDefinitionKey("myProcess").taskCandidateOrAssigned(userId).list();
        System.out.println("任务列表：" + resultTask);
    }
}
