package com.gupao.vip2019.architecture.pattern.prototype.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.io.*;

/**
 * 用Bean包装转换、VO、DTO、MODEL、ENTITY 相互转换
 * @author Lijinchun
 * @Package com.gupao.vip2019.architecture.pattern.prototype.simple
 * @date 2019/8/13 23:13
 */
public interface BeanWrapper<T> extends Cloneable, Serializable {
    /**
     * 使用Spring BeanUtils 做浅拷贝
     * @param clazz
     * @return
     */
    default T toBean(Class<T> clazz){
        Logger log = LoggerFactory.getLogger(this.getClass());
        T t = null;
        try {
            t = clazz.newInstance();
            BeanUtils.copyProperties(this, t);
        } catch (Exception e) {
            log.error("", e);
        }
        return t;
    }


    /**
     * 基于字节流作深度拷贝
     * @return
     */
    default T toBeenWithDeepClone(){
        T t = null;
        Logger log = LoggerFactory.getLogger(this.getClass());
        try(
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos)
                ){
            oos.writeObject(this);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            t = ((T) ois.readObject());
            ois.close();

        }catch (Exception e){
            log.error("", e);
        }
        return t;
    }
}
