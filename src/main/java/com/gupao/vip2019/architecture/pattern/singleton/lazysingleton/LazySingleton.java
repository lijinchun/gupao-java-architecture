package com.gupao.vip2019.architecture.pattern.singleton.lazysingleton;

/**
 * @author 李金春
 * @date 2019/5/16 23:58
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){
        if(lazySingleton != null){
            throw new IllegalArgumentException("单例不能构造初始化");
        }
    }

    /**
     * 获取懒汉式单例
     * @return
     */
    public static final LazySingleton getInstance(){
        //加这个判断是为了让并发线程进入方法 double check
        if(lazySingleton == null){
            //线程安全处理,但有一定的性能问题，JDK1.6开始对synchronized优化了
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
