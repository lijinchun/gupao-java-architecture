package com.gupao.vip2019.architecture.pattern.factory.abstractfactory.impls;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.ICourseFactory;
import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.INote;
import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.IVideo;

/**
 * @author 李金春
 * @date 2019/5/16 0:44
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
