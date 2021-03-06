package com.gupao.vip2019.architecture.pattern.factory.abstractfactory.impls;

import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.INote;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李金春
 * @date 2019/5/16 0:34
 */
@Slf4j
public class JavaNote implements INote {
    JavaNote() {
        log.info("java not init");
    }
}
