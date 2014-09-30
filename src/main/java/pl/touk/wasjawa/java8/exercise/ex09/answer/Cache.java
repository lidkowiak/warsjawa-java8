package pl.touk.wasjawa.java8.exercise.ex09.answer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Cache<K, V> {

    private final Map<K, V> cachedValues = new HashMap<>();
    private final Function<K, V> valueFunction;

    public static <K, V> Cache<K, V> forFunction(Function<K, V> valueProducer) {
	return new Cache<K, V>(valueProducer);
    }

    public Cache(Function<K, V> valueProducer) {
	this.valueFunction = valueProducer;
    }

    public boolean isInCache(K key) {
	return cachedValues.containsKey(key);
    }

    public V get(K key) {
	return cachedValues.get(key);
    }

    public void cacheValue(K key, V value) {
	cachedValues.put(key, value);
    }

    public V getOrCache(K key) {
	if (isInCache(key)) {
	    return get(key);
	}
	V value = valueFunction.apply(key);
	cacheValue(key, value);
	return value;
    }
}
