package com.gupao.vip2019.architecture.pattern.factory.factorymethod;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import com.gupao.vip2019.architecture.pattern.factory.JavascriptCourse;

/**
 * @author 李金春
 * @date 2019/5/15 0:04
 */
public class JavascriptCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavascriptCourse();
    }
}
