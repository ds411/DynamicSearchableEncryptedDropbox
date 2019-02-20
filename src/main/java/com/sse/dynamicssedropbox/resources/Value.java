package com.sse.dynamicssedropbox.resources;

import java.math.BigInteger;

public class Value {

    BigInteger hkey, c1, c2;

    public Value(BigInteger hkey, BigInteger c1, BigInteger c2) {
        this.hkey = hkey;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString() {
        return String.format("(%s, %s, %s)", hkey.toString(), c1.toString(), c2.toString());
    }
}
