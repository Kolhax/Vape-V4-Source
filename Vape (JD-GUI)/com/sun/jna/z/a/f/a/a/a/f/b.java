package com.sun.jna.z.a.f.a.a.a.f;

import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.n;
import com.sun.jna.z.a.f.a.a.a.h;
import com.sun.jna.z.a.i;
import java.awt.Color;
import java.awt.Rectangle;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class b
  extends GuiScreen
{
  int n = 0;
  
  public int a()
  {
    return a.g;
  }
  
  Minecraft l = Minecraft.func_71410_x();
  private int k = 130;
  
  public void func_146286_b(int a, int a, int a)
  {
    int a = a.b;
    if (a == 0) {
      if (Minecraft.func_71410_x().field_71462_r == null) {
        return;
      }
    }
    Minecraft a = Minecraft.func_71410_x();ScaledResolution a = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);int a = a.func_78325_e();float a = h.a();a = (int)(a / a);a = (int)(a / a);a.func_146286_b(a, a, a);n[] a = a.a.b();int a = a.length;int a = 0;
    k[] a;
    int a;
    int a;
    label354:
    label362:
    do
    {
      if (a >= a) {
        break;
      }
      n a = a[a];
      if (a != 0) {
        break label387;
      }
      if ((a != 0) || ((a.p()) || (a != 0))) {
        if ((a != 0) || ((!a.d()) && ((a != 0) || (!a.j().contains(a, a)))))
        {
          a = a.b();a = a.length;a = 0;
          do
          {
            if (a >= a) {
              break label362;
            }
            k a = a[a];Rectangle[] a = a.a().a(a).e(a);int a = a.length;
            if (a != 0) {
              break;
            }
            int a = 0;
            do
            {
              if (a >= a) {
                break label354;
              }
              Rectangle a = a[a];
              if (a == 0)
              {
                if (a != 0) {
                  break;
                }
                if (a.contains(a - a.d() - a.d(), a - a.e() - a.e()))
                {
                  a.b(a - a.d(), a - a.e(), a);a.a.c(a);return;
                }
                a++;
              }
            } while (a == 0);
            a++;
          } while (a == 0);
        }
      }
      a++;
    } while (a == 0);
    a = a.a.b();a = a.length;
    label387:
    a = 0;
    label550:
    label565:
    label647:
    label777:
    do
    {
      if (a >= a) {
        break;
      }
      n a = a[a];
      if ((a != 0) || ((a.p()) || (a != 0)))
      {
        if (a == 0) {
          if (a.equals(com.sun.jna.z.a.j.e.c.n))
          {
            a = a.a().a(a).e(a);a = a.length;a = 0;
            do
            {
              if (a >= a) {
                break;
              }
              Rectangle a = a[a];
              if (a == 0)
              {
                if (a != 0) {
                  break label565;
                }
                if (a.contains(a - a.d(), a - (a.e() + 12))) {
                  a.c.b(true);
                }
              }
              else
              {
                if (a == 0) {
                  break label550;
                }
              }
              a.c.b(false);
              
              a++;
            } while (a == 0);
          }
        }
        if (a == 0) {
          if (!a.d())
          {
            if (a != 0) {
              break label647;
            }
            if (a.j().contains(a, a))
            {
              a.b(a - a.d(), a - a.e(), a);a.a.c(a);
              if (a == 0) {
                break;
              }
            }
          }
        }
        if ((a != 0) || (a.d()))
        {
          a = a.a().a(a).e(a);a = a.length;a = 0;
          do
          {
            if (a >= a) {
              break label777;
            }
            Rectangle a = a[a];
            if (a == 0)
            {
              if (a != 0) {
                break;
              }
              if (a.contains(a - a.d(), a - a.e()))
              {
                a.b(a - a.d(), a - a.e(), a);
                
                a.a.c(a);return;
              }
              a++;
            }
          } while (a == 0);
        }
      }
      a++;
    } while (a == 0);
  }
  
  protected void func_73869_a(char a, int a)
  {
    a.f = false;
    
    int a = a.b;
    if (a == 0) {
      if (a == 15) {
        a.m = true;
      }
    }
    if ((a != 0) || (a != 14))
    {
      if (a != 0) {
        break label51;
      }
      if (a != 57) {}
    }
    else
    {
      a.n = 0;
    }
    label51:
    if (a == 0)
    {
      if (a == 1)
      {
        a.l.func_147108_a((GuiScreen)null);
        if (a == 0) {
          return;
        }
      }
      if (a != 0) {}
    }
    else if (a == 28)
    {
      String a = a.c.b().trim();
      if (a == 0)
      {
        if (a.length() > 0)
        {
          a.b.a("." + a);a.c.a("");
        }
      }
      else {
        a.n = 0;
      }
      if (a == 0) {
        return;
      }
    }
    a.c.a(a, a);
  }
  
  boolean m = false;
  int p = 5;
  
  public void func_73876_c()
  {
    a.c.a();
  }
  
  public void func_73866_w_()
  {
    a.g = 350;a.h = 20;a.i = 130;a.j = 12;Keyboard.enableRepeatEvents(true);a.c = new com.sun.jna.z.a.a.e(a.field_146289_q, a.g + 2, a.h + 2, a.i, a.j);
    
    a.c.f(100);a.c.a(false);a.c.b(false);a.c.d(true);a.n = 0;
  }
  
  public b(com.sun.jna.z.a.f.a.a.a.j a)
  {
    a.a = a;
    
    a.b = new com.sun.jna.z.a.a.d();
  }
  
  private boolean e = false;
  FontRenderer o = new com.sun.jna.z.a.f.a.a.a.b.a(new com.sun.jna.z.a.g.e(q[4], 34.0F));
  
  public void func_146281_b()
  {
    Keyboard.enableRepeatEvents(false);a.l.field_71456_v.func_146158_b().func_146240_d();a.f = true;
  }
  
  private boolean f = true;
  
  public void func_73863_a(int a, int a, float a)
  {
    Minecraft a = Minecraft.func_71410_x();
    
    ScaledResolution a = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);a.g = com.sun.jna.z.a.j.e.c.n.d();int a = a.b;a.h = (com.sun.jna.z.a.j.e.c.n.e() - 4);float a = h.a();GL11.glPushMatrix();GL11.glScalef(a, a, a);Color a = new Color(h.e.getBlue(), h.e.getGreen(), h.e.getRed());String[] a = q;a.o.func_175063_a(a[0], 5.0F, a.field_71440_d / 2 - 25, a.b(a));
    if (a == 0) {}
    a.o.func_78276_b(a[1] + i.d.g + (i.d.h ? a[3] : ""), 5 + a.o.func_78256_a(q[2]), a.field_71440_d / 2 - 25, -1);
    if (a == 0)
    {
      if (com.sun.jna.z.a.j.e.c.n.p())
      {
        GL11.glEnable(3042);GL11.glDisable(2884);GL11.glDisable(3553);a.a(new Color(10, 10, 10, 200));GL11.glBegin(7);int a = a.h + 19;GL11.glVertex2d(a.g, a);
        
        GL11.glVertex2d(a.g + a.i, a);GL11.glVertex2d(a.g + a.i, a + a.j);GL11.glVertex2d(a.g, a + a.j);GL11.glEnd();GL11.glEnable(3553);GL11.glEnable(2884);GL11.glDisable(3042);
      }
      a.c.f();
    }
    a.a.d();
    
    GL11.glPopMatrix();a.func_73863_a(a, a, a);
    if (com.sun.jna.z.a.j.g) {
      a.b = a == 0;
    }
  }
  
  private String d = "";
  private final com.sun.jna.z.a.f.a.a.a.j a;
  public com.sun.jna.z.a.a.d b;
  public com.sun.jna.z.a.a.e c;
  private int g;
  private int h;
  private int i;
  private int j;
  private static final String[] q;
  
  public void func_146274_d()
    throws IOException
  {
    a.func_146274_d();int a = Mouse.getEventDWheel();int a = a.b;
    try
    {
      if (a == 0) {
        if (a == 0) {
          return;
        }
      }
    }
    catch (IOException localIOException1)
    {
      throw localIOException1;
    }
    try
    {
      if (a != 0) {
        break label41;
      }
      if (a <= 1) {
        break label39;
      }
    }
    catch (IOException localIOException2)
    {
      throw localIOException2;
    }
    a = 1;
    try
    {
      label39:
      label41:
      if (a != 0) {
        break label57;
      }
      if (a >= -1) {
        break label54;
      }
    }
    catch (IOException localIOException3)
    {
      throw localIOException3;
    }
    a = -1;
    label54:
    label57:
    a *= 7;
  }
  
  /* Error */
  protected void func_73864_a(int a, int a, int a)
  {
    // Byte code:
    //   0: getstatic 396	com/sun/jna/z/a/f/a/a/a/f/a:b	Z
    //   3: istore 4
    //   5: invokestatic 55	net/minecraft/client/Minecraft:func_71410_x	()Lnet/minecraft/client/Minecraft;
    //   8: getfield 182	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   11: ifnonnull +5 -> 16
    //   14: return
    //   15: athrow
    //   16: invokestatic 187	com/sun/jna/z/a/f/a/a/a/h:a	()F
    //   19: fstore 5
    //   21: iload_1
    //   22: i2f
    //   23: fload 5
    //   25: fdiv
    //   26: f2i
    //   27: istore_1
    //   28: iload_2
    //   29: i2f
    //   30: fload 5
    //   32: fdiv
    //   33: f2i
    //   34: istore_2
    //   35: aload_0
    //   36: iload_1
    //   37: iload_2
    //   38: iload_3
    //   39: invokespecial 189	net/minecraft/client/gui/GuiScreen:func_73864_a	(III)V
    //   42: goto +10 -> 52
    //   45: astore 6
    //   47: aload 6
    //   49: invokevirtual 192	java/io/IOException:printStackTrace	()V
    //   52: aload_0
    //   53: getfield 77	com/sun/jna/z/a/f/a/a/a/f/b:a	Lcom/sun/jna/z/a/f/a/a/a/j;
    //   56: invokeinterface 197 1 0
    //   61: astore 6
    //   63: aload 6
    //   65: arraylength
    //   66: istore 7
    //   68: iconst_0
    //   69: istore 8
    //   71: iload 8
    //   73: iload 7
    //   75: if_icmpge +298 -> 373
    //   78: aload 6
    //   80: iload 8
    //   82: aaload
    //   83: astore 9
    //   85: aload 9
    //   87: invokeinterface 204 1 0
    //   92: iload 4
    //   94: ifne +296 -> 390
    //   97: iload 4
    //   99: ifne +34 -> 133
    //   102: goto +4 -> 106
    //   105: athrow
    //   106: ifne +16 -> 122
    //   109: goto +4 -> 113
    //   112: athrow
    //   113: iload 4
    //   115: ifeq +250 -> 365
    //   118: goto +4 -> 122
    //   121: athrow
    //   122: aload 9
    //   124: invokeinterface 206 1 0
    //   129: goto +4 -> 133
    //   132: athrow
    //   133: iload 4
    //   135: ifne +35 -> 170
    //   138: ifne +227 -> 365
    //   141: goto +4 -> 145
    //   144: athrow
    //   145: aload 9
    //   147: iload 4
    //   149: ifne +26 -> 175
    //   152: goto +4 -> 156
    //   155: athrow
    //   156: invokeinterface 209 1 0
    //   161: iload_1
    //   162: iload_2
    //   163: invokevirtual 215	java/awt/Rectangle:contains	(II)Z
    //   166: goto +4 -> 170
    //   169: athrow
    //   170: ifne +195 -> 365
    //   173: aload 9
    //   175: invokeinterface 218 1 0
    //   180: astore 10
    //   182: aload 10
    //   184: arraylength
    //   185: istore 11
    //   187: iconst_0
    //   188: istore 12
    //   190: iload 12
    //   192: iload 11
    //   194: if_icmpge +171 -> 365
    //   197: aload 10
    //   199: iload 12
    //   201: aaload
    //   202: astore 13
    //   204: aload 13
    //   206: invokeinterface 225 1 0
    //   211: aload 13
    //   213: invokeinterface 230 2 0
    //   218: aload 13
    //   220: invokeinterface 235 2 0
    //   225: astore 14
    //   227: aload 14
    //   229: arraylength
    //   230: istore 15
    //   232: iconst_0
    //   233: iload 4
    //   235: ifne -162 -> 73
    //   238: istore 16
    //   240: iload 16
    //   242: iload 15
    //   244: if_icmpge +113 -> 357
    //   247: aload 14
    //   249: iload 16
    //   251: aaload
    //   252: astore 17
    //   254: iload 4
    //   256: ifne +96 -> 352
    //   259: aload 17
    //   261: iload_1
    //   262: aload 9
    //   264: invokeinterface 239 1 0
    //   269: isub
    //   270: aload 13
    //   272: invokeinterface 240 1 0
    //   277: isub
    //   278: iload_2
    //   279: aload 9
    //   281: invokeinterface 242 1 0
    //   286: isub
    //   287: aload 13
    //   289: invokeinterface 243 1 0
    //   294: isub
    //   295: invokevirtual 215	java/awt/Rectangle:contains	(II)Z
    //   298: iload 4
    //   300: ifne -108 -> 192
    //   303: goto +4 -> 307
    //   306: athrow
    //   307: ifeq +42 -> 349
    //   310: aload 9
    //   312: iload_1
    //   313: aload 9
    //   315: invokeinterface 239 1 0
    //   320: isub
    //   321: iload_2
    //   322: aload 9
    //   324: invokeinterface 242 1 0
    //   329: isub
    //   330: iload_3
    //   331: invokeinterface 245 4 0
    //   336: aload_0
    //   337: getfield 77	com/sun/jna/z/a/f/a/a/a/f/b:a	Lcom/sun/jna/z/a/f/a/a/a/j;
    //   340: aload 9
    //   342: invokeinterface 248 2 0
    //   347: return
    //   348: athrow
    //   349: iinc 16 1
    //   352: iload 4
    //   354: ifeq -114 -> 240
    //   357: iinc 12 1
    //   360: iload 4
    //   362: ifeq -172 -> 190
    //   365: iinc 8 1
    //   368: iload 4
    //   370: ifeq -299 -> 71
    //   373: aload_0
    //   374: getfield 77	com/sun/jna/z/a/f/a/a/a/f/b:a	Lcom/sun/jna/z/a/f/a/a/a/j;
    //   377: invokeinterface 197 1 0
    //   382: astore 6
    //   384: aload 6
    //   386: arraylength
    //   387: istore 7
    //   389: iconst_0
    //   390: istore 8
    //   392: iload 8
    //   394: iload 7
    //   396: if_icmpge +298 -> 694
    //   399: aload 6
    //   401: iload 8
    //   403: aaload
    //   404: astore 9
    //   406: aload 9
    //   408: invokeinterface 204 1 0
    //   413: iload 4
    //   415: ifne +30 -> 445
    //   418: ifne +16 -> 434
    //   421: goto +4 -> 425
    //   424: athrow
    //   425: iload 4
    //   427: ifeq +259 -> 686
    //   430: goto +4 -> 434
    //   433: athrow
    //   434: aload 9
    //   436: invokeinterface 206 1 0
    //   441: goto +4 -> 445
    //   444: athrow
    //   445: iload 4
    //   447: ifne +104 -> 551
    //   450: ifne +81 -> 531
    //   453: goto +4 -> 457
    //   456: athrow
    //   457: aload 9
    //   459: invokeinterface 209 1 0
    //   464: iload_1
    //   465: iload_2
    //   466: invokevirtual 215	java/awt/Rectangle:contains	(II)Z
    //   469: iload 4
    //   471: ifne +80 -> 551
    //   474: goto +4 -> 478
    //   477: athrow
    //   478: ifeq +53 -> 531
    //   481: goto +4 -> 485
    //   484: athrow
    //   485: aload 9
    //   487: iload_1
    //   488: aload 9
    //   490: invokeinterface 239 1 0
    //   495: isub
    //   496: iload_2
    //   497: aload 9
    //   499: invokeinterface 242 1 0
    //   504: isub
    //   505: iload_3
    //   506: invokeinterface 245 4 0
    //   511: aload_0
    //   512: getfield 77	com/sun/jna/z/a/f/a/a/a/f/b:a	Lcom/sun/jna/z/a/f/a/a/a/j;
    //   515: aload 9
    //   517: invokeinterface 248 2 0
    //   522: iload 4
    //   524: ifeq +170 -> 694
    //   527: goto +4 -> 531
    //   530: athrow
    //   531: aload 9
    //   533: iload 4
    //   535: ifne +21 -> 556
    //   538: goto +4 -> 542
    //   541: athrow
    //   542: invokeinterface 206 1 0
    //   547: goto +4 -> 551
    //   550: athrow
    //   551: ifeq +135 -> 686
    //   554: aload 9
    //   556: invokeinterface 249 1 0
    //   561: aload 9
    //   563: invokeinterface 230 2 0
    //   568: aload 9
    //   570: invokeinterface 235 2 0
    //   575: astore 10
    //   577: aload 10
    //   579: arraylength
    //   580: istore 11
    //   582: iconst_0
    //   583: istore 12
    //   585: iload 12
    //   587: iload 11
    //   589: if_icmpge +97 -> 686
    //   592: aload 10
    //   594: iload 12
    //   596: aaload
    //   597: astore 13
    //   599: iload 4
    //   601: ifne +80 -> 681
    //   604: aload 13
    //   606: iload_1
    //   607: aload 9
    //   609: invokeinterface 239 1 0
    //   614: isub
    //   615: iload_2
    //   616: aload 9
    //   618: invokeinterface 242 1 0
    //   623: isub
    //   624: invokevirtual 215	java/awt/Rectangle:contains	(II)Z
    //   627: iload 4
    //   629: ifne -235 -> 394
    //   632: goto +4 -> 636
    //   635: athrow
    //   636: ifeq +42 -> 678
    //   639: aload 9
    //   641: iload_1
    //   642: aload 9
    //   644: invokeinterface 239 1 0
    //   649: isub
    //   650: iload_2
    //   651: aload 9
    //   653: invokeinterface 242 1 0
    //   658: isub
    //   659: iload_3
    //   660: invokeinterface 245 4 0
    //   665: aload_0
    //   666: getfield 77	com/sun/jna/z/a/f/a/a/a/f/b:a	Lcom/sun/jna/z/a/f/a/a/a/j;
    //   669: aload 9
    //   671: invokeinterface 248 2 0
    //   676: return
    //   677: athrow
    //   678: iinc 12 1
    //   681: iload 4
    //   683: ifeq -98 -> 585
    //   686: iinc 8 1
    //   689: iload 4
    //   691: ifeq -299 -> 392
    //   694: return
    // Line number table:
    //   Java source line #38	-> byte code offset #5
    //   Java source line #60	-> byte code offset #14
    //   Java source line #109	-> byte code offset #16
    //   Java source line #56	-> byte code offset #21
    //   Java source line #157	-> byte code offset #28
    //   Java source line #74	-> byte code offset #35
    //   Java source line #85	-> byte code offset #42
    //   Java source line #107	-> byte code offset #45
    //   Java source line #36	-> byte code offset #47
    //   Java source line #116	-> byte code offset #52
    //   Java source line #73	-> byte code offset #85
    //   Java source line #50	-> byte code offset #113
    //   Java source line #153	-> byte code offset #122
    //   Java source line #90	-> byte code offset #173
    //   Java source line #150	-> byte code offset #204
    //   Java source line #128	-> byte code offset #254
    //   Java source line #40	-> byte code offset #310
    //   Java source line #28	-> byte code offset #336
    //   Java source line #49	-> byte code offset #347
    //   Java source line #138	-> byte code offset #349
    //   Java source line #111	-> byte code offset #357
    //   Java source line #135	-> byte code offset #365
    //   Java source line #161	-> byte code offset #373
    //   Java source line #6	-> byte code offset #406
    //   Java source line #101	-> byte code offset #425
    //   Java source line #59	-> byte code offset #434
    //   Java source line #105	-> byte code offset #485
    //   Java source line #106	-> byte code offset #511
    //   Java source line #61	-> byte code offset #522
    //   Java source line #43	-> byte code offset #531
    //   Java source line #27	-> byte code offset #554
    //   Java source line #145	-> byte code offset #599
    //   Java source line #132	-> byte code offset #639
    //   Java source line #144	-> byte code offset #665
    //   Java source line #67	-> byte code offset #676
    //   Java source line #159	-> byte code offset #678
    //   Java source line #114	-> byte code offset #686
    //   Java source line #154	-> byte code offset #694
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	695	0	a	b
    //   0	695	1	a	int
    //   0	695	2	a	int
    //   0	695	3	a	int
    //   3	691	4	a	int
    //   21	674	5	a	float
    //   47	5	6	a	IOException
    //   66	628	7	a	int
    //   69	625	8	a	int
    //   85	280	9	a	n
    //   406	280	9	a	n
    //   180	182	10	a	k[]
    //   185	498	11	a	int
    //   188	495	12	a	int
    //   204	153	13	a	k
    //   599	79	13	a	Rectangle
    //   225	137	14	a	Rectangle[]
    //   230	132	15	a	int
    //   238	124	16	a	int
    //   254	95	17	a	Rectangle
    // Exception table:
    //   from	to	target	type
    //   5	15	15	java/io/IOException
    //   35	42	45	java/io/IOException
    //   85	102	105	java/io/IOException
    //   97	109	112	java/io/IOException
    //   106	118	121	java/io/IOException
    //   113	129	132	java/io/IOException
    //   133	141	144	java/io/IOException
    //   138	152	155	java/io/IOException
    //   145	166	169	java/io/IOException
    //   254	303	306	java/io/IOException
    //   307	348	348	java/io/IOException
    //   406	421	424	java/io/IOException
    //   418	430	433	java/io/IOException
    //   425	441	444	java/io/IOException
    //   445	453	456	java/io/IOException
    //   450	474	477	java/io/IOException
    //   457	481	484	java/io/IOException
    //   478	527	530	java/io/IOException
    //   485	538	541	java/io/IOException
    //   531	547	550	java/io/IOException
    //   599	632	635	java/io/IOException
    //   636	677	677	java/io/IOException
  }
}
