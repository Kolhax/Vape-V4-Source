package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.g;
import com.sun.jna.z.a.f.a.a.a.a.h;
import java.util.ArrayList;
import java.util.List;

public class j
  implements h
{
  private List<g> a = new ArrayList();
  
  /* Error */
  public g[] a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/sun/jna/z/a/f/a/a/a/a/a/j:a	Ljava/util/List;
    //   4: dup
    //   5: astore_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 19	com/sun/jna/z/a/f/a/a/a/a/a/j:a	Ljava/util/List;
    //   11: aload_0
    //   12: getfield 19	com/sun/jna/z/a/f/a/a/a/a/a/j:a	Ljava/util/List;
    //   15: invokeinterface 45 1 0
    //   20: anewarray 33	com/sun/jna/z/a/f/a/a/a/a/g
    //   23: invokeinterface 49 2 0
    //   28: checkcast 51	[Lcom/sun/jna/z/a/f/a/a/a/a/g;
    //   31: aload_1
    //   32: monitorexit
    //   33: areturn
    //   34: astore_2
    //   35: aload_1
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Line number table:
    //   Java source line #5	-> byte code offset #0
    //   Java source line #6	-> byte code offset #7
    //   Java source line #7	-> byte code offset #34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	a	j
    //   5	31	1	Ljava/lang/Object;	Object
    //   34	4	2	localObject1	Object
    // Exception table:
    //   from	to	target	type
    //   7	33	34	finally
    //   34	37	34	finally
  }
  
  public void b(g a)
  {
    try
    {
      if (a == null) {
        throw new NullPointerException();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      throw localNullPointerException;
    }
    synchronized (a.a)
    {
      a.a.remove(a);
    }
  }
  
  public void a(g a)
  {
    try
    {
      if (a == null) {
        throw new NullPointerException();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      throw localNullPointerException;
    }
    synchronized (a.a)
    {
      a.a.add(a);
    }
  }
}
