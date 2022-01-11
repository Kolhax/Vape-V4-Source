package com.sun.jna.z.a.g;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class m
{
  public void a(int a, int a)
  {
    a.a(a, a, c.TWO_DIMENSIONAL);
  }
  
  public void a(int a, int a, c a)
  {
    a.b = a;int a = g.b;
    
    a.d = a;
    if (a == 0)
    {
      if (a == c.THREE_DIMENSIONAL) {
        a.c = 3;
      }
      a.f = new float[a * a.c];
      
      a.a = BufferUtils.createFloatBuffer(a * a.c);
    }
  }
  
  private int c = 2;
  private int d = 7;
  
  public void a(double a, double a, double a)
  {
    a.f[(a.e++)] = ((float)a);
    
    a.f[(a.e++)] = ((float)a);a.f[(a.e++)] = ((float)a);
  }
  
  public void a(float a, float a)
  {
    a.f[(a.e++)] = a;
    
    a.f[(a.e++)] = a;
  }
  
  public void a()
  {
    GL11.glEnableClientState(32884);GL11.glVertexPointer(a.c, 0, a.a);
    
    GL11.glDrawArrays(a.d, 0, a.b);GL11.glDisableClientState(32884);a.e = 0;
  }
  
  public void b()
  {
    a.e = 0;a.f = new float[a.b * a.c];a.a.clear();
  }
  
  public void a(int a)
  {
    a.a(a, 7, c.TWO_DIMENSIONAL);
  }
  
  public void c()
  {
    a.a.put(a.f);a.a.flip();
    
    a.a();
  }
  
  private int e = -1;
  private FloatBuffer a;
  private int b;
  private float[] f;
}
