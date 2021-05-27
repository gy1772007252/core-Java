package com.briup.day.day18.Test.ObjectPool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ObjectPool {

    private static Map<String, String> map = new HashMap<>();
    static {
        map.put("person", "Test.ObjectPool.Person");
        map.put("user", "Test.ObjectPool.User");
    }

    private static Map<String, Object> objectPool = new HashMap<>();

    public void initPool() throws Exception {
        Set<Map.Entry<String, String>> objectEntry = map.entrySet();
        for (Map.Entry<String, String> entry : objectEntry) {
            String objectName = entry.getKey();
            String objectUrl = entry.getValue();
            Object object = createObject(objectUrl);
            objectPool.put(objectName, object);
        }
    }

    public Object createObject(String objectUrl) throws Exception {
        Class c = Class.forName(objectUrl);
        Object o = c.getConstructor().newInstance();
        return o;
    }

    public Object getObject(String name) {
        return objectPool.get(name);
    }

    public static void main(String[] args) throws Exception{

        ObjectPool pool = new ObjectPool();
        pool.initPool();
        System.out.println(pool.getObject("person"));
        System.out.println(pool.getObject("user"));

    }

}
