package com.bitsinharmony.recognito;

/**
 *
 * @author skarack
 */
public class Match<K> {
    private final Double distance;
    private final K userKey;
    
    public Match(Double distance, K userKey) {
        this.distance = distance;
        this.userKey = userKey;
    }
    
    public Double getDistance() {
        return distance;
    }
    
    public K getUserKey() {
        return userKey;
    }
}
