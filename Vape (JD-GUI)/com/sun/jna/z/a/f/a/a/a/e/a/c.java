package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.e.b;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class c
  extends b<com.sun.jna.z.a.f.a.a.a.a.j>
{
  private final i e;
  
  protected void a(com.sun.jna.z.a.f.a.a.a.a.j a, Point a, int a)
  {
    int a = i.f;
    if (a == 0) {
      if (a != 0) {
        return;
      }
    }
    if (a == 0) {
      if (a.x <= a.f())
      {
        if (a != 0) {
          break label96;
        }
        if (a.y <= a.g())
        {
          if (a == 0) {}
          a.e(!a.a());
          if (a == 0) {
            return;
          }
        }
      }
    }
    if ((a != 0) || (a.x <= a.f())) {
      label96:
      if ((a != 0) || (a.a()))
      {
        int a = a.g() + 2;String[] a = a.a();int a = 0;
        label236:
        do
        {
          if (a >= a.length) {
            break;
          }
          if ((a != 0) || ((a != a.b()) || 
          
            (a != 0)))
          {
            if (a == 0) {
              if (a.y >= a)
              {
                if (a != 0) {
                  break label236;
                }
                if (
                
                  a.y <= a + a.e.a().field_78288_b)
                {
                  a.a(a);
                  
                  a.e(false);
                  if (a == 0) {
                    break;
                  }
                }
              }
            }
            a += a.e.a().field_78288_b + 2;
          }
          a++;
        } while (a == 0);
      }
    }
  }
  
  protected void a(com.sun.jna.z.a.f.a.a.a.a.j a)
  {
    a.a(a, false);
    
    Rectangle a = a.j();
    
    GL11.glEnable(3042);int a = i.f;GL11.glDisable(2884);GL11.glDisable(3553);
    
    int a = 0;String[] arrayOfString1 = a.a();int i = arrayOfString1.length;
    for (int j = 0; j < i;)
    {
      String a = arrayOfString1[j];
      if (a != 0) {
        break label113;
      }
      a = Math.max(a, a.e.a()
      
        .func_78256_a(a));j++;
      if (a != 0) {
        com.sun.jna.z.a.j.g = !com.sun.jna.z.a.j.g;
      }
    }
    label113:
    int a = 0;
    if (a == 0)
    {
      if (a.a())
      {
        String[] a = a.a();
        
        int a = 0;
        do
        {
          if (a >= a.length - 1) {
            break;
          }
          a += a.e.a().field_78288_b + 2;
          
          a++;
          if (a != 0) {
            break label239;
          }
        } while (a == 0);
        a += 2;
      }
      com.sun.jna.z.a.f.a.a.a.f.a.a(a.l());
      
      GL11.glBegin(7);
      
      GL11.glVertex2d(0.0D, 0.0D);
      
      GL11.glVertex2d(a.width, 0.0D);
    }
    GL11.glVertex2d(a.width, a.height + a);
    
    GL11.glVertex2d(0.0D, a.height + a);GL11.glEnd();
    label239:
    Object a = com.sun.jna.z.a.f.a.a.a.f.a.b();
    Object a = a.k();
    do
    {
      if (a == null) {
        break;
      }
      ((Point2D)a).setLocation(((Point2D)a).getX() - ((k)a).d(), ((Point2D)a).getY() - ((k)a).e());a = ((k)a).k();
      if (a != 0) {
        break label327;
      }
    } while (a == 0);
    GL11.glColor4f(0.0F, 0.0F, 0.0F, Mouse.isButtonDown(0) ? 0.5F : 0.3F);
    label327:
    if (a == 0) {
      if (a.contains((Point2D)a))
      {
        GL11.glBegin(7);
        
        GL11.glVertex2d(0.0D, 0.0D);
        
        GL11.glVertex2d(a.width, 0.0D);
        
        GL11.glVertex2d(a.width, a.height);GL11.glVertex2d(0.0D, a.height);GL11.glEnd();
        if (a == 0) {
          break label706;
        }
      }
    }
    if (a == 0) {
      if (a.a())
      {
        if (a != 0) {
          break label718;
        }
        if (((Point2D)a).getX() >= a.x)
        {
          if (a != 0) {
            break label718;
          }
          if (((Point2D)a).getX() <= a.x + a.width)
          {
            int a = a.g();
            
            String[] a = a.a();int a = 0;
            label541:
            label552:
            label590:
            label593:
            label607:
            label697:
            do
            {
              if (a >= a.length) {
                break;
              }
              if (a != 0) {
                break label717;
              }
              if ((a != 0) || ((a != a.b()) || 
              
                (a != 0)))
              {
                int a = a.e.a().field_78288_b + 2;
                if (a == 0) {
                  if (a.b() == 0)
                  {
                    if (a != 0) {
                      break label552;
                    }
                    if (a != 1) {
                      break label541;
                    }
                    break label590;
                  }
                }
                if ((a != 0) || (a != 0)) {
                  if (a == 0)
                  {
                    if (
                    
                      a.b() == a.length - 1)
                    {
                      if (a != 0) {
                        break label607;
                      }
                      if (a != a.length - 2) {
                        break label593;
                      }
                    }
                    else
                    {
                      if (a != 0) {
                        break label607;
                      }
                    }
                  }
                  else {
                    if (a != a.length - 1) {
                      break label593;
                    }
                  }
                }
                a++;
                if (a == 0) {
                  if (((Point2D)a).getY() >= a.y + a)
                  {
                    if (a != 0) {
                      break label697;
                    }
                    if (
                    
                      ((Point2D)a).getY() <= a.y + a + a)
                    {
                      GL11.glBegin(7);
                      
                      GL11.glVertex2d(0.0D, a);
                      
                      GL11.glVertex2d(0.0D, a + a);GL11.glVertex2d(a.width, a + a);GL11.glVertex2d(a.width, a);GL11.glEnd();
                      if (a == 0) {
                        break;
                      }
                    }
                  }
                }
                a += a;
              }
              a++;
            } while (a == 0);
          }
        }
      }
    }
    label706:
    label717:
    label718:
    int a = a.e.a().field_78288_b + 4;
    GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.3F);
    
    GL11.glBegin(4);
    if (a == 0)
    {
      if (a.a())
      {
        GL11.glVertex2d(a + 4 + a / 2.0D, a / 3.0D);GL11.glVertex2d(a + 4 + a / 3.0D, 2.0D * a / 3.0D);GL11.glVertex2d(a + 4 + 2.0D * a / 3.0D, 2.0D * a / 3.0D);
        if (a == 0) {}
      }
      else
      {
        GL11.glVertex2d(a + 4 + a / 3.0D, a / 3.0D);GL11.glVertex2d(a + 4 + 2.0D * a / 3.0D, a / 3.0D);
      }
    }
    else {
      GL11.glVertex2d(a + 4 + a / 2.0D, 2.0D * a / 3.0D);
    }
    GL11.glEnd();GL11.glLineWidth(1.0F);GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0F);
    if (a == 0)
    {
      if (a.a())
      {
        GL11.glBegin(1);GL11.glVertex2d(2.0D, a.height);
        
        GL11.glVertex2d(a.width - 2, a.height);
        
        GL11.glEnd();
      }
      GL11.glBegin(1);GL11.glVertex2d(a + 4, 2.0D);GL11.glVertex2d(a + 4, a.height - 2);GL11.glEnd();GL11.glBegin(2);
    }
    if (a == 0)
    {
      if (a.a())
      {
        GL11.glVertex2d(a + 4 + a / 2.0D, a / 3.0D);GL11.glVertex2d(a + 4 + a / 3.0D, 2.0D * a / 3.0D);GL11.glVertex2d(a + 4 + 2.0D * a / 3.0D, 2.0D * a / 3.0D);
        if (a == 0) {}
      }
      else
      {
        GL11.glVertex2d(a + 4 + a / 3.0D, a / 3.0D);GL11.glVertex2d(a + 4 + 2.0D * a / 3.0D, a / 3.0D);
      }
    }
    else {
      GL11.glVertex2d(a + 4 + a / 2.0D, 2.0D * a / 3.0D);
    }
    GL11.glEnd();GL11.glEnable(3553);String a = a.c();a.e.a().func_78276_b(a, 2, a.height / 2 - a.e.a().field_78288_b / 2, 
    
      com.sun.jna.z.a.f.a.a.a.f.a.b(a.m()));
    if (a == 0)
    {
      if (a.a())
      {
        int a = a.height + 2;
        
        String[] a = a.a();int a = 0;
        do
        {
          if (a >= a.length) {
            break;
          }
          if (a != 0) {
            break label1362;
          }
          if (a == 0)
          {
            if ((a != a.b()) || (a != 0)) {
              a.e.a().func_78276_b(a[a], 2, a, 
              
                com.sun.jna.z.a.f.a.a.a.f.a.b(a.m()));
            }
          }
          else {
            a += a.e.a().field_78288_b + 2;
          }
          a++;
        } while (a == 0);
      }
      GL11.glEnable(2884);
    }
    label1362:
    GL11.glDisable(3042);
    a.a(a, true);
  }
  
  c(i a)
  {
    a.<init>(com.sun.jna.z.a.f.a.a.a.a.j.class);
    
    a.e = a;
    
    a.b = Color.WHITE;a.c = new Color(128, 128, 128, 192);
  }
  
  protected Dimension b(com.sun.jna.z.a.f.a.a.a.a.j a)
  {
    int a = 0;
    
    String[] a = a.a();int a = a.length;int a = 0;int a = i.f;
    do
    {
      if (a >= a) {
        break;
      }
      String a = a[a];a = Math.max(a, a.e.a().func_78256_a(a));a++;
    } while (a == 0);
    return new Dimension(a + 8 + a.e.a().field_78288_b, a.e.a().field_78288_b + 4);
  }
  
  protected Rectangle[] c(com.sun.jna.z.a.f.a.a.a.a.j a)
  {
    int i = a.g();
    int a;
    int a = 
    
      i.f;
    if (a == 0) {
      if (a.a())
      {
        String[] a = a.a();int a = 0;
        do
        {
          if (a >= a.length) {
            break;
          }
          a += a.e.a().field_78288_b + 2;a++;
          if (a != 0) {
            break label72;
          }
        } while (a == 0);
        a += 2;
      }
    }
    label72:
    return new Rectangle[] { new Rectangle(0, 0, a.f(), a) };
  }
}
