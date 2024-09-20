package com.malunjkar.util;


import lombok.experimental.UtilityClass;

import java.util.Collection;


@UtilityClass
public final class ObjectUtils {

    public boolean isNull(Object obj){
        if(obj instanceof Collection<?> collection){
            return  ArraysUtils.isEmpty(collection);
        }
        return false;
    }



}
