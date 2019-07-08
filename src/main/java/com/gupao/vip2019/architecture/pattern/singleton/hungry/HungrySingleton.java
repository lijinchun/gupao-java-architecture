package com.gupao.vip2019.architecture.pattern.singleton.hungry;

import java.io.Serializable;

/**
 * @author 李金春
 * @date 2019/5/16 23:54
 */
public class HungrySingleton implements Serializable {
    private static final HungrySingleton INSTANCE = new HungrySingleton();
    private HungrySingleton(){
        if(INSTANCE != null){
            throw new IllegalArgumentException("单例不能构造初始化");
        }
    }

    /**
     * 返序列化破坏
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }

    /**
     * 获取饿汉式单例
     * @return
     */
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
