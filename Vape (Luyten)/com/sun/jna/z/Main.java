package com.sun.jna.z;

import java.net.*;
import java.util.concurrent.atomic.*;
import com.sun.jna.z.a.*;
import java.lang.reflect.*;
import java.util.*;
import java.security.*;
import sun.font.*;

public class Main
{
    public URLClassLoader a;
    public b b;
    public static Main c;
    boolean d;
    public AtomicBoolean e;
    i f;
    public static boolean g;
    private static final String[] h;
    
    public static void entry() {
        new Main();
    }
    
    private Main() {
        this.e = new AtomicBoolean(false);
        Main.c = this;
        this.a = (URLClassLoader)Main.class.getClassLoader();
        try {
            this.b = new b(this);
            this.f = new i();
            this.e.set(true);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
    
    void h() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: astore          a
        //     7: aload           a
        //     9: bipush          12
        //    11: aaload         
        //    12: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    15: astore_2       
        //    16: getstatic       com/sun/jna/z/Main.g:Z
        //    19: aload_2         /* a */
        //    20: iconst_1       
        //    21: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    24: istore_1        /* a */
        //    25: new             Ljava/util/HashSet;
        //    28: dup            
        //    29: sipush          1000
        //    32: invokespecial   java/util/HashSet.<init>:(I)V
        //    35: astore_3        /* a */
        //    36: aload_2         /* a */
        //    37: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //    40: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: checkcast       Ljava/util/Set;
        //    46: astore          a
        //    48: aload           a
        //    50: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    55: astore          5
        //    57: aload           5
        //    59: invokeinterface java/util/Iterator.hasNext:()Z
        //    64: ifeq            184
        //    67: aload           5
        //    69: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    74: checkcast       Ljava/lang/String;
        //    77: astore          a
        //    79: iload_1         /* a */
        //    80: ifne            197
        //    83: aload           a
        //    85: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //    88: astore          a
        //    90: aload           a
        //    92: iconst_2       
        //    93: aaload         
        //    94: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    97: iload_1         /* a */
        //    98: ifne            131
        //   101: goto            105
        //   104: athrow         
        //   105: ifne            180
        //   108: goto            112
        //   111: athrow         
        //   112: aload           a
        //   114: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   117: astore          a
        //   119: aload           a
        //   121: bipush          7
        //   123: aaload         
        //   124: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   127: goto            131
        //   130: athrow         
        //   131: iload_1         /* a */
        //   132: ifne            156
        //   135: ifne            180
        //   138: goto            142
        //   141: athrow         
        //   142: aload           a
        //   144: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   147: iconst_0       
        //   148: aaload         
        //   149: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   152: goto            156
        //   155: athrow         
        //   156: iload_1         /* a */
        //   157: ifne            179
        //   160: ifne            180
        //   163: goto            167
        //   166: athrow         
        //   167: aload_3         /* a */
        //   168: aload           a
        //   170: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   175: goto            179
        //   178: athrow         
        //   179: pop            
        //   180: iload_1         /* a */
        //   181: ifeq            57
        //   184: aload_2         /* a */
        //   185: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   188: aload_3         /* a */
        //   189: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   192: aload_2         /* a */
        //   193: iconst_0       
        //   194: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   197: return         
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  79     101    104    105    Ljava/lang/Exception;
        //  83     108    111    112    Ljava/lang/Exception;
        //  105    127    130    131    Ljava/lang/Exception;
        //  131    138    141    142    Ljava/lang/Exception;
        //  135    152    155    156    Ljava/lang/Exception;
        //  156    163    166    167    Ljava/lang/Exception;
        //  160    175    178    179    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void i() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: astore          a
        //     7: aload           a
        //     9: iconst_3       
        //    10: aaload         
        //    11: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    14: astore_2        /* a */
        //    15: aload_2         /* a */
        //    16: iconst_1       
        //    17: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    20: getstatic       com/sun/jna/z/Main.g:Z
        //    23: new             Ljava/util/Vector;
        //    26: dup            
        //    27: invokespecial   java/util/Vector.<init>:()V
        //    30: astore_3       
        //    31: istore_1        /* a */
        //    32: aload_2         /* a */
        //    33: aload_0         /* a */
        //    34: getfield        com/sun/jna/z/Main.a:Ljava/net/URLClassLoader;
        //    37: aload_3         /* a */
        //    38: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    41: ldc             Ljava/security/SecureClassLoader;.class
        //    43: aload           a
        //    45: iconst_5       
        //    46: aaload         
        //    47: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    50: astore          a
        //    52: aload           a
        //    54: iconst_1       
        //    55: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    58: aload           a
        //    60: aload_0         /* a */
        //    61: getfield        com/sun/jna/z/Main.a:Ljava/net/URLClassLoader;
        //    64: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    67: checkcast       Ljava/util/HashMap;
        //    70: astore          a
        //    72: aload           a
        //    74: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //    77: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    82: astore          6
        //    84: aload           6
        //    86: invokeinterface java/util/Iterator.hasNext:()Z
        //    91: ifeq            163
        //    94: aload           6
        //    96: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   101: checkcast       Ljava/security/ProtectionDomain;
        //   104: astore          a
        //   106: ldc             Ljava/security/ProtectionDomain;.class
        //   108: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   111: astore          a
        //   113: aload           a
        //   115: iconst_1       
        //   116: aaload         
        //   117: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   120: astore          a
        //   122: aload           a
        //   124: iconst_1       
        //   125: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   128: aload           a
        //   130: iload_1         /* a */
        //   131: ifne            174
        //   134: aload           a
        //   136: aconst_null    
        //   137: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   140: iload_1         /* a */
        //   141: ifeq            84
        //   144: goto            148
        //   147: athrow         
        //   148: getstatic       com/sun/jna/z/a/j.g:Z
        //   151: ifeq            159
        //   154: iconst_0       
        //   155: goto            160
        //   158: athrow         
        //   159: iconst_1       
        //   160: putstatic       com/sun/jna/z/a/j.g:Z
        //   163: ldc             Ljava/lang/ClassLoader;.class
        //   165: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   168: bipush          8
        //   170: aaload         
        //   171: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   174: astore          a
        //   176: aload           a
        //   178: iconst_1       
        //   179: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   182: aload           a
        //   184: aload_0         /* a */
        //   185: getfield        com/sun/jna/z/Main.a:Ljava/net/URLClassLoader;
        //   188: aconst_null    
        //   189: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   192: aload_0         /* a */
        //   193: ldc             Lcom/sun/jna/z/Main;.class
        //   195: invokevirtual   com/sun/jna/z/Main.a:(Ljava/lang/Class;)V
        //   198: aload_0         /* a */
        //   199: ldc             Lcom/sun/jna/z/a/d/b;.class
        //   201: invokevirtual   com/sun/jna/z/Main.a:(Ljava/lang/Class;)V
        //   204: return         
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  122    144    147    148    Ljava/lang/Exception;
        //  148    158    158    159    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void a(final Class a) throws Exception {
        final Package a2 = a.getPackage();
        final Field a3 = Package.class.getDeclaredField(Main.h[13]);
        a3.setAccessible(true);
        a3.set(a2, null);
    }
    
    void j() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: astore          a
        //     7: aload           a
        //     9: bipush          6
        //    11: aaload         
        //    12: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    15: astore_2       
        //    16: getstatic       com/sun/jna/z/Main.g:Z
        //    19: aload_2         /* a */
        //    20: iconst_1       
        //    21: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    24: aload_2         /* a */
        //    25: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //    28: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    31: checkcast       Ljava/util/Set;
        //    34: astore_3       
        //    35: istore_1        /* a */
        //    36: aload_3         /* a */
        //    37: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    42: astore          4
        //    44: aload           4
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            163
        //    54: aload           4
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: checkcast       Ljava/lang/String;
        //    64: astore          a
        //    66: aload           a
        //    68: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //    71: astore          a
        //    73: aload           a
        //    75: iconst_2       
        //    76: aaload         
        //    77: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    80: iload_1         /* a */
        //    81: ifne            158
        //    84: ifne            146
        //    87: goto            91
        //    90: athrow         
        //    91: aload           a
        //    93: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //    96: astore          a
        //    98: aload           a
        //   100: bipush          7
        //   102: aaload         
        //   103: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   106: iload_1         /* a */
        //   107: ifne            158
        //   110: goto            114
        //   113: athrow         
        //   114: ifne            146
        //   117: goto            121
        //   120: athrow         
        //   121: aload           a
        //   123: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   126: iconst_0       
        //   127: aaload         
        //   128: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   131: iload_1         /* a */
        //   132: ifne            158
        //   135: goto            139
        //   138: athrow         
        //   139: ifeq            159
        //   142: goto            146
        //   145: athrow         
        //   146: aload_3         /* a */
        //   147: aload           a
        //   149: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   154: goto            158
        //   157: athrow         
        //   158: pop            
        //   159: iload_1         /* a */
        //   160: ifeq            44
        //   163: return         
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  66     87     90     91     Ljava/lang/Exception;
        //  84     110    113    114    Ljava/lang/Exception;
        //  91     117    120    121    Ljava/lang/Exception;
        //  114    135    138    139    Ljava/lang/Exception;
        //  121    142    145    146    Ljava/lang/Exception;
        //  139    154    157    158    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void k() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: astore          a
        //     7: aload           a
        //     9: bipush          11
        //    11: aaload         
        //    12: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    15: astore_2        /* a */
        //    16: aload_2         /* a */
        //    17: iconst_1       
        //    18: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    21: getstatic       com/sun/jna/z/Main.g:Z
        //    24: aload_2         /* a */
        //    25: aconst_null    
        //    26: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: checkcast       Lcom/google/common/collect/ImmutableList;
        //    32: astore_3        /* a */
        //    33: aload_3         /* a */
        //    34: invokevirtual   com/google/common/collect/ImmutableList.iterator:()Lcom/google/common/collect/UnmodifiableIterator;
        //    37: astore          4
        //    39: istore_1        /* a */
        //    40: aload           4
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            234
        //    50: aload           4
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: checkcast       Lnet/minecraftforge/fml/common/eventhandler/ListenerList;
        //    60: astore          a
        //    62: aload           a
        //    64: iconst_0       
        //    65: invokevirtual   net/minecraftforge/fml/common/eventhandler/ListenerList.getListeners:(I)[Lnet/minecraftforge/fml/common/eventhandler/IEventListener;
        //    68: astore          a
        //    70: aload           a
        //    72: arraylength    
        //    73: istore          a
        //    75: iconst_0       
        //    76: istore          a
        //    78: iload           a
        //    80: iload           a
        //    82: if_icmpge       150
        //    85: aload           a
        //    87: iload           a
        //    89: aaload         
        //    90: astore          a
        //    92: iload_1         /* a */
        //    93: ifne            146
        //    96: aload           a
        //    98: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   101: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   104: astore          a
        //   106: aload           a
        //   108: iconst_2       
        //   109: aaload         
        //   110: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   113: iload_1         /* a */
        //   114: ifne            164
        //   117: goto            121
        //   120: athrow         
        //   121: ifeq            143
        //   124: goto            128
        //   127: athrow         
        //   128: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   131: aload           a
        //   133: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   136: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   139: goto            143
        //   142: athrow         
        //   143: iinc            a, 1
        //   146: iload_1         /* a */
        //   147: ifeq            78
        //   150: aload           a
        //   152: iconst_1       
        //   153: invokevirtual   net/minecraftforge/fml/common/eventhandler/ListenerList.getListeners:(I)[Lnet/minecraftforge/fml/common/eventhandler/IEventListener;
        //   156: astore          a
        //   158: aload           a
        //   160: arraylength    
        //   161: istore          a
        //   163: iconst_0       
        //   164: istore          a
        //   166: iload           a
        //   168: iload           a
        //   170: if_icmpge       230
        //   173: aload           a
        //   175: iload           a
        //   177: aaload         
        //   178: astore          a
        //   180: iload_1         /* a */
        //   181: ifne            226
        //   184: aload           a
        //   186: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   189: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   192: iconst_2       
        //   193: aaload         
        //   194: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   197: iload_1         /* a */
        //   198: ifne            47
        //   201: goto            205
        //   204: athrow         
        //   205: ifeq            223
        //   208: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   211: aload           a
        //   213: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   216: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   219: goto            223
        //   222: athrow         
        //   223: iinc            a, 1
        //   226: iload_1         /* a */
        //   227: ifeq            166
        //   230: iload_1         /* a */
        //   231: ifeq            40
        //   234: return         
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  92     117    120    121    Ljava/lang/Exception;
        //  96     124    127    128    Ljava/lang/Exception;
        //  121    139    142    143    Ljava/lang/Exception;
        //  180    201    204    205    Ljava/lang/Exception;
        //  205    219    222    223    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void l() throws Exception {
        final int g = Main.g ? 1 : 0;
        final Field a = Enum.class.getDeclaredField(Main.h[14]);
        a.setAccessible(true);
        final int a2 = g;
        final com.sun.jna.z.a.e.b[] a3 = com.sun.jna.z.a.e.b.values();
        final int a4 = a3.length;
        int a5 = 0;
        while (a5 < a4) {
            final com.sun.jna.z.a.e.b a6 = a3[a5];
            a.set(a6, null);
            ++a5;
            if (a2 != 0) {
                break;
            }
        }
    }
    
