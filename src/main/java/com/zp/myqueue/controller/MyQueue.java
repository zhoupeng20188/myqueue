package com.zp.myqueue.controller;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author zp
 * @create 2020/8/19 14:52
 */
public class MyQueue {
    public static Queue waitQueue1 = new ArrayBlockingQueue(10);
    public static Queue waitQueue2 = new ArrayBlockingQueue(10);
    public static Queue waitQueue3 = new ArrayBlockingQueue(10);
    public static Queue waitQueue4 = new ArrayBlockingQueue(10);
    public static Queue doneQueue = new ArrayBlockingQueue(10);
}
