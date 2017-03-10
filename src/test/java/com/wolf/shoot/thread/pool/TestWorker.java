package com.wolf.shoot.thread.pool;

import com.wolf.shoot.common.thread.worker.AbstractWork;

/**
 * Created by jiangwenping on 17/3/10.
 */
public class TestWorker extends AbstractWork{

    private int i;

    public TestWorker(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
