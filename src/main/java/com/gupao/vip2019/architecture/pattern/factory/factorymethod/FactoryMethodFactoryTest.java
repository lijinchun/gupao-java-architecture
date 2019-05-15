package com.gupao.vip2019.architecture.pattern.factory.factorymethod;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import lombok.extern.slf4j.Slf4j;

/**
 * 工厂方法模式：
 *          适用于大量重复代码
 *          客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 *          一个类通过其子类来指定创建哪个对象
 *          优点：
 *              只需要关心所需产品对应该的工厂，无需关心创建细节
 *              加入新产品符合开闭原则，提高了系统的可扩展性
 *          缺点：
 *              类的个数容易过多，增加了代码结构的复杂度
 *              增加了系统的抽象性和理解难度
 *
 *     一般情况下会结合策略模式一起使用
 * @author 李金春
 * @date 2019/5/15 0:14
 */
@Slf4j
public class FactoryMethodFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        log.info("\r\ncourse name: {}\r\ncourse price:{}\r\n", course.name(), course.price());
        factory = new JavascriptCourseFactory();
        course = factory.create();
        log.info("\r\ncourse name: {}\r\ncourse price:{}\r\n", course.name(), course.price());
    }
}
