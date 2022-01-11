package com.sun.jna.z.a.a;

import com.sun.jna.z.a.f.a.a.a.a.n;
import com.sun.jna.z.a.f.a.a.a.e.a.i;
import com.sun.jna.z.a.f.a.a.a.h;
import com.sun.jna.z.a.j;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ChatAllowedCharacters;

public class e
  extends Gui
{
  private int g = 32;
  
  public boolean m()
  {
    return a.r;
  }
  
  public void a(boolean a)
  {
    a.i = a;
  }
  
  public void b(int a)
  {
    int a = a.h;
    if ((a != 0) || (a.f.length() != 0))
    {
      if (a == 0) {
        if (a.o != a.n)
        {
          a.b("");
          if (a == 0) {
            return;
          }
        }
      }
      if (a == 0) {}
      boolean a = a < 0;
      if (a == 0) {}
      int a = a ? a.n + a : a.n;
      if (a == 0) {}
      int a = a ? a.n : a.n + a;String a = "";
      if (a == 0) {
        if (a >= 0) {
          a = a.f.substring(0, a);
        }
      }
      if (a == 0)
      {
        if (a < a.f.length()) {
          a = a + a.f.substring(a);
        }
        if (a == 0) {
          a.f = a;
        }
      }
      else if (!a)
      {
        return;
      }
      a.d(a);
    }
  }
  
  public void d()
  {
    a.e(0);
  }
  
  private String f = "";
  
  public void g(int a)
  {
    a.p = a;
  }
  
  public int h()
  {
    return a.n;
  }
  
  private boolean i = true;
  
  public void b(String a)
  {
    String a = "";
    
    String a = ChatAllowedCharacters.func_71565_a(a);
    
    int a = a.h;
    if (a == 0) {}
    int a = a.n < a.o ? a.n : a.o;
    if (a == 0) {}
    int a = a.n < a.o ? a.o : a.n;
    
    int a = a.g - a.f.length() - (a - a.o);
    
    boolean a = false;
    if (a == 0) {
      if (a.f.length() > 0) {
        a = a + a.f.substring(0, a);
      }
    }
    int a;
    if (a == 0)
    {
      if (a < a.length())
      {
        a = a + a.substring(0, a);
        
        int a = a;
        if (a != 0) {
          j.g = !j.g;
        }
      }
      else
      {
        a = a + a;
      }
    }
    else {
      a = a.length();
    }
    if (a == 0)
    {
      if ((a.f.length() > 0) && (a < a.f.length())) {
        a = a + a.f.substring(a);
      }
      a.f = a;
    }
    a.d(a - a.o + a);
  }
  
  public int a(int a, int a, boolean a)
  {
    int i1 = a;int a = a.h;
    int a;
    if (a == 0) {}
    boolean a = a < 0;
    
    int a = Math.abs(a);
    
    int a = 0;
    label105:
    label222:
    do
    {
      if (a >= a) {
        break;
      }
      if (a != 0) {
        break label232;
      }
      if (a == 0) {
        if (a)
        {
          do
          {
            if (!a) {
              break;
            }
            if ((a != 0) || (a != 0)) {
              break label105;
            }
            if (a <= 0) {
              break;
            }
            if (a != 0) {
              break label105;
            }
            if (a.f.charAt(a - 1) != ' ') {
              break;
            }
            a--;
          } while (a == 0);
          do
          {
            if (a <= 0) {
              break label222;
            }
            if (a != 0) {
              break;
            }
            if (a.f.charAt(a - 1) == ' ') {
              break label222;
            }
            a--;
          } while (a == 0);
        }
      }
      int a = a.f.length();
      
      a = a.f.indexOf(' ', a);
      if (a == 0) {
        if (a == -1)
        {
          a = a;
          if (a == 0) {
            break label222;
          }
        }
      }
      do
      {
        if (!a) {
          break label222;
        }
        if (a != 0) {
          break;
        }
        if ((a == 0) && ((a >= a) || (a.f.charAt(a) != ' '))) {
          break label222;
        }
        a++;
      } while (a == 0);
      a++;
    } while (a == 0);
    label232:
    return a;
  }
  
  public void c(boolean a)
  {
    a.l = a;
  }
  
  public int k()
  {
    return a.o;
  }
  
  public boolean i()
  {
    return a.i;
  }
  
  public void i(int a)
  {
    int i1 = a.f.length();int a = a.h;
    int a;
    if (a == 0) {
      if (a > a) {
        a = a;
      }
    }
    if ((a != 0) || (a < 0)) {
      a = 0;
    }
    a.o = a;
    if ((a != 0) || (a.a != null))
    {
      if (a == 0) {
        if (a.m > a) {
          a.m = a;
        }
      }
      int a = a.l();String a = a.a.func_78269_a(a.f.substring(a.m), a);int a = a.length() + a.m;
      if (a == 0) {
        if (a == a.m) {
          a.m -= a.a.func_78262_a(a.f, a, true).length();
        }
      }
      if (a == 0)
      {
        if (a > a)
        {
          a.m += a - a;
          if (a == 0) {}
        }
        else
        {
          if (a != 0) {
            break label202;
          }
        }
      }
      else if (a <= a.m) {
        a.m -= a.m - a;
      }
      label202:
      if (a == 0)
      {
        if (a.m < 0) {
          a.m = 0;
        }
        if (a != 0) {}
      }
      else if (a.m <= a)
      {
        return;
      }
      a.m = a;
    }
  }
  
  public String c()
  {
    int a = a.h;
    if (a == 0) {}
    int a = a.n < a.o ? a.n : a.o;
    if (a == 0) {}
    int a = a.n < a.o ? a.o : a.n;return a.f.substring(a, a);
  }
  
  public void a()
  {
    a.h += 1;
  }
  
  public void a(int a, int a, int a)
  {
    int a = a.h;
    if (((a != 0) || (a >= a.b)) && ((a != 0) || (a < a.b + a.d))) {
      if (a == 0)
      {
        if (a < a.c) {
          break label71;
        }
        if (a != 0) {
          break label68;
        }
      }
    }
    label68:
    label71:
    boolean a = a < a.c + a.e;
    if (a == 0) {
      if (a.j)
      {
        if ((a != 0) || (a.l)) {
          if (a != 0) {}
        }
        a.b(a);
      }
    }
    if (((a != 0) || (a.k)) && ((a != 0) || (a == 0)))
    {
      int a = a - a.b;
      if (a == 0) {
        if (a.i) {
          a -= 4;
        }
      }
      String a = a.a.func_78269_a(a.f.substring(a.m), a.l());
      
      a.e(a.a.func_78269_a(a, a).length() + a.m);
    }
  }
  
  public int g()
  {
    return a.g;
  }
  
  public int a(int a, int a)
  {
    return a.a(a, a.h(), true);
  }
  
  public void b(boolean a)
  {
    int a = a.h;
    if (a == 0)
    {
      if (a)
      {
        if (a != 0) {
          break label29;
        }
        if (!a.k) {
          a.h = 0;
        }
      }
      label29:
      a.k = a;
    }
  }
  
  public void a(String a)
  {
    int a = a.h;
    if (a == 0)
    {
      if (a.length() > a.g) {
        a.f = a.substring(0, a.g);
      }
    }
    else {
      if (a == 0) {
        break label41;
      }
    }
    a.f = a;
    label41:
    a.e();
  }
  
  public int c(int a)
  {
    return a.a(a, a.h());
  }
  
  public boolean a(char a, int a)
  {
    int a = a.h;
    if (a == 0) {
      if (a.l)
      {
        if (a != 0) {
          break label280;
        }
        if (a.k)
        {
          if (a == 0) {
            switch (a)
            {
            case '\001': 
              a.e();
              
              a.i(0);return true;
            case '\003': 
              GuiScreen.func_146275_d(a.c());
              
              return true;
            case '\026': 
              a.b(GuiScreen.func_146277_j());return true;
            case '\030': 
              GuiScreen.func_146275_d(a.c());
              
              a.b("");return true;
            }
          }
          if (a == 0) {
            switch (a)
            {
            case 14: 
              if (GuiScreen.func_146271_m())
              {
                a.a(-1);
                if (a == 0) {}
              }
              else
              {
                a.b(-1);
              }
              return true;
            case 199: 
              if (GuiScreen.func_146272_n())
              {
                a.i(0);
                if (a == 0) {}
              }
              else
              {
                a.d();
              }
              return true;
            case 207: 
              if (GuiScreen.func_146272_n())
              {
                a.i(a.f.length());
                if (a == 0) {}
              }
              else
              {
                a.e();
              }
              return true;
            case 211: 
              if (GuiScreen.func_146271_m())
              {
                a.a(1);
                if (a == 0) {}
              }
              else
              {
                a.b(1);
              }
              return true;
            }
          }
          if (a == 0) {
            if (ChatAllowedCharacters.func_71566_a(a))
            {
              a.b(Character.toString(a));
              
              return true;
            }
          }
          return false;
        }
      }
    }
    label280:
    return false;
  }
  
  private boolean j = true;
  private final FontRenderer a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private int h;
  private boolean k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private boolean r;
  i s;
  com.sun.jna.z.a.f.a.a.a.b.a t;
  
  public void e(int a)
  {
    a.n = a;int a = a.f.length();
    
    int a = a.h;
    if (a == 0)
    {
      if (a.n < 0) {
        a.n = 0;
      }
      if (a != 0) {}
    }
    else if (a.n > a)
    {
      a.n = a;
    }
    a.i(a.n);
  }
  
  public void a(int a)
  {
    int a = a.h;
    if (a == 0)
    {
      if (a.f.length() == 0) {
        return;
      }
      if (a != 0) {}
    }
    else if (a.o != a.n)
    {
      a.b("");
      if (a == 0) {
        return;
      }
    }
    a.b(a.c(a) - a.n);
  }
  
  public void e(boolean a)
  {
    a.r = a;
  }
  
  public e(FontRenderer a, int a, int a, int a, int a)
  {
    int a = a.h;a.k = false;a.l = true;
    
    a.m = 0;
    
    a.n = 0;
    
    a.o = 0;a.p = -1;a.q = -1;a.r = true;a.s = ((i)j.e.c.c());a.t = ((com.sun.jna.z.a.f.a.a.a.b.a)a.s.c());a.a = a;
    
    a.b = a;a.c = a;a.d = a;a.e = a;
    if (j.g) {
      a.h = a == 0;
    }
  }
  
  public boolean j()
  {
    return a.k;
  }
  
  public void e()
  {
    a.e(a.f.length());
  }
  
  public void f()
  {
    int a = a.h;
    if ((a != 0) || (a.m()))
    {
      if (a == 0)
      {
        if (a.i())
        {
          func_73734_a(a.b - 1, a.c - 1, a.b + a.d + 1, a.c + a.e + 1, -6250336);
          
          func_73734_a(a.b, a.c, a.b + a.d, a.c + a.e, -16777216);
        }
        if (a != 0) {
          break label115;
        }
      }
      label115:
      int a = a.l ? a.p : a.q;
      int a = a.n - a.m;int a = a.o - a.m;String a = a.t.func_78269_a(a.f.substring(a.m), a.l());
      if ((a != 0) || (a >= 0)) {
        if (a != 0) {}
      }
      boolean a = a <= a.length();
      if (((a != 0) || (a.k)) && ((a != 0) || (a.h / 6 % 2 == 0))) {
        if (a != 0) {}
      }
      boolean a = a;
      if (a == 0) {}
      int a = a.i ? a.b + 4 : a.b;
      if (a == 0) {}
      int a = a.i ? a.c + (a.e - 8) / 2 : a.c;int a = a;
      if (a == 0) {
        if (a > a.length()) {
          a = a.length();
        }
      }
      if (a == 0) {
        if (a.length() > 0)
        {
          String a = a ? a.substring(0, a) : a;a.t.func_78276_b(a, j.e.c.n.d() + 1, j.e.c.n.e() + 16, a);
        }
      }
      if (a == 0) {
        if (a.n >= a.f.length()) {
          if (a != 0) {
            break label432;
          }
        }
      }
      label432:
      boolean a = a.f.length() >= a.g();
      int a = a;
      if (a == 0) {
        if (!a)
        {
          if (a == 0) {}
          a = a > 0 ? a + a.d : a;
          if (a == 0) {
            break label495;
          }
        }
      }
      if (a == 0) {
        if (a)
        {
          a = a - 1;a--;
        }
      }
      label495:
      if (a == 0) {
        if (a.length() > 0)
        {
          if (a != 0) {
            break label550;
          }
          if (a)
          {
            if (a != 0) {
              break label550;
            }
            if (a < a.length()) {
              a.t.func_78276_b(a.substring(a), a, a, a);
            }
          }
        }
      }
      label550:
      if (a == 0) {
        if (a)
        {
          if (a == 0) {
            if (a)
            {
              Gui.func_73734_a(a, a - 1, a + 1, a + 1 + a.t.field_78288_b, -3092272);
              if (a == 0) {
                break label651;
              }
            }
          }
          a.t.func_78276_b("_", j.e.c.n.d() + 2 + a.t.func_78256_a(a), j.e.c.n.e() + 15, a);
        }
      }
      label651:
      if ((a != 0) || (a != a)) {
        int a = a + a.a.func_78256_a(a.substring(0, a));
      }
    }
  }
  
  public int l()
  {
    int a = a.h;
    if (a == 0) {}
    return a.i() ? a.d - 8 : a.d;
  }
  
  public void h(int a)
  {
    a.q = a;
  }
  
  public String b()
  {
    return a.f;
  }
  
  public void f(int a)
  {
    a.g = a;int a = a.h;
    if ((a != 0) || (a.f.length() > a)) {
      a.f = a.f.substring(0, a);
    }
  }
  
  public void d(int a)
  {
    a.e(a.o + a);
  }
  
  public void d(boolean a)
  {
    a.j = a;
  }
}
