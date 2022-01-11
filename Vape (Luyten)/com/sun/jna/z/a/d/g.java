package com.sun.jna.z.a.d;

import net.minecraftforge.fml.common.eventhandler.*;

public class g implements IEventListener
{
    public void invoke(final Event a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1         /* a */
        //     4: checkcast       Lnet/minecraftforge/client/event/RenderHandEvent;
        //     7: astore_3       
        //     8: istore_2        /* a */
        //     9: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //    12: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //    15: getfield        com/sun/jna/z/a/e/g.a:Ljava/util/Map;
        //    18: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    23: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    28: astore          4
        //    30: aload           4
        //    32: invokeinterface java/util/Iterator.hasNext:()Z
        //    37: ifeq            91
        //    40: aload           4
        //    42: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    47: checkcast       Lcom/sun/jna/z/a/e/c;
        //    50: astore          a
        //    52: aload           a
        //    54: iload_2         /* a */
        //    55: ifne            66
        //    58: invokevirtual   com/sun/jna/z/a/e/c.c:()Z
        //    61: ifeq            73
        //    64: aload           a
        //    66: aload_3         /* a */
        //    67: getfield        net/minecraftforge/client/event/RenderHandEvent.partialTicks:F
        //    70: invokevirtual   com/sun/jna/z/a/e/c.a:(F)V
        //    73: iload_2         /* a */
        //    74: ifeq            30
        //    77: getstatic       com/sun/jna/z/a/j.g:Z
        //    80: ifeq            87
        //    83: iconst_0       
        //    84: goto            88
        //    87: iconst_1       
        //    88: putstatic       com/sun/jna/z/a/j.g:Z
        //    91: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    94: astore          a
        //    96: aload           a
        //    98: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   101: getfield        net/minecraft/client/settings/GameSettings.field_74336_f:Z
        //   104: istore          a
        //   106: aload           a
        //   108: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   111: iconst_0       
        //   112: putfield        net/minecraft/client/settings/GameSettings.field_74336_f:Z
        //   115: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //   118: getfield        com/sun/jna/z/a/i.j:Lcom/sun/jna/z/a/g/n;
        //   121: aload_3         /* a */
        //   122: getfield        net/minecraftforge/client/event/RenderHandEvent.partialTicks:F
        //   125: aload_3         /* a */
        //   126: getfield        net/minecraftforge/client/event/RenderHandEvent.renderPass:I
        //   129: invokevirtual   com/sun/jna/z/a/g/n.a:(FI)V
        //   132: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //   135: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //   138: getfield        com/sun/jna/z/a/e/g.a:Ljava/util/Map;
        //   141: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   146: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   151: astore          6
        //   153: aload           6
        //   155: invokeinterface java/util/Iterator.hasNext:()Z
        //   160: ifeq            204
        //   163: aload           6
        //   165: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   170: checkcast       Lcom/sun/jna/z/a/e/c;
        //   173: astore          a
        //   175: iload_2         /* a */
        //   176: ifne            214
        //   179: aload           a
        //   181: iload_2         /* a */
        //   182: ifne            193
        //   185: invokevirtual   com/sun/jna/z/a/e/c.c:()Z
        //   188: ifeq            200
        //   191: aload           a
        //   193: aload_3         /* a */
        //   194: getfield        net/minecraftforge/client/event/RenderHandEvent.partialTicks:F
        //   197: invokevirtual   com/sun/jna/z/a/e/c.b:(F)V
        //   200: iload_2         /* a */
        //   201: ifeq            153
        //   204: aload           a
        //   206: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   209: iload           a
        //   211: putfield        net/minecraft/client/settings/GameSettings.field_74336_f:Z
        //   214: return         
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
}
