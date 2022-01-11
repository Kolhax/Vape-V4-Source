package com.sun.jna.z.a.b;

public class b
{
  private static final char[] a;
  private static int[] b;
  private static final String[] c;
  
  public static String a(byte[] a)
  {
    int a = a.length;char[] arrayOfChar1 = new char[(a + 2) / 3 * 4];
    char[] a;
    int a = e.e;int a = 0;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      byte a = a[(a++)];
      if (a == 0) {
        if (a != 0) {
          break label187;
        }
      }
      byte a = a < a ? a[(a++)] : 0;
      if (a == 0) {}
      byte a = a < a ? a[(a++)] : 0;
      
      int a = 63;a[(a++)] = a[(a >> 2 & a)];a[(a++)] = a[((a << 4 | (a & 0xFF) >> 4) & a)];a[(a++)] = a[((a << 2 | (a & 0xFF) >> 6) & a)];a[(a++)] = a[(a & a)];
    } while (a == 0);
    switch (a % 3)
    {
    case 1: 
      a[(--a)] = '=';
    case 2: 
      label187:
      a[(--a)] = '=';
    }
    return new String(a);
  }
  
  public static byte[] a(String a)
  {
    int a = e.e;
    if (a == 0) {}
    if (a == 0) {}
    int a = a.endsWith("=") ? 1 : a.endsWith(c[0]) ? 2 : 0;
    
    byte[] a = new byte[a.length() * 3 / 4 - a];int a = 255;int a = 0;
    
    int a = 0;
    do
    {
      if (a >= a.length()) {
        break;
      }
      int a = b[a.charAt(a)];int a = b[a.charAt(a + 1)];
      if (a != 0) {
        break label227;
      }
      a[(a++)] = ((byte)((a << 2 | a >> 4) & a));
      if (a == 0) {
        if (a >= a.length) {
          return a;
        }
      }
      int a = b[a.charAt(a + 2)];
      
      a[(a++)] = ((byte)((a << 4 | a >> 2) & a));
      if (a == 0) {
        if (a >= a.length) {
          return a;
        }
      }
      int a = b[a.charAt(a + 3)];
      
      a[(a++)] = ((byte)((a << 6 | a) & a));a += 4;
    } while (a == 0);
    label227:
    return a;
  }
}
