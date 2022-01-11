package com.sun.jna.z;

import com.sun.jna.z.a.i;
import com.sun.jna.z.a.j;
import java.lang.reflect.Field;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.SecureClassLoader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import sun.font.GlyphLayout;

public class Main
{
  public URLClassLoader a;
  public b b;
  public static Main c;
  boolean d;
  
  private Main()
  {
    c = a;
    
    a.a = ((URLClassLoader)Main.class.getClassLoader());
    try
    {
      a.b = new b(a);a.f = new i();a.e.set(true);
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
  
  public static void entry()
  {
    new Main();
  }
  
  void l()
    throws Exception
  {
    Field a = Enum.class.getDeclaredField(h[14]);a.setAccessible(true);
    
    int a = g;com.sun.jna.z.a.e.b[] a = com.sun.jna.z.a.e.b.values();int a = a.length;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.e.b a = a[a];a.set(a, null);a++;
    } while (a == 0);
  }
  
  void i()
    throws Exception
  {
    String[] a = h;Field a = ClassLoader.class.getDeclaredField(a[3]);a.setAccessible(true);Vector localVector = new Vector();int a = g;
    Vector<Class<?>> a;
    a.set(a.a, a);
    Field a = SecureClassLoader.class.getDeclaredField(a[5]);
    
    a.setAccessible(true);HashMap<CodeSource, ProtectionDomain> a = (HashMap)a.get(a.a);Iterator localIterator = a.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label163;
      }
      ProtectionDomain a = (ProtectionDomain)localIterator.next();a = h;Field a = ProtectionDomain.class.getDeclaredField(a[1]);
      try
      {
        a.setAccessible(true);
        if (a != 0) {
          break label174;
        }
        a.set(a, null);
        if (a == 0) {}
      }
      catch (Exception localException1)
      {
        throw localException1;
      }
    }
    try
    {
      if (j.g) {
        tmpTernaryOp = false;
      }
    }
    catch (Exception localException2)
    {
      throw localException2;
    }
    j.g = true;
    label163:
    label174:
    Field a = ClassLoader.class.getDeclaredField(h[8]);
    a.setAccessible(true);
    
    a.set(a.a, null);
    
