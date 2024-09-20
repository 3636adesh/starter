package com.malunjkar.util;

import lombok.experimental.UtilityClass;

import java.util.Collection;
import java.util.function.Supplier;

@UtilityClass
public final class ArraysUtils {

    /**
     * Checks if the collection provided by the supplier is null or empty.
     *
     * @param supplier a supplier providing a collection
     * @return true if the collection is null or empty, false otherwise
     */
    public boolean isEmpty(Supplier<Collection<?>> supplier) {
        Collection<?> collection = supplier.get();
        return collection == null || collection.isEmpty();
    }

    public boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNull(Collection<?> collections) {
        return false;
    }
}
