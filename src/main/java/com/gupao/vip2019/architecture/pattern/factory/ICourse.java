package com.gupao.vip2019.architecture.pattern.factory;

import java.math.BigDecimal;

/**
 * @author 李金春
 * @date 2019/5/13 2:42
 */
public interface ICourse {
    /**
     * 名字
     * @return 名字
     */
    String name();

    /**
     * 价格
     * @return 价格
     */
    BigDecimal price();

    /**
     * 笔记
     */
    void record();

}
