package com.gupao.vip2019.architecture.pattern.factory;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 李金春
 * @date 2019/5/14 23:50
 */
@Slf4j
public class JavascriptCourse implements ICourse {
    public JavascriptCourse() {
        log.info("\r\ncourse name: {}\r\ncourse price:{}", name(), price());
        record();
    }

    @Override
    public String name() {
        return "JavaScript course";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(2888.00);
    }

    @Override
    public void record() {
        log.info("record javascript course");
    }
}
