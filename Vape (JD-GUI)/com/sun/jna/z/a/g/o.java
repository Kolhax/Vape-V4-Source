package com.sun.jna.z.a.g;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class o
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public o(InputStream a)
    throws IOException
  {
    a.<init>(a, 9729);
  }
  
  public static void a(o a, float a, float a, float a, float a)
  {
    a.a();
    
    float a = 0.0F;
    
    float a = 0.0F;
    
    float a = 1.0F;
    
    float a = 1.0F;GL11.glBegin(7);GL11.glTexCoord2f(a, a);GL11.glVertex2f(a, a);GL11.glTexCoord2f(a, a);GL11.glVertex2f(a, a + a);GL11.glTexCoord2f(a, a);GL11.glVertex2f(a + a, a + a);GL11.glTexCoord2f(a, a);GL11.glVertex2f(a + a, a);GL11.glEnd();
  }
  
  public o(InputStream a, int a, int a)
    throws IOException
  {
    a.a = 3553;
    
    a.e = 9729;
    
    a.g = 10496;a.h = 33071;
    
    int a = g.b;a.i = 10497;
    try
    {
      j a = new j(a);
      
      a.c = a.b();
      
      a.d = a.a();int a = 4;ByteBuffer a = BufferUtils.createByteBuffer(4 * a.c * a.d);
      
      a.a(a, a.c * 4, b.RGBA);a.flip();GL11.glEnable(a.a);a.b = GL11.glGenTextures();a.a();
      
      GL11.glPixelStorei(3317, 1);GL11.glTexParameteri(a.a, 10241, a);GL11.glTexParameteri(a.a, 10240, a);
      
      GL11.glTexParameteri(a.a, 10242, a);GL11.glTexParameteri(a.a, 10243, a);GL11.glTexImage2D(a.a, 0, 6408, a.c, a.d, 0, 6408, 5121, a);
      if ((a != 0) || (a != null)) {
        try
        {
          a.close();
        }
        catch (IOException localIOException) {}
      }
      label261:
      return;
    }
    finally
    {
      try
      {
        if (a == 0) {
          if (a == null) {
            break label261;
          }
        }
      }
      catch (IOException localIOException2)
      {
        throw localIOException2;
      }
      try
      {
        a.close();
      }
      catch (IOException localIOException1) {}
    }
  }
  
  public o(InputStream a, int a)
    throws IOException
  {
    a.<init>(a, a, 33071);
  }
  
  public void a()
  {
    GL11.glBindTexture(a.a, a.b);
  }
  
  public int f = 9728;
  public int g;
  public int h;
  public final int i = 10497;
}
