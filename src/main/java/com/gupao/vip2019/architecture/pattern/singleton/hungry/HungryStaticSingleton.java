package com.gupao.vip2019.architecture.pattern.singleton.hungry;

/**
 * @author 李金春
 * @date 2019/5/17 0:03
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton INSTANCE;
    static {
        INSTANCE = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){
        if(INSTANCE != null){
            throw new IllegalArgumentException("单例不能构造初始化");
        }
    }

    /**
     * 获取饿汉式单例
     * @return
     */
    public static HungryStaticSingleton getInstance(){
        return INSTANCE;
    }
}
