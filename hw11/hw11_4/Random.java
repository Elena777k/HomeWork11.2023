package hw11_4;

public class Random {

    private long seed;
    private long a, c, m;

    public Random(long a, long c, long m){
        this.a = a;
        this.c = c;
        this.m = m;

    }

    public Random seed (long seed){
        this.seed = seed;
        return this;
    }

    public long next() {

        return (a * seed + c) % m;
    }
}
