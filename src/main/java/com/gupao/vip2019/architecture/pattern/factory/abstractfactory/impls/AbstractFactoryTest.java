package com.gupao.vip2019.architecture.pattern.factory.abstractfactory.impls;

import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.ICourseFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象工厂模式：
 *      不依赖于产品 类实例如何被创建、实现细节
 *      强调一系列相关的产品对象
 *      提供一个所有产品类的库，所有产品 以同样的接口出现，从而合客户端不依赖具体实现。
 *      不符合“开闭原则”，但它易于扩展，不适合经常变化的场景
 *      优点：
 *          具体产品在应用层代码隔离，无须关心创建细节
 *          将一系列的产品族统一到一起创建
 *      缺点：
 *          规定了所有可能被创建 的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 *          增加了系统的抽象性和理解 难度
 *
 * @author 李金春
 * @date 2019/5/16 0:44
 */
public class AbstractFactoryTest {
    private static final List<ICourseFactory> COURSE_FACTORIES = new ArrayList<>();
    static {
        COURSE_FACTORIES.add(new JavaCourseFactory());
        COURSE_FACTORIES.add(new PythonCourseFactory());
    }
    public static void main(String[] args) {
        for (ICourseFactory courseFactory : COURSE_FACTORIES) {
            courseFactory.createCourse();
            courseFactory.createNote();
            courseFactory.createVideo();
        }
    }
}
