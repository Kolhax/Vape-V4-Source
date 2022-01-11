package com.sun.jna.z.a.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class e
{
  public Socket a;
  public PrintWriter b;
  public BufferedReader c;
  public boolean d = true;
  public static int e;
  private static final String[] f;
  
  public String b()
  {
    try
    {
      return a.c.readLine();
    }
    catch (IOException localIOException) {}
    return "";
  }
  
  public void d()
  {
    a.b.write(2);a.b.close();
    try
    {
      a.c.close();
      
      a.a.close();
    }
    catch (IOException a)
    {
      a.printStackTrace();
    }
  }
  
  public void a(String a)
  {
    a.b.println(c.a(a, 10));a.b.flush();
  }
  
  public String c()
  {
    try
    {
      return a.b(a.c.readLine());
    }
    catch (IOException localIOException) {}
    return "";
  }
  
  public void b(String a)
  {
    a.b.println(a.a(a));
    
    a.b.flush();
  }
  
  public void a(int a)
  {
    a.b.write(a);
    
    a.b.flush();
  }
  
  public void c(String a)
  {
    a.b.println(a);a.b.flush();
  }
  
  public String a()
    throws IOException
  {
    String a = c.a(a.c.readLine(), 10);
    
    return a;
  }
}
