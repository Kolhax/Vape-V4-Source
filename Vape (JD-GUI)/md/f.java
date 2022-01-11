package md;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.g.l;
import com.sun.jna.z.a.i;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class f
  extends c
{
  public static boolean n;
  public static int o;
  public static boolean p;
  public static boolean q;
  public static boolean r;
  public static int s;
  public static boolean t;
  public static boolean u;
  public static int v;
  public static int w;
  public static boolean x;
  public static int y;
  public static boolean z;
  public static int A;
  public static boolean B;
  public static boolean C;
  public static int D;
  public static boolean E;
  public static boolean F;
  public static boolean G;
  private static final String H;
  
  void a(Entity a, float a, float a, float a, float a, float a)
  {
    double a = a.field_70142_S + (a.field_70165_t - a.field_70142_S) * a - i.d.i.a();double a = a.field_70137_T + (a.field_70163_u - a.field_70137_T) * a - i.d.i.b();
    
    double a = a.field_70136_U + (a.field_70161_v - a.field_70136_U) * a - i.d.i.c();GL11.glBlendFunc(770, 771);
    
    GL11.glEnable(3042);GL11.glBlendFunc(770, 771);GL11.glColor4f(a, a, a, 1.0F);GL11.glDisable(2896);GL11.glEnable(2848);GL11.glLineWidth(a);GL11.glDisable(3553);
    GL11.glBegin(1);GL11.glVertex3d(0.0D, a.c().func_70047_e(), 0.0D);GL11.glVertex3d(a, a + a.func_70047_e(), a);GL11.glEnd();GL11.glDisable(3042);int a = G;GL11.glEnable(3553);
    GL11.glDisable(2848);GL11.glEnable(2896);
    if (a != 0) {
      n = !n;
    }
  }
  
  public void b(float a)
  {
    GL11.glPushMatrix();GL11.glDisable(2896);int a = G;GL11.glDisable(2929);a.b().field_71460_t.func_175072_h();Iterator localIterator = a.b().field_71441_e.field_72996_f.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      Object a = localIterator.next();
      if (a == 0)
      {
        if (a != 0) {
          break label196;
        }
        if (!(a instanceof EntityOtherPlayerMP)) {}
      }
      else if ((a != 0) || (a != a.b().field_71439_g))
      {
        EntityOtherPlayerMP a = (EntityOtherPlayerMP)a;
        if (a == 0)
        {
          if (a.d(a))
          {
            a.a(a, 0.0F, 1.0F, 0.0F, 1.2F, a);
            if (a == 0) {
              continue;
            }
          }
          if (a != 0) {}
        }
        else if (a.c(a))
        {
          a.a(a, 0.0F, 0.0F, 1.0F, 1.2F, a);
          if (a == 0) {
            continue;
          }
        }
        a.a(a, 0.27F, 0.7F, 0.92F, 1.0F, a);
      }
    } while (a == 0);
    GL11.glColor3d(1.0D, 1.0D, 1.0D);
    a.b().field_71460_t.func_180436_i();
    label196:
    GL11.glEnable(2929);
    GL11.glPopMatrix();
    if (n) {
      G = a == 0;
    }
  }
  
  public f()
  {
    a.<init>(H, b.Render, -12274966);
  }
}
