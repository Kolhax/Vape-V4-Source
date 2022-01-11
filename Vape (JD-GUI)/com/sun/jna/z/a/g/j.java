package com.sun.jna.z.a.g;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public class j
{
  private final byte[] a;
  private final int b = 1229472850;
  private final int c = 1347179589;
  private final int d = 1951551059;
  private final int e = 1229209940;
  private final int f = 1229278788;
  private final byte g = 0;
  private final byte h = 2;
  private final byte i = 3;
  private final byte j = 4;
  private final byte k = 6;
  private final InputStream l;
  private final CRC32 m;
  private final byte[] n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private byte[] w;
  private byte[] x;
  private byte[] y;
  static final boolean z;
  private static final String[] A;
  
  public int b()
  {
    return a.r;
  }
  
  private void a(ByteBuffer a, byte[] a)
  {
    a.put(a, 1, a.length - 1);
  }
  
  private void i(ByteBuffer a, byte[] a)
  {
    int a = g.b;
    if (a.x != null)
    {
      int a = 1;
      byte a;
      byte a;
      byte a;
      byte a;
      for (int a = a.length; a < a; )
      {
        int a = a[a] & 0xFF;
        
        a = a.w[(a * 3 + 0)];
        
        a = a.w[(a * 3 + 1)];a = a.w[(a * 3 + 2)];a = a.x[a];
      }
      if (a == 0) {}
    }
    else
    {
      int a = 1;int a = a.length;
      do
      {
        if (a >= a) {
          break;
        }
        int a = a[a] & 0xFF;
        
        byte a = a.w[(a * 3 + 0)];byte a = a.w[(a * 3 + 1)];byte a = a.w[(a * 3 + 2)];byte a = -1;
        
        a.put(a).put(a).put(a).put(a);a++;
      } while (a == 0);
    }
  }
  
  private void e(ByteBuffer a, byte[] a)
  {
    int i1 = 1;
    int a;
    int a = g.b;int a = a.length;
    do
    {
      if (a >= a) {
        break;
      }
      a.put(a[(a + 3)]).put(a[(a + 2)]).put(a[(a + 1)]).put(a[a]);a += 4;
    } while (a == 0);
  }
  
  private int a(byte[] a, int a)
  {
    return a[a] << 24 | (a[(a + 1)] & 0xFF) << 16 | (a[(a + 2)] & 0xFF) << 8 | a[(a + 3)] & 0xFF;
  }
  
  private void j(ByteBuffer a, byte[] a)
  {
    int a = g.b;
    if (a.x != null)
    {
      int a = 1;
      byte a;
      byte a;
      byte a;
      byte a;
      for (int a = a.length; a < a; )
      {
        int a = a[a] & 0xFF;a = a.w[(a * 3 + 0)];
        
        a = a.w[(a * 3 + 1)];
        
        a = a.w[(a * 3 + 2)];a = a.x[a];
      }
      if (a == 0) {}
    }
    else
    {
      int a = 1;int a = a.length;
      do
      {
        if (a >= a) {
          break;
        }
        int a = a[a] & 0xFF;byte a = a.w[(a * 3 + 0)];byte a = a.w[(a * 3 + 1)];
        
        byte a = a.w[(a * 3 + 2)];byte a = -1;a.put(a).put(a).put(a).put(a);a++;
      } while (a == 0);
    }
  }
  
  public int a()
  {
    return a.s;
  }
  
  private void f(ByteBuffer a, byte[] a)
  {
    int a = 1;int a = g.b;int a = a.length;
    do
    {
      if (a >= a) {
        break;
      }
      a.put(a[(a + 2)]).put(a[(a + 1)]).put(a[a]).put(a[(a + 3)]);a += 4;
    } while (a == 0);
  }
  
  private void b(byte[] a, int a, int a)
    throws IOException
  {
    do
    {
      int a = a.l.read(a, a, a);
      if (a < 0) {
        throw new EOFException();
      }
      a += a;a -= a;
    } while (a > 0);
  }
  
  private void g(ByteBuffer a, byte[] a)
  {
    int a = 1;int a = g.b;int a = a.length;
    do
    {
      if (a >= a) {
        break;
      }
      a.put(a[a]).put(a[(a + 1)]).put(a[(a + 2)]);a += 4;
    } while (a == 0);
  }
  
  private void a(int a)
    throws IOException
  {
    try
    {
      try
      {
        try
        {
          try
          {
            try
            {
              try
              {
                try
                {
                  try
                  {
                    try
                    {
                      try
                      {
                        try
                        {
                          try
                          {
                            try
                            {
                              try
                              {
                                try
                                {
                                  a.j();
                                  if (a.p != a) {
                                    throw new IOException(A[11] + Integer.toHexString(a));
                                  }
                                }
                                catch (IOException localIOException1)
                                {
                                  throw localIOException1;
                                }
                              }
                              catch (UnsupportedOperationException localUnsupportedOperationException1)
                              {
                                throw localUnsupportedOperationException1;
                              }
                            }
                            catch (IOException localIOException2)
                            {
                              throw localIOException2;
                            }
                          }
                          catch (UnsupportedOperationException localUnsupportedOperationException2)
                          {
                            throw localUnsupportedOperationException2;
                          }
                        }
                        catch (IOException localIOException3)
                        {
                          throw localIOException3;
                        }
                      }
                      catch (UnsupportedOperationException localUnsupportedOperationException3)
                      {
                        throw localUnsupportedOperationException3;
                      }
                    }
                    catch (IOException localIOException4)
                    {
                      throw localIOException4;
                    }
                  }
                  catch (UnsupportedOperationException localUnsupportedOperationException4)
                  {
                    throw localUnsupportedOperationException4;
                  }
                }
                catch (IOException localIOException5)
                {
                  throw localIOException5;
                }
              }
              catch (UnsupportedOperationException localUnsupportedOperationException5)
              {
                throw localUnsupportedOperationException5;
              }
            }
            catch (IOException localIOException6)
            {
              throw localIOException6;
            }
          }
          catch (UnsupportedOperationException localUnsupportedOperationException6)
          {
            throw localUnsupportedOperationException6;
          }
        }
        catch (IOException localIOException7)
        {
          throw localIOException7;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException7)
      {
        throw localUnsupportedOperationException7;
      }
    }
    catch (IOException localIOException8)
    {
      throw localIOException8;
    }
  }
  
  private void b(int a)
    throws IOException
  {
    try
    {
      try
      {
        try
        {
          try
          {
            try
            {
              try
              {
                try
                {
                  try
                  {
                    try
                    {
                      try
                      {
                        try
                        {
                          try
                          {
                            try
                            {
                              try
                              {
                                try
                                {
                                  if (a.o != a) {
                                    throw new IOException(A[7]);
                                  }
                                }
                                catch (IOException localIOException1)
                                {
                                  throw localIOException1;
                                }
                              }
                              catch (UnsupportedOperationException localUnsupportedOperationException1)
                              {
                                throw localUnsupportedOperationException1;
                              }
                            }
                            catch (IOException localIOException2)
                            {
                              throw localIOException2;
                            }
                          }
                          catch (UnsupportedOperationException localUnsupportedOperationException2)
                          {
                            throw localUnsupportedOperationException2;
                          }
                        }
                        catch (IOException localIOException3)
                        {
                          throw localIOException3;
                        }
                      }
                      catch (UnsupportedOperationException localUnsupportedOperationException3)
                      {
                        throw localUnsupportedOperationException3;
                      }
                    }
                    catch (IOException localIOException4)
                    {
                      throw localIOException4;
                    }
                  }
                  catch (UnsupportedOperationException localUnsupportedOperationException4)
                  {
                    throw localUnsupportedOperationException4;
                  }
                }
                catch (IOException localIOException5)
                {
                  throw localIOException5;
                }
              }
              catch (UnsupportedOperationException localUnsupportedOperationException5)
              {
                throw localUnsupportedOperationException5;
              }
            }
            catch (IOException localIOException6)
            {
              throw localIOException6;
            }
          }
          catch (UnsupportedOperationException localUnsupportedOperationException6)
          {
            throw localUnsupportedOperationException6;
          }
        }
        catch (IOException localIOException7)
        {
          throw localIOException7;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException7)
      {
        throw localUnsupportedOperationException7;
      }
    }
    catch (IOException localIOException8)
    {
      throw localIOException8;
    }
  }
  
  private void e(byte[] a, byte[] a)
  {
    int a = a.v;int a = g.b;int a = 1;int a = a.length;
    do
    {
      if (a >= a) {
        break;
      }
      int tmp27_25 = a; byte[] tmp27_24 = a;tmp27_24[tmp27_25] = ((byte)(tmp27_24[tmp27_25] + a[a]));
      
      a++;
    } while (a == 0);
  }
  
  private void a(byte[] a)
  {
    int a = a.v;int i1 = a + 1;int a = g.b;
    int a;
    int a = a.length;
    do
    {
      if (a >= a) {
        break;
      }
      int tmp28_26 = a; byte[] tmp28_25 = a;tmp28_25[tmp28_26] = ((byte)(tmp28_25[tmp28_26] + a[(a - a)]));
      
      a++;
    } while (a == 0);
  }
  
  private void a(Inflater a)
    throws IOException
  {
    for (int a = g.b; a.q == 0;) {
      try
      {
        try
        {
          try
          {
            try
            {
              try
              {
                try
                {
                  try
                  {
                    try
                    {
                      try
                      {
                        try
                        {
                          try
                          {
                            try
                            {
                              try
                              {
                                try
                                {
                                  try
                                  {
                                    a.i();
                                    if (a == 0)
                                    {
                                      a.a(1229209940);
                                      if (a == 0) {
                                        continue;
                                      }
                                    }
                                  }
                                  catch (IOException localIOException1)
                                  {
                                    throw localIOException1;
                                  }
                                }
                                catch (UnsupportedOperationException localUnsupportedOperationException1)
                                {
                                  throw localUnsupportedOperationException1;
                                }
                              }
                              catch (IOException localIOException2)
                              {
                                throw localIOException2;
                              }
                            }
                            catch (UnsupportedOperationException localUnsupportedOperationException2)
                            {
                              throw localUnsupportedOperationException2;
                            }
                          }
                          catch (IOException localIOException3)
                          {
                            throw localIOException3;
                          }
                        }
                        catch (UnsupportedOperationException localUnsupportedOperationException3)
                        {
                          throw localUnsupportedOperationException3;
                        }
                      }
                      catch (IOException localIOException4)
                      {
                        throw localIOException4;
                      }
                    }
                    catch (UnsupportedOperationException localUnsupportedOperationException4)
                    {
                      throw localUnsupportedOperationException4;
                    }
                  }
                  catch (IOException localIOException5)
                  {
                    throw localIOException5;
                  }
                }
                catch (UnsupportedOperationException localUnsupportedOperationException5)
                {
                  throw localUnsupportedOperationException5;
                }
              }
              catch (IOException localIOException6)
              {
                throw localIOException6;
              }
            }
            catch (UnsupportedOperationException localUnsupportedOperationException6)
            {
              throw localUnsupportedOperationException6;
            }
          }
          catch (IOException localIOException7)
          {
            throw localIOException7;
          }
        }
        catch (UnsupportedOperationException localUnsupportedOperationException7)
        {
          throw localUnsupportedOperationException7;
        }
      }
      catch (IOException localIOException8)
      {
        throw localIOException8;
      }
    }
    int a = a.a(a.n, 0, a.n.length);a.setInput(a.n, 0, a);
  }
  
  private void h(ByteBuffer a, byte[] a)
  {
    int a = g.b;
    if (a.x != null)
    {
      int a = 1;
      for (int a = a.length; a < a;)
      {
        int a = a[a] & 0xFF;
        
        byte a = a.w[(a * 3 + 0)];byte a = a.w[(a * 3 + 1)];byte a = a.w[(a * 3 + 2)];byte a = a.x[a];
        try
        {
          try
          {
            try
            {
              try
              {
                try
                {
                  try
                  {
                    try
                    {
                      try
                      {
                        try
                        {
                          try
                          {
                            try
                            {
                              try
                              {
                                try
                                {
                                  try
                                  {
                                    try
                                    {
                                      a.put(a).put(a).put(a).put(a);a++;
                                      if (a != 0) {
                                        return;
                                      }
                                      if (a == 0) {}
                                    }
                                    catch (UnsupportedOperationException localUnsupportedOperationException1)
                                    {
                                      throw localUnsupportedOperationException1;
                                    }
                                  }
                                  catch (IllegalArgumentException localIllegalArgumentException1)
                                  {
                                    throw localIllegalArgumentException1;
                                  }
                                }
                                catch (UnsupportedOperationException localUnsupportedOperationException2)
                                {
                                  throw localUnsupportedOperationException2;
                                }
                              }
                              catch (IllegalArgumentException localIllegalArgumentException2)
                              {
                                throw localIllegalArgumentException2;
                              }
                            }
                            catch (UnsupportedOperationException localUnsupportedOperationException3)
                            {
                              throw localUnsupportedOperationException3;
                            }
                          }
                          catch (IllegalArgumentException localIllegalArgumentException3)
                          {
                            throw localIllegalArgumentException3;
                          }
                        }
                        catch (UnsupportedOperationException localUnsupportedOperationException4)
                        {
                          throw localUnsupportedOperationException4;
                        }
                      }
                      catch (IllegalArgumentException localIllegalArgumentException4)
                      {
                        throw localIllegalArgumentException4;
                      }
                    }
                    catch (UnsupportedOperationException localUnsupportedOperationException5)
                    {
                      throw localUnsupportedOperationException5;
                    }
                  }
                  catch (IllegalArgumentException localIllegalArgumentException5)
                  {
                    throw localIllegalArgumentException5;
                  }
                }
                catch (UnsupportedOperationException localUnsupportedOperationException6)
                {
                  throw localUnsupportedOperationException6;
                }
              }
              catch (IllegalArgumentException localIllegalArgumentException6)
              {
                throw localIllegalArgumentException6;
              }
            }
            catch (UnsupportedOperationException localUnsupportedOperationException7)
            {
              throw localUnsupportedOperationException7;
            }
          }
          catch (IllegalArgumentException localIllegalArgumentException7)
          {
            throw localIllegalArgumentException7;
          }
        }
        catch (UnsupportedOperationException localUnsupportedOperationException8)
        {
          throw localUnsupportedOperationException8;
        }
      }
      if (a == 0) {}
    }
    else
    {
      int a = 1;int a = a.length;
      do
      {
        if (a >= a) {
          break;
        }
        int a = a[a] & 0xFF;byte a = a.w[(a * 3 + 0)];byte a = a.w[(a * 3 + 1)];byte a = a.w[(a * 3 + 2)];byte a = -1;
        
        a.put(a).put(a).put(a).put(a);a++;
      } while (a == 0);
    }
  }
  
  private void f(byte[] a, byte[] a)
  {
    int i1 = a.v;
    int a;
    int i2 = 1;
    int a;
    for (int a = 
        
          g.b; a <= a;) {
      try
      {
        try
        {
          try
          {
            try
            {
              try
              {
                try
                {
                  try
                  {
                    try
                    {
                      try
                      {
                        try
                        {
                          try
                          {
                            try
                            {
                              try
                              {
                                try
                                {
                                  try
                                  {
                                    if (a == 0)
                                    {
                                      int tmp27_25 = a; byte[] tmp27_20 = a;tmp27_20[tmp27_25] = ((byte)(tmp27_20[tmp27_25] + (byte)((a[a] & 0xFF) >>> 1)));
                                      
                                      a++;
                                      if (a == 0) {
                                        continue;
                                      }
                                    }
                                  }
                                  catch (UnsupportedOperationException localUnsupportedOperationException1)
                                  {
                                    throw localUnsupportedOperationException1;
                                  }
                                }
                                catch (IllegalArgumentException localIllegalArgumentException1)
                                {
                                  throw localIllegalArgumentException1;
                                }
                              }
                              catch (UnsupportedOperationException localUnsupportedOperationException2)
                              {
                                throw localUnsupportedOperationException2;
                              }
                            }
                            catch (IllegalArgumentException localIllegalArgumentException2)
                            {
                              throw localIllegalArgumentException2;
                            }
                          }
                          catch (UnsupportedOperationException localUnsupportedOperationException3)
                          {
                            throw localUnsupportedOperationException3;
                          }
                        }
                        catch (IllegalArgumentException localIllegalArgumentException3)
                        {
                          throw localIllegalArgumentException3;
                        }
                      }
                      catch (UnsupportedOperationException localUnsupportedOperationException4)
                      {
                        throw localUnsupportedOperationException4;
                      }
                    }
                    catch (IllegalArgumentException localIllegalArgumentException4)
                    {
                      throw localIllegalArgumentException4;
                    }
                  }
                  catch (UnsupportedOperationException localUnsupportedOperationException5)
                  {
                    throw localUnsupportedOperationException5;
                  }
                }
                catch (IllegalArgumentException localIllegalArgumentException5)
                {
                  throw localIllegalArgumentException5;
                }
              }
              catch (UnsupportedOperationException localUnsupportedOperationException6)
              {
                throw localUnsupportedOperationException6;
              }
            }
            catch (IllegalArgumentException localIllegalArgumentException6)
            {
              throw localIllegalArgumentException6;
            }
          }
          catch (UnsupportedOperationException localUnsupportedOperationException7)
          {
            throw localUnsupportedOperationException7;
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException7)
        {
          throw localIllegalArgumentException7;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException8)
      {
        throw localUnsupportedOperationException8;
      }
    }
    int a = a.length;
    do
    {
      if (a >= a) {
        break;
      }
      int tmp124_122 = a; byte[] tmp124_121 = a;tmp124_121[tmp124_122] = ((byte)(tmp124_121[tmp124_122] + (byte)((a[a] & 0xFF) + (a[(a - a)] & 0xFF) >>> 1)));
      
      a++;
    } while (a == 0);
  }
  
  private void j()
    throws IOException
  {
    a.b(a.n, 0, 8);a.o = a.a(a.n, 0);a.p = a.a(a.n, 4);a.q = a.o;a.m.reset();a.m.update(a.n, 4, 4);
  }
  
  private int a(byte[] a, int a, int a)
    throws IOException
  {
    int a = g.b;
    try
    {
      try
      {
        try
        {
          try
          {
            try
            {
              try
              {
                try
                {
                  try
                  {
                    try
                    {
                      try
                      {
                        try
                        {
                          try
                          {
                            try
                            {
                              try
                              {
                                try
                                {
                                  if (a != 0) {
                                    break label111;
                                  }
                                  if (a <= a.q) {
                                    break label83;
                                  }
                                }
                                catch (IOException localIOException1)
                                {
                                  throw localIOException1;
                                }
                              }
                              catch (UnsupportedOperationException localUnsupportedOperationException1)
                              {
                                throw localUnsupportedOperationException1;
                              }
                            }
                            catch (IOException localIOException2)
                            {
                              throw localIOException2;
                            }
                          }
                          catch (UnsupportedOperationException localUnsupportedOperationException2)
                          {
                            throw localUnsupportedOperationException2;
                          }
                        }
                        catch (IOException localIOException3)
                        {
                          throw localIOException3;
                        }
                      }
                      catch (UnsupportedOperationException localUnsupportedOperationException3)
                      {
                        throw localUnsupportedOperationException3;
                      }
                    }
                    catch (IOException localIOException4)
                    {
                      throw localIOException4;
                    }
                  }
                  catch (UnsupportedOperationException localUnsupportedOperationException4)
                  {
                    throw localUnsupportedOperationException4;
                  }
                }
                catch (IOException localIOException5)
                {
                  throw localIOException5;
                }
              }
              catch (UnsupportedOperationException localUnsupportedOperationException5)
              {
                throw localUnsupportedOperationException5;
              }
            }
            catch (IOException localIOException6)
            {
              throw localIOException6;
            }
          }
          catch (UnsupportedOperationException localUnsupportedOperationException6)
          {
            throw localUnsupportedOperationException6;
          }
        }
        catch (IOException localIOException7)
        {
          throw localIOException7;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException7)
      {
        throw localUnsupportedOperationException7;
      }
    }
    catch (IOException localIOException8)
    {
      throw localIOException8;
    }
    a = a.q;
    label83:
    a.b(a, a, a);
    a.m.update(a, a, a);a.q -= a;
    label111:
    return a;
  }
  
  /* Error */
  public j(InputStream a)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 61	java/lang/Object:<init>	()V
    //   4: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   7: aload_0
    //   8: bipush 8
    //   10: newarray <illegal type>
    //   12: dup
    //   13: iconst_0
    //   14: bipush -119
    //   16: bastore
    //   17: dup
    //   18: iconst_1
    //   19: bipush 80
    //   21: bastore
    //   22: dup
    //   23: iconst_2
    //   24: bipush 78
    //   26: bastore
    //   27: dup
    //   28: iconst_3
    //   29: bipush 71
    //   31: bastore
    //   32: dup
    //   33: iconst_4
    //   34: bipush 13
    //   36: bastore
    //   37: dup
    //   38: iconst_5
    //   39: bipush 10
    //   41: bastore
    //   42: dup
    //   43: bipush 6
    //   45: bipush 26
    //   47: bastore
    //   48: dup
    //   49: bipush 7
    //   51: bipush 10
    //   53: bastore
    //   54: putfield 63	com/sun/jna/z/a/g/j:a	[B
    //   57: aload_0
    //   58: ldc 2
    //   60: putfield 65	com/sun/jna/z/a/g/j:b	I
    //   63: aload_0
    //   64: ldc 3
    //   66: putfield 67	com/sun/jna/z/a/g/j:c	I
    //   69: istore_2
    //   70: aload_0
    //   71: ldc 4
    //   73: putfield 69	com/sun/jna/z/a/g/j:d	I
    //   76: aload_0
    //   77: ldc 5
    //   79: putfield 71	com/sun/jna/z/a/g/j:e	I
    //   82: aload_0
    //   83: ldc 6
    //   85: putfield 73	com/sun/jna/z/a/g/j:f	I
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield 75	com/sun/jna/z/a/g/j:g	B
    //   93: aload_0
    //   94: iconst_2
    //   95: putfield 77	com/sun/jna/z/a/g/j:h	B
    //   98: aload_0
    //   99: iconst_3
    //   100: putfield 79	com/sun/jna/z/a/g/j:i	B
    //   103: aload_0
    //   104: iconst_4
    //   105: putfield 81	com/sun/jna/z/a/g/j:j	B
    //   108: aload_0
    //   109: bipush 6
    //   111: putfield 83	com/sun/jna/z/a/g/j:k	B
    //   114: aload_0
    //   115: aload_1
    //   116: putfield 85	com/sun/jna/z/a/g/j:l	Ljava/io/InputStream;
    //   119: aload_0
    //   120: new 87	java/util/zip/CRC32
    //   123: dup
    //   124: invokespecial 88	java/util/zip/CRC32:<init>	()V
    //   127: putfield 90	com/sun/jna/z/a/g/j:m	Ljava/util/zip/CRC32;
    //   130: aload_0
    //   131: sipush 4096
    //   134: newarray <illegal type>
    //   136: putfield 92	com/sun/jna/z/a/g/j:n	[B
    //   139: aload_0
    //   140: aload_0
    //   141: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   144: iconst_0
    //   145: aload_0
    //   146: getfield 63	com/sun/jna/z/a/g/j:a	[B
    //   149: arraylength
    //   150: invokespecial 95	com/sun/jna/z/a/g/j:b	([BII)V
    //   153: aload_0
    //   154: iload_2
    //   155: ifne +44 -> 199
    //   158: aload_0
    //   159: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   162: invokespecial 98	com/sun/jna/z/a/g/j:b	([B)Z
    //   165: ifne +23 -> 188
    //   168: goto +4 -> 172
    //   171: athrow
    //   172: new 58	java/io/IOException
    //   175: dup
    //   176: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   179: astore_3
    //   180: aload_3
    //   181: iconst_2
    //   182: aaload
    //   183: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   186: athrow
    //   187: athrow
    //   188: aload_0
    //   189: ldc 2
    //   191: invokespecial 106	com/sun/jna/z/a/g/j:a	(I)V
    //   194: aload_0
    //   195: invokespecial 108	com/sun/jna/z/a/g/j:f	()V
    //   198: aload_0
    //   199: invokespecial 110	com/sun/jna/z/a/g/j:i	()V
    //   202: aload_0
    //   203: invokespecial 112	com/sun/jna/z/a/g/j:j	()V
    //   206: aload_0
    //   207: getfield 114	com/sun/jna/z/a/g/j:p	I
    //   210: lookupswitch	default:+87->297, 1229209940:+34->244, 1347179589:+57->267, 1951551059:+65->275
    //   244: iload_2
    //   245: ifeq +60 -> 305
    //   248: getstatic 346	com/sun/jna/z/a/j:g	Z
    //   251: ifeq +12 -> 263
    //   254: goto +4 -> 258
    //   257: athrow
    //   258: iconst_0
    //   259: goto +5 -> 264
    //   262: athrow
    //   263: iconst_1
    //   264: putstatic 346	com/sun/jna/z/a/j:g	Z
    //   267: aload_0
    //   268: invokespecial 116	com/sun/jna/z/a/g/j:g	()V
    //   271: iload_2
    //   272: ifeq +25 -> 297
    //   275: aload_0
    //   276: invokespecial 118	com/sun/jna/z/a/g/j:h	()V
    //   279: goto +18 -> 297
    //   282: athrow
    //   283: athrow
    //   284: athrow
    //   285: athrow
    //   286: athrow
    //   287: athrow
    //   288: athrow
    //   289: athrow
    //   290: athrow
    //   291: athrow
    //   292: athrow
    //   293: athrow
    //   294: athrow
    //   295: athrow
    //   296: athrow
    //   297: aload_0
    //   298: invokespecial 110	com/sun/jna/z/a/g/j:i	()V
    //   301: iload_2
    //   302: ifeq -100 -> 202
    //   305: aload_0
    //   306: iload_2
    //   307: ifne +19 -> 326
    //   310: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   313: iconst_3
    //   314: if_icmpne +46 -> 360
    //   317: goto +4 -> 321
    //   320: athrow
    //   321: aload_0
    //   322: goto +4 -> 326
    //   325: athrow
    //   326: getfield 122	com/sun/jna/z/a/g/j:w	[B
    //   329: ifnonnull +31 -> 360
    //   332: new 58	java/io/IOException
    //   335: dup
    //   336: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   339: iconst_5
    //   340: aaload
    //   341: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   344: athrow
    //   345: athrow
    //   346: athrow
    //   347: athrow
    //   348: athrow
    //   349: athrow
    //   350: athrow
    //   351: athrow
    //   352: athrow
    //   353: athrow
    //   354: athrow
    //   355: athrow
    //   356: athrow
    //   357: athrow
    //   358: athrow
    //   359: athrow
    //   360: return
    // Line number table:
    //   Java source line #190	-> byte code offset #0
    //   Java source line #38	-> byte code offset #7
    //   Java source line #62	-> byte code offset #57
    //   Java source line #248	-> byte code offset #63
    //   Java source line #19	-> byte code offset #70
    //   Java source line #96	-> byte code offset #76
    //   Java source line #447	-> byte code offset #82
    //   Java source line #337	-> byte code offset #88
    //   Java source line #225	-> byte code offset #93
    //   Java source line #165	-> byte code offset #98
    //   Java source line #47	-> byte code offset #103
    //   Java source line #281	-> byte code offset #108
    //   Java source line #192	-> byte code offset #114
    //   Java source line #8	-> byte code offset #119
    //   Java source line #204	-> byte code offset #130
    //   Java source line #33	-> byte code offset #139
    //   Java source line #197	-> byte code offset #153
    //   Java source line #247	-> byte code offset #172
    //   Java source line #341	-> byte code offset #188
    //   Java source line #113	-> byte code offset #194
    //   Java source line #325	-> byte code offset #198
    //   Java source line #87	-> byte code offset #202
    //   Java source line #88	-> byte code offset #206
    //   Java source line #161	-> byte code offset #244
    //   Java source line #135	-> byte code offset #267
    //   Java source line #415	-> byte code offset #271
    //   Java source line #215	-> byte code offset #275
    //   Java source line #449	-> byte code offset #297
    //   Java source line #372	-> byte code offset #305
    //   Java source line #267	-> byte code offset #332
    //   Java source line #90	-> byte code offset #360
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	361	0	a	j
    //   0	361	1	a	InputStream
    //   69	291	2	a	int
    //   179	7	3	a	String[]
    // Exception table:
    //   from	to	target	type
    //   70	168	171	java/io/IOException
    //   158	187	187	java/io/IOException
    //   244	254	257	java/io/IOException
    //   248	262	262	java/io/IOException
    //   267	282	282	java/lang/IllegalArgumentException
    //   267	283	283	java/lang/UnsupportedOperationException
    //   267	284	284	java/lang/IllegalArgumentException
    //   267	285	285	java/lang/UnsupportedOperationException
    //   267	286	286	java/lang/IllegalArgumentException
    //   267	287	287	java/lang/UnsupportedOperationException
    //   267	288	288	java/lang/IllegalArgumentException
    //   267	289	289	java/lang/UnsupportedOperationException
    //   267	290	290	java/lang/IllegalArgumentException
    //   267	291	291	java/lang/UnsupportedOperationException
    //   267	292	292	java/lang/IllegalArgumentException
    //   267	293	293	java/lang/UnsupportedOperationException
    //   267	294	294	java/lang/IllegalArgumentException
    //   267	295	295	java/lang/UnsupportedOperationException
    //   267	279	296	java/io/IOException
    //   305	317	320	java/io/IOException
    //   310	322	325	java/io/IOException
    //   326	345	345	java/io/IOException
    //   326	346	346	java/lang/IllegalArgumentException
    //   326	347	347	java/io/IOException
    //   326	348	348	java/lang/IllegalArgumentException
    //   326	349	349	java/io/IOException
    //   326	350	350	java/lang/IllegalArgumentException
    //   326	351	351	java/io/IOException
    //   326	352	352	java/lang/IllegalArgumentException
    //   326	353	353	java/io/IOException
    //   326	354	354	java/lang/IllegalArgumentException
    //   326	355	355	java/io/IOException
    //   326	356	356	java/lang/IllegalArgumentException
    //   326	357	357	java/io/IOException
    //   326	358	358	java/lang/UnsupportedOperationException
    //   326	359	359	java/io/IOException
  }
  
  /* Error */
  public boolean c()
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   8: iload_1
    //   9: ifne +37 -> 46
    //   12: bipush 6
    //   14: if_icmpeq +27 -> 41
    //   17: goto +4 -> 21
    //   20: athrow
    //   21: aload_0
    //   22: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   25: iload_1
    //   26: ifne +20 -> 46
    //   29: goto +4 -> 33
    //   32: athrow
    //   33: iconst_4
    //   34: if_icmpne +15 -> 49
    //   37: goto +4 -> 41
    //   40: athrow
    //   41: iconst_1
    //   42: goto +4 -> 46
    //   45: athrow
    //   46: goto +4 -> 50
    //   49: iconst_0
    //   50: ireturn
    // Line number table:
    //   Java source line #251	-> byte code offset #4
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	a	j
    //   3	47	1	a	int
    // Exception table:
    //   from	to	target	type
    //   4	17	20	java/lang/UnsupportedOperationException
    //   12	29	32	java/lang/UnsupportedOperationException
    //   21	37	40	java/lang/UnsupportedOperationException
    //   33	42	45	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  public boolean d()
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual 131	com/sun/jna/z/a/g/j:c	()Z
    //   8: iload_1
    //   9: ifne +41 -> 50
    //   12: ifne +37 -> 49
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: getfield 133	com/sun/jna/z/a/g/j:x	[B
    //   23: iload_1
    //   24: ifne +22 -> 46
    //   27: goto +4 -> 31
    //   30: athrow
    //   31: ifnonnull +18 -> 49
    //   34: goto +4 -> 38
    //   37: athrow
    //   38: aload_0
    //   39: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   42: goto +4 -> 46
    //   45: athrow
    //   46: ifnull +7 -> 53
    //   49: iconst_1
    //   50: goto +4 -> 54
    //   53: iconst_0
    //   54: ireturn
    // Line number table:
    //   Java source line #283	-> byte code offset #4
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	a	j
    //   3	51	1	a	int
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/UnsupportedOperationException
    //   12	27	30	java/lang/UnsupportedOperationException
    //   19	34	37	java/lang/UnsupportedOperationException
    //   31	42	45	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  public boolean e()
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   8: iload_1
    //   9: ifne +57 -> 66
    //   12: bipush 6
    //   14: if_icmpeq +47 -> 61
    //   17: goto +4 -> 21
    //   20: athrow
    //   21: aload_0
    //   22: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   25: iload_1
    //   26: ifne +40 -> 66
    //   29: goto +4 -> 33
    //   32: athrow
    //   33: iconst_2
    //   34: if_icmpeq +27 -> 61
    //   37: goto +4 -> 41
    //   40: athrow
    //   41: aload_0
    //   42: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   45: iload_1
    //   46: ifne +20 -> 66
    //   49: goto +4 -> 53
    //   52: athrow
    //   53: iconst_3
    //   54: if_icmpne +15 -> 69
    //   57: goto +4 -> 61
    //   60: athrow
    //   61: iconst_1
    //   62: goto +4 -> 66
    //   65: athrow
    //   66: goto +4 -> 70
    //   69: iconst_0
    //   70: ireturn
    // Line number table:
    //   Java source line #21	-> byte code offset #4
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	a	j
    //   3	67	1	a	int
    // Exception table:
    //   from	to	target	type
    //   4	17	20	java/lang/UnsupportedOperationException
    //   12	29	32	java/lang/UnsupportedOperationException
    //   21	37	40	java/lang/UnsupportedOperationException
    //   33	49	52	java/lang/UnsupportedOperationException
    //   41	57	60	java/lang/UnsupportedOperationException
    //   53	62	65	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  public void a(byte a, byte a, byte a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore 4
    //   5: aload_0
    //   6: iload 4
    //   8: ifne +29 -> 37
    //   11: invokevirtual 131	com/sun/jna/z/a/g/j:c	()Z
    //   14: ifeq +22 -> 36
    //   17: goto +4 -> 21
    //   20: athrow
    //   21: new 138	java/lang/UnsupportedOperationException
    //   24: dup
    //   25: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   28: bipush 10
    //   30: aaload
    //   31: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   34: athrow
    //   35: athrow
    //   36: aload_0
    //   37: getfield 122	com/sun/jna/z/a/g/j:w	[B
    //   40: astore 5
    //   42: iload 4
    //   44: ifne +68 -> 112
    //   47: aload 5
    //   49: ifnonnull +48 -> 97
    //   52: goto +4 -> 56
    //   55: athrow
    //   56: aload_0
    //   57: bipush 6
    //   59: newarray <illegal type>
    //   61: dup
    //   62: iconst_0
    //   63: iconst_0
    //   64: bastore
    //   65: dup
    //   66: iconst_1
    //   67: iload_1
    //   68: bastore
    //   69: dup
    //   70: iconst_2
    //   71: iconst_0
    //   72: bastore
    //   73: dup
    //   74: iconst_3
    //   75: iload_2
    //   76: bastore
    //   77: dup
    //   78: iconst_4
    //   79: iconst_0
    //   80: bastore
    //   81: dup
    //   82: iconst_5
    //   83: iload_3
    //   84: bastore
    //   85: putfield 135	com/sun/jna/z/a/g/j:y	[B
    //   88: iload 4
    //   90: ifeq +125 -> 215
    //   93: goto +4 -> 97
    //   96: athrow
    //   97: aload_0
    //   98: aload 5
    //   100: arraylength
    //   101: iconst_3
    //   102: idiv
    //   103: newarray <illegal type>
    //   105: putfield 133	com/sun/jna/z/a/g/j:x	[B
    //   108: goto +4 -> 112
    //   111: athrow
    //   112: iconst_0
    //   113: istore 6
    //   115: iconst_0
    //   116: istore 7
    //   118: iload 6
    //   120: aload 5
    //   122: arraylength
    //   123: if_icmpge +92 -> 215
    //   126: aload 5
    //   128: iload 6
    //   130: iload 4
    //   132: ifne +70 -> 202
    //   135: baload
    //   136: iload_1
    //   137: if_icmpne +55 -> 192
    //   140: goto +4 -> 144
    //   143: athrow
    //   144: aload 5
    //   146: iload 6
    //   148: iconst_1
    //   149: iadd
    //   150: iload 4
    //   152: ifne +50 -> 202
    //   155: goto +4 -> 159
    //   158: athrow
    //   159: baload
    //   160: iload_2
    //   161: if_icmpne +31 -> 192
    //   164: goto +4 -> 168
    //   167: athrow
    //   168: aload 5
    //   170: iload 6
    //   172: iconst_2
    //   173: iadd
    //   174: iload 4
    //   176: ifne +26 -> 202
    //   179: goto +4 -> 183
    //   182: athrow
    //   183: baload
    //   184: iload_3
    //   185: if_icmpeq +19 -> 204
    //   188: goto +4 -> 192
    //   191: athrow
    //   192: aload_0
    //   193: getfield 133	com/sun/jna/z/a/g/j:x	[B
    //   196: iload 7
    //   198: goto +4 -> 202
    //   201: athrow
    //   202: iconst_m1
    //   203: bastore
    //   204: iinc 6 3
    //   207: iinc 7 1
    //   210: iload 4
    //   212: ifeq -94 -> 118
    //   215: return
    // Line number table:
    //   Java source line #366	-> byte code offset #5
    //   Java source line #441	-> byte code offset #21
    //   Java source line #11	-> byte code offset #36
    //   Java source line #309	-> byte code offset #42
    //   Java source line #196	-> byte code offset #56
    //   Java source line #356	-> byte code offset #97
    //   Java source line #394	-> byte code offset #112
    //   Java source line #254	-> byte code offset #126
    //   Java source line #104	-> byte code offset #192
    //   Java source line #205	-> byte code offset #204
    //   Java source line #170	-> byte code offset #215
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	a	j
    //   0	216	1	a	byte
    //   0	216	2	a	byte
    //   0	216	3	a	byte
    //   3	212	4	a	int
    //   42	174	5	a	byte[]
    //   115	100	6	a	int
    //   118	97	7	a	int
    // Exception table:
    //   from	to	target	type
    //   5	17	20	java/lang/UnsupportedOperationException
    //   11	35	35	java/lang/UnsupportedOperationException
    //   42	52	55	java/lang/UnsupportedOperationException
    //   47	93	96	java/lang/UnsupportedOperationException
    //   56	108	111	java/lang/UnsupportedOperationException
    //   126	140	143	java/lang/UnsupportedOperationException
    //   135	155	158	java/lang/UnsupportedOperationException
    //   144	164	167	java/lang/UnsupportedOperationException
    //   159	179	182	java/lang/UnsupportedOperationException
    //   168	188	191	java/lang/UnsupportedOperationException
    //   183	198	201	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  public b a(b a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   8: iload_2
    //   9: ifne +60 -> 69
    //   12: tableswitch	default:+285->297, 0:+169->181, 1:+285->297, 2:+45->57, 3:+229->241, 4:+225->237, 5:+285->297, 6:+109->121
    //   56: athrow
    //   57: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   60: aload_1
    //   61: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   64: iaload
    //   65: goto +4 -> 69
    //   68: athrow
    //   69: tableswitch	default:+48->117, 1:+31->100, 2:+31->100, 3:+31->100, 4:+31->100
    //   100: aload_1
    //   101: areturn
    //   102: athrow
    //   103: athrow
    //   104: athrow
    //   105: athrow
    //   106: athrow
    //   107: athrow
    //   108: athrow
    //   109: athrow
    //   110: athrow
    //   111: athrow
    //   112: athrow
    //   113: athrow
    //   114: athrow
    //   115: athrow
    //   116: athrow
    //   117: getstatic 151	com/sun/jna/z/a/g/b:RGB	Lcom/sun/jna/z/a/g/b;
    //   120: areturn
    //   121: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   124: aload_1
    //   125: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   128: iaload
    //   129: tableswitch	default:+48->177, 1:+31->160, 2:+31->160, 3:+31->160, 4:+31->160
    //   160: aload_1
    //   161: areturn
    //   162: athrow
    //   163: athrow
    //   164: athrow
    //   165: athrow
    //   166: athrow
    //   167: athrow
    //   168: athrow
    //   169: athrow
    //   170: athrow
    //   171: athrow
    //   172: athrow
    //   173: athrow
    //   174: athrow
    //   175: athrow
    //   176: athrow
    //   177: getstatic 154	com/sun/jna/z/a/g/b:RGBA	Lcom/sun/jna/z/a/g/b;
    //   180: areturn
    //   181: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   184: aload_1
    //   185: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   188: iaload
    //   189: lookupswitch	default:+44->233, 5:+27->216, 6:+27->216
    //   216: aload_1
    //   217: areturn
    //   218: athrow
    //   219: athrow
    //   220: athrow
    //   221: athrow
    //   222: athrow
    //   223: athrow
    //   224: athrow
    //   225: athrow
    //   226: athrow
    //   227: athrow
    //   228: athrow
    //   229: athrow
    //   230: athrow
    //   231: athrow
    //   232: athrow
    //   233: getstatic 157	com/sun/jna/z/a/g/b:LUMINANCE	Lcom/sun/jna/z/a/g/b;
    //   236: areturn
    //   237: getstatic 160	com/sun/jna/z/a/g/b:LUMINANCE_ALPHA	Lcom/sun/jna/z/a/g/b;
    //   240: areturn
    //   241: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   244: aload_1
    //   245: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   248: iaload
    //   249: tableswitch	default:+44->293, 1:+27->276, 2:+27->276, 3:+27->276
    //   276: aload_1
    //   277: areturn
    //   278: athrow
    //   279: athrow
    //   280: athrow
    //   281: athrow
    //   282: athrow
    //   283: athrow
    //   284: athrow
    //   285: athrow
    //   286: athrow
    //   287: athrow
    //   288: athrow
    //   289: athrow
    //   290: athrow
    //   291: athrow
    //   292: athrow
    //   293: getstatic 154	com/sun/jna/z/a/g/b:RGBA	Lcom/sun/jna/z/a/g/b;
    //   296: areturn
    //   297: new 138	java/lang/UnsupportedOperationException
    //   300: dup
    //   301: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   304: iconst_3
    //   305: aaload
    //   306: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   309: athrow
    // Line number table:
    //   Java source line #346	-> byte code offset #4
    //   Java source line #443	-> byte code offset #57
    //   Java source line #185	-> byte code offset #100
    //   Java source line #118	-> byte code offset #117
    //   Java source line #398	-> byte code offset #121
    //   Java source line #54	-> byte code offset #160
    //   Java source line #27	-> byte code offset #177
    //   Java source line #98	-> byte code offset #181
    //   Java source line #393	-> byte code offset #216
    //   Java source line #111	-> byte code offset #233
    //   Java source line #152	-> byte code offset #237
    //   Java source line #319	-> byte code offset #241
    //   Java source line #12	-> byte code offset #276
    //   Java source line #20	-> byte code offset #293
    //   Java source line #203	-> byte code offset #297
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	a	j
    //   0	310	1	a	b
    //   3	306	2	a	int
    // Exception table:
    //   from	to	target	type
    //   4	56	56	java/lang/UnsupportedOperationException
    //   12	65	68	java/lang/UnsupportedOperationException
    //   69	102	102	java/lang/UnsupportedOperationException
    //   69	103	103	java/lang/IllegalArgumentException
    //   69	104	104	java/lang/UnsupportedOperationException
    //   69	105	105	java/lang/IllegalArgumentException
    //   69	106	106	java/lang/UnsupportedOperationException
    //   69	107	107	java/lang/IllegalArgumentException
    //   69	108	108	java/lang/UnsupportedOperationException
    //   69	109	109	java/lang/IllegalArgumentException
    //   69	110	110	java/lang/UnsupportedOperationException
    //   69	111	111	java/lang/IllegalArgumentException
    //   69	112	112	java/lang/UnsupportedOperationException
    //   69	113	113	java/lang/IllegalArgumentException
    //   69	114	114	java/lang/UnsupportedOperationException
    //   69	115	115	java/lang/IllegalArgumentException
    //   69	116	116	java/lang/UnsupportedOperationException
    //   121	162	162	java/lang/UnsupportedOperationException
    //   121	163	163	java/lang/IllegalArgumentException
    //   121	164	164	java/lang/UnsupportedOperationException
    //   121	165	165	java/lang/IllegalArgumentException
    //   121	166	166	java/lang/UnsupportedOperationException
    //   121	167	167	java/lang/IllegalArgumentException
    //   121	168	168	java/lang/UnsupportedOperationException
    //   121	169	169	java/lang/IllegalArgumentException
    //   121	170	170	java/lang/UnsupportedOperationException
    //   121	171	171	java/lang/IllegalArgumentException
    //   121	172	172	java/lang/UnsupportedOperationException
    //   121	173	173	java/lang/IllegalArgumentException
    //   121	174	174	java/lang/UnsupportedOperationException
    //   121	175	175	java/lang/IllegalArgumentException
    //   121	176	176	java/lang/UnsupportedOperationException
    //   181	218	218	java/lang/UnsupportedOperationException
    //   181	219	219	java/lang/IllegalArgumentException
    //   181	220	220	java/lang/UnsupportedOperationException
    //   181	221	221	java/lang/IllegalArgumentException
    //   181	222	222	java/lang/UnsupportedOperationException
    //   181	223	223	java/lang/IllegalArgumentException
    //   181	224	224	java/lang/UnsupportedOperationException
    //   181	225	225	java/lang/IllegalArgumentException
    //   181	226	226	java/lang/UnsupportedOperationException
    //   181	227	227	java/lang/IllegalArgumentException
    //   181	228	228	java/lang/UnsupportedOperationException
    //   181	229	229	java/lang/IllegalArgumentException
    //   181	230	230	java/lang/UnsupportedOperationException
    //   181	231	231	java/lang/IllegalArgumentException
    //   181	232	232	java/lang/UnsupportedOperationException
    //   241	278	278	java/lang/UnsupportedOperationException
    //   241	279	279	java/lang/IllegalArgumentException
    //   241	280	280	java/lang/UnsupportedOperationException
    //   241	281	281	java/lang/IllegalArgumentException
    //   241	282	282	java/lang/UnsupportedOperationException
    //   241	283	283	java/lang/IllegalArgumentException
    //   241	284	284	java/lang/UnsupportedOperationException
    //   241	285	285	java/lang/IllegalArgumentException
    //   241	286	286	java/lang/UnsupportedOperationException
    //   241	287	287	java/lang/IllegalArgumentException
    //   241	288	288	java/lang/UnsupportedOperationException
    //   241	289	289	java/lang/IllegalArgumentException
    //   241	290	290	java/lang/UnsupportedOperationException
    //   241	291	291	java/lang/IllegalArgumentException
    //   241	292	292	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  public void a(ByteBuffer a, int a, b a)
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: aload_1
    //   4: invokevirtual 166	java/nio/ByteBuffer:position	()I
    //   7: istore 5
    //   9: aload_0
    //   10: getfield 128	com/sun/jna/z/a/g/j:r	I
    //   13: aload_0
    //   14: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   17: imul
    //   18: bipush 7
    //   20: iadd
    //   21: bipush 8
    //   23: idiv
    //   24: aload_0
    //   25: getfield 170	com/sun/jna/z/a/g/j:v	I
    //   28: imul
    //   29: istore 6
    //   31: istore 4
    //   33: iload 6
    //   35: iconst_1
    //   36: iadd
    //   37: newarray <illegal type>
    //   39: astore 7
    //   41: iload 6
    //   43: iconst_1
    //   44: iadd
    //   45: newarray <illegal type>
    //   47: astore 8
    //   49: aload_0
    //   50: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   53: bipush 8
    //   55: iload 4
    //   57: ifne +19 -> 76
    //   60: if_icmpge +22 -> 82
    //   63: goto +4 -> 67
    //   66: athrow
    //   67: aload_0
    //   68: getfield 128	com/sun/jna/z/a/g/j:r	I
    //   71: iconst_1
    //   72: goto +4 -> 76
    //   75: athrow
    //   76: iadd
    //   77: newarray <illegal type>
    //   79: goto +4 -> 83
    //   82: aconst_null
    //   83: astore 9
    //   85: new 172	java/util/zip/Inflater
    //   88: dup
    //   89: invokespecial 173	java/util/zip/Inflater:<init>	()V
    //   92: astore 10
    //   94: iconst_0
    //   95: istore 11
    //   97: iload 11
    //   99: aload_0
    //   100: getfield 126	com/sun/jna/z/a/g/j:s	I
    //   103: if_icmpge +732 -> 835
    //   106: aload_0
    //   107: aload 10
    //   109: aload 7
    //   111: iconst_0
    //   112: aload 7
    //   114: arraylength
    //   115: invokespecial 176	com/sun/jna/z/a/g/j:a	(Ljava/util/zip/Inflater;[BII)V
    //   118: aload_0
    //   119: aload 7
    //   121: aload 8
    //   123: invokespecial 179	com/sun/jna/z/a/g/j:d	([B[B)V
    //   126: aload_1
    //   127: iload 5
    //   129: iload 11
    //   131: iload_2
    //   132: imul
    //   133: iadd
    //   134: invokevirtual 182	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   137: pop
    //   138: iload 4
    //   140: ifne +700 -> 840
    //   143: aload_0
    //   144: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   147: iload 4
    //   149: ifne +64 -> 213
    //   152: goto +4 -> 156
    //   155: athrow
    //   156: tableswitch	default:+646->802, 0:+290->446, 1:+646->802, 2:+45->201, 3:+418->574, 4:+358->514, 5:+646->802, 6:+170->326
    //   200: athrow
    //   201: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   204: aload_3
    //   205: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   208: iaload
    //   209: goto +4 -> 213
    //   212: athrow
    //   213: tableswitch	default:+95->308, 1:+31->244, 2:+47->260, 3:+63->276, 4:+79->292
    //   244: aload_0
    //   245: aload_1
    //   246: aload 7
    //   248: invokespecial 185	com/sun/jna/z/a/g/j:b	(Ljava/nio/ByteBuffer;[B)V
    //   251: iload 4
    //   253: ifeq +562 -> 815
    //   256: goto +4 -> 260
    //   259: athrow
    //   260: aload_0
    //   261: aload_1
    //   262: aload 7
    //   264: invokespecial 187	com/sun/jna/z/a/g/j:c	(Ljava/nio/ByteBuffer;[B)V
    //   267: iload 4
    //   269: ifeq +546 -> 815
    //   272: goto +4 -> 276
    //   275: athrow
    //   276: aload_0
    //   277: aload_1
    //   278: aload 7
    //   280: invokespecial 189	com/sun/jna/z/a/g/j:d	(Ljava/nio/ByteBuffer;[B)V
    //   283: iload 4
    //   285: ifeq +530 -> 815
    //   288: goto +4 -> 292
    //   291: athrow
    //   292: aload_0
    //   293: aload_1
    //   294: aload 7
    //   296: invokespecial 191	com/sun/jna/z/a/g/j:a	(Ljava/nio/ByteBuffer;[B)V
    //   299: iload 4
    //   301: ifeq +514 -> 815
    //   304: goto +4 -> 308
    //   307: athrow
    //   308: new 138	java/lang/UnsupportedOperationException
    //   311: dup
    //   312: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   315: astore 14
    //   317: aload 14
    //   319: iconst_0
    //   320: aaload
    //   321: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   324: athrow
    //   325: athrow
    //   326: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   329: aload_3
    //   330: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   333: iaload
    //   334: tableswitch	default:+94->428, 1:+30->364, 2:+46->380, 3:+62->396, 4:+78->412
    //   364: aload_0
    //   365: aload_1
    //   366: aload 7
    //   368: invokespecial 193	com/sun/jna/z/a/g/j:e	(Ljava/nio/ByteBuffer;[B)V
    //   371: iload 4
    //   373: ifeq +442 -> 815
    //   376: goto +4 -> 380
    //   379: athrow
    //   380: aload_0
    //   381: aload_1
    //   382: aload 7
    //   384: invokespecial 191	com/sun/jna/z/a/g/j:a	(Ljava/nio/ByteBuffer;[B)V
    //   387: iload 4
    //   389: ifeq +426 -> 815
    //   392: goto +4 -> 396
    //   395: athrow
    //   396: aload_0
    //   397: aload_1
    //   398: aload 7
    //   400: invokespecial 195	com/sun/jna/z/a/g/j:f	(Ljava/nio/ByteBuffer;[B)V
    //   403: iload 4
    //   405: ifeq +410 -> 815
    //   408: goto +4 -> 412
    //   411: athrow
    //   412: aload_0
    //   413: aload_1
    //   414: aload 7
    //   416: invokespecial 197	com/sun/jna/z/a/g/j:g	(Ljava/nio/ByteBuffer;[B)V
    //   419: iload 4
    //   421: ifeq +394 -> 815
    //   424: goto +4 -> 428
    //   427: athrow
    //   428: new 138	java/lang/UnsupportedOperationException
    //   431: dup
    //   432: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   435: astore 14
    //   437: aload 14
    //   439: iconst_0
    //   440: aaload
    //   441: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   444: athrow
    //   445: athrow
    //   446: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   449: aload_3
    //   450: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   453: iaload
    //   454: lookupswitch	default:+42->496, 5:+26->480, 6:+26->480
    //   480: aload_0
    //   481: aload_1
    //   482: aload 7
    //   484: invokespecial 191	com/sun/jna/z/a/g/j:a	(Ljava/nio/ByteBuffer;[B)V
    //   487: iload 4
    //   489: ifeq +326 -> 815
    //   492: goto +4 -> 496
    //   495: athrow
    //   496: new 138	java/lang/UnsupportedOperationException
    //   499: dup
    //   500: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   503: astore 14
    //   505: aload 14
    //   507: iconst_0
    //   508: aaload
    //   509: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   512: athrow
    //   513: athrow
    //   514: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   517: aload_3
    //   518: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   521: iaload
    //   522: lookupswitch	default:+34->556, 7:+18->540
    //   540: aload_0
    //   541: aload_1
    //   542: aload 7
    //   544: invokespecial 191	com/sun/jna/z/a/g/j:a	(Ljava/nio/ByteBuffer;[B)V
    //   547: iload 4
    //   549: ifeq +266 -> 815
    //   552: goto +4 -> 556
    //   555: athrow
    //   556: new 138	java/lang/UnsupportedOperationException
    //   559: dup
    //   560: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   563: astore 14
    //   565: aload 14
    //   567: iconst_0
    //   568: aaload
    //   569: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   572: athrow
    //   573: athrow
    //   574: aload_0
    //   575: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   578: tableswitch	default:+106->684, 1:+89->667, 2:+72->650, 3:+106->684, 4:+55->633, 5:+106->684, 6:+106->684, 7:+106->684, 8:+46->624
    //   624: aload 7
    //   626: astore 9
    //   628: iload 4
    //   630: ifeq +73 -> 703
    //   633: aload_0
    //   634: aload 7
    //   636: aload 9
    //   638: invokespecial 199	com/sun/jna/z/a/g/j:a	([B[B)V
    //   641: iload 4
    //   643: ifeq +60 -> 703
    //   646: goto +4 -> 650
    //   649: athrow
    //   650: aload_0
    //   651: aload 7
    //   653: aload 9
    //   655: invokespecial 201	com/sun/jna/z/a/g/j:b	([B[B)V
    //   658: iload 4
    //   660: ifeq +43 -> 703
    //   663: goto +4 -> 667
    //   666: athrow
    //   667: aload_0
    //   668: aload 7
    //   670: aload 9
    //   672: invokespecial 203	com/sun/jna/z/a/g/j:c	([B[B)V
    //   675: iload 4
    //   677: ifeq +26 -> 703
    //   680: goto +4 -> 684
    //   683: athrow
    //   684: new 138	java/lang/UnsupportedOperationException
    //   687: dup
    //   688: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   691: astore 14
    //   693: aload 14
    //   695: bipush 6
    //   697: aaload
    //   698: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   701: athrow
    //   702: athrow
    //   703: getstatic 144	com/sun/jna/z/a/g/k:a	[I
    //   706: aload_3
    //   707: invokevirtual 147	com/sun/jna/z/a/g/b:ordinal	()I
    //   710: iaload
    //   711: tableswitch	default:+73->784, 1:+25->736, 2:+41->752, 3:+57->768
    //   736: aload_0
    //   737: aload_1
    //   738: aload 9
    //   740: invokespecial 205	com/sun/jna/z/a/g/j:h	(Ljava/nio/ByteBuffer;[B)V
    //   743: iload 4
    //   745: ifeq +70 -> 815
    //   748: goto +4 -> 752
    //   751: athrow
    //   752: aload_0
    //   753: aload_1
    //   754: aload 9
    //   756: invokespecial 207	com/sun/jna/z/a/g/j:i	(Ljava/nio/ByteBuffer;[B)V
    //   759: iload 4
    //   761: ifeq +54 -> 815
    //   764: goto +4 -> 768
    //   767: athrow
    //   768: aload_0
    //   769: aload_1
    //   770: aload 9
    //   772: invokespecial 209	com/sun/jna/z/a/g/j:j	(Ljava/nio/ByteBuffer;[B)V
    //   775: iload 4
    //   777: ifeq +38 -> 815
    //   780: goto +4 -> 784
    //   783: athrow
    //   784: new 138	java/lang/UnsupportedOperationException
    //   787: dup
    //   788: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   791: astore 14
    //   793: aload 14
    //   795: iconst_0
    //   796: aaload
    //   797: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   800: athrow
    //   801: athrow
    //   802: new 138	java/lang/UnsupportedOperationException
    //   805: dup
    //   806: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   809: iconst_3
    //   810: aaload
    //   811: invokespecial 139	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   814: athrow
    //   815: aload 7
    //   817: astore 12
    //   819: aload 8
    //   821: astore 7
    //   823: aload 12
    //   825: astore 8
    //   827: iinc 11 1
    //   830: iload 4
    //   832: ifeq -735 -> 97
    //   835: aload 10
    //   837: invokevirtual 212	java/util/zip/Inflater:end	()V
    //   840: goto +13 -> 853
    //   843: astore 13
    //   845: aload 10
    //   847: invokevirtual 212	java/util/zip/Inflater:end	()V
    //   850: aload 13
    //   852: athrow
    //   853: return
    // Line number table:
    //   Java source line #258	-> byte code offset #3
    //   Java source line #171	-> byte code offset #9
    //   Java source line #380	-> byte code offset #33
    //   Java source line #150	-> byte code offset #41
    //   Java source line #291	-> byte code offset #49
    //   Java source line #333	-> byte code offset #85
    //   Java source line #428	-> byte code offset #94
    //   Java source line #51	-> byte code offset #106
    //   Java source line #288	-> byte code offset #118
    //   Java source line #350	-> byte code offset #126
    //   Java source line #79	-> byte code offset #138
    //   Java source line #371	-> byte code offset #201
    //   Java source line #194	-> byte code offset #244
    //   Java source line #173	-> byte code offset #260
    //   Java source line #294	-> byte code offset #276
    //   Java source line #76	-> byte code offset #292
    //   Java source line #126	-> byte code offset #308
    //   Java source line #389	-> byte code offset #326
    //   Java source line #405	-> byte code offset #364
    //   Java source line #149	-> byte code offset #380
    //   Java source line #144	-> byte code offset #396
    //   Java source line #338	-> byte code offset #412
    //   Java source line #6	-> byte code offset #428
    //   Java source line #89	-> byte code offset #446
    //   Java source line #58	-> byte code offset #480
    //   Java source line #50	-> byte code offset #496
    //   Java source line #345	-> byte code offset #514
    //   Java source line #298	-> byte code offset #540
    //   Java source line #328	-> byte code offset #556
    //   Java source line #295	-> byte code offset #574
    //   Java source line #77	-> byte code offset #624
    //   Java source line #64	-> byte code offset #633
    //   Java source line #71	-> byte code offset #650
    //   Java source line #439	-> byte code offset #667
    //   Java source line #397	-> byte code offset #684
    //   Java source line #114	-> byte code offset #703
    //   Java source line #253	-> byte code offset #736
    //   Java source line #202	-> byte code offset #752
    //   Java source line #407	-> byte code offset #768
    //   Java source line #427	-> byte code offset #784
    //   Java source line #442	-> byte code offset #802
    //   Java source line #387	-> byte code offset #815
    //   Java source line #290	-> byte code offset #819
    //   Java source line #355	-> byte code offset #823
    //   Java source line #156	-> byte code offset #827
    //   Java source line #123	-> byte code offset #835
    //   Java source line #271	-> byte code offset #840
    //   Java source line #49	-> byte code offset #843
    //   Java source line #91	-> byte code offset #853
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	854	0	a	j
    //   0	854	1	a	ByteBuffer
    //   0	854	2	a	int
    //   0	854	3	a	b
    //   31	822	4	a	int
    //   9	845	5	a	int
    //   33	821	6	a	int
    //   41	813	7	a	byte[]
    //   49	805	8	a	byte[]
    //   85	769	9	a	byte[]
    //   94	760	10	a	Inflater
    //   97	738	11	a	int
    //   819	8	12	a	byte[]
    //   315	485	14	a	String[]
    // Exception table:
    //   from	to	target	type
    //   49	63	66	java/io/IOException
    //   60	72	75	java/io/IOException
    //   106	152	155	java/io/IOException
    //   143	200	200	java/io/IOException
    //   156	209	212	java/io/IOException
    //   213	256	259	java/io/IOException
    //   244	272	275	java/io/IOException
    //   260	288	291	java/io/IOException
    //   276	304	307	java/io/IOException
    //   292	325	325	java/io/IOException
    //   326	376	379	java/io/IOException
    //   364	392	395	java/io/IOException
    //   380	408	411	java/io/IOException
    //   396	424	427	java/io/IOException
    //   412	445	445	java/io/IOException
    //   446	492	495	java/io/IOException
    //   480	513	513	java/io/IOException
    //   514	552	555	java/io/IOException
    //   540	573	573	java/io/IOException
    //   628	646	649	java/io/IOException
    //   633	663	666	java/io/IOException
    //   650	680	683	java/io/IOException
    //   667	702	702	java/io/IOException
    //   703	748	751	java/io/IOException
    //   736	764	767	java/io/IOException
    //   752	780	783	java/io/IOException
    //   768	801	801	java/io/IOException
    //   94	835	843	finally
    //   843	845	843	finally
  }
  
  /* Error */
  public void b(ByteBuffer a, int a, b a)
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore 4
    //   5: iload_2
    //   6: iload 4
    //   8: ifne +29 -> 37
    //   11: ifgt +22 -> 33
    //   14: goto +4 -> 18
    //   17: athrow
    //   18: new 218	java/lang/IllegalArgumentException
    //   21: dup
    //   22: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   25: bipush 17
    //   27: aaload
    //   28: invokespecial 219	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   31: athrow
    //   32: athrow
    //   33: aload_1
    //   34: invokevirtual 166	java/nio/ByteBuffer:position	()I
    //   37: istore 5
    //   39: aload_0
    //   40: getfield 126	com/sun/jna/z/a/g/j:s	I
    //   43: iconst_1
    //   44: isub
    //   45: iload_2
    //   46: imul
    //   47: istore 6
    //   49: aload_1
    //   50: iload 5
    //   52: iload 6
    //   54: iadd
    //   55: invokevirtual 182	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   58: pop
    //   59: aload_0
    //   60: aload_1
    //   61: iload_2
    //   62: ineg
    //   63: aload_3
    //   64: invokevirtual 221	com/sun/jna/z/a/g/j:a	(Ljava/nio/ByteBuffer;ILcom/sun/jna/z/a/g/b;)V
    //   67: aload_1
    //   68: aload_1
    //   69: invokevirtual 166	java/nio/ByteBuffer:position	()I
    //   72: iload 6
    //   74: iadd
    //   75: invokevirtual 182	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   78: pop
    //   79: return
    // Line number table:
    //   Java source line #360	-> byte code offset #5
    //   Java source line #269	-> byte code offset #18
    //   Java source line #396	-> byte code offset #33
    //   Java source line #181	-> byte code offset #39
    //   Java source line #44	-> byte code offset #49
    //   Java source line #386	-> byte code offset #59
    //   Java source line #130	-> byte code offset #67
    //   Java source line #304	-> byte code offset #79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	a	j
    //   0	80	1	a	ByteBuffer
    //   0	80	2	a	int
    //   0	80	3	a	b
    //   3	4	4	a	int
    //   37	14	5	a	int
    //   47	26	6	a	int
    //   17	1	7	localIOException1	IOException
    //   32	1	8	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   5	14	17	java/io/IOException
    //   11	32	32	java/io/IOException
  }
  
  /* Error */
  private void b(ByteBuffer a, byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   8: iload_3
    //   9: ifne +18 -> 27
    //   12: ifnull +171 -> 183
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   23: goto +4 -> 27
    //   26: athrow
    //   27: iconst_1
    //   28: baload
    //   29: istore 4
    //   31: aload_0
    //   32: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   35: iconst_3
    //   36: baload
    //   37: istore 5
    //   39: aload_0
    //   40: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   43: iconst_5
    //   44: baload
    //   45: istore 6
    //   47: iconst_1
    //   48: istore 7
    //   50: aload_2
    //   51: arraylength
    //   52: istore 8
    //   54: iload 7
    //   56: iload 8
    //   58: if_icmpge +121 -> 179
    //   61: aload_2
    //   62: iload 7
    //   64: baload
    //   65: istore 9
    //   67: aload_2
    //   68: iload 7
    //   70: iconst_1
    //   71: iadd
    //   72: baload
    //   73: istore 10
    //   75: aload_2
    //   76: iload 7
    //   78: iconst_2
    //   79: iadd
    //   80: baload
    //   81: istore 11
    //   83: iconst_m1
    //   84: istore 12
    //   86: iload_3
    //   87: ifne +148 -> 235
    //   90: iload_3
    //   91: ifne +84 -> 175
    //   94: goto +4 -> 98
    //   97: athrow
    //   98: iload 9
    //   100: iload 4
    //   102: if_icmpne +48 -> 150
    //   105: goto +4 -> 109
    //   108: athrow
    //   109: iload 10
    //   111: iload 5
    //   113: iload_3
    //   114: ifne +30 -> 144
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: if_icmpne +29 -> 150
    //   124: goto +4 -> 128
    //   127: athrow
    //   128: iload 11
    //   130: iload_3
    //   131: ifne +17 -> 148
    //   134: goto +4 -> 138
    //   137: athrow
    //   138: iload 6
    //   140: goto +4 -> 144
    //   143: athrow
    //   144: if_icmpne +6 -> 150
    //   147: iconst_0
    //   148: istore 12
    //   150: aload_1
    //   151: iload 12
    //   153: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   156: iload 11
    //   158: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   161: iload 10
    //   163: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   166: iload 9
    //   168: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   171: pop
    //   172: iinc 7 3
    //   175: iload_3
    //   176: ifeq -122 -> 54
    //   179: iload_3
    //   180: ifeq +55 -> 235
    //   183: iconst_1
    //   184: istore 4
    //   186: aload_2
    //   187: arraylength
    //   188: istore 5
    //   190: iload 4
    //   192: iload 5
    //   194: if_icmpge +41 -> 235
    //   197: aload_1
    //   198: iconst_m1
    //   199: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   202: aload_2
    //   203: iload 4
    //   205: iconst_2
    //   206: iadd
    //   207: baload
    //   208: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   211: aload_2
    //   212: iload 4
    //   214: iconst_1
    //   215: iadd
    //   216: baload
    //   217: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   220: aload_2
    //   221: iload 4
    //   223: baload
    //   224: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   227: pop
    //   228: iinc 4 3
    //   231: iload_3
    //   232: ifeq -42 -> 190
    //   235: return
    // Line number table:
    //   Java source line #155	-> byte code offset #4
    //   Java source line #352	-> byte code offset #19
    //   Java source line #306	-> byte code offset #31
    //   Java source line #23	-> byte code offset #39
    //   Java source line #418	-> byte code offset #47
    //   Java source line #426	-> byte code offset #61
    //   Java source line #59	-> byte code offset #67
    //   Java source line #388	-> byte code offset #75
    //   Java source line #209	-> byte code offset #83
    //   Java source line #413	-> byte code offset #86
    //   Java source line #353	-> byte code offset #147
    //   Java source line #376	-> byte code offset #150
    //   Java source line #381	-> byte code offset #172
    //   Java source line #97	-> byte code offset #179
    //   Java source line #112	-> byte code offset #183
    //   Java source line #146	-> byte code offset #197
    //   Java source line #86	-> byte code offset #228
    //   Java source line #244	-> byte code offset #235
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	a	j
    //   0	236	1	a	ByteBuffer
    //   0	236	2	a	byte[]
    //   3	232	3	a	int
    //   31	148	4	a	byte
    //   186	49	4	a	int
    //   39	140	5	a	byte
    //   190	45	5	a	int
    //   47	132	6	a	byte
    //   50	129	7	a	int
    //   54	125	8	a	int
    //   67	105	9	a	byte
    //   75	97	10	a	byte
    //   83	89	11	a	byte
    //   86	86	12	a	byte
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/UnsupportedOperationException
    //   12	23	26	java/lang/UnsupportedOperationException
    //   86	94	97	java/lang/UnsupportedOperationException
    //   90	105	108	java/lang/UnsupportedOperationException
    //   98	117	120	java/lang/UnsupportedOperationException
    //   109	124	127	java/lang/UnsupportedOperationException
    //   121	134	137	java/lang/UnsupportedOperationException
    //   128	140	143	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void c(ByteBuffer a, byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   8: iload_3
    //   9: ifne +18 -> 27
    //   12: ifnull +171 -> 183
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   23: goto +4 -> 27
    //   26: athrow
    //   27: iconst_1
    //   28: baload
    //   29: istore 4
    //   31: aload_0
    //   32: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   35: iconst_3
    //   36: baload
    //   37: istore 5
    //   39: aload_0
    //   40: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   43: iconst_5
    //   44: baload
    //   45: istore 6
    //   47: iconst_1
    //   48: istore 7
    //   50: aload_2
    //   51: arraylength
    //   52: istore 8
    //   54: iload 7
    //   56: iload 8
    //   58: if_icmpge +121 -> 179
    //   61: aload_2
    //   62: iload 7
    //   64: baload
    //   65: istore 9
    //   67: aload_2
    //   68: iload 7
    //   70: iconst_1
    //   71: iadd
    //   72: baload
    //   73: istore 10
    //   75: aload_2
    //   76: iload 7
    //   78: iconst_2
    //   79: iadd
    //   80: baload
    //   81: istore 11
    //   83: iconst_m1
    //   84: istore 12
    //   86: iload_3
    //   87: ifne +148 -> 235
    //   90: iload_3
    //   91: ifne +84 -> 175
    //   94: goto +4 -> 98
    //   97: athrow
    //   98: iload 9
    //   100: iload 4
    //   102: if_icmpne +48 -> 150
    //   105: goto +4 -> 109
    //   108: athrow
    //   109: iload 10
    //   111: iload 5
    //   113: iload_3
    //   114: ifne +30 -> 144
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: if_icmpne +29 -> 150
    //   124: goto +4 -> 128
    //   127: athrow
    //   128: iload 11
    //   130: iload_3
    //   131: ifne +17 -> 148
    //   134: goto +4 -> 138
    //   137: athrow
    //   138: iload 6
    //   140: goto +4 -> 144
    //   143: athrow
    //   144: if_icmpne +6 -> 150
    //   147: iconst_0
    //   148: istore 12
    //   150: aload_1
    //   151: iload 9
    //   153: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   156: iload 10
    //   158: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   161: iload 11
    //   163: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   166: iload 12
    //   168: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   171: pop
    //   172: iinc 7 3
    //   175: iload_3
    //   176: ifeq -122 -> 54
    //   179: iload_3
    //   180: ifeq +55 -> 235
    //   183: iconst_1
    //   184: istore 4
    //   186: aload_2
    //   187: arraylength
    //   188: istore 5
    //   190: iload 4
    //   192: iload 5
    //   194: if_icmpge +41 -> 235
    //   197: aload_1
    //   198: aload_2
    //   199: iload 4
    //   201: baload
    //   202: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   205: aload_2
    //   206: iload 4
    //   208: iconst_1
    //   209: iadd
    //   210: baload
    //   211: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   214: aload_2
    //   215: iload 4
    //   217: iconst_2
    //   218: iadd
    //   219: baload
    //   220: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   223: iconst_m1
    //   224: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   227: pop
    //   228: iinc 4 3
    //   231: iload_3
    //   232: ifeq -42 -> 190
    //   235: return
    // Line number table:
    //   Java source line #93	-> byte code offset #4
    //   Java source line #399	-> byte code offset #19
    //   Java source line #374	-> byte code offset #31
    //   Java source line #318	-> byte code offset #39
    //   Java source line #73	-> byte code offset #47
    //   Java source line #278	-> byte code offset #61
    //   Java source line #35	-> byte code offset #67
    //   Java source line #410	-> byte code offset #75
    //   Java source line #377	-> byte code offset #83
    //   Java source line #259	-> byte code offset #86
    //   Java source line #446	-> byte code offset #147
    //   Java source line #302	-> byte code offset #150
    //   Java source line #275	-> byte code offset #172
    //   Java source line #414	-> byte code offset #179
    //   Java source line #15	-> byte code offset #183
    //   Java source line #169	-> byte code offset #197
    //   Java source line #332	-> byte code offset #228
    //   Java source line #365	-> byte code offset #235
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	a	j
    //   0	236	1	a	ByteBuffer
    //   0	236	2	a	byte[]
    //   3	232	3	a	int
    //   31	148	4	a	byte
    //   186	49	4	a	int
    //   39	140	5	a	byte
    //   190	45	5	a	int
    //   47	132	6	a	byte
    //   50	129	7	a	int
    //   54	125	8	a	int
    //   67	105	9	a	byte
    //   75	97	10	a	byte
    //   83	89	11	a	byte
    //   86	86	12	a	byte
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/UnsupportedOperationException
    //   12	23	26	java/lang/UnsupportedOperationException
    //   86	94	97	java/lang/UnsupportedOperationException
    //   90	105	108	java/lang/UnsupportedOperationException
    //   98	117	120	java/lang/UnsupportedOperationException
    //   109	124	127	java/lang/UnsupportedOperationException
    //   121	134	137	java/lang/UnsupportedOperationException
    //   128	140	143	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void d(ByteBuffer a, byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   8: iload_3
    //   9: ifne +18 -> 27
    //   12: ifnull +171 -> 183
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   23: goto +4 -> 27
    //   26: athrow
    //   27: iconst_1
    //   28: baload
    //   29: istore 4
    //   31: aload_0
    //   32: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   35: iconst_3
    //   36: baload
    //   37: istore 5
    //   39: aload_0
    //   40: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   43: iconst_5
    //   44: baload
    //   45: istore 6
    //   47: iconst_1
    //   48: istore 7
    //   50: aload_2
    //   51: arraylength
    //   52: istore 8
    //   54: iload 7
    //   56: iload 8
    //   58: if_icmpge +121 -> 179
    //   61: aload_2
    //   62: iload 7
    //   64: baload
    //   65: istore 9
    //   67: aload_2
    //   68: iload 7
    //   70: iconst_1
    //   71: iadd
    //   72: baload
    //   73: istore 10
    //   75: aload_2
    //   76: iload 7
    //   78: iconst_2
    //   79: iadd
    //   80: baload
    //   81: istore 11
    //   83: iconst_m1
    //   84: istore 12
    //   86: iload_3
    //   87: ifne +148 -> 235
    //   90: iload_3
    //   91: ifne +84 -> 175
    //   94: goto +4 -> 98
    //   97: athrow
    //   98: iload 9
    //   100: iload 4
    //   102: if_icmpne +48 -> 150
    //   105: goto +4 -> 109
    //   108: athrow
    //   109: iload 10
    //   111: iload 5
    //   113: iload_3
    //   114: ifne +30 -> 144
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: if_icmpne +29 -> 150
    //   124: goto +4 -> 128
    //   127: athrow
    //   128: iload 11
    //   130: iload_3
    //   131: ifne +17 -> 148
    //   134: goto +4 -> 138
    //   137: athrow
    //   138: iload 6
    //   140: goto +4 -> 144
    //   143: athrow
    //   144: if_icmpne +6 -> 150
    //   147: iconst_0
    //   148: istore 12
    //   150: aload_1
    //   151: iload 11
    //   153: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   156: iload 10
    //   158: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   161: iload 9
    //   163: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   166: iload 12
    //   168: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   171: pop
    //   172: iinc 7 3
    //   175: iload_3
    //   176: ifeq -122 -> 54
    //   179: iload_3
    //   180: ifeq +55 -> 235
    //   183: iconst_1
    //   184: istore 4
    //   186: aload_2
    //   187: arraylength
    //   188: istore 5
    //   190: iload 4
    //   192: iload 5
    //   194: if_icmpge +41 -> 235
    //   197: aload_1
    //   198: aload_2
    //   199: iload 4
    //   201: iconst_2
    //   202: iadd
    //   203: baload
    //   204: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   207: aload_2
    //   208: iload 4
    //   210: iconst_1
    //   211: iadd
    //   212: baload
    //   213: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   216: aload_2
    //   217: iload 4
    //   219: baload
    //   220: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   223: iconst_m1
    //   224: invokevirtual 228	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   227: pop
    //   228: iinc 4 3
    //   231: iload_3
    //   232: ifeq -42 -> 190
    //   235: return
    // Line number table:
    //   Java source line #316	-> byte code offset #4
    //   Java source line #188	-> byte code offset #19
    //   Java source line #375	-> byte code offset #31
    //   Java source line #5	-> byte code offset #39
    //   Java source line #221	-> byte code offset #47
    //   Java source line #145	-> byte code offset #61
    //   Java source line #285	-> byte code offset #67
    //   Java source line #370	-> byte code offset #75
    //   Java source line #270	-> byte code offset #83
    //   Java source line #368	-> byte code offset #86
    //   Java source line #336	-> byte code offset #147
    //   Java source line #236	-> byte code offset #150
    //   Java source line #262	-> byte code offset #172
    //   Java source line #52	-> byte code offset #179
    //   Java source line #362	-> byte code offset #183
    //   Java source line #357	-> byte code offset #197
    //   Java source line #315	-> byte code offset #228
    //   Java source line #83	-> byte code offset #235
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	a	j
    //   0	236	1	a	ByteBuffer
    //   0	236	2	a	byte[]
    //   3	232	3	a	int
    //   31	148	4	a	byte
    //   186	49	4	a	int
    //   39	140	5	a	byte
    //   190	45	5	a	int
    //   47	132	6	a	byte
    //   50	129	7	a	int
    //   54	125	8	a	int
    //   67	105	9	a	byte
    //   75	97	10	a	byte
    //   83	89	11	a	byte
    //   86	86	12	a	byte
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/UnsupportedOperationException
    //   12	23	26	java/lang/UnsupportedOperationException
    //   86	94	97	java/lang/UnsupportedOperationException
    //   90	105	108	java/lang/UnsupportedOperationException
    //   98	117	120	java/lang/UnsupportedOperationException
    //   109	124	127	java/lang/UnsupportedOperationException
    //   121	134	137	java/lang/UnsupportedOperationException
    //   128	140	143	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void a(byte[] a, byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: iconst_1
    //   4: istore 4
    //   6: aload_2
    //   7: arraylength
    //   8: istore 5
    //   10: istore_3
    //   11: iload 4
    //   13: iload 5
    //   15: if_icmpge +78 -> 93
    //   18: aload_1
    //   19: iconst_1
    //   20: iload 4
    //   22: iconst_1
    //   23: ishr
    //   24: iadd
    //   25: baload
    //   26: sipush 255
    //   29: iand
    //   30: istore 6
    //   32: iload_3
    //   33: ifne +56 -> 89
    //   36: iload 5
    //   38: iload 4
    //   40: isub
    //   41: lookupswitch	default:+20->61, 1:+36->77
    //   60: athrow
    //   61: aload_2
    //   62: iload 4
    //   64: iconst_1
    //   65: iadd
    //   66: iload 6
    //   68: bipush 15
    //   70: iand
    //   71: i2b
    //   72: bastore
    //   73: goto +4 -> 77
    //   76: athrow
    //   77: aload_2
    //   78: iload 4
    //   80: iload 6
    //   82: iconst_4
    //   83: ishr
    //   84: i2b
    //   85: bastore
    //   86: iinc 4 2
    //   89: iload_3
    //   90: ifeq -79 -> 11
    //   93: return
    // Line number table:
    //   Java source line #119	-> byte code offset #3
    //   Java source line #425	-> byte code offset #18
    //   Java source line #260	-> byte code offset #32
    //   Java source line #103	-> byte code offset #61
    //   Java source line #24	-> byte code offset #77
    //   Java source line #134	-> byte code offset #86
    //   Java source line #177	-> byte code offset #93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	a	j
    //   0	94	1	a	byte[]
    //   0	94	2	a	byte[]
    //   10	80	3	a	int
    //   4	83	4	a	int
    //   8	1	5	i1	int
    //   11	30	5	a	int
    //   30	51	6	a	int
    //   60	1	8	localUnsupportedOperationException1	UnsupportedOperationException
    //   76	1	9	localUnsupportedOperationException2	UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   32	60	60	java/lang/UnsupportedOperationException
    //   36	73	76	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void b(byte[] a, byte[] a)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   6: aload_2
    //   7: arraylength
    //   8: istore 5
    //   10: istore_3
    //   11: iload 4
    //   13: iload 5
    //   15: if_icmpge +112 -> 127
    //   18: aload_1
    //   19: iconst_1
    //   20: iload 4
    //   22: iconst_2
    //   23: ishr
    //   24: iadd
    //   25: baload
    //   26: sipush 255
    //   29: iand
    //   30: istore 6
    //   32: iload_3
    //   33: ifne +90 -> 123
    //   36: iload 5
    //   38: iload 4
    //   40: isub
    //   41: tableswitch	default:+28->69, 1:+69->110, 2:+56->97, 3:+43->84
    //   68: athrow
    //   69: aload_2
    //   70: iload 4
    //   72: iconst_3
    //   73: iadd
    //   74: iload 6
    //   76: iconst_3
    //   77: iand
    //   78: i2b
    //   79: bastore
    //   80: goto +4 -> 84
    //   83: athrow
    //   84: aload_2
    //   85: iload 4
    //   87: iconst_2
    //   88: iadd
    //   89: iload 6
    //   91: iconst_2
    //   92: ishr
    //   93: iconst_3
    //   94: iand
    //   95: i2b
    //   96: bastore
    //   97: aload_2
    //   98: iload 4
    //   100: iconst_1
    //   101: iadd
    //   102: iload 6
    //   104: iconst_4
    //   105: ishr
    //   106: iconst_3
    //   107: iand
    //   108: i2b
    //   109: bastore
    //   110: aload_2
    //   111: iload 4
    //   113: iload 6
    //   115: bipush 6
    //   117: ishr
    //   118: i2b
    //   119: bastore
    //   120: iinc 4 4
    //   123: iload_3
    //   124: ifeq -113 -> 11
    //   127: return
    // Line number table:
    //   Java source line #186	-> byte code offset #0
    //   Java source line #391	-> byte code offset #18
    //   Java source line #420	-> byte code offset #32
    //   Java source line #433	-> byte code offset #69
    //   Java source line #43	-> byte code offset #84
    //   Java source line #277	-> byte code offset #97
    //   Java source line #445	-> byte code offset #110
    //   Java source line #101	-> byte code offset #120
    //   Java source line #280	-> byte code offset #127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	a	j
    //   0	128	1	a	byte[]
    //   0	128	2	a	byte[]
    //   10	114	3	a	int
    //   1	120	4	a	int
    //   8	1	5	i1	int
    //   11	30	5	a	int
    //   30	84	6	a	int
    //   68	1	8	localUnsupportedOperationException1	UnsupportedOperationException
    //   83	1	9	localUnsupportedOperationException2	UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   32	68	68	java/lang/UnsupportedOperationException
    //   36	80	83	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void c(byte[] a, byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: iconst_1
    //   4: istore 4
    //   6: istore_3
    //   7: aload_2
    //   8: arraylength
    //   9: istore 5
    //   11: iload 4
    //   13: iload 5
    //   15: if_icmpge +183 -> 198
    //   18: aload_1
    //   19: iconst_1
    //   20: iload 4
    //   22: iconst_3
    //   23: ishr
    //   24: iadd
    //   25: baload
    //   26: sipush 255
    //   29: iand
    //   30: istore 6
    //   32: iload_3
    //   33: ifne +161 -> 194
    //   36: iload 5
    //   38: iload 4
    //   40: isub
    //   41: tableswitch	default:+44->85, 1:+140->181, 2:+126->167, 3:+113->154, 4:+100->141, 5:+87->128, 6:+74->115, 7:+60->101
    //   84: athrow
    //   85: aload_2
    //   86: iload 4
    //   88: bipush 7
    //   90: iadd
    //   91: iload 6
    //   93: iconst_1
    //   94: iand
    //   95: i2b
    //   96: bastore
    //   97: goto +4 -> 101
    //   100: athrow
    //   101: aload_2
    //   102: iload 4
    //   104: bipush 6
    //   106: iadd
    //   107: iload 6
    //   109: iconst_1
    //   110: ishr
    //   111: iconst_1
    //   112: iand
    //   113: i2b
    //   114: bastore
    //   115: aload_2
    //   116: iload 4
    //   118: iconst_5
    //   119: iadd
    //   120: iload 6
    //   122: iconst_2
    //   123: ishr
    //   124: iconst_1
    //   125: iand
    //   126: i2b
    //   127: bastore
    //   128: aload_2
    //   129: iload 4
    //   131: iconst_4
    //   132: iadd
    //   133: iload 6
    //   135: iconst_3
    //   136: ishr
    //   137: iconst_1
    //   138: iand
    //   139: i2b
    //   140: bastore
    //   141: aload_2
    //   142: iload 4
    //   144: iconst_3
    //   145: iadd
    //   146: iload 6
    //   148: iconst_4
    //   149: ishr
    //   150: iconst_1
    //   151: iand
    //   152: i2b
    //   153: bastore
    //   154: aload_2
    //   155: iload 4
    //   157: iconst_2
    //   158: iadd
    //   159: iload 6
    //   161: iconst_5
    //   162: ishr
    //   163: iconst_1
    //   164: iand
    //   165: i2b
    //   166: bastore
    //   167: aload_2
    //   168: iload 4
    //   170: iconst_1
    //   171: iadd
    //   172: iload 6
    //   174: bipush 6
    //   176: ishr
    //   177: iconst_1
    //   178: iand
    //   179: i2b
    //   180: bastore
    //   181: aload_2
    //   182: iload 4
    //   184: iload 6
    //   186: bipush 7
    //   188: ishr
    //   189: i2b
    //   190: bastore
    //   191: iinc 4 8
    //   194: iload_3
    //   195: ifeq -184 -> 11
    //   198: return
    // Line number table:
    //   Java source line #408	-> byte code offset #3
    //   Java source line #256	-> byte code offset #18
    //   Java source line #18	-> byte code offset #32
    //   Java source line #2	-> byte code offset #85
    //   Java source line #331	-> byte code offset #101
    //   Java source line #246	-> byte code offset #115
    //   Java source line #60	-> byte code offset #128
    //   Java source line #214	-> byte code offset #141
    //   Java source line #133	-> byte code offset #154
    //   Java source line #235	-> byte code offset #167
    //   Java source line #261	-> byte code offset #181
    //   Java source line #409	-> byte code offset #191
    //   Java source line #148	-> byte code offset #198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	a	j
    //   0	199	1	a	byte[]
    //   0	199	2	a	byte[]
    //   6	189	3	a	int
    //   4	1	4	i1	int
    //   7	185	4	a	int
    //   9	32	5	a	int
    //   30	155	6	a	int
    //   84	1	8	localUnsupportedOperationException1	UnsupportedOperationException
    //   100	1	9	localUnsupportedOperationException2	UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   32	84	84	java/lang/UnsupportedOperationException
    //   36	97	100	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void d(byte[] a, byte[] a)
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_3
    //   4: aload_1
    //   5: iconst_0
    //   6: baload
    //   7: tableswitch	default:+96->103, 0:+33->40, 1:+41->48, 2:+54->61, 3:+68->75, 4:+82->89
    //   40: iload_3
    //   41: ifeq +96 -> 137
    //   44: goto +4 -> 48
    //   47: athrow
    //   48: aload_0
    //   49: aload_1
    //   50: invokespecial 231	com/sun/jna/z/a/g/j:a	([B)V
    //   53: iload_3
    //   54: ifeq +83 -> 137
    //   57: goto +4 -> 61
    //   60: athrow
    //   61: aload_0
    //   62: aload_1
    //   63: aload_2
    //   64: invokespecial 233	com/sun/jna/z/a/g/j:e	([B[B)V
    //   67: iload_3
    //   68: ifeq +69 -> 137
    //   71: goto +4 -> 75
    //   74: athrow
    //   75: aload_0
    //   76: aload_1
    //   77: aload_2
    //   78: invokespecial 235	com/sun/jna/z/a/g/j:f	([B[B)V
    //   81: iload_3
    //   82: ifeq +55 -> 137
    //   85: goto +4 -> 89
    //   88: athrow
    //   89: aload_0
    //   90: aload_1
    //   91: aload_2
    //   92: invokespecial 237	com/sun/jna/z/a/g/j:g	([B[B)V
    //   95: iload_3
    //   96: ifeq +41 -> 137
    //   99: goto +4 -> 103
    //   102: athrow
    //   103: new 58	java/io/IOException
    //   106: dup
    //   107: new 239	java/lang/StringBuilder
    //   110: dup
    //   111: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   114: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   117: bipush 12
    //   119: aaload
    //   120: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload_1
    //   124: iconst_0
    //   125: baload
    //   126: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   135: athrow
    //   136: athrow
    //   137: return
    // Line number table:
    //   Java source line #61	-> byte code offset #4
    //   Java source line #242	-> byte code offset #40
    //   Java source line #327	-> byte code offset #48
    //   Java source line #41	-> byte code offset #53
    //   Java source line #219	-> byte code offset #61
    //   Java source line #444	-> byte code offset #67
    //   Java source line #297	-> byte code offset #75
    //   Java source line #32	-> byte code offset #81
    //   Java source line #166	-> byte code offset #89
    //   Java source line #364	-> byte code offset #95
    //   Java source line #82	-> byte code offset #103
    //   Java source line #326	-> byte code offset #137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	a	j
    //   0	138	1	a	byte[]
    //   0	138	2	a	byte[]
    //   3	93	3	a	int
    //   47	1	4	localIOException1	IOException
    //   60	1	5	localIOException2	IOException
    //   74	1	6	localIOException3	IOException
    //   88	1	7	localIOException4	IOException
    //   102	1	8	localIOException5	IOException
    //   136	1	9	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   4	44	47	java/io/IOException
    //   40	57	60	java/io/IOException
    //   48	71	74	java/io/IOException
    //   61	85	88	java/io/IOException
    //   75	99	102	java/io/IOException
    //   89	136	136	java/io/IOException
  }
  
  /* Error */
  private void g(byte[] a, byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: aload_0
    //   4: getfield 170	com/sun/jna/z/a/g/j:v	I
    //   7: istore 4
    //   9: iconst_1
    //   10: istore 5
    //   12: istore_3
    //   13: iload 5
    //   15: iload 4
    //   17: if_icmpgt +86 -> 103
    //   20: aload_1
    //   21: iload_3
    //   22: ifne +82 -> 104
    //   25: iload 5
    //   27: dup2
    //   28: baload
    //   29: aload_2
    //   30: iload 5
    //   32: baload
    //   33: iadd
    //   34: i2b
    //   35: bastore
    //   36: iinc 5 1
    //   39: iload_3
    //   40: ifeq -27 -> 13
    //   43: goto +4 -> 47
    //   46: athrow
    //   47: goto +4 -> 51
    //   50: athrow
    //   51: goto +4 -> 55
    //   54: athrow
    //   55: goto +4 -> 59
    //   58: athrow
    //   59: goto +4 -> 63
    //   62: athrow
    //   63: goto +4 -> 67
    //   66: athrow
    //   67: goto +4 -> 71
    //   70: athrow
    //   71: goto +4 -> 75
    //   74: athrow
    //   75: goto +4 -> 79
    //   78: athrow
    //   79: goto +4 -> 83
    //   82: athrow
    //   83: goto +4 -> 87
    //   86: athrow
    //   87: goto +4 -> 91
    //   90: athrow
    //   91: goto +4 -> 95
    //   94: athrow
    //   95: goto +4 -> 99
    //   98: athrow
    //   99: goto +4 -> 103
    //   102: athrow
    //   103: aload_1
    //   104: arraylength
    //   105: istore 6
    //   107: iload 5
    //   109: iload 6
    //   111: if_icmpge +375 -> 486
    //   114: aload_1
    //   115: iload 5
    //   117: iload 4
    //   119: isub
    //   120: baload
    //   121: sipush 255
    //   124: iand
    //   125: istore 7
    //   127: aload_2
    //   128: iload 5
    //   130: baload
    //   131: sipush 255
    //   134: iand
    //   135: istore 8
    //   137: aload_2
    //   138: iload 5
    //   140: iload 4
    //   142: isub
    //   143: baload
    //   144: sipush 255
    //   147: iand
    //   148: istore 9
    //   150: iload 7
    //   152: iload 8
    //   154: iadd
    //   155: iload 9
    //   157: isub
    //   158: istore 10
    //   160: iload 10
    //   162: iload 7
    //   164: isub
    //   165: istore 11
    //   167: iload 11
    //   169: iload_3
    //   170: ifne +76 -> 246
    //   173: ifge +68 -> 241
    //   176: goto +4 -> 180
    //   179: athrow
    //   180: goto +4 -> 184
    //   183: athrow
    //   184: goto +4 -> 188
    //   187: athrow
    //   188: goto +4 -> 192
    //   191: athrow
    //   192: goto +4 -> 196
    //   195: athrow
    //   196: goto +4 -> 200
    //   199: athrow
    //   200: goto +4 -> 204
    //   203: athrow
    //   204: goto +4 -> 208
    //   207: athrow
    //   208: goto +4 -> 212
    //   211: athrow
    //   212: goto +4 -> 216
    //   215: athrow
    //   216: goto +4 -> 220
    //   219: athrow
    //   220: goto +4 -> 224
    //   223: athrow
    //   224: goto +4 -> 228
    //   227: athrow
    //   228: goto +4 -> 232
    //   231: athrow
    //   232: goto +4 -> 236
    //   235: athrow
    //   236: iload 11
    //   238: ineg
    //   239: istore 11
    //   241: iload 10
    //   243: iload 8
    //   245: isub
    //   246: istore 12
    //   248: iload 12
    //   250: iload_3
    //   251: ifne +76 -> 327
    //   254: ifge +68 -> 322
    //   257: goto +4 -> 261
    //   260: athrow
    //   261: goto +4 -> 265
    //   264: athrow
    //   265: goto +4 -> 269
    //   268: athrow
    //   269: goto +4 -> 273
    //   272: athrow
    //   273: goto +4 -> 277
    //   276: athrow
    //   277: goto +4 -> 281
    //   280: athrow
    //   281: goto +4 -> 285
    //   284: athrow
    //   285: goto +4 -> 289
    //   288: athrow
    //   289: goto +4 -> 293
    //   292: athrow
    //   293: goto +4 -> 297
    //   296: athrow
    //   297: goto +4 -> 301
    //   300: athrow
    //   301: goto +4 -> 305
    //   304: athrow
    //   305: goto +4 -> 309
    //   308: athrow
    //   309: goto +4 -> 313
    //   312: athrow
    //   313: goto +4 -> 317
    //   316: athrow
    //   317: iload 12
    //   319: ineg
    //   320: istore 12
    //   322: iload 10
    //   324: iload 9
    //   326: isub
    //   327: istore 13
    //   329: iload 13
    //   331: iload_3
    //   332: ifne +73 -> 405
    //   335: ifge +68 -> 403
    //   338: goto +4 -> 342
    //   341: athrow
    //   342: goto +4 -> 346
    //   345: athrow
    //   346: goto +4 -> 350
    //   349: athrow
    //   350: goto +4 -> 354
    //   353: athrow
    //   354: goto +4 -> 358
    //   357: athrow
    //   358: goto +4 -> 362
    //   361: athrow
    //   362: goto +4 -> 366
    //   365: athrow
    //   366: goto +4 -> 370
    //   369: athrow
    //   370: goto +4 -> 374
    //   373: athrow
    //   374: goto +4 -> 378
    //   377: athrow
    //   378: goto +4 -> 382
    //   381: athrow
    //   382: goto +4 -> 386
    //   385: athrow
    //   386: goto +4 -> 390
    //   389: athrow
    //   390: goto +4 -> 394
    //   393: athrow
    //   394: goto +4 -> 398
    //   397: athrow
    //   398: iload 13
    //   400: ineg
    //   401: istore 13
    //   403: iload 11
    //   405: iload 12
    //   407: iload_3
    //   408: ifne +53 -> 461
    //   411: if_icmpgt +34 -> 445
    //   414: goto +4 -> 418
    //   417: athrow
    //   418: iload 11
    //   420: iload 13
    //   422: iload_3
    //   423: ifne +38 -> 461
    //   426: goto +4 -> 430
    //   429: athrow
    //   430: if_icmpgt +15 -> 445
    //   433: goto +4 -> 437
    //   436: athrow
    //   437: iload 7
    //   439: istore 9
    //   441: iload_3
    //   442: ifeq +26 -> 468
    //   445: iload 12
    //   447: iload_3
    //   448: ifne +18 -> 466
    //   451: goto +4 -> 455
    //   454: athrow
    //   455: iload 13
    //   457: goto +4 -> 461
    //   460: athrow
    //   461: if_icmpgt +7 -> 468
    //   464: iload 8
    //   466: istore 9
    //   468: aload_1
    //   469: iload 5
    //   471: dup2
    //   472: baload
    //   473: iload 9
    //   475: i2b
    //   476: iadd
    //   477: i2b
    //   478: bastore
    //   479: iinc 5 1
    //   482: iload_3
    //   483: ifeq -376 -> 107
    //   486: return
    // Line number table:
    //   Java source line #66	-> byte code offset #3
    //   Java source line #193	-> byte code offset #9
    //   Java source line #191	-> byte code offset #20
    //   Java source line #307	-> byte code offset #36
    //   Java source line #422	-> byte code offset #103
    //   Java source line #100	-> byte code offset #114
    //   Java source line #13	-> byte code offset #127
    //   Java source line #228	-> byte code offset #137
    //   Java source line #206	-> byte code offset #150
    //   Java source line #109	-> byte code offset #160
    //   Java source line #300	-> byte code offset #241
    //   Java source line #57	-> byte code offset #322
    //   Java source line #53	-> byte code offset #403
    //   Java source line #382	-> byte code offset #437
    //   Java source line #273	-> byte code offset #445
    //   Java source line #110	-> byte code offset #464
    //   Java source line #335	-> byte code offset #468
    //   Java source line #314	-> byte code offset #479
    //   Java source line #69	-> byte code offset #486
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	487	0	a	j
    //   0	487	1	a	byte[]
    //   0	487	2	a	byte[]
    //   12	474	3	a	int
    //   9	478	4	a	int
    //   13	474	5	a	int
    //   107	379	6	a	int
    //   127	352	7	a	int
    //   137	342	8	a	int
    //   150	329	9	a	int
    //   160	319	10	a	int
    //   167	312	11	a	int
    //   248	231	12	a	int
    //   329	150	13	a	int
    // Exception table:
    //   from	to	target	type
    //   20	43	46	java/lang/UnsupportedOperationException
    //   20	47	50	java/lang/IllegalArgumentException
    //   20	51	54	java/lang/UnsupportedOperationException
    //   20	55	58	java/lang/IllegalArgumentException
    //   20	59	62	java/lang/UnsupportedOperationException
    //   20	63	66	java/lang/IllegalArgumentException
    //   20	67	70	java/lang/UnsupportedOperationException
    //   20	71	74	java/lang/IllegalArgumentException
    //   20	75	78	java/lang/UnsupportedOperationException
    //   20	79	82	java/lang/IllegalArgumentException
    //   20	83	86	java/lang/UnsupportedOperationException
    //   20	87	90	java/lang/IllegalArgumentException
    //   20	91	94	java/lang/UnsupportedOperationException
    //   20	95	98	java/lang/IllegalArgumentException
    //   20	99	102	java/lang/UnsupportedOperationException
    //   167	176	179	java/lang/UnsupportedOperationException
    //   167	180	183	java/lang/IllegalArgumentException
    //   167	184	187	java/lang/UnsupportedOperationException
    //   167	188	191	java/lang/IllegalArgumentException
    //   167	192	195	java/lang/UnsupportedOperationException
    //   167	196	199	java/lang/IllegalArgumentException
    //   167	200	203	java/lang/UnsupportedOperationException
    //   167	204	207	java/lang/IllegalArgumentException
    //   167	208	211	java/lang/UnsupportedOperationException
    //   167	212	215	java/lang/IllegalArgumentException
    //   167	216	219	java/lang/UnsupportedOperationException
    //   167	220	223	java/lang/IllegalArgumentException
    //   167	224	227	java/lang/UnsupportedOperationException
    //   167	228	231	java/lang/IllegalArgumentException
    //   167	232	235	java/lang/UnsupportedOperationException
    //   248	257	260	java/lang/UnsupportedOperationException
    //   248	261	264	java/lang/IllegalArgumentException
    //   248	265	268	java/lang/UnsupportedOperationException
    //   248	269	272	java/lang/IllegalArgumentException
    //   248	273	276	java/lang/UnsupportedOperationException
    //   248	277	280	java/lang/IllegalArgumentException
    //   248	281	284	java/lang/UnsupportedOperationException
    //   248	285	288	java/lang/IllegalArgumentException
    //   248	289	292	java/lang/UnsupportedOperationException
    //   248	293	296	java/lang/IllegalArgumentException
    //   248	297	300	java/lang/UnsupportedOperationException
    //   248	301	304	java/lang/IllegalArgumentException
    //   248	305	308	java/lang/UnsupportedOperationException
    //   248	309	312	java/lang/IllegalArgumentException
    //   248	313	316	java/lang/UnsupportedOperationException
    //   329	338	341	java/lang/UnsupportedOperationException
    //   329	342	345	java/lang/IllegalArgumentException
    //   329	346	349	java/lang/UnsupportedOperationException
    //   329	350	353	java/lang/IllegalArgumentException
    //   329	354	357	java/lang/UnsupportedOperationException
    //   329	358	361	java/lang/IllegalArgumentException
    //   329	362	365	java/lang/UnsupportedOperationException
    //   329	366	369	java/lang/IllegalArgumentException
    //   329	370	373	java/lang/UnsupportedOperationException
    //   329	374	377	java/lang/IllegalArgumentException
    //   329	378	381	java/lang/UnsupportedOperationException
    //   329	382	385	java/lang/IllegalArgumentException
    //   329	386	389	java/lang/UnsupportedOperationException
    //   329	390	393	java/lang/IllegalArgumentException
    //   329	394	397	java/lang/UnsupportedOperationException
    //   405	414	417	java/lang/UnsupportedOperationException
    //   411	426	429	java/lang/UnsupportedOperationException
    //   418	433	436	java/lang/UnsupportedOperationException
    //   441	451	454	java/lang/UnsupportedOperationException
    //   445	457	460	java/lang/UnsupportedOperationException
  }
  
  /* Error */
  private void f()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: bipush 13
    //   3: invokespecial 253	com/sun/jna/z/a/g/j:b	(I)V
    //   6: aload_0
    //   7: aload_0
    //   8: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   11: iconst_0
    //   12: bipush 13
    //   14: invokespecial 256	com/sun/jna/z/a/g/j:a	([BII)I
    //   17: pop
    //   18: aload_0
    //   19: aload_0
    //   20: aload_0
    //   21: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   24: iconst_0
    //   25: invokespecial 259	com/sun/jna/z/a/g/j:a	([BI)I
    //   28: putfield 128	com/sun/jna/z/a/g/j:r	I
    //   31: aload_0
    //   32: aload_0
    //   33: aload_0
    //   34: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   37: iconst_4
    //   38: invokespecial 259	com/sun/jna/z/a/g/j:a	([BI)I
    //   41: putfield 126	com/sun/jna/z/a/g/j:s	I
    //   44: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   47: istore_1
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   53: bipush 8
    //   55: baload
    //   56: sipush 255
    //   59: iand
    //   60: putfield 168	com/sun/jna/z/a/g/j:t	I
    //   63: aload_0
    //   64: aload_0
    //   65: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   68: bipush 9
    //   70: baload
    //   71: sipush 255
    //   74: iand
    //   75: putfield 120	com/sun/jna/z/a/g/j:u	I
    //   78: aload_0
    //   79: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   82: iload_1
    //   83: ifne +62 -> 145
    //   86: tableswitch	default:+421->507, 0:+43->129, 1:+421->507, 2:+177->263, 3:+311->397, 4:+110->196, 5:+421->507, 6:+244->330
    //   128: athrow
    //   129: aload_0
    //   130: iload_1
    //   131: ifne +57 -> 188
    //   134: goto +4 -> 138
    //   137: athrow
    //   138: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   141: goto +4 -> 145
    //   144: athrow
    //   145: bipush 8
    //   147: if_icmpeq +40 -> 187
    //   150: new 58	java/io/IOException
    //   153: dup
    //   154: new 239	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   161: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   164: astore_2
    //   165: aload_2
    //   166: bipush 16
    //   168: aaload
    //   169: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: aload_0
    //   173: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   176: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   179: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   185: athrow
    //   186: athrow
    //   187: aload_0
    //   188: iconst_1
    //   189: putfield 170	com/sun/jna/z/a/g/j:v	I
    //   192: iload_1
    //   193: ifeq +350 -> 543
    //   196: aload_0
    //   197: iload_1
    //   198: ifne +57 -> 255
    //   201: goto +4 -> 205
    //   204: athrow
    //   205: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   208: bipush 8
    //   210: if_icmpeq +44 -> 254
    //   213: goto +4 -> 217
    //   216: athrow
    //   217: new 58	java/io/IOException
    //   220: dup
    //   221: new 239	java/lang/StringBuilder
    //   224: dup
    //   225: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   228: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   231: astore_2
    //   232: aload_2
    //   233: bipush 16
    //   235: aaload
    //   236: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: aload_0
    //   240: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   243: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   246: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   252: athrow
    //   253: athrow
    //   254: aload_0
    //   255: iconst_2
    //   256: putfield 170	com/sun/jna/z/a/g/j:v	I
    //   259: iload_1
    //   260: ifeq +283 -> 543
    //   263: aload_0
    //   264: iload_1
    //   265: ifne +57 -> 322
    //   268: goto +4 -> 272
    //   271: athrow
    //   272: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   275: bipush 8
    //   277: if_icmpeq +44 -> 321
    //   280: goto +4 -> 284
    //   283: athrow
    //   284: new 58	java/io/IOException
    //   287: dup
    //   288: new 239	java/lang/StringBuilder
    //   291: dup
    //   292: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   295: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   298: astore_2
    //   299: aload_2
    //   300: bipush 16
    //   302: aaload
    //   303: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: aload_0
    //   307: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   310: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   313: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   319: athrow
    //   320: athrow
    //   321: aload_0
    //   322: iconst_3
    //   323: putfield 170	com/sun/jna/z/a/g/j:v	I
    //   326: iload_1
    //   327: ifeq +216 -> 543
    //   330: aload_0
    //   331: iload_1
    //   332: ifne +57 -> 389
    //   335: goto +4 -> 339
    //   338: athrow
    //   339: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   342: bipush 8
    //   344: if_icmpeq +44 -> 388
    //   347: goto +4 -> 351
    //   350: athrow
    //   351: new 58	java/io/IOException
    //   354: dup
    //   355: new 239	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   362: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   365: astore_2
    //   366: aload_2
    //   367: bipush 16
    //   369: aaload
    //   370: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload_0
    //   374: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   377: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   380: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   383: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   386: athrow
    //   387: athrow
    //   388: aload_0
    //   389: iconst_4
    //   390: putfield 170	com/sun/jna/z/a/g/j:v	I
    //   393: iload_1
    //   394: ifeq +149 -> 543
    //   397: aload_0
    //   398: iload_1
    //   399: ifne +63 -> 462
    //   402: goto +4 -> 406
    //   405: athrow
    //   406: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   409: tableswitch	default:+61->470, 1:+48->457, 2:+48->457, 3:+61->470, 4:+48->457, 5:+61->470, 6:+61->470, 7:+61->470, 8:+48->457
    //   456: athrow
    //   457: aload_0
    //   458: goto +4 -> 462
    //   461: athrow
    //   462: iconst_1
    //   463: putfield 170	com/sun/jna/z/a/g/j:v	I
    //   466: iload_1
    //   467: ifeq +76 -> 543
    //   470: new 58	java/io/IOException
    //   473: dup
    //   474: new 239	java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   481: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   484: astore_2
    //   485: aload_2
    //   486: bipush 16
    //   488: aaload
    //   489: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: aload_0
    //   493: getfield 168	com/sun/jna/z/a/g/j:t	I
    //   496: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   499: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   502: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   505: athrow
    //   506: athrow
    //   507: new 58	java/io/IOException
    //   510: dup
    //   511: new 239	java/lang/StringBuilder
    //   514: dup
    //   515: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   518: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   521: astore_2
    //   522: aload_2
    //   523: bipush 14
    //   525: aaload
    //   526: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   529: aload_0
    //   530: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   533: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   536: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   539: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   542: athrow
    //   543: aload_0
    //   544: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   547: bipush 10
    //   549: baload
    //   550: iload_1
    //   551: ifne +33 -> 584
    //   554: ifeq +23 -> 577
    //   557: goto +4 -> 561
    //   560: athrow
    //   561: new 58	java/io/IOException
    //   564: dup
    //   565: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   568: astore_2
    //   569: aload_2
    //   570: iconst_4
    //   571: aaload
    //   572: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   575: athrow
    //   576: athrow
    //   577: aload_0
    //   578: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   581: bipush 11
    //   583: baload
    //   584: iload_1
    //   585: ifne +34 -> 619
    //   588: ifeq +24 -> 612
    //   591: goto +4 -> 595
    //   594: athrow
    //   595: new 58	java/io/IOException
    //   598: dup
    //   599: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   602: astore_2
    //   603: aload_2
    //   604: bipush 9
    //   606: aaload
    //   607: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   610: athrow
    //   611: athrow
    //   612: aload_0
    //   613: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   616: bipush 12
    //   618: baload
    //   619: ifeq +31 -> 650
    //   622: new 58	java/io/IOException
    //   625: dup
    //   626: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   629: iconst_1
    //   630: aaload
    //   631: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   634: athrow
    //   635: athrow
    //   636: athrow
    //   637: athrow
    //   638: athrow
    //   639: athrow
    //   640: athrow
    //   641: athrow
    //   642: athrow
    //   643: athrow
    //   644: athrow
    //   645: athrow
    //   646: athrow
    //   647: athrow
    //   648: athrow
    //   649: athrow
    //   650: return
    // Line number table:
    //   Java source line #401	-> byte code offset #0
    //   Java source line #95	-> byte code offset #6
    //   Java source line #120	-> byte code offset #18
    //   Java source line #308	-> byte code offset #31
    //   Java source line #30	-> byte code offset #47
    //   Java source line #189	-> byte code offset #63
    //   Java source line #175	-> byte code offset #78
    //   Java source line #72	-> byte code offset #129
    //   Java source line #296	-> byte code offset #150
    //   Java source line #46	-> byte code offset #187
    //   Java source line #157	-> byte code offset #192
    //   Java source line #233	-> byte code offset #196
    //   Java source line #419	-> byte code offset #217
    //   Java source line #94	-> byte code offset #254
    //   Java source line #424	-> byte code offset #259
    //   Java source line #330	-> byte code offset #263
    //   Java source line #436	-> byte code offset #284
    //   Java source line #434	-> byte code offset #321
    //   Java source line #25	-> byte code offset #326
    //   Java source line #81	-> byte code offset #330
    //   Java source line #28	-> byte code offset #351
    //   Java source line #342	-> byte code offset #388
    //   Java source line #240	-> byte code offset #393
    //   Java source line #142	-> byte code offset #397
    //   Java source line #163	-> byte code offset #457
    //   Java source line #200	-> byte code offset #466
    //   Java source line #137	-> byte code offset #470
    //   Java source line #168	-> byte code offset #507
    //   Java source line #369	-> byte code offset #543
    //   Java source line #36	-> byte code offset #561
    //   Java source line #10	-> byte code offset #577
    //   Java source line #7	-> byte code offset #595
    //   Java source line #84	-> byte code offset #612
    //   Java source line #423	-> byte code offset #622
    //   Java source line #351	-> byte code offset #650
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	651	0	a	j
    //   47	603	1	a	int
    //   164	446	2	a	String[]
    // Exception table:
    //   from	to	target	type
    //   48	128	128	java/io/IOException
    //   86	134	137	java/io/IOException
    //   129	141	144	java/io/IOException
    //   145	186	186	java/io/IOException
    //   188	201	204	java/io/IOException
    //   196	213	216	java/io/IOException
    //   205	253	253	java/io/IOException
    //   255	268	271	java/io/IOException
    //   263	280	283	java/io/IOException
    //   272	320	320	java/io/IOException
    //   322	335	338	java/io/IOException
    //   330	347	350	java/io/IOException
    //   339	387	387	java/io/IOException
    //   389	402	405	java/io/IOException
    //   397	456	456	java/io/IOException
    //   406	458	461	java/io/IOException
    //   462	506	506	java/io/IOException
    //   543	557	560	java/io/IOException
    //   554	576	576	java/io/IOException
    //   584	591	594	java/io/IOException
    //   588	611	611	java/io/IOException
    //   619	635	635	java/io/IOException
    //   619	636	636	java/lang/UnsupportedOperationException
    //   619	637	637	java/io/IOException
    //   619	638	638	java/lang/UnsupportedOperationException
    //   619	639	639	java/io/IOException
    //   619	640	640	java/lang/UnsupportedOperationException
    //   619	641	641	java/io/IOException
    //   619	642	642	java/lang/UnsupportedOperationException
    //   619	643	643	java/io/IOException
    //   619	644	644	java/lang/UnsupportedOperationException
    //   619	645	645	java/io/IOException
    //   619	646	646	java/lang/UnsupportedOperationException
    //   619	647	647	java/io/IOException
    //   619	648	648	java/lang/UnsupportedOperationException
    //   619	649	649	java/io/IOException
  }
  
  /* Error */
  private void g()
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: aload_0
    //   4: getfield 261	com/sun/jna/z/a/g/j:o	I
    //   7: iconst_3
    //   8: idiv
    //   9: istore_2
    //   10: istore_1
    //   11: iload_2
    //   12: iconst_1
    //   13: iload_1
    //   14: ifne +18 -> 32
    //   17: if_icmplt +47 -> 64
    //   20: goto +4 -> 24
    //   23: athrow
    //   24: iload_2
    //   25: sipush 256
    //   28: goto +4 -> 32
    //   31: athrow
    //   32: iload_1
    //   33: ifne +19 -> 52
    //   36: if_icmpgt +28 -> 64
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: aload_0
    //   44: getfield 261	com/sun/jna/z/a/g/j:o	I
    //   47: iconst_3
    //   48: goto +4 -> 52
    //   51: athrow
    //   52: irem
    //   53: iload_1
    //   54: ifne +48 -> 102
    //   57: ifeq +22 -> 79
    //   60: goto +4 -> 64
    //   63: athrow
    //   64: new 58	java/io/IOException
    //   67: dup
    //   68: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   71: bipush 8
    //   73: aaload
    //   74: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: athrow
    //   79: aload_0
    //   80: iload_2
    //   81: iconst_3
    //   82: imul
    //   83: newarray <illegal type>
    //   85: putfield 122	com/sun/jna/z/a/g/j:w	[B
    //   88: aload_0
    //   89: aload_0
    //   90: getfield 122	com/sun/jna/z/a/g/j:w	[B
    //   93: iconst_0
    //   94: aload_0
    //   95: getfield 122	com/sun/jna/z/a/g/j:w	[B
    //   98: arraylength
    //   99: invokespecial 256	com/sun/jna/z/a/g/j:a	([BII)I
    //   102: pop
    //   103: return
    // Line number table:
    //   Java source line #39	-> byte code offset #3
    //   Java source line #286	-> byte code offset #11
    //   Java source line #178	-> byte code offset #64
    //   Java source line #378	-> byte code offset #79
    //   Java source line #92	-> byte code offset #88
    //   Java source line #162	-> byte code offset #103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	a	j
    //   10	93	1	a	int
    //   11	93	2	a	int
    // Exception table:
    //   from	to	target	type
    //   11	20	23	java/io/IOException
    //   17	28	31	java/io/IOException
    //   32	39	42	java/io/IOException
    //   36	48	51	java/io/IOException
    //   52	60	63	java/io/IOException
    //   57	78	78	java/io/IOException
  }
  
  /* Error */
  private void h()
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 120	com/sun/jna/z/a/g/j:u	I
    //   8: iload_1
    //   9: ifne +62 -> 71
    //   12: tableswitch	default:+171->183, 0:+33->45, 1:+171->183, 2:+64->76, 3:+98->110
    //   44: athrow
    //   45: aload_0
    //   46: iconst_2
    //   47: invokespecial 253	com/sun/jna/z/a/g/j:b	(I)V
    //   50: aload_0
    //   51: iconst_2
    //   52: newarray <illegal type>
    //   54: putfield 135	com/sun/jna/z/a/g/j:y	[B
    //   57: aload_0
    //   58: aload_0
    //   59: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   62: iconst_0
    //   63: iconst_2
    //   64: invokespecial 256	com/sun/jna/z/a/g/j:a	([BII)I
    //   67: goto +4 -> 71
    //   70: athrow
    //   71: pop
    //   72: iload_1
    //   73: ifeq +110 -> 183
    //   76: aload_0
    //   77: bipush 6
    //   79: invokespecial 253	com/sun/jna/z/a/g/j:b	(I)V
    //   82: aload_0
    //   83: bipush 6
    //   85: newarray <illegal type>
    //   87: putfield 135	com/sun/jna/z/a/g/j:y	[B
    //   90: aload_0
    //   91: aload_0
    //   92: getfield 135	com/sun/jna/z/a/g/j:y	[B
    //   95: iconst_0
    //   96: bipush 6
    //   98: invokespecial 256	com/sun/jna/z/a/g/j:a	([BII)I
    //   101: pop
    //   102: iload_1
    //   103: ifeq +80 -> 183
    //   106: goto +4 -> 110
    //   109: athrow
    //   110: aload_0
    //   111: getfield 122	com/sun/jna/z/a/g/j:w	[B
    //   114: iload_1
    //   115: ifne +46 -> 161
    //   118: goto +4 -> 122
    //   121: athrow
    //   122: ifnonnull +22 -> 144
    //   125: goto +4 -> 129
    //   128: athrow
    //   129: new 58	java/io/IOException
    //   132: dup
    //   133: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   136: bipush 20
    //   138: aaload
    //   139: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   142: athrow
    //   143: athrow
    //   144: aload_0
    //   145: aload_0
    //   146: getfield 122	com/sun/jna/z/a/g/j:w	[B
    //   149: arraylength
    //   150: iconst_3
    //   151: idiv
    //   152: newarray <illegal type>
    //   154: putfield 133	com/sun/jna/z/a/g/j:x	[B
    //   157: aload_0
    //   158: getfield 133	com/sun/jna/z/a/g/j:x	[B
    //   161: iconst_m1
    //   162: invokestatic 267	java/util/Arrays:fill	([BB)V
    //   165: aload_0
    //   166: aload_0
    //   167: getfield 133	com/sun/jna/z/a/g/j:x	[B
    //   170: iconst_0
    //   171: aload_0
    //   172: getfield 133	com/sun/jna/z/a/g/j:x	[B
    //   175: arraylength
    //   176: invokespecial 256	com/sun/jna/z/a/g/j:a	([BII)I
    //   179: pop
    //   180: goto +3 -> 183
    //   183: return
    // Line number table:
    //   Java source line #339	-> byte code offset #4
    //   Java source line #402	-> byte code offset #45
    //   Java source line #284	-> byte code offset #50
    //   Java source line #231	-> byte code offset #57
    //   Java source line #322	-> byte code offset #72
    //   Java source line #361	-> byte code offset #76
    //   Java source line #272	-> byte code offset #82
    //   Java source line #266	-> byte code offset #90
    //   Java source line #172	-> byte code offset #102
    //   Java source line #216	-> byte code offset #110
    //   Java source line #48	-> byte code offset #129
    //   Java source line #276	-> byte code offset #144
    //   Java source line #392	-> byte code offset #157
    //   Java source line #139	-> byte code offset #165
    //   Java source line #121	-> byte code offset #180
    //   Java source line #201	-> byte code offset #183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	a	j
    //   3	180	1	a	int
    // Exception table:
    //   from	to	target	type
    //   4	44	44	java/io/IOException
    //   12	67	70	java/io/IOException
    //   71	106	109	java/io/IOException
    //   76	118	121	java/io/IOException
    //   110	125	128	java/io/IOException
    //   122	143	143	java/io/IOException
  }
  
  /* Error */
  private void i()
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 269	com/sun/jna/z/a/g/j:q	I
    //   8: iload_1
    //   9: ifne +52 -> 61
    //   12: ifle +26 -> 38
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: aload_0
    //   21: getfield 269	com/sun/jna/z/a/g/j:q	I
    //   24: iconst_4
    //   25: iadd
    //   26: i2l
    //   27: invokespecial 272	com/sun/jna/z/a/g/j:a	(J)V
    //   30: iload_1
    //   31: ifeq +68 -> 99
    //   34: goto +4 -> 38
    //   37: athrow
    //   38: aload_0
    //   39: aload_0
    //   40: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   43: iconst_0
    //   44: iconst_4
    //   45: invokespecial 95	com/sun/jna/z/a/g/j:b	([BII)V
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   53: iconst_0
    //   54: invokespecial 259	com/sun/jna/z/a/g/j:a	([BI)I
    //   57: goto +4 -> 61
    //   60: athrow
    //   61: istore_2
    //   62: aload_0
    //   63: getfield 90	com/sun/jna/z/a/g/j:m	Ljava/util/zip/CRC32;
    //   66: invokevirtual 276	java/util/zip/CRC32:getValue	()J
    //   69: l2i
    //   70: istore_3
    //   71: iload_1
    //   72: ifne +42 -> 114
    //   75: iload_3
    //   76: iload_2
    //   77: if_icmpeq +22 -> 99
    //   80: goto +4 -> 84
    //   83: athrow
    //   84: new 58	java/io/IOException
    //   87: dup
    //   88: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   91: bipush 19
    //   93: aaload
    //   94: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   97: athrow
    //   98: athrow
    //   99: aload_0
    //   100: iconst_0
    //   101: putfield 269	com/sun/jna/z/a/g/j:q	I
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield 261	com/sun/jna/z/a/g/j:o	I
    //   109: aload_0
    //   110: iconst_0
    //   111: putfield 114	com/sun/jna/z/a/g/j:p	I
    //   114: return
    // Line number table:
    //   Java source line #117	-> byte code offset #4
    //   Java source line #312	-> byte code offset #19
    //   Java source line #67	-> byte code offset #38
    //   Java source line #347	-> byte code offset #48
    //   Java source line #105	-> byte code offset #62
    //   Java source line #234	-> byte code offset #71
    //   Java source line #138	-> byte code offset #84
    //   Java source line #3	-> byte code offset #99
    //   Java source line #179	-> byte code offset #104
    //   Java source line #255	-> byte code offset #109
    //   Java source line #153	-> byte code offset #114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	a	j
    //   3	111	1	a	int
    //   62	37	2	a	int
    //   71	28	3	a	int
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/io/IOException
    //   12	34	37	java/io/IOException
    //   19	57	60	java/io/IOException
    //   71	80	83	java/io/IOException
    //   75	98	98	java/io/IOException
  }
  
  /* Error */
  private void a(Inflater a, byte[] a, int a, int a)
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore 5
    //   5: getstatic 297	com/sun/jna/z/a/g/j:z	Z
    //   8: iload 5
    //   10: ifne +39 -> 49
    //   13: ifne +28 -> 41
    //   16: goto +4 -> 20
    //   19: athrow
    //   20: aload_2
    //   21: aload_0
    //   22: getfield 92	com/sun/jna/z/a/g/j:n	[B
    //   25: if_acmpne +16 -> 41
    //   28: goto +4 -> 32
    //   31: athrow
    //   32: new 299	java/lang/AssertionError
    //   35: dup
    //   36: invokespecial 300	java/lang/AssertionError:<init>	()V
    //   39: athrow
    //   40: athrow
    //   41: aload_1
    //   42: aload_2
    //   43: iload_3
    //   44: iload 4
    //   46: invokevirtual 303	java/util/zip/Inflater:inflate	([BII)I
    //   49: istore 6
    //   51: iload 6
    //   53: ifgt +98 -> 151
    //   56: aload_1
    //   57: invokevirtual 306	java/util/zip/Inflater:finished	()Z
    //   60: iload 5
    //   62: ifne +27 -> 89
    //   65: goto +4 -> 69
    //   68: athrow
    //   69: ifeq +16 -> 85
    //   72: goto +4 -> 76
    //   75: athrow
    //   76: new 308	java/io/EOFException
    //   79: dup
    //   80: invokespecial 309	java/io/EOFException:<init>	()V
    //   83: athrow
    //   84: athrow
    //   85: aload_1
    //   86: invokevirtual 312	java/util/zip/Inflater:needsInput	()Z
    //   89: ifeq +17 -> 106
    //   92: aload_0
    //   93: aload_1
    //   94: invokespecial 314	com/sun/jna/z/a/g/j:a	(Ljava/util/zip/Inflater;)V
    //   97: iload 5
    //   99: ifeq +64 -> 163
    //   102: goto +4 -> 106
    //   105: athrow
    //   106: new 58	java/io/IOException
    //   109: dup
    //   110: new 239	java/lang/StringBuilder
    //   113: dup
    //   114: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   117: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   120: astore 7
    //   122: aload 7
    //   124: bipush 13
    //   126: aaload
    //   127: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: iload 4
    //   132: invokevirtual 247	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   135: aload 7
    //   137: bipush 18
    //   139: aaload
    //   140: invokevirtual 244	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   149: athrow
    //   150: athrow
    //   151: iload_3
    //   152: iload 6
    //   154: iadd
    //   155: istore_3
    //   156: iload 4
    //   158: iload 6
    //   160: isub
    //   161: istore 4
    //   163: iload 4
    //   165: ifgt -124 -> 41
    //   168: iload 5
    //   170: ifne -85 -> 85
    //   173: goto +30 -> 203
    //   176: astore 6
    //   178: new 58	java/io/IOException
    //   181: dup
    //   182: getstatic 350	com/sun/jna/z/a/g/j:A	[Ljava/lang/String;
    //   185: bipush 15
    //   187: aaload
    //   188: invokespecial 101	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   191: aload 6
    //   193: invokevirtual 318	java/io/IOException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   196: checkcast 58	java/io/IOException
    //   199: checkcast 58	java/io/IOException
    //   202: athrow
    //   203: return
    // Line number table:
    //   Java source line #334	-> byte code offset #5
    //   Java source line #264	-> byte code offset #41
    //   Java source line #158	-> byte code offset #51
    //   Java source line #243	-> byte code offset #56
    //   Java source line #303	-> byte code offset #76
    //   Java source line #160	-> byte code offset #85
    //   Java source line #406	-> byte code offset #92
    //   Java source line #131	-> byte code offset #106
    //   Java source line #218	-> byte code offset #151
    //   Java source line #125	-> byte code offset #156
    //   Java source line #237	-> byte code offset #163
    //   Java source line #132	-> byte code offset #168
    //   Java source line #379	-> byte code offset #176
    //   Java source line #42	-> byte code offset #178
    //   Java source line #102	-> byte code offset #203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	a	j
    //   0	204	1	a	Inflater
    //   0	204	2	a	byte[]
    //   0	204	3	a	int
    //   0	204	4	a	int
    //   3	200	5	a	int
    //   51	112	6	a	int
    //   178	25	6	a	java.util.zip.DataFormatException
    //   120	29	7	a	String[]
    // Exception table:
    //   from	to	target	type
    //   5	16	19	java/util/zip/DataFormatException
    //   13	28	31	java/util/zip/DataFormatException
    //   20	40	40	java/util/zip/DataFormatException
    //   51	65	68	java/util/zip/DataFormatException
    //   56	72	75	java/util/zip/DataFormatException
    //   69	84	84	java/util/zip/DataFormatException
    //   89	102	105	java/util/zip/DataFormatException
    //   92	150	150	java/util/zip/DataFormatException
    //   41	168	176	java/util/zip/DataFormatException
  }
  
  /* Error */
  private void a(long a)
    throws IOException
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: istore_3
    //   4: lload_1
    //   5: lconst_0
    //   6: lcmp
    //   7: ifle +46 -> 53
    //   10: aload_0
    //   11: getfield 85	com/sun/jna/z/a/g/j:l	Ljava/io/InputStream;
    //   14: lload_1
    //   15: invokevirtual 324	java/io/InputStream:skip	(J)J
    //   18: lstore 4
    //   20: lload 4
    //   22: lconst_0
    //   23: iload_3
    //   24: ifne +23 -> 47
    //   27: lcmp
    //   28: ifge +16 -> 44
    //   31: goto +4 -> 35
    //   34: athrow
    //   35: new 308	java/io/EOFException
    //   38: dup
    //   39: invokespecial 309	java/io/EOFException:<init>	()V
    //   42: athrow
    //   43: athrow
    //   44: lload_1
    //   45: lload 4
    //   47: lsub
    //   48: lstore_1
    //   49: iload_3
    //   50: ifeq -46 -> 4
    //   53: return
    // Line number table:
    //   Java source line #124	-> byte code offset #4
    //   Java source line #108	-> byte code offset #10
    //   Java source line #9	-> byte code offset #20
    //   Java source line #400	-> byte code offset #35
    //   Java source line #220	-> byte code offset #44
    //   Java source line #85	-> byte code offset #49
    //   Java source line #282	-> byte code offset #53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	a	j
    //   0	54	1	a	long
    //   3	47	3	a	int
    //   18	28	4	a	long
    //   34	1	4	localIOException1	IOException
    //   43	1	5	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   20	31	34	java/io/IOException
    //   27	43	43	java/io/IOException
  }
  
  /* Error */
  private boolean b(byte[] a)
  {
    // Byte code:
    //   0: getstatic 342	com/sun/jna/z/a/g/g:b	I
    //   3: iconst_0
    //   4: istore_3
    //   5: istore_2
    //   6: iload_3
    //   7: aload_0
    //   8: getfield 63	com/sun/jna/z/a/g/j:a	[B
    //   11: arraylength
    //   12: if_icmpge +44 -> 56
    //   15: aload_1
    //   16: iload_3
    //   17: baload
    //   18: iload_2
    //   19: ifne +38 -> 57
    //   22: iload_2
    //   23: ifne +25 -> 48
    //   26: goto +4 -> 30
    //   29: athrow
    //   30: aload_0
    //   31: getfield 63	com/sun/jna/z/a/g/j:a	[B
    //   34: iload_3
    //   35: baload
    //   36: if_icmpeq +13 -> 49
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: iconst_0
    //   44: goto +4 -> 48
    //   47: athrow
    //   48: ireturn
    //   49: iinc 3 1
    //   52: iload_2
    //   53: ifeq -47 -> 6
    //   56: iconst_1
    //   57: ireturn
    // Line number table:
    //   Java source line #241	-> byte code offset #3
    //   Java source line #167	-> byte code offset #15
    //   Java source line #274	-> byte code offset #43
    //   Java source line #14	-> byte code offset #49
    //   Java source line #211	-> byte code offset #56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	a	j
    //   0	58	1	a	byte[]
    //   5	52	2	a	int
    //   6	50	3	a	int
    // Exception table:
    //   from	to	target	type
    //   15	26	29	java/lang/UnsupportedOperationException
    //   22	39	42	java/lang/UnsupportedOperationException
    //   30	44	47	java/lang/UnsupportedOperationException
  }
}
