package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.i;

class C
  extends Thread
{
  final n a;
  private static final String b;
  
  C(n a) {}
  
  public void run()
  {
    int a = g.c;
    try
    {
      Thread.sleep(2000L);
      
      a.a.b.b(b);
      
      int a = 0;
      while (!i.d.e) {
        try
        {
          if (a < 240)
          {
            a++;
            
            Thread.sleep(250L);
            if (a == 0) {
              continue;
            }
          }
        }
        catch (InterruptedException localInterruptedException1)
        {
          throw localInterruptedException1;
        }
      }
      a.a.b.b(b);
    }
    catch (InterruptedException a)
    {
      a.printStackTrace();
    }
  }
}
