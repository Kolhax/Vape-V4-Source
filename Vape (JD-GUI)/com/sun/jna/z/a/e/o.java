package com.sun.jna.z.a.e;

import com.sun.jna.z.a.g.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class o
  extends Thread
{
  final k a;
  
  o(k a) {}
  
  public void run()
  {
    Iterator localIterator = a.a.a.iterator();int a = c.m;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      d a = (d)localIterator.next();
      if ((a != 0) || (a.d == a.a.b)) {
        a.a.a.remove(a);
      }
    } while (a == 0);
  }
}
