package com.gupao.vip2019.architecture.pattern.factory.abstractfactory;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;

/**
 * @author 李金春
 * @date 2019/5/16 0:30
 */
public interface ICourseFactory {
    /**
     * 创建课程
     * @return
     */
    ICourse createCourse();

    /**
     * 创建笔记
     * @return
     */
    INote createNote();

    /**
     * 创建视频
     * @return
     */
    IVideo createVideo();
}
