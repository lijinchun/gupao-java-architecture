package com.gupao.vip2019.architecture.pattern.factory.abstractfactory.impls;

import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.INote;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李金春
 * @date 2019/5/16 0:47
 */
@Slf4j
public class PythonNote implements INote {
    PythonNote() {
        log.info("python note init");
    }
}
