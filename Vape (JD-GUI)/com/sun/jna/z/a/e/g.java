package com.sun.jna.z.a.e;

import com.sun.jna.z.a.e.a.a;
import com.sun.jna.z.a.f.a.a.a.a.i;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.j;
import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class g
{
  public c a(Class a)
  {
    return (c)a.a.get(a);
  }
  
  public List<t> b()
  {
    ArrayList localArrayList = new ArrayList();
    List<t> a;
    int a = 
    
      c.m;Iterator localIterator = a.a.values().iterator();
    label123:
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      c a = (c)localIterator.next();
      if ((a != 0) || (a.k() != null))
      {
        k[] a = a.k();int a = a.length;int a = 0;
        do
        {
          if (a >= a) {
            break label123;
          }
          k a = a[a];
          if (a == 0)
          {
            if (a != 0) {
              break;
            }
            if ((a instanceof t)) {
              a.add((t)a);
            }
            a++;
          }
        } while (a == 0);
      }
    } while (a == 0);
    return a;
  }
  
  public List<i> c()
  {
    ArrayList localArrayList = new ArrayList();int a = c.m;
    List<i> a;
    Iterator localIterator = a.a.values().iterator();
    label123:
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      c a = (c)localIterator.next();
      if ((a != 0) || (a.k() != null))
      {
        k[] a = a.k();int a = a.length;int a = 0;
        do
        {
          if (a >= a) {
            break label123;
          }
          k a = a[a];
          if (a == 0)
          {
            if (a != 0) {
              break;
            }
            if ((a instanceof i)) {
              a.add((i)a);
            }
            a++;
          }
        } while (a == 0);
      }
    } while (a == 0);
    return a;
  }
  
  public Map<Class, c> a = new HashMap();
  private static final String[] b;
  
  public void a()
  {
    a.a = a.a(a.a);
  }
  
  private Map<Class, c> a(Map<Class, c> a)
  {
    List<Map.Entry<Class, c>> a = 
    
      new LinkedList(a.entrySet());Collections.sort(a, new h(a));Map<Class, c> a = new LinkedHashMap();Iterator localIterator = a.iterator();int a = c.m;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      Map.Entry<Class, c> a = (Map.Entry)localIterator.next();
      if (a != 0) {
        break label101;
      }
      a.put(a.getKey(), a.getValue());
    } while (a == 0);
    label101:
    return a;
  }
  
  public g()
  {
    String a = InputContext.getInstance().getLocale().getLanguage();
    
    int a = c.m;String[] a = b;a.a(new a(a[1], b.None, a.equals(a[2]) ? 41 : 54, 0));
    
    a.a(new d(b[0], b.Other, 0));
    if (a != 0) {
      j.g = !j.g;
    }
  }
  
  public c a(String a)
  {
    Iterator localIterator = a.a.values().iterator();int a = c.m;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      c a = (c)localIterator.next();
      if ((a != 0) || (a.a().toLowerCase().equals(a.toLowerCase()))) {
        return a;
      }
    } while (a == 0);
    return null;
  }
  
  public void a(c a)
  {
    a.a.put(a.getClass(), a);
  }
}
