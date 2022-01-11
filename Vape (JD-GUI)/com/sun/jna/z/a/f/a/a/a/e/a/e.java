package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.o;
import com.sun.jna.z.a.f.a.a.a.e.b;
import java.awt.Color;
import java.awt.Dimension;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;

public class e
  extends b<o>
{
  private final i e;
  
  e(i a)
  {
    a.<init>(o.class);a.e = a;
    
    a.b = Color.WHITE;a.c = new Color(128, 128, 128, 128);
  }
  
  protected void a(o a)
  {
    GL11.glPushMatrix();a.a(a, false);int a = 0;int a = 0;
    
    int a = i.f;
    if (a == 0) {}
    switch (j.a[a.a().ordinal()])
    {
    case 1: 
      a = 
      
        a + (a.f() / 2 - a.e.a().func_78256_a(a.b()) / 2);
      if (a == 0) {
        break;
      }
    case 2: 
      a = 
      
        a + (a.f() - a.e.a().func_78256_a(a.b()) - 2);
      if (a == 0) {
        break;
      }
    default: 
      a += 2;
    }
    if (a == 0) {
      switch (j.a[a.b().ordinal()])
      {
      case 3: 
        a += 2;
        if (a == 0) {
          break;
        }
      case 4: 
        a += a.g() - a.e.a().field_78288_b - 2;
        if (a == 0) {
          break;
        }
      }
    } else {
      a += a.g() / 2 - a.e.a().field_78288_b / 2;
    }
    a.e.c().func_78276_b(a.b(), a, a, com.sun.jna.z.a.f.a.a.a.f.a.b(a.f));a.a(a, true);GL11.glPopMatrix();
  }
  
  final Color f = Color.lightGray;
  
  protected Dimension b(o a)
  {
    return 
    
      new Dimension(a.e.a().func_78256_a(a.b()) + 4, a.e.a().field_78288_b + 4);
  }
}
