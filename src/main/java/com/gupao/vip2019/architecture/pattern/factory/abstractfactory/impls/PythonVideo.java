package com.gupao.vip2019.architecture.pattern.factory.abstractfactory.impls;

import com.gupao.vip2019.architecture.pattern.factory.abstractfactory.IVideo;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李金春
 * @date 2019/5/16 0:48
 */
@Slf4j
public class PythonVideo implements IVideo {
    PythonVideo() {
        log.info("python video init");
    }
}
