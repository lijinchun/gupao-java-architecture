package com.gupao.vip2019.architecture.pattern.factory.simplefactory;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import com.gupao.vip2019.architecture.pattern.factory.JavaCourse;
import com.gupao.vip2019.architecture.pattern.factory.JavascriptCourse;
import lombok.extern.slf4j.Slf4j;

/**
 * 简单工厂模式：
 *      工厂类负责创建的对象比较少
 *      客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 *      优点：
 *          只需要传入一个正确的参数，就可以获取你所需要的对象无须知道其创建的细节
 *      缺点：
 *          工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
 *          不易于扩展过于复杂的产品结构
 *      举例：JDK Calendar
 * @author 李金春
 * @date 2019/5/13 2:43
 */
@Slf4j
public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICourse course = SimpleFactory.create(JavaCourse.class);
        log.info("\r\ncourse name: {}\r\ncourse price:{}\r\n", course.name(), course.price());
        course.record();
        course = SimpleFactory.create(JavascriptCourse.class.getName());
        log.info("\r\ncourse name: {}\r\ncourse price:{}\r\n", course.name(), course.price());
        course.record();
    }
}