    a.a(Main.class);a.a(com.sun.jna.z.a.d.b.class);
  }
  
  void o()
    throws Exception
  {
    Field a = GlyphLayout.class.getDeclaredField(h[4]);
    
    a.setAccessible(true);
    
    a.set(null, null);
  }
  
  public AtomicBoolean e = new AtomicBoolean(false);
  i f;
  public static boolean g;
  private static final String[] h;
  
  void a(Class a)
    throws Exception
  {
    Package a = a.getPackage();Field a = Package.class.getDeclaredField(h[13]);a.setAccessible(true);a.set(a, null);
  }
  
  void n()
    throws Exception
  {
    Field a = ClassLoader.class.getDeclaredField(h[10]);
    
    a.setAccessible(true);Set<ProtectionDomain> a = (Set)a.get(a.a);
    
    a.clear();
  }
  
  /* Error */
  void h()
    throws Exception
  {
    // Byte code:
    //   0: ldc 2
    //   2: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   5: astore 7
    //   7: aload 7
    //   9: bipush 12
    //   11: aaload
    //   12: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   15: astore_2
    //   16: getstatic 260	com/sun/jna/z/Main:g	Z
    //   19: aload_2
    //   20: iconst_1
    //   21: invokevirtual 86	java/lang/reflect/Field:setAccessible	(Z)V
    //   24: istore_1
    //   25: new 88	java/util/HashSet
    //   28: dup
    //   29: sipush 1000
    //   32: invokespecial 91	java/util/HashSet:<init>	(I)V
    //   35: astore_3
    //   36: aload_2
    //   37: getstatic 97	net/minecraft/launchwrapper/Launch:classLoader	Lnet/minecraft/launchwrapper/LaunchClassLoader;
    //   40: invokevirtual 101	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   43: checkcast 103	java/util/Set
    //   46: astore 4
    //   48: aload 4
    //   50: invokeinterface 107 1 0
    //   55: astore 5
    //   57: aload 5
    //   59: invokeinterface 113 1 0
    //   64: ifeq +120 -> 184
    //   67: aload 5
    //   69: invokeinterface 117 1 0
    //   74: checkcast 119	java/lang/String
    //   77: astore 6
    //   79: iload_1
    //   80: ifne +117 -> 197
    //   83: aload 6
    //   85: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   88: astore 7
    //   90: aload 7
    //   92: iconst_2
    //   93: aaload
    //   94: invokevirtual 123	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   97: iload_1
    //   98: ifne +33 -> 131
    //   101: goto +4 -> 105
    //   104: athrow
    //   105: ifne +75 -> 180
    //   108: goto +4 -> 112
    //   111: athrow
    //   112: aload 6
    //   114: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   117: astore 7
    //   119: aload 7
    //   121: bipush 7
    //   123: aaload
    //   124: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   127: goto +4 -> 131
    //   130: athrow
    //   131: iload_1
    //   132: ifne +24 -> 156
    //   135: ifne +45 -> 180
    //   138: goto +4 -> 142
    //   141: athrow
    //   142: aload 6
    //   144: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   147: iconst_0
    //   148: aaload
    //   149: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   152: goto +4 -> 156
    //   155: athrow
    //   156: iload_1
    //   157: ifne +22 -> 179
    //   160: ifne +20 -> 180
    //   163: goto +4 -> 167
    //   166: athrow
    //   167: aload_3
    //   168: aload 6
    //   170: invokeinterface 131 2 0
    //   175: goto +4 -> 179
    //   178: athrow
    //   179: pop
    //   180: iload_1
    //   181: ifeq -124 -> 57
    //   184: aload_2
    //   185: getstatic 97	net/minecraft/launchwrapper/Launch:classLoader	Lnet/minecraft/launchwrapper/LaunchClassLoader;
    //   188: aload_3
    //   189: invokevirtual 134	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   192: aload_2
    //   193: iconst_0
    //   194: invokevirtual 86	java/lang/reflect/Field:setAccessible	(Z)V
    //   197: return
    // Line number table:
    //   Java source line #95	-> byte code offset #0
    //   Java source line #8	-> byte code offset #19
    //   Java source line #66	-> byte code offset #25
    //   Java source line #57	-> byte code offset #36
    //   Java source line #20	-> byte code offset #48
    //   Java source line #40	-> byte code offset #79
    //   Java source line #34	-> byte code offset #167
    //   Java source line #11	-> byte code offset #180
    //   Java source line #102	-> byte code offset #184
    //   Java source line #70	-> byte code offset #192
    //   Java source line #51	-> byte code offset #197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	a	Main
    //   24	173	1	a	int
    //   19	179	2	a	Field
    //   36	162	3	a	Set<String>
    //   48	150	4	a	Set<String>
    //   79	101	6	a	String
    //   5	192	7	a	String[]
    // Exception table:
    //   from	to	target	type
    //   79	101	104	java/lang/Exception
    //   83	108	111	java/lang/Exception
    //   105	127	130	java/lang/Exception
    //   131	138	141	java/lang/Exception
    //   135	152	155	java/lang/Exception
    //   156	163	166	java/lang/Exception
    //   160	175	178	java/lang/Exception
  }
  
  /* Error */
  void j()
    throws Exception
  {
    // Byte code:
    //   0: ldc 2
    //   2: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   5: astore 6
    //   7: aload 6
    //   9: bipush 6
    //   11: aaload
    //   12: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   15: astore_2
    //   16: getstatic 260	com/sun/jna/z/Main:g	Z
    //   19: aload_2
    //   20: iconst_1
    //   21: invokevirtual 86	java/lang/reflect/Field:setAccessible	(Z)V
    //   24: aload_2
    //   25: getstatic 97	net/minecraft/launchwrapper/Launch:classLoader	Lnet/minecraft/launchwrapper/LaunchClassLoader;
    //   28: invokevirtual 101	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 103	java/util/Set
    //   34: astore_3
    //   35: istore_1
    //   36: aload_3
    //   37: invokeinterface 107 1 0
    //   42: astore 4
    //   44: aload 4
    //   46: invokeinterface 113 1 0
    //   51: ifeq +112 -> 163
    //   54: aload 4
    //   56: invokeinterface 117 1 0
    //   61: checkcast 119	java/lang/String
    //   64: astore 5
    //   66: aload 5
    //   68: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   71: astore 6
    //   73: aload 6
    //   75: iconst_2
    //   76: aaload
    //   77: invokevirtual 123	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   80: iload_1
    //   81: ifne +77 -> 158
    //   84: ifne +62 -> 146
    //   87: goto +4 -> 91
    //   90: athrow
    //   91: aload 5
    //   93: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   96: astore 6
    //   98: aload 6
    //   100: bipush 7
    //   102: aaload
    //   103: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   106: iload_1
    //   107: ifne +51 -> 158
    //   110: goto +4 -> 114
    //   113: athrow
    //   114: ifne +32 -> 146
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: aload 5
    //   123: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   126: iconst_0
    //   127: aaload
    //   128: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   131: iload_1
    //   132: ifne +26 -> 158
    //   135: goto +4 -> 139
    //   138: athrow
    //   139: ifeq +20 -> 159
    //   142: goto +4 -> 146
    //   145: athrow
    //   146: aload_3
    //   147: aload 5
    //   149: invokeinterface 174 2 0
    //   154: goto +4 -> 158
    //   157: athrow
    //   158: pop
    //   159: iload_1
    //   160: ifeq -116 -> 44
    //   163: return
    // Line number table:
    //   Java source line #17	-> byte code offset #0
    //   Java source line #50	-> byte code offset #19
    //   Java source line #19	-> byte code offset #24
    //   Java source line #83	-> byte code offset #36
    //   Java source line #30	-> byte code offset #66
    //   Java source line #54	-> byte code offset #146
    //   Java source line #42	-> byte code offset #159
    //   Java source line #67	-> byte code offset #163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	a	Main
    //   35	128	1	a	int
    //   19	145	2	a	Field
    //   36	128	3	a	Set<String>
    //   66	93	5	a	String
    //   5	158	6	a	String[]
    // Exception table:
    //   from	to	target	type
    //   66	87	90	java/lang/Exception
    //   84	110	113	java/lang/Exception
    //   91	117	120	java/lang/Exception
    //   114	135	138	java/lang/Exception
    //   121	142	145	java/lang/Exception
    //   139	154	157	java/lang/Exception
  }
  
  /* Error */
  void k()
    throws Exception
  {
    // Byte code:
    //   0: ldc 8
    //   2: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   5: astore 10
    //   7: aload 10
    //   9: bipush 11
    //   11: aaload
    //   12: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   15: astore_2
    //   16: aload_2
    //   17: iconst_1
    //   18: invokevirtual 86	java/lang/reflect/Field:setAccessible	(Z)V
    //   21: getstatic 260	com/sun/jna/z/Main:g	Z
    //   24: aload_2
    //   25: aconst_null
    //   26: invokevirtual 101	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 178	com/google/common/collect/ImmutableList
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 181	com/google/common/collect/ImmutableList:iterator	()Lcom/google/common/collect/UnmodifiableIterator;
    //   37: astore 4
    //   39: istore_1
    //   40: aload 4
    //   42: invokeinterface 113 1 0
    //   47: ifeq +187 -> 234
    //   50: aload 4
    //   52: invokeinterface 117 1 0
    //   57: checkcast 8	net/minecraftforge/fml/common/eventhandler/ListenerList
    //   60: astore 5
    //   62: aload 5
    //   64: iconst_0
    //   65: invokevirtual 185	net/minecraftforge/fml/common/eventhandler/ListenerList:getListeners	(I)[Lnet/minecraftforge/fml/common/eventhandler/IEventListener;
    //   68: astore 6
    //   70: aload 6
    //   72: arraylength
    //   73: istore 7
    //   75: iconst_0
    //   76: istore 8
    //   78: iload 8
    //   80: iload 7
    //   82: if_icmpge +68 -> 150
    //   85: aload 6
    //   87: iload 8
    //   89: aaload
    //   90: astore 9
    //   92: iload_1
    //   93: ifne +53 -> 146
    //   96: aload 9
    //   98: invokevirtual 191	java/lang/Object:toString	()Ljava/lang/String;
    //   101: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   104: astore 10
    //   106: aload 10
    //   108: iconst_2
    //   109: aaload
    //   110: invokevirtual 123	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   113: iload_1
    //   114: ifne +50 -> 164
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: ifeq +22 -> 143
    //   124: goto +4 -> 128
    //   127: athrow
    //   128: getstatic 197	java/lang/System:out	Ljava/io/PrintStream;
    //   131: aload 9
    //   133: invokevirtual 191	java/lang/Object:toString	()Ljava/lang/String;
    //   136: invokevirtual 203	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   139: goto +4 -> 143
    //   142: athrow
    //   143: iinc 8 1
    //   146: iload_1
    //   147: ifeq -69 -> 78
    //   150: aload 5
    //   152: iconst_1
    //   153: invokevirtual 185	net/minecraftforge/fml/common/eventhandler/ListenerList:getListeners	(I)[Lnet/minecraftforge/fml/common/eventhandler/IEventListener;
    //   156: astore 6
    //   158: aload 6
    //   160: arraylength
    //   161: istore 7
    //   163: iconst_0
    //   164: istore 8
    //   166: iload 8
    //   168: iload 7
    //   170: if_icmpge +60 -> 230
    //   173: aload 6
    //   175: iload 8
    //   177: aaload
    //   178: astore 9
    //   180: iload_1
    //   181: ifne +45 -> 226
    //   184: aload 9
    //   186: invokevirtual 191	java/lang/Object:toString	()Ljava/lang/String;
    //   189: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   192: iconst_2
    //   193: aaload
    //   194: invokevirtual 123	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   197: iload_1
    //   198: ifne -151 -> 47
    //   201: goto +4 -> 205
    //   204: athrow
    //   205: ifeq +18 -> 223
    //   208: getstatic 197	java/lang/System:out	Ljava/io/PrintStream;
    //   211: aload 9
    //   213: invokevirtual 191	java/lang/Object:toString	()Ljava/lang/String;
    //   216: invokevirtual 203	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   219: goto +4 -> 223
    //   222: athrow
    //   223: iinc 8 1
    //   226: iload_1
    //   227: ifeq -61 -> 166
    //   230: iload_1
    //   231: ifeq -191 -> 40
    //   234: return
    // Line number table:
    //   Java source line #29	-> byte code offset #0
    //   Java source line #86	-> byte code offset #16
    //   Java source line #16	-> byte code offset #24
    //   Java source line #65	-> byte code offset #33
    //   Java source line #14	-> byte code offset #62
    //   Java source line #23	-> byte code offset #92
    //   Java source line #69	-> byte code offset #128
    //   Java source line #46	-> byte code offset #143
    //   Java source line #75	-> byte code offset #150
    //   Java source line #84	-> byte code offset #180
    //   Java source line #13	-> byte code offset #208
    //   Java source line #97	-> byte code offset #223
    //   Java source line #101	-> byte code offset #230
    //   Java source line #36	-> byte code offset #234
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	a	Main
    //   39	195	1	a	int
    //   16	219	2	a	Field
    //   33	202	3	a	com.google.common.collect.ImmutableList<net.minecraftforge.fml.common.eventhandler.ListenerList>
    //   62	168	5	a	net.minecraftforge.fml.common.eventhandler.ListenerList
    //   68	163	6	a	net.minecraftforge.fml.common.eventhandler.IEventListener[]
    //   73	158	7	a	int
    //   76	155	8	a	int
    //   92	51	9	a	net.minecraftforge.fml.common.eventhandler.IEventListener
    //   180	43	9	a	net.minecraftforge.fml.common.eventhandler.IEventListener
    //   5	229	10	a	String[]
    // Exception table:
    //   from	to	target	type
    //   92	117	120	java/lang/Exception
    //   96	124	127	java/lang/Exception
    //   121	139	142	java/lang/Exception
    //   180	201	204	java/lang/Exception
    //   205	219	222	java/lang/Exception
  }
  
  /* Error */
  void m()
    throws Exception
  {
    // Byte code:
    //   0: ldc 2
    //   2: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   5: astore 9
    //   7: aload 9
    //   9: bipush 15
    //   11: aaload
    //   12: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   15: astore_2
    //   16: getstatic 260	com/sun/jna/z/Main:g	Z
    //   19: aload_2
    //   20: iconst_1
    //   21: invokevirtual 86	java/lang/reflect/Field:setAccessible	(Z)V
    //   24: aload_2
    //   25: getstatic 97	net/minecraft/launchwrapper/Launch:classLoader	Lnet/minecraft/launchwrapper/LaunchClassLoader;
    //   28: invokevirtual 101	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 220	java/util/Map
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface 224 1 0
    //   41: invokeinterface 107 1 0
    //   46: astore 4
    //   48: istore_1
    //   49: aload 4
    //   51: invokeinterface 113 1 0
    //   56: ifeq +125 -> 181
    //   59: aload 4
    //   61: invokeinterface 117 1 0
    //   66: checkcast 7	java/lang/Package
    //   69: astore 5
    //   71: aload 5
    //   73: invokevirtual 227	java/lang/Package:getName	()Ljava/lang/String;
    //   76: iload_1
    //   77: ifne +99 -> 176
    //   80: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   83: astore 9
    //   85: aload 9
    //   87: iconst_2
    //   88: aaload
    //   89: invokevirtual 123	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   92: ifne +72 -> 164
    //   95: goto +4 -> 99
    //   98: athrow
    //   99: aload 5
    //   101: invokevirtual 227	java/lang/Package:getName	()Ljava/lang/String;
    //   104: iload_1
    //   105: ifne +71 -> 176
    //   108: goto +4 -> 112
    //   111: athrow
    //   112: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   115: astore 9
    //   117: aload 9
    //   119: bipush 7
    //   121: aaload
    //   122: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   125: ifne +39 -> 164
    //   128: goto +4 -> 132
    //   131: athrow
    //   132: aload 5
    //   134: invokevirtual 227	java/lang/Package:getName	()Ljava/lang/String;
    //   137: iload_1
    //   138: ifne +38 -> 176
    //   141: goto +4 -> 145
    //   144: athrow
    //   145: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   148: astore 9
    //   150: aload 9
    //   152: iconst_0
    //   153: aaload
    //   154: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   157: ifeq +20 -> 177
    //   160: goto +4 -> 164
    //   163: athrow
    //   164: aload_3
    //   165: aload 5
    //   167: invokeinterface 229 2 0
    //   172: goto +4 -> 176
    //   175: athrow
    //   176: pop
    //   177: iload_1
    //   178: ifeq -129 -> 49
    //   181: ldc 3
    //   183: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   186: astore 9
    //   188: aload 9
    //   190: bipush 9
    //   192: aaload
    //   193: invokevirtual 81	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   196: astore 4
    //   198: aload 4
    //   200: iconst_1
    //   201: invokevirtual 86	java/lang/reflect/Field:setAccessible	(Z)V
    //   204: aload 4
    //   206: getstatic 97	net/minecraft/launchwrapper/Launch:classLoader	Lnet/minecraft/launchwrapper/LaunchClassLoader;
    //   209: invokevirtual 101	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   212: checkcast 146	java/util/HashMap
    //   215: astore 5
    //   217: new 146	java/util/HashMap
    //   220: dup
    //   221: invokespecial 230	java/util/HashMap:<init>	()V
    //   224: astore 6
    //   226: aload 5
    //   228: invokevirtual 231	java/util/HashMap:keySet	()Ljava/util/Set;
    //   231: invokeinterface 107 1 0
    //   236: astore 7
    //   238: aload 7
    //   240: invokeinterface 113 1 0
    //   245: ifeq +126 -> 371
    //   248: aload 7
    //   250: invokeinterface 117 1 0
    //   255: checkcast 119	java/lang/String
    //   258: astore 8
    //   260: iload_1
    //   261: ifne +120 -> 381
    //   264: aload 8
    //   266: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   269: astore 9
    //   271: aload 9
    //   273: iconst_2
    //   274: aaload
    //   275: invokevirtual 123	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   278: iload_1
    //   279: ifne +33 -> 312
    //   282: goto +4 -> 286
    //   285: athrow
    //   286: ifne +81 -> 367
    //   289: goto +4 -> 293
    //   292: athrow
    //   293: aload 8
    //   295: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   298: astore 9
    //   300: aload 9
    //   302: bipush 7
    //   304: aaload
    //   305: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   308: goto +4 -> 312
    //   311: athrow
    //   312: iload_1
    //   313: ifne +32 -> 345
    //   316: ifne +51 -> 367
    //   319: goto +4 -> 323
    //   322: athrow
    //   323: aload 8
    //   325: iload_1
    //   326: ifne +40 -> 366
    //   329: goto +4 -> 333
    //   332: athrow
    //   333: getstatic 267	com/sun/jna/z/Main:h	[Ljava/lang/String;
    //   336: iconst_0
    //   337: aaload
    //   338: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   341: goto +4 -> 345
    //   344: athrow
    //   345: ifne +22 -> 367
    //   348: aload 6
    //   350: aload 8
    //   352: aload 5
    //   354: aload 8
    //   356: invokevirtual 232	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   359: invokevirtual 236	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   362: goto +4 -> 366
    //   365: athrow
    //   366: pop
    //   367: iload_1
    //   368: ifeq -130 -> 238
    //   371: aload 4
    //   373: getstatic 97	net/minecraft/launchwrapper/Launch:classLoader	Lnet/minecraft/launchwrapper/LaunchClassLoader;
    //   376: aload 6
    //   378: invokevirtual 134	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   381: getstatic 263	com/sun/jna/z/a/j:g	Z
    //   384: ifeq +20 -> 404
    //   387: iload_1
    //   388: ifeq +12 -> 400
    //   391: goto +4 -> 395
    //   394: athrow
    //   395: iconst_0
    //   396: goto +5 -> 401
    //   399: athrow
    //   400: iconst_1
    //   401: putstatic 260	com/sun/jna/z/Main:g	Z
    //   404: return
    // Line number table:
    //   Java source line #26	-> byte code offset #0
    //   Java source line #71	-> byte code offset #16
    //   Java source line #12	-> byte code offset #24
    //   Java source line #90	-> byte code offset #35
    //   Java source line #58	-> byte code offset #71
    //   Java source line #53	-> byte code offset #164
    //   Java source line #96	-> byte code offset #177
    //   Java source line #92	-> byte code offset #181
    //   Java source line #2	-> byte code offset #198
    //   Java source line #68	-> byte code offset #204
    //   Java source line #81	-> byte code offset #217
    //   Java source line #22	-> byte code offset #226
    //   Java source line #27	-> byte code offset #260
    //   Java source line #55	-> byte code offset #348
    //   Java source line #18	-> byte code offset #367
    //   Java source line #79	-> byte code offset #371
    //   Java source line #77	-> byte code offset #381
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	405	0	a	Main
    //   48	356	1	a	int
    //   16	389	2	a	Field
    //   35	370	3	a	java.util.Map<Package, java.util.jar.Manifest>
    //   198	207	4	a	Field
    //   71	106	5	a	Package
    //   217	188	5	a	HashMap<String, Package>
    //   226	179	6	a	HashMap<String, Package>
    //   260	107	8	a	String
    //   5	399	9	a	String[]
    // Exception table:
    //   from	to	target	type
    //   71	95	98	java/lang/Exception
    //   80	108	111	java/lang/Exception
    //   99	128	131	java/lang/Exception
    //   112	141	144	java/lang/Exception
    //   132	160	163	java/lang/Exception
    //   145	172	175	java/lang/Exception
    //   260	282	285	java/lang/Exception
    //   264	289	292	java/lang/Exception
    //   286	308	311	java/lang/Exception
    //   312	319	322	java/lang/Exception
    //   316	329	332	java/lang/Exception
    //   323	341	344	java/lang/Exception
    //   345	362	365	java/lang/Exception
    //   381	391	394	java/lang/Exception
    //   387	399	399	java/lang/Exception
  }
  
  private static native void freeLib();
}
