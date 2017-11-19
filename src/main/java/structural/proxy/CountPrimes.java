package structural.proxy;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
class CountPrimes {
    private static int[] sieveCounted = null;

    static int count(int lowerBound, int upperBound) {
        Preconditions.checkArgument(lowerBound > 1);
        Preconditions.checkArgument(upperBound > lowerBound);
        if (sieveCounted == null || sieveCounted.length < upperBound) {
            reloadSieveCounted(upperBound);
        }
        return sieveCounted[upperBound] - sieveCounted[lowerBound-1];
    }

    private static void reloadSieveCounted(int upperBound) {
        Preconditions.checkArgument(upperBound > 1);
        sieveCounted = new int[upperBound + 1];
        int counter = 0;
        boolean[] isPrime = Sieve.boolSieve(upperBound);
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                counter++;
            }
            sieveCounted[i]=counter;
        }
    }
}
