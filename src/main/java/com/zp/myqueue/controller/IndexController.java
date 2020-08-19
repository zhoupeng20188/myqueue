package com.zp.myqueue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2020/8/19 14:50
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(int id) {
        int index = id % 3;
        if (index == 0) {
            MyQueue.waitQueue1.add(id);
        } else if (index == 1) {
            MyQueue.waitQueue2.add(id);
        } else if (index == 2) {
            MyQueue.waitQueue3.add(id);
        } else if (index == 3) {
            MyQueue.waitQueue4.add(id);
        }
        while (!MyQueue.doneQueue.contains(id)) {
        }
        return "OK";
    }
}
