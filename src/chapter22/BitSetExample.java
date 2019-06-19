package chapter22;

import java.util.BitSet;
import java.util.stream.IntStream;

public class BitSetExample {
    boolean isPowerOfTwo(int x)
    {
        return (x != 0) && ((x & (x - 1)) == 0);
    }
    public static void main(String[] args) {
        final BitSet bitSet = new BitSet(8); // by default all bits are unset
        IntStream.range(0, 8).filter(i -> i % 2 == 0).forEach(bitSet::set); // {0, 2, 4, 6}
        bitSet.set(3); // {0, 2, 3, 4, 6}
        bitSet.set(3, false); // {0, 2, 4, 6}
        final boolean b = bitSet.get(3); // b = false
        bitSet.flip(6); // {0, 2, 4}
        bitSet.set(100); // {0, 2, 4, 100} - expands automatically

        bitSet.and(new BitSet(8));
        bitSet.or(new BitSet(8));
        bitSet.xor(new BitSet(8));
        bitSet.andNot(new BitSet(8));

    }
}
