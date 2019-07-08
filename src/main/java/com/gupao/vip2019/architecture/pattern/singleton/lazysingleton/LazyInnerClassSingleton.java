package com.gupao.vip2019.architecture.pattern.singleton.lazysingleton;

/**
 * @author 李金春
 * @date 2019/5/17 1:34
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyInnerClassSingleton.LazyHolder.LAZY_INNER_CLASS_SINGLETON != null){
            throw new IllegalArgumentException("单例不能构造初始化");
        }}

    /**
     * 懒汉式单例
     *  LazyHolder里央的逻辑等外部方法调用时才会执行
     *  利用内部类的加载机制
     *  JVM底层执行逻辑，完美避免线程安全问题
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        return LazyInnerClassSingleton.LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }
}
