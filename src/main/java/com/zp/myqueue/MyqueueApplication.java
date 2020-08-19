package com.zp.myqueue;

import com.zp.myqueue.controller.MyQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Queue;

@SpringBootApplication
public class MyqueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyqueueApplication.class, args);
        new Thread(()->{
            Queue queue = MyQueue.waitQueue1;
            for(;;){
                if(queue.size() > 0){
                    int id = (int) queue.poll();
                    try {
                        System.out.println(id);
                        // 停顿2秒，模拟处理时间
                        Thread.sleep(2000);
                        MyQueue.doneQueue.add(id);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(()->{
            Queue queue = MyQueue.waitQueue2;
            for(;;){
                if(queue.size() > 0){
                    int id = (int) queue.poll();
                    try {
                        System.out.println(id);
                        // 停顿2秒，模拟处理时间
                        Thread.sleep(2000);
                        MyQueue.doneQueue.add(id);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(()->{
            Queue queue = MyQueue.waitQueue3;
            for(;;){
                if(queue.size() > 0){
                    int id = (int) queue.poll();
                    try {
                        System.out.println(id);
                        // 停顿2秒，模拟处理时间
                        Thread.sleep(2000);
                        MyQueue.doneQueue.add(id);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(()->{
            Queue queue = MyQueue.waitQueue4;
            for(;;){
                if(queue.size() > 0){
                    int id = (int) queue.poll();
                    try {
                        System.out.println(id);
                        // 停顿2秒，模拟处理时间
                        Thread.sleep(2000);
                        MyQueue.doneQueue.add(id);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
