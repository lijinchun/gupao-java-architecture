package com.gupao.vip2019.architecture.pattern.prototype.simple;

import lombok.Data;

import java.util.List;

/**
 * @author Lijinchun
 * @Package com.gupao.vip2019.architecture.pattern.prototype.simple
 * @date 2019/8/13 22:22
 */
@Data
public class ClonePerson implements BeanWrapper<ClonePerson> {
    private String name;
    private Integer age;
    private List<String> hobbies;
}
