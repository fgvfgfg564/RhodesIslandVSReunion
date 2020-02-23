package misc;

public class IntPair {

    public int first, second;

    public IntPair(int a, int b) {
        first = a;
        second = b;
    }

    @Override
    public int hashCode() {
        return first * 998244353 + second;
    }

    public boolean equals(IntPair obj) {
        return first == obj.first && second == obj.second;
    }


}
