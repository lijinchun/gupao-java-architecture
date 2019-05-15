package com.gupao.vip2019.architecture.pattern.factory.factorymethod;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import com.gupao.vip2019.architecture.pattern.factory.JavaCourse;

/**
 * @author 李金春
 * @date 2019/5/15 0:01
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
