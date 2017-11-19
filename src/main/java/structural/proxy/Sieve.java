package structural.proxy;

import com.google.common.base.Preconditions;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
class Sieve {

    static boolean[] boolSieve(int upperBound) {
        Preconditions.checkArgument(upperBound > 1);
        boolean[] sieve = new boolean[upperBound + 1];
        Arrays.fill(sieve, true);
        for (int m = 2; m <= (int) Math.sqrt(upperBound); m++) {
            if (sieve[m]) {
                for (int k = m * m; k <= upperBound; k += m)
                    sieve[k] = false;
            }
        }
        return sieve;
    }
}