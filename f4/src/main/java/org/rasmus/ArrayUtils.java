package org.rasmus;

public class ArrayUtils {
    public static <T> T getFirstOrDefault(T[] list, T defaultValue) {
      if (list.length == 0) {
          return defaultValue;
      }

      return list[0];
    }
}
