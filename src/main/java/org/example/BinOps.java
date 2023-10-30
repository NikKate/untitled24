package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int binary = (Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        return Integer.toBinaryString(binary);

    }

    public String mult(String a, String b) {
        int binary1 = (Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
        return Integer.toBinaryString(binary1);
    }
}
