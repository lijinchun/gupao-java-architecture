package com.gupao.vip2019.architecture.pattern.singleton;

import com.gupao.vip2019.architecture.pattern.singleton.hungry.HungrySingleton;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @author 李金春
 * @date 2019/5/17 1:55
 */
@Slf4j
public class SerializableSingletonTest{
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1 = seriableSingleton(hungrySingleton);
        log.info("{}", hungrySingleton == hungrySingleton1);
    }

    private static HungrySingleton seriableSingleton(HungrySingleton hungrySingleton) {
        try(
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos)
        ){
            oos.writeObject(hungrySingleton);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            return (HungrySingleton)ois.readObject();
        }catch (Exception e){
            log.error("", e);
        }
        return null;
    }
}
