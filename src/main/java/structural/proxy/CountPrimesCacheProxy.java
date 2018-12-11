package structural.proxy;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
class CountPrimesCacheProxy {
    
    private static final HashMap<Key, Integer> cache = new HashMap<>();

    public static int count(int lowerBound, int upperBound) {
        Key key = new Key(lowerBound, upperBound);
        if (!cache.containsKey(key)) {
            cache.put(key, CountPrimes.count(lowerBound, upperBound));
        }
        
        return cache.get(key);
    }
    
    private static final class Key {
        private final int lowerBound;
        private final int upperBound;

        private Key(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return lowerBound == key.lowerBound &&
                    upperBound == key.upperBound;
        }

        @Override
        public int hashCode() {
            return Objects.hash(lowerBound, upperBound);
        }
    }
}
