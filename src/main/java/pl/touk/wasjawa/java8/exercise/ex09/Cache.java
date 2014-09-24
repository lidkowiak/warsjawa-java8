package pl.touk.wasjawa.java8.exercise.ex09;

import java.util.HashMap;
import java.util.Map;

public class Cache<K, V> {

    private Map<K, V> cachedValues = new HashMap<>();

    public boolean isInCache(K key) {
        return cachedValues.containsKey(key);
    }

    public V get(K key) {
        return cachedValues.get(key);
    }

    public void cacheValue(K key, V value) {
        cachedValues.put(key, value);
    }
}
