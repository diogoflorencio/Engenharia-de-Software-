package randoop;

import junit.framework.*;

public class RandoopTest4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test1");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var4 = new Stude.Cronograma();
    java.util.List var5 = var4.getDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var4.getDisciplina("hi!");
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var4.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var4.addDisciplina(var16);
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var21 = var20.toString();
    var20.setCor(15);
    var20.setCor(10);
    var4.addDisciplina(var20);
    java.lang.String var27 = var20.getNome();
    java.lang.String var28 = var20.toString();
    Stude.Stude var30 = new Stude.Stude("hi!");
    int var31 = var30.intervalo();
    Stude.Usuario var32 = var30.getUsuario();
    int var33 = var30.tempoDeEstudo();
    java.util.HashMap var34 = var30.desempenho();
    Stude.MetodoDeEstudo var35 = var30.getMetodoDeEstudo();
    Stude.Cronograma var36 = var30.getCronograma();
    java.util.List var37 = var36.getDisciplinas();
    int var38 = var36.tamanhoDisciplinas();
    Stude.Cronograma var39 = new Stude.Cronograma();
    Stude.Disciplina var41 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var43 = var39.getDisciplina("");
    Stude.Cronograma var44 = new Stude.Cronograma();
    java.util.List var45 = var44.getDisciplinas();
    Stude.Disciplina var47 = var44.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var49 = var44.getDisciplina("hi!");
    Stude.Disciplina var52 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var44.addDisciplina(var52);
    int var54 = var52.getCor();
    var39.addDisciplina(var52);
    var52.setNome("hi!");
    java.lang.String var58 = var52.toString();
    var36.addDisciplina(var52);
    boolean var60 = var20.equals((java.lang.Object)var52);
    var0.addDisciplina(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var63 = var0.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test2");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getNome();
    java.lang.String var14 = var11.toString();
    int var15 = var11.getCor();
    var11.setCor((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test3");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test4");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var5 = var1.getUsuario();
    java.lang.String var6 = var5.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test5");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    Stude.Disciplina var18 = var1.getDisciplina("");
    Stude.MetodoDeEstudo var19 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test6");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Disciplina var12 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test7");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test8");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.List var9 = var1.getDisciplinas();
    Stude.Disciplina var11 = var1.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test9");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var28 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var30 = var0.getDisciplina("");
    Stude.Disciplina var32 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test10");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    int var8 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Usuario var10 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test11");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    java.lang.String var17 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test12");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    var6.setNome("Metodo de estudo regular");
    var6.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test13");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test14");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test15");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    var9.addHorasDeEstudo(100.0d);
    double var24 = var9.getHorasEstudadas();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var27.setCor((-1));
    java.lang.String var30 = var27.getNome();
    var27.setCor((-1));
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var36 = var35.toString();
    var35.setCor(15);
    java.lang.String var39 = var35.getNome();
    Stude.Cronograma var40 = new Stude.Cronograma();
    Stude.Disciplina var42 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var40.getDisciplina("");
    java.util.List var45 = var40.getDisciplinas();
    boolean var46 = var35.equals((java.lang.Object)var40);
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var50 = var49.toString();
    Stude.Stude var52 = new Stude.Stude("hi!");
    var52.setMetodoAvancado();
    Stude.MetodoDeEstudo var54 = var52.getMetodoDeEstudo();
    java.util.HashMap var55 = var52.desempenho();
    var52.setMetodoRegular();
    Stude.MetodoDeEstudo var57 = var52.getMetodoDeEstudo();
    var52.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var60 = var52.desempenho();
    boolean var61 = var49.equals((java.lang.Object)var60);
    var40.addDisciplina(var49);
    boolean var63 = var27.equals((java.lang.Object)var40);
    boolean var64 = var9.equals((java.lang.Object)var40);
    double var65 = var9.getHorasEstudadas();
    int var66 = var9.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo avancado"+ "'", var36.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 100);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test16");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    double var8 = var2.getHorasEstudadas();
    var2.setCor(10);
    java.lang.String var11 = var2.toString();
    int var12 = var2.getCor();
    java.lang.String var13 = var2.getNome();
    int var14 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test17");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setNome("Metodo de estudo regular");
    int var13 = var7.getCor();
    var2.addDisciplina(var7);
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.addHorasDeEstudo(10.0d);
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = var17.getNome();
    Stude.Cronograma var22 = new Stude.Cronograma();
    Stude.Disciplina var24 = var22.getDisciplina("Metodo de estudo regular");
    boolean var25 = var17.equals((java.lang.Object)"Metodo de estudo regular");
    var17.addHorasDeEstudo(10.0d);
    var17.addHorasDeEstudo(1.0d);
    Stude.Regular var30 = new Stude.Regular();
    int var31 = var30.getTempo();
    java.lang.String var32 = var30.toString();
    int var33 = var30.getIntervalo();
    java.lang.String var34 = var30.toString();
    int var35 = var30.getIntervalo();
    int var36 = var30.getIntervalo();
    int var37 = var30.getTempo();
    int var38 = var30.getIntervalo();
    int var39 = var30.getIntervalo();
    java.lang.String var40 = var30.toString();
    java.lang.String var41 = var30.toString();
    int var42 = var30.getIntervalo();
    int var43 = var30.getTempo();
    boolean var44 = var17.equals((java.lang.Object)var30);
    Stude.Stude var46 = new Stude.Stude("hi!");
    var46.setMetodoAvancado();
    Stude.MetodoDeEstudo var48 = var46.getMetodoDeEstudo();
    Stude.Usuario var49 = var46.getUsuario();
    boolean var50 = var17.equals((java.lang.Object)var49);
    var2.addDisciplina(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo regular"+ "'", var21.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test18");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    var1.addDisciplina("hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test19");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test20");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.tempoDeEstudo();
    java.util.List var6 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test21");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test22");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Usuario var4 = var1.getUsuario();
    java.util.HashMap var5 = var1.desempenho();
    int var6 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test23");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    var0.addDisciplina(var10);
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 30);
    var20.setCor(2);
    int var23 = var20.getCor();
    java.lang.String var24 = var20.toString();
    java.lang.String var25 = var20.toString();
    double var26 = var20.getHorasEstudadas();
    var0.addDisciplina(var20);
    double var28 = var20.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test24");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    Stude.Stude var79 = new Stude.Stude("hi!");
    int var80 = var79.intervalo();
    Stude.Usuario var81 = var79.getUsuario();
    int var82 = var79.tempoDeEstudo();
    java.util.HashMap var83 = var79.desempenho();
    Stude.MetodoDeEstudo var84 = var79.getMetodoDeEstudo();
    java.util.List var85 = var79.getDisciplinas();
    boolean var86 = var69.equals((java.lang.Object)var79);
    Stude.Cronograma var87 = var79.getCronograma();
    Stude.Cronograma var88 = var79.getCronograma();
    java.util.HashMap var89 = var79.desempenho();
    var79.addDisciplina("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test25");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test26");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test27");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var12.getCor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test28");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    int var26 = var23.getCor();
    var23.addHorasDeEstudo(1.0d);
    java.lang.String var29 = var23.getNome();
    Stude.Disciplina var32 = new Stude.Disciplina("hi!", 30);
    boolean var33 = var23.equals((java.lang.Object)var32);
    java.lang.String var34 = var23.toString();
    var3.addDisciplina(var23);
    java.util.List var36 = var3.getDisciplinas();
    Stude.Disciplina var38 = var3.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var40 = var3.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test29");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    var2.setNome("hi!");
    java.lang.String var16 = var2.getNome();
    var2.addHorasDeEstudo(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test30");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var10 = var1.getUsuario();
    java.util.HashMap var11 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test31");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    java.util.List var57 = var7.getDisciplinas();
    int var58 = var7.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test32");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    int var16 = var13.getCor();
    var13.addHorasDeEstudo(1.0d);
    java.lang.String var19 = var13.toString();
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    int var27 = var24.tempoDeEstudo();
    java.util.List var28 = var24.getDisciplinas();
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var30 = var24.getMetodoDeEstudo();
    java.util.List var31 = var24.getDisciplinas();
    var24.setNomeUsuario("Metodo de estudo avancado");
    boolean var34 = var13.equals((java.lang.Object)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test33");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    int var15 = var13.getCor();
    var0.addDisciplina(var13);
    Stude.Usuario var18 = new Stude.Usuario("Metodo de estudo avancado");
    var18.setNome("Metodo de estudo regular");
    boolean var21 = var13.equals((java.lang.Object)var18);
    java.lang.String var22 = var13.getNome();
    var13.addHorasDeEstudo(21.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test34");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setCor(15);
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    java.util.HashMap var12 = var9.desempenho();
    var9.setMetodoRegular();
    java.util.List var14 = var9.getDisciplinas();
    java.util.HashMap var15 = var9.desempenho();
    int var16 = var9.intervalo();
    Stude.MetodoDeEstudo var17 = var9.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var17);
    Stude.Stude var20 = new Stude.Stude("hi!");
    var20.setMetodoAvancado();
    Stude.MetodoDeEstudo var22 = var20.getMetodoDeEstudo();
    java.util.HashMap var23 = var20.desempenho();
    var20.setMetodoRegular();
    Stude.MetodoDeEstudo var25 = var20.getMetodoDeEstudo();
    int var26 = var20.tempoDeEstudo();
    Stude.Disciplina var28 = var20.getDisciplina("Metodo de estudo avancado");
    int var29 = var20.tempoDeEstudo();
    boolean var30 = var2.equals((java.lang.Object)var20);
    int var31 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 15);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test35");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.tempoDeEstudo();
    java.util.HashMap var6 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test36");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test37");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test38");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 2);
    int var3 = var2.getCor();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    var6.addHorasDeEstudo(10.0d);
    java.lang.String var11 = var6.getNome();
    var6.setNome("Metodo de estudo regular");
    boolean var14 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test39");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test40");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test41");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    java.util.HashMap var10 = var1.desempenho();
    var1.addDisciplina("hi!", (-1));
    Stude.Disciplina var15 = var1.getDisciplina("");
    Stude.Usuario var16 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test42");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test43");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    java.lang.String var18 = var15.toString();
    var15.addHorasDeEstudo(1.0d);
    var15.setCor(100);
    int var23 = var15.getCor();
    double var24 = var15.getHorasEstudadas();
    var15.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test44");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Disciplina var4 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test45");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test46");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 2);
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test47");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test48");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    Stude.Disciplina var7 = var3.getDisciplina("");
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    java.lang.String var14 = var10.getNome();
    int var15 = var10.getCor();
    Stude.Stude var17 = new Stude.Stude("hi!");
    Stude.Cronograma var18 = var17.getCronograma();
    int var19 = var17.tempoDeEstudo();
    var17.setMetodoAvancado();
    var17.setNomeUsuario("hi!");
    java.util.HashMap var23 = var17.desempenho();
    boolean var24 = var10.equals((java.lang.Object)var23);
    var3.addDisciplina(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test49");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    java.util.List var10 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.List var15 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test50");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.intervalo();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test51");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    int var15 = var13.getCor();
    var0.addDisciplina(var13);
    java.lang.String var17 = var13.getNome();
    java.lang.String var18 = var13.getNome();
    java.lang.String var19 = var13.getNome();
    java.lang.String var20 = var13.getNome();
    var13.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test52");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    Stude.Disciplina var6 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var8 = var3.getDisciplina("hi!");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var3.addDisciplina(var11);
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var3.addDisciplina(var15);
    int var17 = var3.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var21 = var20.toString();
    var20.setCor(15);
    var20.setNome("Metodo de estudo regular");
    int var26 = var20.getCor();
    var3.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = var0.getDisciplina("hi!");
    Stude.Disciplina var32 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var33 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test53");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    var9.addHorasDeEstudo(100.0d);
    double var24 = var9.getHorasEstudadas();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var28 = var27.toString();
    java.lang.String var29 = var27.getNome();
    double var30 = var27.getHorasEstudadas();
    boolean var31 = var9.equals((java.lang.Object)var27);
    int var32 = var27.getCor();
    java.lang.String var33 = var27.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo avancado"+ "'", var29.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test54");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test55");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setCor(1);
    int var12 = var2.getCor();
    double var13 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test56");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test57");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    double var8 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(20.0d);
    java.lang.String var11 = var2.toString();
    java.lang.String var12 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test58");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    Stude.Disciplina var7 = var3.getDisciplina("Metodo de estudo regular");
    java.util.List var8 = var3.getDisciplinas();
    int var9 = var3.tamanhoDisciplinas();
    Stude.Disciplina var11 = var3.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test59");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test60");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var10 = var1.getUsuario();
    java.lang.String var11 = var10.getNome();
    var10.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test61");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    var2.setCor(3);
    double var7 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test62");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.List var21 = var1.getDisciplinas();
    Stude.Usuario var22 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test63");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addDisciplina(var13);
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.setCor((-1));
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var25 = var20.getNome();
    var20.setNome("Metodo de estudo regular");
    var9.addDisciplina(var20);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.setCor((-1));
    int var34 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    java.lang.String var37 = var31.getNome();
    int var38 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    var31.addHorasDeEstudo(1.0d);
    var9.addDisciplina(var31);
    Stude.Disciplina var46 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var47 = new Stude.Cronograma();
    java.util.List var48 = var47.getDisciplinas();
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var48);
    boolean var50 = var46.equals((java.lang.Object)var49);
    var46.addHorasDeEstudo(1.0d);
    var46.addHorasDeEstudo(10.0d);
    var46.setCor(100);
    var9.addDisciplina(var46);
    int var58 = var46.getCor();
    int var59 = var46.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 100);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test64");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test65");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var12.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.addHorasDeEstudo(10.0d);
    java.lang.String var19 = var16.toString();
    java.lang.String var20 = var16.getNome();
    int var21 = var16.getCor();
    var12.addDisciplina(var16);
    Stude.Disciplina var24 = var12.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test66");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    var2.addHorasDeEstudo(20.0d);
    int var7 = var2.getCor();
    java.lang.String var8 = var2.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test67");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test68");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    int var8 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test69");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test70");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    Stude.Stude var14 = new Stude.Stude("hi!");
    var14.setMetodoAvancado();
    Stude.MetodoDeEstudo var16 = var14.getMetodoDeEstudo();
    java.util.HashMap var17 = var14.desempenho();
    var14.setMetodoRegular();
    java.util.List var19 = var14.getDisciplinas();
    java.util.HashMap var20 = var14.desempenho();
    int var21 = var14.intervalo();
    Stude.Cronograma var22 = var14.getCronograma();
    Stude.Cronograma var23 = var14.getCronograma();
    Stude.Disciplina var25 = var14.getDisciplina("");
    java.util.List var26 = var14.getDisciplinas();
    boolean var27 = var10.equals((java.lang.Object)var14);
    var0.addDisciplina(var10);
    boolean var30 = var0.removeDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test71");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var16 = var7.getDisciplina("");
    Stude.Cronograma var17 = new Stude.Cronograma();
    java.util.List var18 = var17.getDisciplinas();
    Stude.Disciplina var20 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var17.getDisciplina("hi!");
    java.util.List var23 = var17.getDisciplinas();
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.setCor((-1));
    int var29 = var26.getCor();
    var26.addHorasDeEstudo(1.0d);
    java.lang.String var32 = var26.getNome();
    var17.addDisciplina(var26);
    var7.addDisciplina(var26);
    var26.setNome("Metodo de estudo avancado");
    int var37 = var26.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test72");


    Stude.Usuario var1 = new Stude.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("Metodo de estudo regular");
    var1.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test73");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.addDisciplina(var20);
    int var22 = var20.getCor();
    var7.addDisciplina(var20);
    java.lang.String var24 = var20.getNome();
    java.lang.String var25 = var20.getNome();
    java.lang.String var26 = var20.getNome();
    var20.setNome("hi!");
    java.lang.String var29 = var20.getNome();
    java.lang.String var30 = var20.toString();
    var0.addDisciplina(var20);
    java.lang.String var32 = var20.getNome();
    boolean var34 = var20.equals((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test74");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test75");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test76");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo avancado");
    int var13 = var0.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.setCor((-1));
    int var19 = var16.getCor();
    var16.addHorasDeEstudo(1.0d);
    double var22 = var16.getHorasEstudadas();
    java.lang.String var23 = var16.toString();
    Stude.Stude var25 = new Stude.Stude("hi!");
    int var26 = var25.intervalo();
    Stude.Usuario var27 = var25.getUsuario();
    Stude.Cronograma var28 = var25.getCronograma();
    var25.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var31 = var25.desempenho();
    Stude.MetodoDeEstudo var32 = var25.getMetodoDeEstudo();
    boolean var33 = var16.equals((java.lang.Object)var32);
    var0.addDisciplina(var16);
    int var35 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test77");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.lang.String var14 = var2.toString();
    int var15 = var2.getCor();
    java.lang.String var16 = var2.getNome();
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var20 = var19.getHorasEstudadas();
    double var21 = var19.getHorasEstudadas();
    java.lang.String var22 = var19.toString();
    boolean var23 = var2.equals((java.lang.Object)var19);
    java.lang.String var24 = var19.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test78");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Usuario var9 = var1.getUsuario();
    var1.setMetodoRegular();
    int var11 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test79");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    java.util.List var6 = var5.getDisciplinas();
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test80");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    Stude.Stude var9 = new Stude.Stude("hi!");
    int var10 = var9.intervalo();
    Stude.Usuario var11 = var9.getUsuario();
    var9.setMetodoRegular();
    var9.setNomeUsuario("Metodo de estudo regular");
    boolean var15 = var2.equals((java.lang.Object)var9);
    var9.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test81");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    double var5 = var2.getHorasEstudadas();
    var2.setCor(2);
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    var10.setCor((-1));
    Stude.Stude var17 = new Stude.Stude("hi!");
    var17.setMetodoRegular();
    Stude.MetodoDeEstudo var19 = var17.getMetodoDeEstudo();
    var17.setMetodoAvancado();
    var17.setMetodoAvancado();
    boolean var22 = var10.equals((java.lang.Object)var17);
    var10.addHorasDeEstudo(20.0d);
    var10.setCor(100);
    boolean var27 = var2.equals((java.lang.Object)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test82");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    var1.setNome("Metodo de estudo regular");
    java.lang.String var4 = var1.getNome();
    var1.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test83");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.addDisciplina("hi!", 0);
    Stude.Disciplina var20 = var15.getDisciplina("Metodo de estudo regular");
    var15.setMetodoRegular();
    var15.setMetodoAvancado();
    boolean var23 = var7.equals((java.lang.Object)var15);
    var7.setCor(15);
    java.lang.String var26 = var7.toString();
    Stude.Disciplina var29 = new Stude.Disciplina("hi!", 5);
    double var30 = var29.getHorasEstudadas();
    var29.addHorasDeEstudo(10.0d);
    java.lang.String var33 = var29.toString();
    boolean var34 = var7.equals((java.lang.Object)var29);
    java.lang.String var35 = var29.getNome();
    var29.addHorasDeEstudo(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test84");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.intervalo();
    int var7 = var1.intervalo();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test85");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    Stude.Disciplina var6 = var1.getDisciplina("");
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test86");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    Stude.Disciplina var7 = var3.getDisciplina("");
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    java.lang.String var14 = var10.getNome();
    int var15 = var10.getCor();
    Stude.Stude var17 = new Stude.Stude("hi!");
    Stude.Cronograma var18 = var17.getCronograma();
    int var19 = var17.tempoDeEstudo();
    var17.setMetodoAvancado();
    var17.setNomeUsuario("hi!");
    java.util.HashMap var23 = var17.desempenho();
    boolean var24 = var10.equals((java.lang.Object)var23);
    var3.addDisciplina(var10);
    Stude.Regular var26 = new Stude.Regular();
    int var27 = var26.getTempo();
    java.lang.String var28 = var26.toString();
    int var29 = var26.getTempo();
    int var30 = var26.getIntervalo();
    java.lang.String var31 = var26.toString();
    java.lang.String var32 = var26.toString();
    int var33 = var26.getIntervalo();
    java.lang.String var34 = var26.toString();
    java.lang.String var35 = var26.toString();
    boolean var36 = var10.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test87");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo regular");
    int var8 = var4.tamanhoDisciplinas();
    int var9 = var4.tamanhoDisciplinas();
    Stude.Cronograma var10 = new Stude.Cronograma();
    int var11 = var10.tamanhoDisciplinas();
    Stude.Cronograma var12 = new Stude.Cronograma();
    Stude.Disciplina var14 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var16 = var12.getDisciplina("");
    Stude.Cronograma var17 = new Stude.Cronograma();
    java.util.List var18 = var17.getDisciplinas();
    Stude.Disciplina var20 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var17.getDisciplina("hi!");
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.addDisciplina(var25);
    int var27 = var25.getCor();
    var12.addDisciplina(var25);
    var10.addDisciplina(var25);
    var25.setCor(0);
    var4.addDisciplina(var25);
    int var33 = var4.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test88");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test89");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test90");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test91");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    var9.setMetodoAvancado();
    var9.setMetodoAvancado();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var9.addDisciplina("Metodo de estudo avancado", 1);
    Stude.Disciplina var19 = var9.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var9.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test92");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    Stude.Stude var8 = new Stude.Stude("hi!");
    var8.setMetodoAvancado();
    Stude.MetodoDeEstudo var10 = var8.getMetodoDeEstudo();
    java.util.HashMap var11 = var8.desempenho();
    var8.setMetodoRegular();
    Stude.MetodoDeEstudo var13 = var8.getMetodoDeEstudo();
    var8.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var16 = var8.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    java.lang.String var23 = var20.toString();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Cronograma var26 = new Stude.Cronograma();
    java.util.List var27 = var26.getDisciplinas();
    Stude.Disciplina var29 = var26.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var31 = var26.getDisciplina("hi!");
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.addDisciplina(var34);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var26.addDisciplina(var38);
    java.lang.String var40 = var38.getNome();
    Stude.Stude var42 = new Stude.Stude("hi!");
    var42.setMetodoAvancado();
    Stude.MetodoDeEstudo var44 = var42.getMetodoDeEstudo();
    java.util.HashMap var45 = var42.desempenho();
    var42.setMetodoRegular();
    Stude.MetodoDeEstudo var47 = var42.getMetodoDeEstudo();
    var42.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var50 = var42.getMetodoDeEstudo();
    Stude.Cronograma var51 = var42.getCronograma();
    boolean var52 = var38.equals((java.lang.Object)var51);
    var0.addDisciplina(var38);
    int var54 = var38.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 100);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test93");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test94");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("hi!");
    var1.addDisciplina("Metodo de estudo regular", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test95");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    Stude.Usuario var10 = new Stude.Usuario("Metodo de estudo regular");
    var10.setNome("Metodo de estudo avancado");
    boolean var13 = var2.equals((java.lang.Object)var10);
    double var14 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test96");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    int var10 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test97");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Usuario var4 = var1.getUsuario();
    java.lang.String var5 = var4.getNome();
    java.lang.String var6 = var4.getNome();
    java.lang.String var7 = var4.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test98");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test99");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    Stude.Stude var6 = new Stude.Stude("hi!");
    int var7 = var6.intervalo();
    Stude.Usuario var8 = var6.getUsuario();
    Stude.Cronograma var9 = var6.getCronograma();
    var6.setMetodoAvancado();
    Stude.Cronograma var11 = var6.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var12);
    Stude.Regular var14 = new Stude.Regular();
    int var15 = var14.getTempo();
    int var16 = var14.getTempo();
    java.lang.String var17 = var14.toString();
    int var18 = var14.getIntervalo();
    int var19 = var14.getIntervalo();
    int var20 = var14.getTempo();
    int var21 = var14.getTempo();
    boolean var22 = var2.equals((java.lang.Object)var14);
    int var23 = var14.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 5);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test100");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 5);
    int var9 = var1.tempoDeEstudo();
    java.util.HashMap var10 = var1.desempenho();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test101");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.HashMap var11 = var1.desempenho();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test102");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    int var13 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test103");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    int var3 = var1.tempoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test104");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    int var9 = var1.tempoDeEstudo();
    Stude.Disciplina var11 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test105");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test106");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.List var5 = var4.getDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test107");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    double var5 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    double var8 = var2.getHorasEstudadas();
    java.lang.String var9 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test108");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    int var3 = var2.getCor();
    var2.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test109");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var11 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test110");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    int var13 = var1.intervalo();
    Stude.Cronograma var14 = var1.getCronograma();
    java.util.HashMap var15 = var1.desempenho();
    int var16 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test111");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 1);
    int var3 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test112");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.intervalo();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    var1.addDisciplina("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test113");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var5 = var2.getNome();
    var2.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test114");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo avancado", 10);
    java.util.List var17 = var1.getDisciplinas();
    java.util.List var18 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test115");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    Stude.Usuario var9 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test116");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    var20.setCor(30);
    Stude.Avancado var30 = new Stude.Avancado();
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    int var33 = var30.getIntervalo();
    int var34 = var30.getTempo();
    int var35 = var30.getTempo();
    int var36 = var30.getTempo();
    int var37 = var30.getTempo();
    java.lang.String var38 = var30.toString();
    boolean var39 = var20.equals((java.lang.Object)var30);
    Stude.Stude var41 = new Stude.Stude("hi!");
    int var42 = var41.intervalo();
    Stude.MetodoDeEstudo var43 = var41.getMetodoDeEstudo();
    Stude.Disciplina var45 = var41.getDisciplina("Metodo de estudo avancado");
    var41.setMetodoAvancado();
    Stude.Usuario var47 = var41.getUsuario();
    int var48 = var41.tempoDeEstudo();
    boolean var49 = var20.equals((java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test117");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var11 = var1.getCronograma();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test118");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test119");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var5 = var1.getUsuario();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test120");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getIntervalo();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test121");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", 5);
    Stude.Cronograma var8 = var1.getCronograma();
    boolean var10 = var8.removeDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var8.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test122");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    var16.setCor(0);
    var16.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test123");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Usuario var16 = var1.getUsuario();
    java.lang.String var17 = var16.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test124");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    int var12 = var1.intervalo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test125");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var9.setCor((-1));
    int var12 = var9.getCor();
    var9.addHorasDeEstudo(1.0d);
    java.lang.String var15 = var9.getNome();
    var0.addDisciplina(var9);
    int var17 = var0.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 5);
    double var21 = var20.getHorasEstudadas();
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var24 = var20.toString();
    java.lang.String var25 = var20.toString();
    java.lang.String var26 = var20.getNome();
    var20.addHorasDeEstudo(10.0d);
    var0.addDisciplina(var20);
    int var30 = var0.tamanhoDisciplinas();
    Stude.Cronograma var31 = new Stude.Cronograma();
    java.util.List var32 = var31.getDisciplinas();
    Stude.Disciplina var34 = var31.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var36 = var31.getDisciplina("hi!");
    Stude.Disciplina var39 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.addDisciplina(var39);
    java.util.List var41 = var31.getDisciplinas();
    Stude.Disciplina var43 = var31.getDisciplina("Metodo de estudo avancado");
    java.util.List var44 = var31.getDisciplinas();
    Stude.Cronograma var45 = new Stude.Cronograma();
    Stude.Disciplina var47 = var45.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var49 = var45.getDisciplina("");
    java.util.List var50 = var45.getDisciplinas();
    Stude.Stude var52 = new Stude.Stude("hi!");
    var52.setMetodoAvancado();
    Stude.MetodoDeEstudo var54 = var52.getMetodoDeEstudo();
    var52.setMetodoAvancado();
    var52.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var60 = var52.getDisciplina("Metodo de estudo regular");
    var45.addDisciplina(var60);
    double var62 = var60.getHorasEstudadas();
    var60.setNome("Metodo de estudo regular");
    int var65 = var60.getCor();
    var31.addDisciplina(var60);
    var0.addDisciplina(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test126");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var9.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test127");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test128");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    var2.setCor(2);
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var12 = var11.toString();
    var11.setCor(15);
    var11.setNome("Metodo de estudo regular");
    int var17 = var11.getCor();
    java.lang.String var18 = var11.toString();
    var11.setNome("Metodo de estudo regular");
    boolean var21 = var2.equals((java.lang.Object)var11);
    int var22 = var11.getCor();
    java.lang.String var23 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test129");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    var2.setCor(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test130");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("hi!");
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    var13.setNomeUsuario("Metodo de estudo regular");
    int var17 = var13.intervalo();
    Stude.Usuario var18 = var13.getUsuario();
    Stude.Disciplina var20 = var13.getDisciplina("Metodo de estudo avancado");
    int var21 = var13.intervalo();
    boolean var22 = var2.equals((java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test131");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var28 = var0.getDisciplina("Metodo de estudo avancado");
    boolean var30 = var0.removeDisciplina("Metodo de estudo avancado");
    java.util.List var31 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test132");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    int var10 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test133");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test134");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test135");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test136");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 10);
    var2.setNome("Metodo de estudo regular");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    java.lang.String var11 = var7.getNome();
    boolean var13 = var7.equals((java.lang.Object)(byte)100);
    java.lang.String var14 = var7.toString();
    boolean var15 = var2.equals((java.lang.Object)var14);
    java.lang.String var16 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test137");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test138");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    java.util.List var57 = var7.getDisciplinas();
    Stude.Disciplina var59 = var7.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var61 = var7.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test139");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    java.lang.String var7 = var2.getNome();
    java.lang.String var8 = var2.toString();
    int var9 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test140");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    double var21 = var9.getHorasEstudadas();
    var9.setNome("hi!");
    var9.addHorasDeEstudo(10.0d);
    var9.addHorasDeEstudo(1.0d);
    var9.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test141");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    java.lang.String var19 = var15.getNome();
    boolean var21 = var15.equals((java.lang.Object)(byte)100);
    java.lang.String var22 = var15.toString();
    var12.addDisciplina(var15);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.addHorasDeEstudo(10.0d);
    java.lang.String var29 = var26.toString();
    var12.addDisciplina(var26);
    java.lang.String var31 = var26.getNome();
    int var32 = var26.getCor();
    int var33 = var26.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 5);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test142");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test143");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", 5);
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test144");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    java.util.List var8 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test145");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.addDisciplina("hi!", 0);
    Stude.Disciplina var20 = var15.getDisciplina("Metodo de estudo regular");
    var15.setMetodoRegular();
    var15.setMetodoAvancado();
    boolean var23 = var7.equals((java.lang.Object)var15);
    var7.setCor(15);
    int var26 = var7.getCor();
    java.lang.String var27 = var7.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test146");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    int var6 = var2.getCor();
    java.lang.String var7 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test147");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("hi!");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    var15.setCor(2);
    var4.addDisciplina(var15);
    var15.setNome("Metodo de estudo avancado");
    var15.setNome("Metodo de estudo avancado");
    java.lang.String var25 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test148");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test149");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    var2.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test150");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    var15.setCor(0);
    Stude.Avancado var19 = new Stude.Avancado();
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    int var22 = var19.getIntervalo();
    java.lang.String var23 = var19.toString();
    int var24 = var19.getIntervalo();
    boolean var25 = var15.equals((java.lang.Object)var24);
    java.lang.String var26 = var15.toString();
    var15.setCor(30);
    int var29 = var15.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo avancado"+ "'", var20.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 30);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test151");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Stude var12 = new Stude.Stude("hi!");
    var12.setMetodoAvancado();
    Stude.MetodoDeEstudo var14 = var12.getMetodoDeEstudo();
    java.util.HashMap var15 = var12.desempenho();
    var12.setMetodoRegular();
    Stude.MetodoDeEstudo var17 = var12.getMetodoDeEstudo();
    var12.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var20 = var12.getCronograma();
    int var21 = var20.tamanhoDisciplinas();
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var25 = var24.toString();
    java.lang.String var26 = var24.toString();
    java.lang.String var27 = var24.toString();
    var20.addDisciplina(var24);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.setCor((-1));
    var31.addHorasDeEstudo(10.0d);
    java.lang.String var36 = var31.getNome();
    var31.setNome("Metodo de estudo regular");
    var20.addDisciplina(var31);
    Stude.Stude var41 = new Stude.Stude("hi!");
    Stude.Cronograma var42 = var41.getCronograma();
    int var43 = var41.tempoDeEstudo();
    int var44 = var41.tempoDeEstudo();
    int var45 = var41.intervalo();
    var41.setMetodoAvancado();
    Stude.Cronograma var47 = var41.getCronograma();
    Stude.Disciplina var50 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var51 = var50.getHorasEstudadas();
    var50.setNome("hi!");
    var50.setNome("hi!");
    var47.addDisciplina(var50);
    var50.setCor(30);
    var20.addDisciplina(var50);
    var9.addDisciplina(var50);
    var50.setCor((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test152");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test153");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.lang.String var4 = var3.getNome();
    java.lang.String var5 = var3.getNome();
    var3.setNome("hi!");
    var3.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test154");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Usuario var12 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    Stude.Disciplina var17 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test155");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    java.util.List var3 = var1.getDisciplinas();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Cronograma var5 = var1.getCronograma();
    int var6 = var5.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test156");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    int var9 = var1.intervalo();
    Stude.Cronograma var10 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var10.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test157");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    int var17 = var1.tempoDeEstudo();
    Stude.Usuario var18 = var1.getUsuario();
    java.util.HashMap var19 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test158");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    java.util.HashMap var11 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test159");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test160");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    double var9 = var2.getHorasEstudadas();
    var2.setCor(3);
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    Stude.Usuario var15 = var13.getUsuario();
    var13.setMetodoRegular();
    var13.setMetodoRegular();
    Stude.Usuario var18 = var13.getUsuario();
    boolean var19 = var2.equals((java.lang.Object)var18);
    var2.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test161");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    java.util.HashMap var18 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test162");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    int var5 = var1.intervalo();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test163");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test164");


    Stude.Usuario var1 = new Stude.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    java.lang.String var3 = var1.getNome();
    java.lang.String var4 = var1.getNome();
    java.lang.String var5 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test165");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    double var12 = var11.getHorasEstudadas();
    java.lang.String var13 = var11.toString();
    double var14 = var11.getHorasEstudadas();
    var11.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test166");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test167");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    java.util.List var18 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test168");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var28 = var0.getDisciplina("Metodo de estudo avancado");
    double var29 = var28.getHorasEstudadas();
    var28.addHorasDeEstudo(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test169");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test170");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getCor();
    int var8 = var2.getCor();
    var2.addHorasDeEstudo(11.0d);
    java.lang.String var11 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test171");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    java.lang.String var14 = var10.getNome();
    int var15 = var10.getCor();
    java.lang.String var16 = var10.getNome();
    var7.addDisciplina(var10);
    java.lang.String var18 = var10.getNome();
    Stude.Stude var20 = new Stude.Stude("hi!");
    var20.setMetodoAvancado();
    Stude.MetodoDeEstudo var22 = var20.getMetodoDeEstudo();
    java.util.HashMap var23 = var20.desempenho();
    var20.setMetodoRegular();
    java.util.List var25 = var20.getDisciplinas();
    var20.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var29 = var20.getMetodoDeEstudo();
    java.util.HashMap var30 = var20.desempenho();
    var20.setNomeUsuario("Metodo de estudo regular");
    boolean var33 = var10.equals((java.lang.Object)var20);
    int var34 = var20.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 5);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test172");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    java.lang.String var14 = var10.getNome();
    int var15 = var10.getCor();
    java.lang.String var16 = var10.getNome();
    var7.addDisciplina(var10);
    java.lang.String var18 = var10.getNome();
    java.lang.String var19 = var10.toString();
    var10.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test173");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.List var14 = var13.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    var17.addHorasDeEstudo(10.0d);
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var29 = var22.getDisciplina("");
    java.util.List var30 = var22.getDisciplinas();
    java.util.HashMap var31 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var32 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var33 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var34 = Stude.Desempenho.tempoDeEstudo(var30);
    boolean var35 = var17.equals((java.lang.Object)var34);
    var13.addDisciplina(var17);
    Stude.Disciplina var38 = var13.getDisciplina("Metodo de estudo avancado");
    java.util.List var39 = var13.getDisciplinas();
    Stude.Disciplina var41 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Stude var43 = new Stude.Stude("hi!");
    var43.setMetodoAvancado();
    Stude.MetodoDeEstudo var45 = var43.getMetodoDeEstudo();
    java.util.HashMap var46 = var43.desempenho();
    var43.setMetodoRegular();
    java.util.HashMap var48 = var43.desempenho();
    boolean var49 = var41.equals((java.lang.Object)var48);
    int var50 = var41.getCor();
    var41.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test174");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.addDisciplina("hi!", 10);
    java.util.HashMap var18 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test175");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test176");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test177");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    var1.addDisciplina("Metodo de estudo avancado", 5);
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    int var16 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test178");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Usuario var12 = var1.getUsuario();
    int var13 = var1.intervalo();
    int var14 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test179");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    java.util.List var11 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test180");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test181");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.MetodoDeEstudo var5 = var1.getMetodoDeEstudo();
    int var6 = var1.intervalo();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test182");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Usuario var9 = var1.getUsuario();
    java.lang.String var10 = var9.getNome();
    var9.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test183");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    var0.addDisciplina(var10);
    Stude.Disciplina var19 = var0.getDisciplina("");
    int var20 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var0.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test184");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    int var15 = var0.getTempo();
    int var16 = var0.getIntervalo();
    int var17 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test185");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    var2.setCor(15);
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test186");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("hi!");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    var15.setCor(2);
    var4.addDisciplina(var15);
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.addDisciplina("hi!", 0);
    Stude.Cronograma var26 = var22.getCronograma();
    boolean var27 = var15.equals((java.lang.Object)var22);
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.setMetodoAvancado();
    Stude.MetodoDeEstudo var31 = var29.getMetodoDeEstudo();
    java.util.HashMap var32 = var29.desempenho();
    var29.setMetodoRegular();
    Stude.MetodoDeEstudo var34 = var29.getMetodoDeEstudo();
    var29.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var37 = var29.getCronograma();
    java.util.List var38 = var29.getDisciplinas();
    java.util.HashMap var39 = var29.desempenho();
    boolean var40 = var15.equals((java.lang.Object)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test187");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    int var10 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test188");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    Stude.Usuario var13 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test189");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    double var4 = var2.getHorasEstudadas();
    double var5 = var2.getHorasEstudadas();
    double var6 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(100.0d);
    var2.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test190");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    java.util.List var4 = var3.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var3.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test191");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test192");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    java.util.HashMap var9 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test193");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    var2.setCor(15);
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var7 = var2.toString();
    var2.setCor(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test194");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getIntervalo();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test195");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    var2.setCor((-1));
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var11 = var2.toString();
    var2.setNome("hi!");
    Stude.Usuario var15 = new Stude.Usuario("hi!");
    java.lang.String var16 = var15.getNome();
    java.lang.String var17 = var15.getNome();
    var15.setNome("Metodo de estudo regular");
    boolean var20 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test196");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    java.lang.String var8 = var6.getNome();
    java.lang.String var9 = var6.getNome();
    java.lang.String var10 = var6.getNome();
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test197");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    int var3 = var1.intervalo();
    var1.setMetodoAvancado();
    int var5 = var1.tempoDeEstudo();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test198");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    int var9 = var1.intervalo();
    java.util.List var10 = var1.getDisciplinas();
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test199");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    java.lang.String var14 = var10.getNome();
    Stude.Cronograma var15 = new Stude.Cronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var15.getDisciplina("");
    java.util.List var20 = var15.getDisciplinas();
    boolean var21 = var10.equals((java.lang.Object)var15);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var25 = var24.toString();
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    Stude.MetodoDeEstudo var32 = var27.getMetodoDeEstudo();
    var27.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var35 = var27.desempenho();
    boolean var36 = var24.equals((java.lang.Object)var35);
    var15.addDisciplina(var24);
    boolean var38 = var2.equals((java.lang.Object)var15);
    Stude.Avancado var39 = new Stude.Avancado();
    java.lang.String var40 = var39.toString();
    java.lang.String var41 = var39.toString();
    int var42 = var39.getIntervalo();
    int var43 = var39.getIntervalo();
    boolean var44 = var2.equals((java.lang.Object)var43);
    java.lang.String var45 = var2.toString();
    java.lang.String var46 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test200");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 10);
    var2.setNome("Metodo de estudo regular");
    int var5 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test201");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    java.util.List var14 = var0.getDisciplinas();
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test202");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    Stude.Cronograma var16 = var15.getCronograma();
    Stude.Usuario var17 = var15.getUsuario();
    java.lang.String var18 = var17.getNome();
    java.lang.String var19 = var17.getNome();
    boolean var20 = var2.equals((java.lang.Object)var17);
    java.lang.String var21 = var2.toString();
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var25 = new Stude.Stude("hi!");
    int var26 = var25.intervalo();
    Stude.Usuario var27 = var25.getUsuario();
    Stude.Cronograma var28 = var25.getCronograma();
    var25.setMetodoAvancado();
    Stude.Cronograma var30 = var25.getCronograma();
    java.util.List var31 = var25.getDisciplinas();
    boolean var32 = var2.equals((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test203");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var14 = var13.toString();
    var13.setCor(15);
    var13.setCor(15);
    java.lang.String var19 = var13.toString();
    java.lang.String var20 = var13.toString();
    java.lang.String var21 = var13.getNome();
    double var22 = var13.getHorasEstudadas();
    var0.addDisciplina(var13);
    Stude.Disciplina var25 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var26 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo avancado"+ "'", var20.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test204");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    var2.setCor(30);
    java.lang.String var14 = var2.getNome();
    int var15 = var2.getCor();
    var2.setCor(2);
    java.lang.String var18 = var2.toString();
    int var19 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test205");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", (-1));
    java.lang.String var3 = var2.toString();
    Stude.Disciplina var6 = new Stude.Disciplina("hi!", 5);
    double var7 = var6.getHorasEstudadas();
    var6.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var6.toString();
    java.lang.String var11 = var6.toString();
    java.lang.String var12 = var6.getNome();
    var6.addHorasDeEstudo(10.0d);
    var6.setNome("hi!");
    boolean var17 = var2.equals((java.lang.Object)var6);
    var2.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test206");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test207");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test208");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var8.setNome("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test209");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    var0.addDisciplina(var10);
    Stude.Disciplina var19 = var0.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test210");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    int var3 = var0.tamanhoDisciplinas();
    java.util.List var4 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test211");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    int var9 = var1.tempoDeEstudo();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test212");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var36.setCor((-1));
    int var39 = var36.getCor();
    var7.addDisciplina(var36);
    java.lang.String var41 = var36.getNome();
    int var42 = var36.getCor();
    java.lang.String var43 = var36.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test213");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test214");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test215");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 0);
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    int var13 = var11.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test216");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    int var12 = var1.intervalo();
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var15 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test217");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    int var14 = var1.tempoDeEstudo();
    java.util.HashMap var15 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test218");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var11 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test219");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("hi!");
    var2.addHorasDeEstudo(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test220");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    int var5 = var2.getCor();
    java.lang.String var6 = var2.toString();
    var2.addHorasDeEstudo(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test221");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 30);
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Cronograma var14 = var1.getCronograma();
    java.util.HashMap var15 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test222");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var22 = var3.getDisciplina("hi!");
    var22.setCor(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test223");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var12 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    Stude.Disciplina var17 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test224");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    Stude.Stude var7 = new Stude.Stude("hi!");
    int var8 = var7.intervalo();
    Stude.Usuario var9 = var7.getUsuario();
    int var10 = var7.intervalo();
    var7.setMetodoAvancado();
    Stude.Usuario var12 = var7.getUsuario();
    Stude.Cronograma var13 = var7.getCronograma();
    Stude.MetodoDeEstudo var14 = var7.getMetodoDeEstudo();
    Stude.Usuario var15 = var7.getUsuario();
    boolean var16 = var2.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test225");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Stude var11 = new Stude.Stude("hi!");
    int var12 = var11.intervalo();
    Stude.Usuario var13 = var11.getUsuario();
    Stude.Cronograma var14 = var11.getCronograma();
    int var15 = var14.tamanhoDisciplinas();
    Stude.Stude var17 = new Stude.Stude("hi!");
    Stude.Cronograma var18 = var17.getCronograma();
    Stude.Cronograma var19 = var17.getCronograma();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var22.setCor((-1));
    int var25 = var22.getCor();
    var22.addHorasDeEstudo(1.0d);
    java.lang.String var28 = var22.getNome();
    Stude.Disciplina var31 = new Stude.Disciplina("hi!", 30);
    boolean var32 = var22.equals((java.lang.Object)var31);
    java.lang.String var33 = var31.getNome();
    var31.setNome("hi!");
    var19.addDisciplina(var31);
    var14.addDisciplina(var31);
    var9.addDisciplina(var31);
    Stude.Disciplina var40 = var9.getDisciplina("hi!");
    java.util.List var41 = var9.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var43 = var9.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test226");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var11 = var1.desempenho();
    var1.setNomeUsuario("hi!");
    Stude.Usuario var14 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test227");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.Disciplina var4 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var6 = var1.getDisciplina("");
    int var7 = var1.intervalo();
    java.util.List var8 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test228");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    Stude.Cronograma var12 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test229");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    java.util.List var57 = var7.getDisciplinas();
    java.util.List var58 = var7.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test230");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test231");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test232");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 2);
    java.lang.String var3 = var2.getNome();
    var2.setCor(10);
    java.lang.String var6 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test233");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    int var10 = var1.intervalo();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test234");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.addDisciplina("hi!", 0);
    Stude.Disciplina var20 = var15.getDisciplina("Metodo de estudo regular");
    var15.setMetodoRegular();
    var15.setMetodoAvancado();
    boolean var23 = var7.equals((java.lang.Object)var15);
    Stude.Regular var24 = new Stude.Regular();
    int var25 = var24.getTempo();
    java.lang.String var26 = var24.toString();
    int var27 = var24.getIntervalo();
    java.lang.String var28 = var24.toString();
    int var29 = var24.getIntervalo();
    int var30 = var24.getTempo();
    boolean var31 = var7.equals((java.lang.Object)var24);
    var7.setCor(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test235");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test236");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    java.util.List var10 = var0.getDisciplinas();
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test237");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var13 = var11.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test238");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test239");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("");
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Usuario var12 = var1.getUsuario();
    var1.addDisciplina("Metodo de estudo regular", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test240");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var6 = var1.getCronograma();
    java.util.List var7 = var6.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test241");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var12.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test242");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var1.intervalo();
    var1.setMetodoRegular();
    int var15 = var1.intervalo();
    java.util.HashMap var16 = var1.desempenho();
    java.util.HashMap var17 = var1.desempenho();
    Stude.MetodoDeEstudo var18 = var1.getMetodoDeEstudo();
    int var19 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test243");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test244");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test245");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test246");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    var2.setCor(0);
    int var10 = var2.getCor();
    Stude.Stude var12 = new Stude.Stude("hi!");
    Stude.Cronograma var13 = var12.getCronograma();
    Stude.Disciplina var15 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var19 = var18.toString();
    var18.setCor(15);
    var18.setCor(10);
    var13.addDisciplina(var18);
    boolean var25 = var2.equals((java.lang.Object)var13);
    Stude.Cronograma var26 = new Stude.Cronograma();
    int var27 = var26.tamanhoDisciplinas();
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var31 = var30.getHorasEstudadas();
    double var32 = var30.getHorasEstudadas();
    var26.addDisciplina(var30);
    int var34 = var26.tamanhoDisciplinas();
    java.util.List var35 = var26.getDisciplinas();
    java.util.HashMap var36 = Stude.Desempenho.tempoDeEstudo(var35);
    boolean var37 = var2.equals((java.lang.Object)var35);
    int var38 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test247");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    int var10 = var1.tempoDeEstudo();
    Stude.Cronograma var11 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var11.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test248");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    java.lang.String var8 = var2.getNome();
    var2.setNome("Metodo de estudo regular");
    var2.addHorasDeEstudo(1.0d);
    Stude.Stude var14 = new Stude.Stude("hi!");
    Stude.Cronograma var15 = var14.getCronograma();
    int var16 = var14.tempoDeEstudo();
    int var17 = var14.tempoDeEstudo();
    int var18 = var14.intervalo();
    int var19 = var14.tempoDeEstudo();
    boolean var20 = var2.equals((java.lang.Object)var14);
    int var21 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test249");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("hi!");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    var15.setCor(2);
    var4.addDisciplina(var15);
    var15.setNome("Metodo de estudo avancado");
    var15.setNome("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test250");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test251");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    var1.addDisciplina("Metodo de estudo regular", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test252");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    int var8 = var1.intervalo();
    int var9 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test253");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test254");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var8 = new Stude.Stude("hi!");
    var8.setMetodoAvancado();
    Stude.MetodoDeEstudo var10 = var8.getMetodoDeEstudo();
    java.util.HashMap var11 = var8.desempenho();
    var8.setMetodoRegular();
    Stude.MetodoDeEstudo var13 = var8.getMetodoDeEstudo();
    var8.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var16 = var8.getCronograma();
    Stude.Disciplina var18 = var8.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var19 = var8.getCronograma();
    Stude.Usuario var20 = var8.getUsuario();
    Stude.Cronograma var21 = var8.getCronograma();
    int var22 = var8.intervalo();
    var8.setMetodoAvancado();
    int var24 = var8.tempoDeEstudo();
    boolean var25 = var2.equals((java.lang.Object)var24);
    java.lang.String var26 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test255");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test256");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test257");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test258");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.tempoDeEstudo();
    Stude.Usuario var6 = var1.getUsuario();
    var6.setNome("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test259");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    var2.addHorasDeEstudo(1.0d);
    var2.setNome("hi!");
    java.lang.String var11 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test260");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    java.util.List var14 = var4.getDisciplinas();
    java.util.List var15 = var4.getDisciplinas();
    int var16 = var4.tamanhoDisciplinas();
    java.util.List var17 = var4.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test261");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoAvancado();
    java.util.List var8 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test262");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    int var26 = var23.getCor();
    var23.addHorasDeEstudo(1.0d);
    java.lang.String var29 = var23.getNome();
    Stude.Disciplina var32 = new Stude.Disciplina("hi!", 30);
    boolean var33 = var23.equals((java.lang.Object)var32);
    java.lang.String var34 = var23.toString();
    var3.addDisciplina(var23);
    var23.setCor(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test263");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var9 = var8.getCor();
    int var10 = var8.getCor();
    java.lang.String var11 = var8.getNome();
    var4.addDisciplina(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var4.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test264");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    var1.setMetodoRegular();
    var1.addDisciplina("hi!", 5);
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test265");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test266");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Cronograma var5 = var1.getCronograma();
    int var6 = var5.tamanhoDisciplinas();
    int var7 = var5.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    java.lang.String var17 = var10.toString();
    var10.setNome("Metodo de estudo regular");
    var5.addDisciplina(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test267");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    double var5 = var2.getHorasEstudadas();
    int var6 = var2.getCor();
    var2.setNome("hi!");
    int var9 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test268");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test269");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var22 = var21.toString();
    var21.setCor(15);
    var21.setCor(15);
    var0.addDisciplina(var21);
    java.util.List var28 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test270");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    Stude.Stude var79 = new Stude.Stude("hi!");
    int var80 = var79.intervalo();
    Stude.Usuario var81 = var79.getUsuario();
    int var82 = var79.tempoDeEstudo();
    java.util.HashMap var83 = var79.desempenho();
    Stude.MetodoDeEstudo var84 = var79.getMetodoDeEstudo();
    java.util.List var85 = var79.getDisciplinas();
    boolean var86 = var69.equals((java.lang.Object)var79);
    Stude.Cronograma var87 = var79.getCronograma();
    Stude.Cronograma var88 = var79.getCronograma();
    java.util.HashMap var89 = var79.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var91 = var79.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test271");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test272");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    int var13 = var11.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test273");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    var9.setMetodoAvancado();
    var9.setMetodoAvancado();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var9.addDisciplina("Metodo de estudo avancado", 1);
    java.util.List var18 = var9.getDisciplinas();
    var9.addDisciplina("Metodo de estudo regular", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test274");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test275");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var15 = var14.getCor();
    double var16 = var14.getHorasEstudadas();
    java.lang.String var17 = var14.toString();
    var11.addDisciplina(var14);
    Stude.Disciplina var21 = new Stude.Disciplina("hi!", 5);
    double var22 = var21.getHorasEstudadas();
    var21.addHorasDeEstudo(10.0d);
    var21.addHorasDeEstudo(10.0d);
    var11.addDisciplina(var21);
    Stude.Disciplina var29 = var11.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var31 = var11.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test276");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test277");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.intervalo();
    Stude.MetodoDeEstudo var5 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test278");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test279");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test280");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test281");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    int var17 = var1.tempoDeEstudo();
    java.util.List var18 = var1.getDisciplinas();
    Stude.Usuario var19 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test282");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.lang.String var14 = var2.toString();
    int var15 = var2.getCor();
    java.lang.String var16 = var2.getNome();
    int var17 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test283");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    int var10 = var1.tempoDeEstudo();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Usuario var12 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test284");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test285");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    Stude.Cronograma var5 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test286");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var12.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.addHorasDeEstudo(10.0d);
    java.lang.String var19 = var16.toString();
    java.lang.String var20 = var16.getNome();
    int var21 = var16.getCor();
    var12.addDisciplina(var16);
    int var23 = var12.tamanhoDisciplinas();
    Stude.Disciplina var25 = var12.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test287");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test288");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var1.intervalo();
    var1.setMetodoRegular();
    boolean var16 = var1.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test289");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    java.util.List var4 = var3.getDisciplinas();
    Stude.Stude var6 = new Stude.Stude("hi!");
    var6.setMetodoAvancado();
    Stude.MetodoDeEstudo var8 = var6.getMetodoDeEstudo();
    java.util.HashMap var9 = var6.desempenho();
    var6.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var6.getMetodoDeEstudo();
    var6.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var14 = var6.getCronograma();
    Stude.Disciplina var16 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var17 = var6.getCronograma();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var21 = var20.toString();
    var20.setCor(15);
    java.lang.String var24 = var20.getNome();
    boolean var26 = var20.equals((java.lang.Object)(byte)100);
    java.lang.String var27 = var20.toString();
    var17.addDisciplina(var20);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.addHorasDeEstudo(10.0d);
    java.lang.String var34 = var31.toString();
    var17.addDisciplina(var31);
    java.lang.String var36 = var31.getNome();
    int var37 = var31.getCor();
    var31.setNome("Metodo de estudo regular");
    var3.addDisciplina(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 5);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test290");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    int var15 = var0.getTempo();
    java.lang.String var16 = var0.toString();
    int var17 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test291");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var11 = var10.getHorasEstudadas();
    var10.setNome("hi!");
    var10.setNome("hi!");
    var7.addDisciplina(var10);
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var19.addHorasDeEstudo(10.0d);
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = var19.getNome();
    int var24 = var19.getCor();
    var7.addDisciplina(var19);
    int var26 = var19.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test292");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    double var21 = var9.getHorasEstudadas();
    var9.setNome("Metodo de estudo regular");
    int var24 = var9.getCor();
    var9.setCor(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test293");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    java.util.HashMap var16 = var10.desempenho();
    Stude.MetodoDeEstudo var17 = var10.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var10);
    Stude.Cronograma var19 = var10.getCronograma();
    Stude.MetodoDeEstudo var20 = var10.getMetodoDeEstudo();
    Stude.Cronograma var21 = var10.getCronograma();
    Stude.Stude var23 = new Stude.Stude("hi!");
    int var24 = var23.intervalo();
    Stude.MetodoDeEstudo var25 = var23.getMetodoDeEstudo();
    var23.addDisciplina("hi!", 2);
    Stude.Disciplina var30 = var23.getDisciplina("hi!");
    var21.addDisciplina(var30);
    java.util.List var32 = var21.getDisciplinas();
    Stude.Cronograma var33 = new Stude.Cronograma();
    int var34 = var33.tamanhoDisciplinas();
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo regular", 1);
    var33.addDisciplina(var37);
    Stude.Disciplina var41 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var41.addHorasDeEstudo(10.0d);
    java.lang.String var44 = var41.toString();
    java.lang.String var45 = var41.getNome();
    java.lang.String var46 = var41.getNome();
    java.lang.String var47 = var41.toString();
    var33.addDisciplina(var41);
    Stude.Stude var50 = new Stude.Stude("hi!");
    int var51 = var50.intervalo();
    Stude.Usuario var52 = var50.getUsuario();
    Stude.Cronograma var53 = var50.getCronograma();
    var50.setMetodoAvancado();
    Stude.Cronograma var55 = var50.getCronograma();
    Stude.Disciplina var58 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var55.addDisciplina(var58);
    java.lang.String var60 = var58.toString();
    double var61 = var58.getHorasEstudadas();
    double var62 = var58.getHorasEstudadas();
    var33.addDisciplina(var58);
    var21.addDisciplina(var58);
    Stude.Cronograma var65 = new Stude.Cronograma();
    Stude.Disciplina var67 = var65.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var69 = var65.getDisciplina("");
    java.util.List var70 = var65.getDisciplinas();
    Stude.Stude var72 = new Stude.Stude("hi!");
    var72.setMetodoAvancado();
    Stude.MetodoDeEstudo var74 = var72.getMetodoDeEstudo();
    var72.setMetodoAvancado();
    var72.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var80 = var72.getDisciplina("Metodo de estudo regular");
    var65.addDisciplina(var80);
    double var82 = var80.getHorasEstudadas();
    var80.setNome("Metodo de estudo regular");
    int var85 = var80.getCor();
    var21.addDisciplina(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Metodo de estudo avancado"+ "'", var60.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 1);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test294");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var6 = var1.intervalo();
    java.util.List var7 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test295");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test296");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    int var11 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.HashMap var13 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test297");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test298");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var22 = var21.toString();
    var21.setCor(15);
    var21.setCor(15);
    var0.addDisciplina(var21);
    Stude.Disciplina var29 = var0.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test299");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test300");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Cronograma var7 = new Stude.Cronograma();
    int var8 = var7.tamanhoDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var12 = var11.getHorasEstudadas();
    double var13 = var11.getHorasEstudadas();
    var7.addDisciplina(var11);
    var11.setCor(15);
    var6.addDisciplina(var11);
    java.lang.String var18 = var11.getNome();
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var22 = var21.toString();
    java.lang.String var23 = var21.toString();
    java.lang.String var24 = var21.toString();
    var21.setNome("hi!");
    Stude.Stude var28 = new Stude.Stude("hi!");
    int var29 = var28.intervalo();
    Stude.Usuario var30 = var28.getUsuario();
    var28.setMetodoRegular();
    var28.setNomeUsuario("Metodo de estudo regular");
    boolean var34 = var21.equals((java.lang.Object)var28);
    int var35 = var21.getCor();
    var21.addHorasDeEstudo(100.0d);
    boolean var38 = var11.equals((java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test301");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.setCor(15);
    var2.setCor(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test302");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.Disciplina var4 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var6 = var1.getDisciplina("");
    Stude.Usuario var7 = var1.getUsuario();
    java.lang.String var8 = var7.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test303");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var9 = var1.desempenho();
    int var10 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test304");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var7 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test305");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var10.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test306");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    Stude.Stude var8 = new Stude.Stude("hi!");
    var8.setMetodoAvancado();
    Stude.MetodoDeEstudo var10 = var8.getMetodoDeEstudo();
    java.util.HashMap var11 = var8.desempenho();
    var8.setMetodoRegular();
    Stude.MetodoDeEstudo var13 = var8.getMetodoDeEstudo();
    var8.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var16 = var8.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    java.lang.String var23 = var20.toString();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Cronograma var26 = new Stude.Cronograma();
    java.util.List var27 = var26.getDisciplinas();
    Stude.Disciplina var29 = var26.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var31 = var26.getDisciplina("hi!");
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.addDisciplina(var34);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var26.addDisciplina(var38);
    java.lang.String var40 = var38.getNome();
    Stude.Stude var42 = new Stude.Stude("hi!");
    var42.setMetodoAvancado();
    Stude.MetodoDeEstudo var44 = var42.getMetodoDeEstudo();
    java.util.HashMap var45 = var42.desempenho();
    var42.setMetodoRegular();
    Stude.MetodoDeEstudo var47 = var42.getMetodoDeEstudo();
    var42.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var50 = var42.getMetodoDeEstudo();
    Stude.Cronograma var51 = var42.getCronograma();
    boolean var52 = var38.equals((java.lang.Object)var51);
    var0.addDisciplina(var38);
    Stude.Disciplina var56 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var57 = var56.toString();
    var56.setCor(15);
    java.lang.String var60 = var56.getNome();
    Stude.Cronograma var61 = new Stude.Cronograma();
    Stude.Disciplina var63 = var61.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var65 = var61.getDisciplina("");
    java.util.List var66 = var61.getDisciplinas();
    boolean var67 = var56.equals((java.lang.Object)var61);
    var56.setNome("hi!");
    double var70 = var56.getHorasEstudadas();
    var0.addDisciplina(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "Metodo de estudo avancado"+ "'", var57.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Metodo de estudo avancado"+ "'", var60.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test307");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Stude var10 = new Stude.Stude("hi!");
    var10.setMetodoAvancado();
    Stude.MetodoDeEstudo var12 = var10.getMetodoDeEstudo();
    var10.setMetodoAvancado();
    var10.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var18 = var10.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var18);
    Stude.Stude var21 = new Stude.Stude("hi!");
    int var22 = var21.intervalo();
    Stude.Usuario var23 = var21.getUsuario();
    Stude.Cronograma var24 = var21.getCronograma();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var27.addHorasDeEstudo(10.0d);
    java.lang.String var30 = var27.toString();
    java.lang.String var31 = var27.getNome();
    java.lang.String var32 = var27.getNome();
    var24.addDisciplina(var27);
    Stude.Stude var35 = new Stude.Stude("hi!");
    var35.addDisciplina("hi!", 0);
    Stude.Disciplina var40 = var35.getDisciplina("Metodo de estudo regular");
    var35.setMetodoRegular();
    var35.setMetodoAvancado();
    boolean var43 = var27.equals((java.lang.Object)var35);
    Stude.Regular var44 = new Stude.Regular();
    int var45 = var44.getTempo();
    java.lang.String var46 = var44.toString();
    int var47 = var44.getIntervalo();
    java.lang.String var48 = var44.toString();
    int var49 = var44.getIntervalo();
    int var50 = var44.getTempo();
    boolean var51 = var27.equals((java.lang.Object)var44);
    var0.addDisciplina(var27);
    int var53 = var0.tamanhoDisciplinas();
    int var54 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo regular"+ "'", var48.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test308");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    java.util.List var19 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test309");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var17 = var16.toString();
    var16.setCor(15);
    var16.setCor(10);
    var0.addDisciplina(var16);
    int var23 = var16.getCor();
    double var24 = var16.getHorasEstudadas();
    var16.addHorasDeEstudo(20.0d);
    java.lang.String var27 = var16.getNome();
    double var28 = var16.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 20.0d);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test310");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var9.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test311");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test312");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test313");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var11 = var1.desempenho();
    Stude.Usuario var12 = var1.getUsuario();
    java.lang.String var13 = var12.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test314");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    java.util.HashMap var7 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test315");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    java.util.HashMap var11 = var1.desempenho();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    java.util.List var15 = var1.getDisciplinas();
    java.util.HashMap var16 = var1.desempenho();
    int var17 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test316");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    int var9 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test317");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test318");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test319");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var9 = var0.getDisciplinas();
    Stude.Disciplina var11 = var0.getDisciplina("");
    int var12 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test320");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test321");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    var0.addDisciplina(var10);
    double var18 = var10.getHorasEstudadas();
    java.lang.String var19 = var10.getNome();
    int var20 = var10.getCor();
    double var21 = var10.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test322");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var25 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test323");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    boolean var32 = var7.removeDisciplina("hi!");
    java.util.List var33 = var7.getDisciplinas();
    java.util.HashMap var34 = Stude.Desempenho.tempoDeEstudo(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test324");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    Stude.Stude var58 = new Stude.Stude("hi!");
    var58.setMetodoAvancado();
    Stude.MetodoDeEstudo var60 = var58.getMetodoDeEstudo();
    java.util.HashMap var61 = var58.desempenho();
    java.util.HashMap var62 = var58.desempenho();
    var58.setMetodoAvancado();
    Stude.MetodoDeEstudo var64 = var58.getMetodoDeEstudo();
    boolean var65 = var34.equals((java.lang.Object)var58);
    var34.setCor(30);
    Stude.Stude var69 = new Stude.Stude("hi!");
    var69.setMetodoAvancado();
    Stude.MetodoDeEstudo var71 = var69.getMetodoDeEstudo();
    java.util.HashMap var72 = var69.desempenho();
    var69.setMetodoRegular();
    java.util.List var74 = var69.getDisciplinas();
    java.util.HashMap var75 = var69.desempenho();
    int var76 = var69.intervalo();
    Stude.Cronograma var77 = var69.getCronograma();
    Stude.Cronograma var78 = var69.getCronograma();
    Stude.Disciplina var80 = var69.getDisciplina("");
    boolean var81 = var34.equals((java.lang.Object)"");
    var34.addHorasDeEstudo(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test325");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var10.getDisciplinas();
    int var12 = var10.tamanhoDisciplinas();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var15.setCor((-1));
    var15.addHorasDeEstudo(10.0d);
    java.lang.String var20 = var15.getNome();
    var15.setNome("Metodo de estudo regular");
    var10.addDisciplina(var15);
    Stude.Disciplina var25 = var10.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test326");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    int var5 = var2.getCor();
    double var6 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test327");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.List var14 = var13.getDisciplinas();
    Stude.Disciplina var16 = var13.getDisciplina("");
    Stude.Disciplina var18 = var13.getDisciplina("Metodo de estudo regular");
    java.util.List var19 = var13.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test328");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Usuario var9 = var1.getUsuario();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 100);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test329");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    var2.setCor(30);
    Stude.Stude var15 = new Stude.Stude("hi!");
    int var16 = var15.intervalo();
    Stude.Usuario var17 = var15.getUsuario();
    int var18 = var15.intervalo();
    java.util.List var19 = var15.getDisciplinas();
    Stude.Cronograma var20 = var15.getCronograma();
    int var21 = var15.tempoDeEstudo();
    boolean var22 = var2.equals((java.lang.Object)var15);
    java.lang.String var23 = var2.getNome();
    Stude.Stude var25 = new Stude.Stude("hi!");
    int var26 = var25.intervalo();
    Stude.Usuario var27 = var25.getUsuario();
    Stude.Cronograma var28 = var25.getCronograma();
    java.util.HashMap var29 = var25.desempenho();
    Stude.Usuario var30 = var25.getUsuario();
    Stude.Usuario var31 = var25.getUsuario();
    boolean var32 = var2.equals((java.lang.Object)var25);
    int var33 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 30);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test330");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.HashMap var11 = var1.desempenho();
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.List var13 = var12.getDisciplinas();
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test331");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    double var6 = var2.getHorasEstudadas();
    var2.setCor(3);
    java.lang.String var9 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test332");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    var15.setNome("Metodo de estudo regular");
    int var21 = var15.getCor();
    java.lang.String var22 = var15.toString();
    var15.setNome("Metodo de estudo regular");
    var11.addDisciplina(var15);
    Stude.Disciplina var27 = var11.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test333");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    Stude.Stude var13 = new Stude.Stude("hi!");
    var13.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var13.getMetodoDeEstudo();
    java.util.HashMap var16 = var13.desempenho();
    var13.setMetodoRegular();
    Stude.MetodoDeEstudo var18 = var13.getMetodoDeEstudo();
    var13.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var21 = var13.getCronograma();
    Stude.Disciplina var23 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var24 = var13.getCronograma();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var28 = var27.toString();
    var27.setCor(15);
    java.lang.String var31 = var27.getNome();
    boolean var33 = var27.equals((java.lang.Object)(byte)100);
    java.lang.String var34 = var27.toString();
    var24.addDisciplina(var27);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var41 = var38.toString();
    var24.addDisciplina(var38);
    var0.addDisciplina(var38);
    Stude.Stude var45 = new Stude.Stude("hi!");
    Stude.MetodoDeEstudo var46 = var45.getMetodoDeEstudo();
    boolean var47 = var38.equals((java.lang.Object)var45);
    Stude.Usuario var48 = var45.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo avancado"+ "'", var34.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test334");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    Stude.Disciplina var18 = var1.getDisciplina("");
    java.util.List var19 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test335");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test336");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    Stude.Disciplina var6 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var8 = var3.getDisciplina("hi!");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var3.addDisciplina(var11);
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var3.addDisciplina(var15);
    int var17 = var3.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var21 = var20.toString();
    var20.setCor(15);
    var20.setNome("Metodo de estudo regular");
    int var26 = var20.getCor();
    var3.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = var0.getDisciplina("hi!");
    Stude.Disciplina var32 = var0.getDisciplina("Metodo de estudo avancado");
    int var33 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test337");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test338");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    java.util.List var8 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test339");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Cronograma var2 = new Stude.Cronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var6 = var2.getDisciplina("");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    int var17 = var15.getCor();
    var2.addDisciplina(var15);
    var0.addDisciplina(var15);
    int var20 = var0.tamanhoDisciplinas();
    Stude.Disciplina var22 = var0.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test340");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    java.lang.String var28 = var20.toString();
    int var29 = var20.getCor();
    var20.addHorasDeEstudo(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test341");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var2.toString();
    java.lang.String var14 = var2.toString();
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test342");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test343");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(10.0d);
    var2.setCor(100);
    int var13 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test344");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Usuario var12 = var1.getUsuario();
    java.util.List var13 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test345");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    java.lang.String var78 = var69.toString();
    Stude.Stude var80 = new Stude.Stude("hi!");
    int var81 = var80.intervalo();
    Stude.Usuario var82 = var80.getUsuario();
    Stude.Cronograma var83 = var80.getCronograma();
    var80.setMetodoAvancado();
    var80.setMetodoAvancado();
    int var86 = var80.intervalo();
    int var87 = var80.intervalo();
    int var88 = var80.intervalo();
    boolean var89 = var69.equals((java.lang.Object)var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var80.addDisciplina("", (-1));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "Metodo de estudo avancado"+ "'", var78.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test346");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.tempoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    java.util.List var10 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test347");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    java.lang.String var10 = var9.getNome();
    var9.setNome("Metodo de estudo avancado");
    var9.setNome("Metodo de estudo avancado");
    var9.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test348");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test349");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var12 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test350");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var15.setCor(100);
    Stude.Cronograma var18 = new Stude.Cronograma();
    java.util.List var19 = var18.getDisciplinas();
    Stude.Disciplina var21 = var18.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var23 = var18.getDisciplina("hi!");
    Stude.Disciplina var25 = var18.getDisciplina("");
    boolean var26 = var15.equals((java.lang.Object)"");
    var0.addDisciplina(var15);
    int var28 = var0.tamanhoDisciplinas();
    java.util.List var29 = var0.getDisciplinas();
    Stude.Disciplina var31 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var32 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test351");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("hi!");
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    var13.setNomeUsuario("Metodo de estudo regular");
    int var17 = var13.intervalo();
    Stude.Usuario var18 = var13.getUsuario();
    Stude.Disciplina var20 = var13.getDisciplina("Metodo de estudo avancado");
    int var21 = var13.intervalo();
    boolean var22 = var2.equals((java.lang.Object)var21);
    int var23 = var2.getCor();
    java.lang.String var24 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test352");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var10 = var1.getDisciplinas();
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test353");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    java.util.List var34 = var7.getDisciplinas();
    Stude.Disciplina var36 = var7.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var38 = var7.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test354");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 15);
    int var15 = var1.tempoDeEstudo();
    Stude.Usuario var16 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test355");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Usuario var9 = var1.getUsuario();
    java.util.List var10 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test356");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var17 = var16.toString();
    var16.setCor(15);
    var16.setCor(10);
    var0.addDisciplina(var16);
    java.lang.String var23 = var16.getNome();
    java.lang.String var24 = var16.toString();
    var16.addHorasDeEstudo(3.0d);
    java.lang.String var27 = var16.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test357");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.List var14 = var13.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    var17.addHorasDeEstudo(10.0d);
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var29 = var22.getDisciplina("");
    java.util.List var30 = var22.getDisciplinas();
    java.util.HashMap var31 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var32 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var33 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var34 = Stude.Desempenho.tempoDeEstudo(var30);
    boolean var35 = var17.equals((java.lang.Object)var34);
    var13.addDisciplina(var17);
    Stude.Disciplina var38 = var13.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var40 = var13.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test358");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test359");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test360");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var11.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test361");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    int var9 = var1.tempoDeEstudo();
    int var10 = var1.intervalo();
    int var11 = var1.intervalo();
    java.util.HashMap var12 = var1.desempenho();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test362");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    var9.addHorasDeEstudo(100.0d);
    double var24 = var9.getHorasEstudadas();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var27.setCor((-1));
    java.lang.String var30 = var27.getNome();
    var27.setCor((-1));
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var36 = var35.toString();
    var35.setCor(15);
    java.lang.String var39 = var35.getNome();
    Stude.Cronograma var40 = new Stude.Cronograma();
    Stude.Disciplina var42 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var40.getDisciplina("");
    java.util.List var45 = var40.getDisciplinas();
    boolean var46 = var35.equals((java.lang.Object)var40);
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var50 = var49.toString();
    Stude.Stude var52 = new Stude.Stude("hi!");
    var52.setMetodoAvancado();
    Stude.MetodoDeEstudo var54 = var52.getMetodoDeEstudo();
    java.util.HashMap var55 = var52.desempenho();
    var52.setMetodoRegular();
    Stude.MetodoDeEstudo var57 = var52.getMetodoDeEstudo();
    var52.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var60 = var52.desempenho();
    boolean var61 = var49.equals((java.lang.Object)var60);
    var40.addDisciplina(var49);
    boolean var63 = var27.equals((java.lang.Object)var40);
    boolean var64 = var9.equals((java.lang.Object)var40);
    double var65 = var9.getHorasEstudadas();
    var9.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo avancado"+ "'", var36.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 100.0d);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test363");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var17 = var16.toString();
    var16.setCor(15);
    var16.setCor(10);
    var0.addDisciplina(var16);
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var25 = new Stude.Cronograma();
    java.util.List var26 = var25.getDisciplinas();
    Stude.Disciplina var28 = var25.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var30 = var25.getDisciplina("hi!");
    Stude.Disciplina var33 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var25.addDisciplina(var33);
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var25.addDisciplina(var37);
    int var39 = var25.tamanhoDisciplinas();
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var43 = var42.toString();
    var42.setCor(15);
    var42.setNome("Metodo de estudo regular");
    int var48 = var42.getCor();
    var25.addDisciplina(var42);
    Stude.Disciplina var51 = var25.getDisciplina("Metodo de estudo regular");
    java.lang.String var52 = var51.toString();
    var51.addHorasDeEstudo(100.0d);
    var0.addDisciplina(var51);
    java.lang.String var56 = var51.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo avancado"+ "'", var43.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo regular"+ "'", var52.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Metodo de estudo regular"+ "'", var56.equals("Metodo de estudo regular"));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test364");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    boolean var32 = var7.removeDisciplina("hi!");
    Stude.Disciplina var34 = var7.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var36 = var7.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test365");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test366");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var5 = var2.getNome();
    var2.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test367");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test368");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var17 = var16.toString();
    var16.setCor(15);
    var16.setCor(10);
    var0.addDisciplina(var16);
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var25 = new Stude.Cronograma();
    java.util.List var26 = var25.getDisciplinas();
    Stude.Disciplina var28 = var25.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var30 = var25.getDisciplina("hi!");
    Stude.Disciplina var33 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var25.addDisciplina(var33);
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var25.addDisciplina(var37);
    int var39 = var25.tamanhoDisciplinas();
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var43 = var42.toString();
    var42.setCor(15);
    var42.setNome("Metodo de estudo regular");
    int var48 = var42.getCor();
    var25.addDisciplina(var42);
    Stude.Disciplina var51 = var25.getDisciplina("Metodo de estudo regular");
    java.lang.String var52 = var51.toString();
    var51.addHorasDeEstudo(100.0d);
    var0.addDisciplina(var51);
    Stude.Disciplina var58 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var58.setCor((-1));
    int var61 = var58.getCor();
    var58.addHorasDeEstudo(1.0d);
    java.lang.String var64 = var58.getNome();
    Stude.Disciplina var67 = new Stude.Disciplina("hi!", 30);
    boolean var68 = var58.equals((java.lang.Object)var67);
    java.lang.String var69 = var58.toString();
    java.lang.String var70 = var58.getNome();
    var0.addDisciplina(var58);
    java.lang.String var72 = var58.getNome();
    java.lang.String var73 = var58.toString();
    int var74 = var58.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo avancado"+ "'", var43.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo regular"+ "'", var52.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Metodo de estudo regular"+ "'", var64.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Metodo de estudo regular"+ "'", var69.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo regular"+ "'", var70.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Metodo de estudo regular"+ "'", var72.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Metodo de estudo regular"+ "'", var73.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test369");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test370");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 30);
    int var3 = var2.getCor();
    double var4 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test371");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.addDisciplina("Metodo de estudo regular", 100);
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test372");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    java.util.HashMap var11 = var1.desempenho();
    int var12 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test373");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    java.util.HashMap var8 = var1.desempenho();
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test374");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test375");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    java.util.HashMap var12 = var1.desempenho();
    int var13 = var1.tempoDeEstudo();
    int var14 = var1.intervalo();
    Stude.Usuario var15 = var1.getUsuario();
    Stude.Cronograma var16 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var16.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test376");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    Stude.Cronograma var34 = new Stude.Cronograma();
    Stude.Disciplina var36 = var34.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var38 = var34.getDisciplina("");
    java.util.List var39 = var34.getDisciplinas();
    Stude.Stude var41 = new Stude.Stude("hi!");
    var41.setMetodoAvancado();
    Stude.MetodoDeEstudo var43 = var41.getMetodoDeEstudo();
    var41.setMetodoAvancado();
    var41.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var49 = var41.getDisciplina("Metodo de estudo regular");
    var34.addDisciplina(var49);
    double var51 = var49.getHorasEstudadas();
    var49.setNome("Metodo de estudo avancado");
    var49.setCor(5);
    var7.addDisciplina(var49);
    var49.setCor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test377");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test378");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    int var2 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = var0.getDisciplina("hi!");
    int var5 = var0.tamanhoDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test379");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    int var30 = var16.getCor();
    java.lang.String var31 = var16.getNome();
    java.lang.String var32 = var16.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test380");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    java.util.HashMap var3 = var1.desempenho();
    java.util.List var4 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test381");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test382");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test383");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var17 = var16.toString();
    var16.setCor(15);
    var16.setCor(10);
    var0.addDisciplina(var16);
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    var24.setCor(0);
    var24.setNome("Metodo de estudo avancado");
    var24.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test384");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test385");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addDisciplina(var13);
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.setCor((-1));
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var25 = var20.getNome();
    var20.setNome("Metodo de estudo regular");
    var9.addDisciplina(var20);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.setCor((-1));
    int var34 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    java.lang.String var37 = var31.getNome();
    int var38 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    var31.addHorasDeEstudo(1.0d);
    var9.addDisciplina(var31);
    double var44 = var31.getHorasEstudadas();
    var31.addHorasDeEstudo(21.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 3.0d);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test386");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    int var13 = var1.intervalo();
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("hi!", 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test387");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getIntervalo();
    int var12 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test388");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test389");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    int var12 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test390");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    Stude.Usuario var8 = var1.getUsuario();
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test391");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    java.lang.String var10 = var9.getNome();
    java.lang.String var11 = var9.getNome();
    var9.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test392");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test393");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test394");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getNome();
    var11.setCor(0);
    var11.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test395");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoRegular();
    int var11 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test396");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test397");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.List var4 = var1.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var4);
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test398");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    double var5 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test399");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var27 = var0.getDisciplinas();
    int var28 = var0.tamanhoDisciplinas();
    Stude.Stude var30 = new Stude.Stude("hi!");
    int var31 = var30.intervalo();
    Stude.Usuario var32 = var30.getUsuario();
    int var33 = var30.tempoDeEstudo();
    java.util.HashMap var34 = var30.desempenho();
    Stude.MetodoDeEstudo var35 = var30.getMetodoDeEstudo();
    Stude.Cronograma var36 = var30.getCronograma();
    int var37 = var36.tamanhoDisciplinas();
    Stude.Disciplina var40 = new Stude.Disciplina("hi!", 5);
    double var41 = var40.getHorasEstudadas();
    var40.addHorasDeEstudo(10.0d);
    var40.setCor(0);
    var36.addDisciplina(var40);
    var0.addDisciplina(var40);
    java.util.List var48 = var0.getDisciplinas();
    java.util.List var49 = var0.getDisciplinas();
    Stude.Disciplina var51 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var52 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test400");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    var9.setMetodoAvancado();
    var9.setMetodoAvancado();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var2.addHorasDeEstudo(20.0d);
    var2.setCor(100);
    java.lang.String var19 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test401");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    boolean var22 = var2.equals((java.lang.Object)var21);
    java.lang.String var23 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test402");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 3);
    Stude.Stude var4 = new Stude.Stude("hi!");
    var4.setMetodoAvancado();
    Stude.MetodoDeEstudo var6 = var4.getMetodoDeEstudo();
    var4.setNomeUsuario("Metodo de estudo regular");
    var4.setMetodoAvancado();
    java.util.HashMap var10 = var4.desempenho();
    java.util.HashMap var11 = var4.desempenho();
    java.util.HashMap var12 = var4.desempenho();
    boolean var13 = var2.equals((java.lang.Object)var12);
    var2.addHorasDeEstudo(20.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test403");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("hi!");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    var15.setCor(2);
    var4.addDisciplina(var15);
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.addDisciplina("hi!", 0);
    Stude.Cronograma var26 = var22.getCronograma();
    boolean var27 = var15.equals((java.lang.Object)var22);
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.addDisciplina("Metodo de estudo regular", 10);
    int var33 = var29.tempoDeEstudo();
    var29.addDisciplina("Metodo de estudo regular", 15);
    boolean var37 = var15.equals((java.lang.Object)var29);
    java.lang.String var38 = var15.toString();
    int var39 = var15.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test404");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Disciplina var6 = var1.getDisciplina("hi!");
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test405");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var16 = var7.getDisciplina("");
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var19.setCor((-1));
    int var22 = var19.getCor();
    var19.addHorasDeEstudo(1.0d);
    java.lang.String var25 = var19.toString();
    var19.addHorasDeEstudo(1.0d);
    var7.addDisciplina(var19);
    int var29 = var7.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test406");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test407");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test408");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Usuario var10 = var1.getUsuario();
    boolean var12 = var1.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test409");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    var2.addHorasDeEstudo(20.0d);
    double var11 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 21.0d);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test410");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    java.lang.String var78 = var69.toString();
    var69.setNome("Metodo de estudo regular");
    var69.addHorasDeEstudo(10.0d);
    java.lang.String var83 = var69.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "Metodo de estudo avancado"+ "'", var78.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Metodo de estudo regular"+ "'", var83.equals("Metodo de estudo regular"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test411");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    java.util.List var10 = var1.getDisciplinas();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test412");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test413");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    Stude.Stude var79 = new Stude.Stude("hi!");
    int var80 = var79.intervalo();
    Stude.Usuario var81 = var79.getUsuario();
    int var82 = var79.tempoDeEstudo();
    java.util.HashMap var83 = var79.desempenho();
    Stude.MetodoDeEstudo var84 = var79.getMetodoDeEstudo();
    java.util.List var85 = var79.getDisciplinas();
    boolean var86 = var69.equals((java.lang.Object)var79);
    Stude.Cronograma var87 = var79.getCronograma();
    java.util.List var88 = var87.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test414");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.tempoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    java.util.List var10 = var1.getDisciplinas();
    var1.setMetodoRegular();
    int var12 = var1.intervalo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test415");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    int var26 = var23.getCor();
    var23.addHorasDeEstudo(1.0d);
    java.lang.String var29 = var23.getNome();
    Stude.Disciplina var32 = new Stude.Disciplina("hi!", 30);
    boolean var33 = var23.equals((java.lang.Object)var32);
    java.lang.String var34 = var23.toString();
    var3.addDisciplina(var23);
    java.lang.String var36 = var23.toString();
    java.lang.String var37 = var23.toString();
    java.lang.String var38 = var23.toString();
    var23.addHorasDeEstudo(3.0d);
    var23.setNome("Metodo de estudo regular");
    Stude.Stude var44 = new Stude.Stude("hi!");
    var44.setMetodoAvancado();
    Stude.MetodoDeEstudo var46 = var44.getMetodoDeEstudo();
    java.util.HashMap var47 = var44.desempenho();
    java.util.HashMap var48 = var44.desempenho();
    var44.setMetodoAvancado();
    Stude.Disciplina var51 = var44.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var52 = var44.desempenho();
    java.util.List var53 = var44.getDisciplinas();
    boolean var54 = var23.equals((java.lang.Object)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var56 = var44.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test416");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.Disciplina var7 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test417");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Usuario var5 = var1.getUsuario();
    java.util.List var6 = var1.getDisciplinas();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test418");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Usuario var5 = var1.getUsuario();
    java.util.List var6 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test419");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    boolean var79 = var28.removeDisciplina("Metodo de estudo avancado");
    boolean var81 = var28.removeDisciplina("Metodo de estudo regular");
    int var82 = var28.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test420");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    int var17 = var1.tempoDeEstudo();
    Stude.Usuario var18 = var1.getUsuario();
    java.util.HashMap var19 = var1.desempenho();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test421");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    Stude.Disciplina var12 = new Stude.Disciplina("hi!", 30);
    var12.setCor(2);
    Stude.Stude var16 = new Stude.Stude("hi!");
    int var17 = var16.intervalo();
    Stude.Usuario var18 = var16.getUsuario();
    Stude.Cronograma var19 = var16.getCronograma();
    var16.setMetodoAvancado();
    Stude.Cronograma var21 = var16.getCronograma();
    java.util.List var22 = var21.getDisciplinas();
    boolean var23 = var12.equals((java.lang.Object)var22);
    boolean var24 = var2.equals((java.lang.Object)var12);
    int var25 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test422");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    double var21 = var9.getHorasEstudadas();
    var9.setNome("hi!");
    var9.addHorasDeEstudo(10.0d);
    Stude.Cronograma var26 = new Stude.Cronograma();
    int var27 = var26.tamanhoDisciplinas();
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var31 = var30.getHorasEstudadas();
    double var32 = var30.getHorasEstudadas();
    var26.addDisciplina(var30);
    java.util.List var34 = var26.getDisciplinas();
    java.util.List var35 = var26.getDisciplinas();
    java.util.List var36 = var26.getDisciplinas();
    boolean var37 = var9.equals((java.lang.Object)var26);
    int var38 = var26.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test423");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test424");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.HashMap var14 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test425");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test426");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var0.addDisciplina(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test427");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    int var14 = var1.tempoDeEstudo();
    Stude.Usuario var15 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test428");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var15 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test429");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    var9.setMetodoAvancado();
    var9.setMetodoAvancado();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var9.addDisciplina("Metodo de estudo avancado", 1);
    Stude.Disciplina var19 = var9.getDisciplina("");
    Stude.Disciplina var21 = var9.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test430");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    java.lang.String var14 = var10.getNome();
    int var15 = var10.getCor();
    java.lang.String var16 = var10.getNome();
    var7.addDisciplina(var10);
    var10.addHorasDeEstudo(3.0d);
    var10.addHorasDeEstudo(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test431");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    double var8 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    var2.setCor(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test432");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test433");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    int var15 = var0.getIntervalo();
    int var16 = var0.getTempo();
    int var17 = var0.getIntervalo();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test434");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test435");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var15.setCor(100);
    Stude.Cronograma var18 = new Stude.Cronograma();
    java.util.List var19 = var18.getDisciplinas();
    Stude.Disciplina var21 = var18.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var23 = var18.getDisciplina("hi!");
    Stude.Disciplina var25 = var18.getDisciplina("");
    boolean var26 = var15.equals((java.lang.Object)"");
    var0.addDisciplina(var15);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var31 = var30.getHorasEstudadas();
    var30.setNome("hi!");
    var30.setNome("Metodo de estudo avancado");
    var30.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var30);
    java.lang.String var39 = var30.getNome();
    Stude.Stude var41 = new Stude.Stude("hi!");
    int var42 = var41.intervalo();
    Stude.Usuario var43 = var41.getUsuario();
    Stude.Cronograma var44 = var41.getCronograma();
    java.util.HashMap var45 = var41.desempenho();
    var41.setMetodoRegular();
    Stude.Disciplina var48 = var41.getDisciplina("Metodo de estudo regular");
    int var49 = var41.tempoDeEstudo();
    var41.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var52 = var41.getCronograma();
    int var53 = var41.tempoDeEstudo();
    boolean var54 = var30.equals((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test436");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    var1.setNomeUsuario("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test437");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.tempoDeEstudo();
    java.util.List var6 = var1.getDisciplinas();
    java.util.List var7 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test438");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    Stude.Cronograma var10 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var10.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test439");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    Stude.Cronograma var16 = var15.getCronograma();
    Stude.Usuario var17 = var15.getUsuario();
    java.lang.String var18 = var17.getNome();
    java.lang.String var19 = var17.getNome();
    boolean var20 = var2.equals((java.lang.Object)var17);
    java.lang.String var21 = var2.toString();
    java.lang.String var22 = var2.getNome();
    java.lang.String var23 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test440");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    double var78 = var69.getHorasEstudadas();
    int var79 = var69.getCor();
    var69.setCor(30);
    java.lang.String var82 = var69.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "Metodo de estudo avancado"+ "'", var82.equals("Metodo de estudo avancado"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test441");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var9.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test442");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var9 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test443");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    int var9 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test444");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test445");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test446");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    int var10 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test447");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("hi!");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    var15.setCor(2);
    var4.addDisciplina(var15);
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.addDisciplina("hi!", 0);
    Stude.Cronograma var26 = var22.getCronograma();
    boolean var27 = var15.equals((java.lang.Object)var22);
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.addDisciplina("Metodo de estudo regular", 10);
    int var33 = var29.tempoDeEstudo();
    var29.addDisciplina("Metodo de estudo regular", 15);
    boolean var37 = var15.equals((java.lang.Object)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test448");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.addDisciplina("Metodo de estudo avancado", 5);
    int var9 = var1.intervalo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test449");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test450");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test451");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Cronograma var15 = new Stude.Cronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var15.getDisciplina("");
    java.util.List var20 = var15.getDisciplinas();
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.setMetodoAvancado();
    Stude.MetodoDeEstudo var24 = var22.getMetodoDeEstudo();
    var22.setMetodoAvancado();
    var22.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var30 = var22.getDisciplina("Metodo de estudo regular");
    var15.addDisciplina(var30);
    Stude.Disciplina var33 = var15.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var37 = var36.toString();
    var36.setCor(15);
    var36.setCor(15);
    Stude.Stude var43 = new Stude.Stude("hi!");
    var43.setMetodoAvancado();
    Stude.MetodoDeEstudo var45 = var43.getMetodoDeEstudo();
    java.util.HashMap var46 = var43.desempenho();
    var43.setMetodoRegular();
    java.util.List var48 = var43.getDisciplinas();
    java.util.HashMap var49 = var43.desempenho();
    int var50 = var43.intervalo();
    Stude.MetodoDeEstudo var51 = var43.getMetodoDeEstudo();
    boolean var52 = var36.equals((java.lang.Object)var51);
    var15.addDisciplina(var36);
    Stude.Disciplina var56 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var57 = var56.toString();
    java.lang.String var58 = var56.getNome();
    var15.addDisciplina(var56);
    java.util.List var60 = var15.getDisciplinas();
    Stude.Disciplina var63 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var64 = var63.toString();
    var63.setCor(15);
    java.lang.String var67 = var63.getNome();
    Stude.Cronograma var68 = new Stude.Cronograma();
    Stude.Disciplina var70 = var68.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var72 = var68.getDisciplina("");
    java.util.List var73 = var68.getDisciplinas();
    boolean var74 = var63.equals((java.lang.Object)var68);
    java.lang.String var75 = var63.toString();
    int var76 = var63.getCor();
    java.lang.String var77 = var63.getNome();
    Stude.Disciplina var80 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var81 = var80.getHorasEstudadas();
    double var82 = var80.getHorasEstudadas();
    java.lang.String var83 = var80.toString();
    boolean var84 = var63.equals((java.lang.Object)var80);
    var63.setCor(2);
    var15.addDisciplina(var63);
    var14.addDisciplina(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo avancado"+ "'", var37.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "Metodo de estudo avancado"+ "'", var57.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Metodo de estudo avancado"+ "'", var58.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Metodo de estudo avancado"+ "'", var64.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "Metodo de estudo avancado"+ "'", var67.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "Metodo de estudo avancado"+ "'", var75.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Metodo de estudo avancado"+ "'", var77.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Metodo de estudo regular"+ "'", var83.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test452");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    int var15 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test453");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Cronograma var13 = var1.getCronograma();
    int var14 = var13.tamanhoDisciplinas();
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Usuario var28 = var16.getUsuario();
    Stude.Cronograma var29 = var16.getCronograma();
    Stude.Cronograma var30 = new Stude.Cronograma();
    java.util.List var31 = var30.getDisciplinas();
    Stude.Disciplina var33 = var30.getDisciplina("Metodo de estudo regular");
    Stude.Stude var35 = new Stude.Stude("hi!");
    var35.setMetodoAvancado();
    Stude.MetodoDeEstudo var37 = var35.getMetodoDeEstudo();
    java.util.HashMap var38 = var35.desempenho();
    var35.setMetodoRegular();
    Stude.MetodoDeEstudo var40 = var35.getMetodoDeEstudo();
    var35.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var43 = var35.getCronograma();
    Stude.Disciplina var45 = var35.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var46 = var35.getCronograma();
    int var47 = var46.tamanhoDisciplinas();
    Stude.Disciplina var50 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var50.addHorasDeEstudo(10.0d);
    java.lang.String var53 = var50.toString();
    java.lang.String var54 = var50.getNome();
    int var55 = var50.getCor();
    var46.addDisciplina(var50);
    var30.addDisciplina(var50);
    Stude.Disciplina var60 = new Stude.Disciplina("hi!", 5);
    double var61 = var60.getHorasEstudadas();
    var60.addHorasDeEstudo(10.0d);
    java.lang.String var64 = var60.toString();
    java.lang.String var65 = var60.toString();
    java.lang.String var66 = var60.getNome();
    var30.addDisciplina(var60);
    Stude.Disciplina var70 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var71 = var70.getHorasEstudadas();
    int var72 = var70.getCor();
    var30.addDisciplina(var70);
    var29.addDisciplina(var70);
    var70.setNome("Metodo de estudo regular");
    var13.addDisciplina(var70);
    java.util.List var78 = var13.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo regular"+ "'", var53.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Metodo de estudo regular"+ "'", var54.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi!"+ "'", var64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test454");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test455");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test456");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test457");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.HashMap var13 = var1.desempenho();
    Stude.Usuario var14 = var1.getUsuario();
    java.lang.String var15 = var14.getNome();
    var14.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test458");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var13 = var1.getDisciplinas();
    Stude.Cronograma var14 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test459");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    int var15 = var0.getTempo();
    int var16 = var0.getIntervalo();
    java.lang.String var17 = var0.toString();
    int var18 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 15);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test460");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test461");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test462");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    var0.addDisciplina(var10);
    java.lang.String var18 = var10.getNome();
    double var19 = var10.getHorasEstudadas();
    java.lang.String var20 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test463");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test464");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.List var7 = var1.getDisciplinas();
    java.util.HashMap var8 = Stude.Desempenho.tempoDeEstudo(var7);
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var7);
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test465");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.addDisciplina("hi!", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test466");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.List var9 = var1.getDisciplinas();
    Stude.Disciplina var11 = var1.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test467");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Usuario var10 = var1.getUsuario();
    var10.setNome("Metodo de estudo regular");
    var10.setNome("Metodo de estudo avancado");
    var10.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test468");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var7.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test469");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    java.util.HashMap var11 = var1.desempenho();
    int var12 = var1.intervalo();
    java.util.HashMap var13 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test470");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("Metodo de estudo avancado", 15);
    java.util.List var9 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test471");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    int var2 = var1.intervalo();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = var3.getDisciplina("");
    int var8 = var3.tamanhoDisciplinas();
    Stude.Disciplina var10 = var3.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test472");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var27 = var0.getDisciplinas();
    int var28 = var0.tamanhoDisciplinas();
    Stude.Stude var30 = new Stude.Stude("hi!");
    int var31 = var30.intervalo();
    Stude.Usuario var32 = var30.getUsuario();
    int var33 = var30.tempoDeEstudo();
    java.util.HashMap var34 = var30.desempenho();
    Stude.MetodoDeEstudo var35 = var30.getMetodoDeEstudo();
    Stude.Cronograma var36 = var30.getCronograma();
    int var37 = var36.tamanhoDisciplinas();
    Stude.Disciplina var40 = new Stude.Disciplina("hi!", 5);
    double var41 = var40.getHorasEstudadas();
    var40.addHorasDeEstudo(10.0d);
    var40.setCor(0);
    var36.addDisciplina(var40);
    var0.addDisciplina(var40);
    java.util.List var48 = var0.getDisciplinas();
    java.util.List var49 = var0.getDisciplinas();
    Stude.Disciplina var51 = var0.getDisciplina("Metodo de estudo avancado");
    double var52 = var51.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test473");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Usuario var12 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test474");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    int var15 = var13.getCor();
    var0.addDisciplina(var13);
    java.lang.String var17 = var13.getNome();
    java.lang.String var18 = var13.getNome();
    var13.addHorasDeEstudo(10.0d);
    var13.setCor(5);
    Stude.Stude var24 = new Stude.Stude("hi!");
    int var25 = var24.intervalo();
    Stude.Usuario var26 = var24.getUsuario();
    var24.setMetodoRegular();
    var24.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var30 = var24.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var31 = var24.getMetodoDeEstudo();
    java.util.HashMap var32 = var24.desempenho();
    java.util.List var33 = var24.getDisciplinas();
    boolean var34 = var13.equals((java.lang.Object)var24);
    double var35 = var13.getHorasEstudadas();
    java.lang.String var36 = var13.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test475");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var0.addDisciplina(var9);
    Stude.Disciplina var15 = var0.getDisciplina("Metodo de estudo regular");
    int var16 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test476");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test477");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    Stude.Usuario var8 = var1.getUsuario();
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test478");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.HashMap var12 = var1.desempenho();
    int var13 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test479");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    var8.setCor(5);
    double var12 = var8.getHorasEstudadas();
    java.lang.String var13 = var8.toString();
    java.lang.String var14 = var8.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test480");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 15);
    var27.setCor(15);
    var27.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var27);
    Stude.Disciplina var34 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var36 = new Stude.Stude("hi!");
    int var37 = var36.intervalo();
    Stude.Usuario var38 = var36.getUsuario();
    Stude.Cronograma var39 = var36.getCronograma();
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var42.addHorasDeEstudo(10.0d);
    java.lang.String var45 = var42.toString();
    java.lang.String var46 = var42.getNome();
    java.lang.String var47 = var42.getNome();
    var39.addDisciplina(var42);
    Stude.Stude var50 = new Stude.Stude("hi!");
    var50.addDisciplina("hi!", 0);
    Stude.Disciplina var55 = var50.getDisciplina("Metodo de estudo regular");
    var50.setMetodoRegular();
    var50.setMetodoAvancado();
    boolean var58 = var42.equals((java.lang.Object)var50);
    int var59 = var50.intervalo();
    boolean var60 = var34.equals((java.lang.Object)var50);
    java.lang.String var61 = var34.getNome();
    int var62 = var34.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Metodo de estudo regular"+ "'", var61.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test481");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 15);
    var27.setCor(15);
    var27.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var27);
    Stude.Disciplina var34 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var36 = new Stude.Stude("hi!");
    int var37 = var36.intervalo();
    Stude.Usuario var38 = var36.getUsuario();
    Stude.Cronograma var39 = var36.getCronograma();
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var42.addHorasDeEstudo(10.0d);
    java.lang.String var45 = var42.toString();
    java.lang.String var46 = var42.getNome();
    java.lang.String var47 = var42.getNome();
    var39.addDisciplina(var42);
    Stude.Stude var50 = new Stude.Stude("hi!");
    var50.addDisciplina("hi!", 0);
    Stude.Disciplina var55 = var50.getDisciplina("Metodo de estudo regular");
    var50.setMetodoRegular();
    var50.setMetodoAvancado();
    boolean var58 = var42.equals((java.lang.Object)var50);
    int var59 = var50.intervalo();
    boolean var60 = var34.equals((java.lang.Object)var50);
    var50.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var63 = var50.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test482");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("Metodo de estudo avancado", 15);
    var1.addDisciplina("Metodo de estudo avancado", 1);
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test483");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test484");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    int var17 = var1.tempoDeEstudo();
    java.util.List var18 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test485");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test486");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    java.lang.String var14 = var10.getNome();
    Stude.Cronograma var15 = new Stude.Cronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var15.getDisciplina("");
    java.util.List var20 = var15.getDisciplinas();
    boolean var21 = var10.equals((java.lang.Object)var15);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var25 = var24.toString();
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    Stude.MetodoDeEstudo var32 = var27.getMetodoDeEstudo();
    var27.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var35 = var27.desempenho();
    boolean var36 = var24.equals((java.lang.Object)var35);
    var15.addDisciplina(var24);
    boolean var38 = var2.equals((java.lang.Object)var15);
    Stude.Avancado var39 = new Stude.Avancado();
    java.lang.String var40 = var39.toString();
    java.lang.String var41 = var39.toString();
    int var42 = var39.getIntervalo();
    int var43 = var39.getIntervalo();
    boolean var44 = var2.equals((java.lang.Object)var43);
    var2.setNome("hi!");
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var50 = var49.toString();
    var49.setCor(15);
    java.lang.String var53 = var49.getNome();
    Stude.Cronograma var54 = new Stude.Cronograma();
    Stude.Disciplina var56 = var54.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var54.getDisciplina("");
    java.util.List var59 = var54.getDisciplinas();
    boolean var60 = var49.equals((java.lang.Object)var54);
    java.util.List var61 = var54.getDisciplinas();
    java.util.HashMap var62 = Stude.Desempenho.tempoDeEstudo(var61);
    boolean var63 = var2.equals((java.lang.Object)var62);
    var2.setNome("hi!");
    java.lang.String var66 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo avancado"+ "'", var53.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test487");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test488");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = var1.desempenho();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test489");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    double var9 = var2.getHorasEstudadas();
    var2.setCor(3);
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    Stude.Usuario var15 = var13.getUsuario();
    var13.setMetodoRegular();
    var13.setMetodoRegular();
    Stude.Usuario var18 = var13.getUsuario();
    boolean var19 = var2.equals((java.lang.Object)var18);
    java.lang.String var20 = var18.getNome();
    java.lang.String var21 = var18.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test490");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var7 = var1.getUsuario();
    java.lang.String var8 = var7.getNome();
    java.lang.String var9 = var7.getNome();
    java.lang.String var10 = var7.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test491");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    java.lang.String var28 = var20.toString();
    int var29 = var20.getCor();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    java.lang.String var33 = var32.toString();
    boolean var34 = var20.equals((java.lang.Object)var32);
    java.lang.String var35 = var20.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test492");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    int var13 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test493");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var11 = var10.getHorasEstudadas();
    var10.setNome("hi!");
    var10.setNome("hi!");
    var7.addDisciplina(var10);
    double var17 = var10.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test494");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    Stude.Cronograma var15 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    var1.setNomeUsuario("hi!");
    java.util.HashMap var21 = var1.desempenho();
    var1.setMetodoRegular();
    int var23 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 5);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test495");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    Stude.Cronograma var10 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test496");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test497");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    Stude.Cronograma var16 = var15.getCronograma();
    Stude.Usuario var17 = var15.getUsuario();
    java.lang.String var18 = var17.getNome();
    java.lang.String var19 = var17.getNome();
    boolean var20 = var2.equals((java.lang.Object)var17);
    java.lang.String var21 = var2.getNome();
    java.lang.String var22 = var2.toString();
    java.lang.String var23 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test498");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    int var16 = var0.getTempo();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test499");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 100);
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test500");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);

  }

}
