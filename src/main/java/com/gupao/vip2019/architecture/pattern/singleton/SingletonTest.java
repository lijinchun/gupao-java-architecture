package com.gupao.vip2019.architecture.pattern.singleton;

import com.gupao.vip2019.architecture.pattern.singleton.hungry.HungrySingleton;
import com.gupao.vip2019.architecture.pattern.singleton.hungry.HungryStaticSingleton;
import com.gupao.vip2019.architecture.pattern.singleton.lazysingleton.LazyInnerClassSingleton;
import com.gupao.vip2019.architecture.pattern.singleton.lazysingleton.LazySingleton;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

/**
 * @author 李金春
 * @date 2019/5/17 0:05
 */
@Slf4j
public class SingletonTest {
    public static void main(String[] args) {
        long t1 = concurrent(()->{
            log.debug(HungrySingleton.getInstance().toString());
        }, 100);

        long t2 = concurrent(()->{
            log.debug(HungryStaticSingleton.getInstance().toString());
        }, 100);

        long t3 = concurrent(()->{
            log.debug(LazySingleton.getInstance().toString());
        }, 100);
        log.info("\nt1:{}\r\nt2:{}\r\nt3:{}", t1, t2, t3);

        long t4 = concurrent(()->{
            log.debug(LazyInnerClassSingleton.getInstance().toString());
        }, 100);
        log.info("\nt1:{}\r\nt2:{}\r\nt3:{}\r\nt4:{}", t1, t2, t3, t4);
    }

    private static long concurrent(Runnable runnable, int concurrentCount){
        //发令枪
        CountDownLatch latch = new CountDownLatch(concurrentCount);
        //计时
        CountDownLatch latch2 = new CountDownLatch(concurrentCount);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < concurrentCount; i++) {
            new Thread(() -> {
                try {
                    // 阻塞
                    // count = 0 就会释放所有的共享锁
                    // 万箭齐发
                    latch.await();
                } catch (InterruptedException e) {
                    log.error("", e);
                }
                runnable.run();
                latch2.countDown();
            }).start();
            //每次启动一个线程，count --
            latch.countDown();
        }
        try {
            latch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
