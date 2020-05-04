package org.lemon.jdksource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月29日 15:50:00
 */
public class ConcurrentHashMapUsage {

    public static void main(String[] args) throws ClassNotFoundException {
        Map<String, String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put("key" + i, "value" + i);
        }

    }
}
