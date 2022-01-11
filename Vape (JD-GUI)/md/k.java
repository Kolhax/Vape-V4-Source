package md;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class k
  extends c
{
  public static boolean o;
  public static int p;
  public static boolean q;
  public static boolean r;
  public static boolean s;
  public static int t;
  public static boolean u;
  public static boolean v;
  public static int w;
  public static int x;
  public static boolean y;
  public static int z;
  public static boolean A;
  public static int B;
  public static boolean C;
  public static boolean D;
  public static int E;
  public static boolean F;
  public static boolean G;
  public static boolean H;
  private static final String I;
  
  public void f()
  {
    a.a.field_71439_g.func_82170_o(16);
  }
  
  public void a(TickEvent.PlayerTickEvent a)
  {
    a.a.field_71439_g.func_70690_d(new PotionEffect(16, 5200, 0));int a = H;
    if (a != 0) {
      o = !o;
    }
  }
  
  public k()
  {
    a.<init>(I, b.Render, 65280);
  }
}