    void m() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: astore          a
        //     7: aload           a
        //     9: bipush          15
        //    11: aaload         
        //    12: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    15: astore_2        /* a */
        //    16: getstatic       com/sun/jna/z/Main.g:Z
        //    19: aload_2         /* a */
        //    20: iconst_1       
        //    21: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    24: aload_2         /* a */
        //    25: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //    28: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    31: checkcast       Ljava/util/Map;
        //    34: astore_3        /* a */
        //    35: aload_3         /* a */
        //    36: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    41: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    46: astore          4
        //    48: istore_1        /* a */
        //    49: aload           4
        //    51: invokeinterface java/util/Iterator.hasNext:()Z
        //    56: ifeq            181
        //    59: aload           4
        //    61: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    66: checkcast       Ljava/lang/Package;
        //    69: astore          a
        //    71: aload           a
        //    73: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //    76: iload_1         /* a */
        //    77: ifne            176
        //    80: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //    83: astore          a
        //    85: aload           a
        //    87: iconst_2       
        //    88: aaload         
        //    89: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    92: ifne            164
        //    95: goto            99
        //    98: athrow         
        //    99: aload           a
        //   101: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //   104: iload_1         /* a */
        //   105: ifne            176
        //   108: goto            112
        //   111: athrow         
        //   112: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   115: astore          a
        //   117: aload           a
        //   119: bipush          7
        //   121: aaload         
        //   122: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   125: ifne            164
        //   128: goto            132
        //   131: athrow         
        //   132: aload           a
        //   134: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //   137: iload_1         /* a */
        //   138: ifne            176
        //   141: goto            145
        //   144: athrow         
        //   145: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   148: astore          a
        //   150: aload           a
        //   152: iconst_0       
        //   153: aaload         
        //   154: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   157: ifeq            177
        //   160: goto            164
        //   163: athrow         
        //   164: aload_3         /* a */
        //   165: aload           a
        //   167: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   172: goto            176
        //   175: athrow         
        //   176: pop            
        //   177: iload_1         /* a */
        //   178: ifeq            49
        //   181: ldc             Ljava/lang/ClassLoader;.class
        //   183: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   186: astore          a
        //   188: aload           a
        //   190: bipush          9
        //   192: aaload         
        //   193: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   196: astore          a
        //   198: aload           a
        //   200: iconst_1       
        //   201: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   204: aload           a
        //   206: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   209: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   212: checkcast       Ljava/util/HashMap;
        //   215: astore          a
        //   217: new             Ljava/util/HashMap;
        //   220: dup            
        //   221: invokespecial   java/util/HashMap.<init>:()V
        //   224: astore          a
        //   226: aload           a
        //   228: invokevirtual   java/util/HashMap.keySet:()Ljava/util/Set;
        //   231: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   236: astore          7
        //   238: aload           7
        //   240: invokeinterface java/util/Iterator.hasNext:()Z
        //   245: ifeq            371
        //   248: aload           7
        //   250: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   255: checkcast       Ljava/lang/String;
        //   258: astore          a
        //   260: iload_1         /* a */
        //   261: ifne            381
        //   264: aload           a
        //   266: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   269: astore          a
        //   271: aload           a
        //   273: iconst_2       
        //   274: aaload         
        //   275: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   278: iload_1         /* a */
        //   279: ifne            312
        //   282: goto            286
        //   285: athrow         
        //   286: ifne            367
        //   289: goto            293
        //   292: athrow         
        //   293: aload           a
        //   295: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   298: astore          a
        //   300: aload           a
        //   302: bipush          7
        //   304: aaload         
        //   305: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   308: goto            312
        //   311: athrow         
        //   312: iload_1         /* a */
        //   313: ifne            345
        //   316: ifne            367
        //   319: goto            323
        //   322: athrow         
        //   323: aload           a
        //   325: iload_1         /* a */
        //   326: ifne            366
        //   329: goto            333
        //   332: athrow         
        //   333: getstatic       com/sun/jna/z/Main.h:[Ljava/lang/String;
        //   336: iconst_0       
        //   337: aaload         
        //   338: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   341: goto            345
        //   344: athrow         
        //   345: ifne            367
        //   348: aload           a
        //   350: aload           a
        //   352: aload           a
        //   354: aload           a
        //   356: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   359: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   362: goto            366
        //   365: athrow         
        //   366: pop            
        //   367: iload_1         /* a */
        //   368: ifeq            238
        //   371: aload           a
        //   373: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   376: aload           a
        //   378: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   381: getstatic       com/sun/jna/z/a/j.g:Z
        //   384: ifeq            404
        //   387: iload_1         /* a */
        //   388: ifeq            400
        //   391: goto            395
        //   394: athrow         
        //   395: iconst_0       
        //   396: goto            401
        //   399: athrow         
        //   400: iconst_1       
        //   401: putstatic       com/sun/jna/z/Main.g:Z
        //   404: return         
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  71     95     98     99     Ljava/lang/Exception;
        //  80     108    111    112    Ljava/lang/Exception;
        //  99     128    131    132    Ljava/lang/Exception;
        //  112    141    144    145    Ljava/lang/Exception;
        //  132    160    163    164    Ljava/lang/Exception;
        //  145    172    175    176    Ljava/lang/Exception;
        //  260    282    285    286    Ljava/lang/Exception;
        //  264    289    292    293    Ljava/lang/Exception;
        //  286    308    311    312    Ljava/lang/Exception;
        //  312    319    322    323    Ljava/lang/Exception;
        //  316    329    332    333    Ljava/lang/Exception;
        //  323    341    344    345    Ljava/lang/Exception;
        //  345    362    365    366    Ljava/lang/Exception;
        //  381    391    394    395    Ljava/lang/Exception;
        //  387    399    399    400    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0099:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void n() throws Exception {
        final Field a = ClassLoader.class.getDeclaredField(Main.h[10]);
        a.setAccessible(true);
        final Set<ProtectionDomain> a2 = (Set<ProtectionDomain>)a.get(this.a);
        a2.clear();
    }
    
    void o() throws Exception {
        final Field a = GlyphLayout.class.getDeclaredField(Main.h[4]);
        a.setAccessible(true);
        a.set(null, null);
    }
    
    private static native void freeLib();
    
    static void access$000() {
        freeLib();
    }
    
    static {
        final String[] h2 = new String[16];
        int n = 0;
        String s;
        int n2 = (s = "\\Z¡\u00e8\u0091K\u00e4WI±¨\u000bPD§µ\u008cB\u00fcRL£´\u0003YF§\u0007PD§µ\u008cK\u00e0\u0005PI¥®\u009a\u0007CL¥§\u009cF\u00f6\u0015]M¡§\u008bG\u00e5Vz£µ\u0090[\u00e1PM\u0085§\u009cF\u00f6\u0002^L\rWM §\u008aB\u00e7wG«§\u0096@\bCI¥\u00ad\u009eI\u00f6@\u0007WG«§\u0096@\u00e0\bRDª\u008a\u0096]\u00e7@\u000eZF°§\u0093G\u00f7pD§µ\u008cK\u00e0\u0006_G§¢\u009a\\").length();
        int n3 = 11;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0248: {
                            if (n7 > 1) {
                                break Label_0248;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '3';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '(';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00c6';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u00c6';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u00ff';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '.';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0093';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n9;
                            } while (n7 == 0);
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            h2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "]I«£\u0010CI¥\u00ad\u009eI\u00f6~I¨¯\u0099K\u00e0G[").length();
                            n3 = 4;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            h2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    ++n4;
                    final String s4 = s;
                    final int n10 = n4;
                    s3 = s4.substring(n10, n10 + n3);
                    n6 = 0;
                }
            }
            break;
        }
        h = h2;
    }
}
