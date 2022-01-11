package com.sun.jna.z.a.g;

class k
{
    static final int[] a;
    
    static {
        a = new int[b.values().length];
        try {
            k.a[b.ABGR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            k.a[b.RGBA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            k.a[b.BGRA.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            k.a[b.RGB.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            k.a[b.LUMINANCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            k.a[b.ALPHA.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            k.a[b.LUMINANCE_ALPHA.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
    }
}
