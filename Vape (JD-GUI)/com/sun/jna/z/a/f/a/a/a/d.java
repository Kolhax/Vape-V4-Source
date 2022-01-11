package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.b.c;
import com.sun.jna.z.a.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;

public class d
{
  public d(i parami)
  {
    parami.a(a(c.a("do~$gcdoixkl~lexmo$ifcod~$o|od~$Ifcod~Ibk~Xoioc|onO|od~", 10)), new IEventListener()
    {
      public void invoke(Event paramAnonymousEvent)
      {
        try
        {
          Field localField1 = d.this.c(paramAnonymousEvent.getClass(), c.a("waasuw", 18));
          Object localObject1 = localField1.get(paramAnonymousEvent);
          Method localMethod1 = d.this.b(localObject1.getClass().getSuperclass(), c.a("h{`mQ?;><;:Qj", 14), new Class[0]);
          if (null == localMethod1) {
            localMethod1 = d.this.b(localObject1.getClass().getSuperclass(), c.a("tvgU|a~rggvwGvkg", 19), new Class[0]);
          }
          Object localObject2 = d.this.d(localObject1, localMethod1, new Object[0]);
          Method localMethod2 = d.this.b(d.this.a(c.a("yrer=r}t=@gaz}t", 19)), c.a("k{ob}", 14), new Class[] { d.this.a(c.a("gl{l#alcj#Boghny", 13)) });
          Method localMethod3 = d.this.b(d.this.a(c.a("v}j}2p}r{2Ohnur{", 28)), c.a("zmxdikm", 8), new Class[] { d.this.a(c.a("{pgp?}pv?RypcBt`dtrt", 17)), d.this.a(c.a("tct;yt{r;V}tgFpd`p{vp", 21)) });
          Object localObject3 = d.this.d(c.a("<j< 8<j< 8<j<)8<j<+8<j<+8<j</8<j< 8<j", 24), localMethod3, new Object[] { c.a("*", 14), "§" });
          Object localObject4 = d.this.d(localObject2, localMethod2, new Object[] { localObject3 });
          if (((Boolean)d.this.d(localObject4, d.this.b(localObject4.getClass(), c.a("obbahlc[laxh", 13), new Class[0]), new Object[0])).booleanValue())
          {
            Class localClass1 = d.this.a(c.a("tn4wstyh{|n4yvstn4Wstyh{|n", 26));
            Method localMethod4 = d.this.b(localClass1, c.a("kxcnR:<9<=Ru", 13), new Class[0]);
            Object localObject5 = d.this.d(null, localMethod4, new Object[0]);
            Field localField2 = d.this.c(localClass1, c.a("ifjckP8>;<6Ph", 15));
            Object localObject6 = localField2.get(localObject5);
            Field localField3 = d.this.c(localObject6.getClass(), c.a("anbkcX06603Xf", 7));
            Object localObject7 = localField3.get(localObject6);
            Method localMethod5 = d.this.b(localObject7.getClass(), c.a("`sheY7214?1Yg", 6), new Class[] { d.this.a(c.a("`kz cg`km|ohz `kzya|e ^omekz", 14)) });
            
            Class localClass2 = d.this.a(c.a("{pgp?}pv?Becxv", 17));
            Method localMethod6 = d.this.b(localClass2, c.a("ikzLwzk}", 14), new Class[0]);
            Object localObject8 = d.this.d(c.a("GDGBFJCH@NY", 11), localMethod6, new Object[0]);
            
            Class localClass3 = d.this.a(c.a("db#chyyt#oxkkh#Xc}bbahi", 13));
            Method localMethod7 = d.this.b(localClass3, c.a("svetta`Fqbbav", 4), new Class[] { d.this.a(c.a("SJ", 8)) });
            Object localObject9 = d.this.d(null, localMethod7, new Object[] { localObject8 });
            Class localClass4 = d.this.a(c.a("`kz cg`km|ohz `kzya|e ^omekzL{hhk|", 14));
            Constructor localConstructor1 = localClass4.getConstructor(new Class[] { d.this.a(c.a("{}<|wffk<pgttw`<PkfwPgt", 18)) });
            Object localObject10 = localConstructor1.newInstance(new Object[] { localObject9 });
            
            Class localClass5 = d.this.a(c.a("en%fbenhyjm%en|dy`%{gjr%hgbne%H:<[jh`nH~xdf[jrgdjo", 11));
            Constructor localConstructor2 = localClass5.getConstructor(new Class[] { d.this.a(c.a("tct;yt{r;Fag|{r", 21)), localClass4 });
            Object localObject11 = localConstructor2.newInstance(new Object[] { c.a("^]^[_SZQYW@", 18), localObject10 });
            d.this.d(localObject7, localMethod5, new Object[] { localObject11 });
          }
        }
        catch (Exception localException) {}
      }
    }, 1);
  }
  
  public Class a(String paramString)
  {
    try
    {
      Method localMethod1 = Class.class.getDeclaredMethod(c.a("kbCl`h", 13), new Class[] { String.class });
      localMethod1.setAccessible(true);
      Method localMethod2 = Method.class.getDeclaredMethod(c.a("ebzcgi", 12), new Class[] { Object.class, Object[].class });
      localMethod2.setAccessible(true);
      return (Class)localMethod2.invoke(localMethod1, new Object[] { null, { paramString } });
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Method b(Class paramClass, String paramString, Class... paramVarArgs)
  {
    try
    {
      Class localClass = a(c.a("doxo bo`i Mbo}}", 14));
      Method localMethod1 = localClass.getDeclaredMethod(c.a("uwfVwq~s`wv_wfz}v", 18), new Class[] { String.class, Class[].class });
      localMethod1.setAccessible(true);
      Method localMethod2 = localMethod1.getClass().getDeclaredMethod(c.a("fay`dj", 15), new Class[] { Object.class, Object[].class });
      localMethod2.setAccessible(true);
      Method localMethod3 = (Method)localMethod2.invoke(localMethod1, new Object[] { paramClass, { paramString, paramVarArgs } });
      localMethod3.setAccessible(true);
      return localMethod3;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Field c(Class paramClass, String paramString)
  {
    try
    {
      Class localClass = a(c.a("odsd+idkb+Fidvv", 5));
      Method localMethod1 = localClass.getDeclaredMethod(c.a("prcSrt{versQ~r{s", 23), new Class[] { String.class });
      localMethod1.setAccessible(true);
      Method localMethod2 = localMethod1.getClass().getDeclaredMethod(c.a("`gfbl", 9), new Class[] { Object.class, Object[].class });
      localMethod2.setAccessible(true);
      Field localField = (Field)localMethod2.invoke(localMethod1, new Object[] { paramClass, { paramString } });
      localField.setAccessible(true);
      return localField;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public Object d(Object paramObject, Method paramMethod, Object... paramVarArgs)
  {
    try
    {
      Method localMethod = paramMethod.getClass().getDeclaredMethod(c.a("{|d}yw", 18), new Class[] { Object.class, Object[].class });
      localMethod.setAccessible(true);
      return localMethod.invoke(paramMethod, new Object[] { paramObject, paramVarArgs });
    }
    catch (Exception localException) {}
    return null;
  }
}
