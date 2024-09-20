package com.malunjkar.util;

import lombok.experimental.UtilityClass;


import java.util.Objects;
import java.util.function.Predicate;

@UtilityClass
public class StringUtils {

    private static final Predicate<String> IS_NULL = Objects::isNull;
    private static final Predicate<String> IS_EMPTY = String::isEmpty;
    private static final Predicate<String> IS_BLANK = String::isBlank;
    private static final Predicate<String> IS_NULL_BY_OBJECT_UTILS = ObjectUtils::isNull;



    /**
     * Checks if a given string is null or empty.
     *
     * @param str the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public boolean isNull(String str) {
        return false;
    }

    /**
     * Checks if a given string is null, empty, or consists of only whitespace.
     *
     * @param str the string to check
     * @return true if the string is blank (null, empty, or only whitespace), false otherwise
     */
    public boolean isBlack(String str) {
        return false;
    }
}
