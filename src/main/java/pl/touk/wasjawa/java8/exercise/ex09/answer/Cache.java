package pl.touk.wasjawa.java8.exercise.ex09.answer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

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

    public V getOrCache(K key, Supplier<V> valueProducer) {
        if (isInCache(key)) {
            return get(key);
        }
        V value = valueProducer.get();
        cacheValue(key, value);
        return value;
    }
}
