package com.sun.jna.z.a.e;

import java.util.Comparator;
import java.util.Map.Entry;

class h
  implements Comparator<Map.Entry<Class, c>>
{
  final g a;
  
  h(g a) {}
  
  public int a(Map.Entry<Class, c> a, Map.Entry<Class, c> a)
  {
    return ((c)a.getValue()).a().compareTo(((c)a.getValue()).a());
  }
}
