package com.gupao.vip2019.architecture.pattern.prototype.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lijinchun
 * @Package com.gupao.vip2019.architecture.pattern.prototype.simple
 * @date 2019/8/13 22:32
 */
@Slf4j
public class PrototypeTest {

    public static void main(String[] args) {
        ClonePerson person = new ClonePerson();
        person.setName("张三");
        person.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("GAME");
        hobbies.add("Study");
        person.setHobbies(hobbies);
        log.debug("{}", person.getHobbies()== person.toBean(ClonePerson.class).getHobbies());
        log.debug("{}", person.getHobbies()== person.toBeenWithDeepClone().getHobbies());
    }
}
