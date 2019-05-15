package com.gupao.vip2019.architecture.pattern.factory.abstractfactory.impls;

import com.gupao.vip2019.architecture.pattern.factory.ICourse;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 李金春
 * @date 2019/5/16 0:45
 */
@Slf4j
public class PythonCourse implements ICourse {
    PythonCourse() {
        log.info("\r\ncourse name: {}\r\ncourse price:{}", name(), price());
        record();
    }

    @Override
    public String name() {
        return "Python course";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(250.00);
    }

    @Override
    public void record() {
        log.info("record python note");
    }
}
