package com.gupao.vip2019.architecture.pattern.factory.factorymethod;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;

/**
 * @author 李金春
 * @date 2019/5/15 0:00
 */
public interface ICourseFactory {
    /**
     * 课程创建
     * @return
     */
    ICourse create();
}
