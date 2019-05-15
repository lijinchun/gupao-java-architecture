package com.gupao.vip2019.architecture.pattern.factory.simplefactory;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

/**
 * @author 李金春
 * @date 2019/5/13 3:09
 */
@Slf4j
public class SimpleFactory {
    private SimpleFactory(){}
    public static ICourse create(Class<? extends ICourse> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException|IllegalAccessException e) {
            log.error("", e);
        }
        return null;
    }
    public static ICourse create(String className){
        Assert.notNull(className, "class name is null");
        try {
            Class clazz = Class.forName(className);
            Object obj = clazz.newInstance();
            Assert.isTrue(obj instanceof ICourse, "this class is not a instance of ICourse");
            return (ICourse) obj;

        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e) {
            log.error("", e);
        }
        return null;
    }
}
