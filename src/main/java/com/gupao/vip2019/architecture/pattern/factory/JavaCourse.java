package com.gupao.vip2019.architecture.pattern.factory;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 李金春
 * @date 2019/5/13 2:43
 */
@Slf4j
public class JavaCourse implements ICourse {
    public JavaCourse() {
        log.info("\r\ncourse name: {}\r\ncourse price:{}", name(), price());
        record();
    }

    @Override
    public String name() {
        return "Java架构师课程";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(6800.00);
    }

    @Override
    public void record() {
        log.info("java 笔记");
    }
}
