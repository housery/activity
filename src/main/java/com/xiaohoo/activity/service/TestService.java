package com.xiaohoo.activity.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author: xiaohoo
 * @date: 2019/5/16 22:46
 * @email: 1126457667@qq.com
 */
@Service
public class TestService {

    public void activiti() {
        System.out.println("任务开始执行。。。。。。");
    }

    public List<String> user() {
        return Arrays.asList("xiaoming", "xiaohong");
    }
}
