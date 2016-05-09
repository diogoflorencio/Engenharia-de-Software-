package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    Stude.Desempenho var0 = new Stude.Desempenho();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Stude var1 = new Stude.Stude("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
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

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var13 = var12.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDisciplina(var12);
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
    assertTrue(var13 == 0.0d);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
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

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    var1.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.lang.String var4 = var3.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


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
      boolean var15 = var0.removeDisciplina("");
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

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.setNome("hi!");
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

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
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

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
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

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertTrue(var7 == 15);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var2.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.addHorasDeEstudo(0.0d);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Usuario var1 = new Stude.Usuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var0.removeDisciplina("");
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
    assertTrue(var14 == 2);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.addHorasDeEstudo(0.0d);
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

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("");
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

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var4.removeDisciplina("hi!");
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

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
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

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var8);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(10);
    var2.addDisciplina(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 5);
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

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    int var5 = var2.getCor();
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var10.removeDisciplina("");
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

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    var6.setNome("hi!");
    var6.setNome("Metodo de estudo avancado");
    
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    int var11 = var9.tamanhoDisciplinas();
    
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var2.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
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
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("");
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

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    var2.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
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
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    int var2 = var0.tamanhoDisciplinas();
    int var3 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
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
    assertTrue(var7 == 15);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    var2.addHorasDeEstudo(1.0d);
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

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
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
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    java.lang.String var3 = var2.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var0.removeDisciplina("hi!");
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

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 100);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    var4.setCor(15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    var13.setNome("hi!");
    var13.setCor(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.addHorasDeEstudo(0.0d);
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

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var11.removeDisciplina("");
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
    assertNotNull(var12);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    double var8 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var0.removeDisciplina("hi!");
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

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.removeDisciplina("");
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

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    java.lang.String var5 = var4.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    java.util.List var3 = var1.getDisciplinas();
    java.util.HashMap var4 = Stude.Desempenho.tempoDeEstudo(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    java.lang.String var7 = var2.getNome();
    var2.setCor(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    java.util.HashMap var2 = Stude.Desempenho.tempoDeEstudo(var1);
    java.util.HashMap var3 = Stude.Desempenho.tempoDeEstudo(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    var8.setCor(5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.addHorasDeEstudo((-1.0d));
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

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.removeDisciplina("Metodo de estudo avancado");
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
    assertNull(var7);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var4.setNome("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 0);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var4.setNome("Metodo de estudo regular");
    java.lang.String var7 = var4.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 30);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 30);
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

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    Stude.Disciplina var7 = var1.getDisciplina("");
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var31 = var7.removeDisciplina("");
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

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var2.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 10);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    var1.addDisciplina("hi!", 15);
    java.util.List var13 = var1.getDisciplinas();
    java.util.List var14 = var1.getDisciplinas();
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var10 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
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

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
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

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    var6.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    java.util.List var8 = var0.getDisciplinas();
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var8);
    
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

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var2.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Usuario var4 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setNome("");
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

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var10.removeDisciplina("");
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
    assertNotNull(var10);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", (-1));
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

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    int var2 = var1.intervalo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    java.util.List var19 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var0.removeDisciplina("");
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    java.util.List var7 = var6.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var6.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var7);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    java.util.List var7 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.removeDisciplina("");
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


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
    java.lang.String var18 = var13.toString();
    
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
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("");
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

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.addHorasDeEstudo(0.0d);
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
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var2.getNome();
    java.lang.String var14 = var2.toString();
    
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

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("");
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("");
    
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

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Usuario var10 = var1.getUsuario();
    int var11 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.addHorasDeEstudo((-1.0d));
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
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var3.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    
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
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("Metodo de estudo regular");
    int var8 = var2.getCor();
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
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.removeDisciplina("");
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

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    double var9 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getNome();
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = var11.getNome();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("Metodo de estudo regular");
    
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

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    
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

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.util.List var8 = var0.getDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    java.lang.String var5 = var4.getNome();
    java.lang.String var6 = var4.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
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

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.setNome("Metodo de estudo avancado");
    Stude.Avancado var10 = new Stude.Avancado();
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    int var13 = var10.getIntervalo();
    java.lang.String var14 = var10.toString();
    java.lang.String var15 = var10.toString();
    int var16 = var10.getIntervalo();
    boolean var17 = var2.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var2.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var9.getDisciplinas();
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getNome();
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    var10.setNomeUsuario("Metodo de estudo regular");
    var10.setNomeUsuario("Metodo de estudo regular");
    int var16 = var10.tempoDeEstudo();
    Stude.Cronograma var17 = var10.getCronograma();
    boolean var18 = var2.equals((java.lang.Object)var17);
    double var19 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10.0d);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setNome("");
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

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    int var3 = var2.getCor();
    double var4 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 15);
    
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

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.util.List var8 = var0.getDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    int var5 = var2.getCor();
    var2.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor(3);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getNome();
    java.lang.String var14 = var11.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setNome("");
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    java.util.List var9 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var7.removeDisciplina("Metodo de estudo avancado");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
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

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    var6.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var7 = var2.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var6.addDisciplina(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var6.removeDisciplina("");
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

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


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
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var0.removeDisciplina("");
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
    assertNotNull(var22);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setNome("");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 1);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var9.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var6 = var2.getNome();
    double var7 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


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
      boolean var13 = var1.removeDisciplina("");
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

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    java.util.List var19 = var0.getDisciplinas();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var23 = var22.toString();
    var22.setCor(15);
    java.lang.String var26 = var22.getNome();
    boolean var28 = var22.equals((java.lang.Object)(byte)100);
    var0.addDisciplina(var22);
    int var30 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.removeDisciplina("hi!");
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    java.util.List var19 = var0.getDisciplinas();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var23 = var22.toString();
    var22.setCor(15);
    java.lang.String var26 = var22.getNome();
    boolean var28 = var22.equals((java.lang.Object)(byte)100);
    var0.addDisciplina(var22);
    int var30 = var22.getCor();
    java.lang.String var31 = var22.toString();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("Metodo de estudo regular");
    java.lang.String var10 = var7.getNome();
    java.lang.String var11 = var7.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.intervalo();
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("hi!");
    Stude.Disciplina var7 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.addHorasDeEstudo((-1.0d));
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("Metodo de estudo regular");
    int var8 = var2.getCor();
    var2.setCor(30);
    double var11 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    Stude.Disciplina var7 = var1.getDisciplina("");
    int var8 = var1.intervalo();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var69.addHorasDeEstudo((-1.0d));
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

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.removeDisciplina("hi!");
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

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Usuario var10 = var1.getUsuario();
    var10.setNome("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNome("");
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
    assertNotNull(var10);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


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
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var37.setCor((-1));
    java.lang.String var40 = var37.getNome();
    java.lang.String var41 = var37.getNome();
    int var42 = var37.getCor();
    var37.setNome("Metodo de estudo avancado");
    var7.addDisciplina(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var47 = var7.removeDisciplina("hi!");
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
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var5);
    
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

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
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

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
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

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var9.removeDisciplina("");
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    int var2 = var1.intervalo();
    Stude.Cronograma var3 = var1.getCronograma();
    int var4 = var3.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var6.addDisciplina(var9);
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    var13.addHorasDeEstudo(10.0d);
    java.lang.String var18 = var13.getNome();
    int var19 = var13.getCor();
    var6.addDisciplina(var13);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    java.lang.String var26 = var23.getNome();
    java.lang.String var27 = var23.getNome();
    int var28 = var23.getCor();
    double var29 = var23.getHorasEstudadas();
    var23.addHorasDeEstudo(20.0d);
    var6.addDisciplina(var23);
    java.lang.String var33 = var23.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Usuario var8 = var1.getUsuario();
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
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 1);
    var2.addHorasDeEstudo(100.0d);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var4 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var4.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setNome("");
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
    assertNotNull(var6);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


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
    boolean var29 = var0.removeDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var31 = var0.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var29 == true);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var9);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.addDisciplina("Metodo de estudo regular", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
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

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    var2.setNome("hi!");
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

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var4.removeDisciplina("");
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
    assertNull(var7);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
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
    assertNotNull(var8);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.HashMap var5 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    int var3 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    int var3 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo regular", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var10 = var8.getDisciplina("");
    Stude.Disciplina var12 = var8.getDisciplina("Metodo de estudo regular");
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    java.util.List var9 = var8.getDisciplinas();
    int var10 = var8.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var8.removeDisciplina("Metodo de estudo regular");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setCor(2);
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    java.util.HashMap var14 = var11.desempenho();
    var11.setMetodoRegular();
    java.util.List var16 = var11.getDisciplinas();
    java.util.HashMap var17 = var11.desempenho();
    var11.addDisciplina("hi!", 5);
    boolean var21 = var2.equals((java.lang.Object)5);
    java.lang.String var22 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    
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

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.List var7 = var1.getDisciplinas();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    Stude.Disciplina var4 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Disciplina var11 = var1.getDisciplina("");
    
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
    assertNull(var11);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


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
    Stude.Disciplina var19 = var0.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var19);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    var1.addDisciplina("hi!", 15);
    java.util.List var13 = var1.getDisciplinas();
    java.util.List var14 = var1.getDisciplinas();
    int var15 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 0);
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
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
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    int var8 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    int var3 = var2.getCor();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    Stude.Usuario var1 = new Stude.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("Metodo de estudo regular");
    java.lang.String var5 = var1.getNome();
    java.lang.String var6 = var1.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var14);
    
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

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 0);
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
    assertNull(var9);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    var5.setNome("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


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
    int var17 = var15.getCor();
    
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
    assertTrue(var17 == 1);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.tempoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var7.removeDisciplina("");
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
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 15);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


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
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var25.setCor((-1));
    java.lang.String var28 = var25.getNome();
    java.lang.String var29 = var25.getNome();
    int var30 = var25.getCor();
    double var31 = var25.getHorasEstudadas();
    var25.setNome("Metodo de estudo avancado");
    var3.addDisciplina(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var3.removeDisciplina("");
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(15);
    var2.addDisciplina(var7);
    int var14 = var2.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    java.lang.String var4 = var3.getNome();
    java.lang.String var5 = var3.getNome();
    java.lang.String var6 = var3.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    java.lang.String var5 = var4.getNome();
    var4.setNome("Metodo de estudo avancado");
    var4.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 100);
    var2.setCor(30);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


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
    Stude.Disciplina var12 = var10.getDisciplina("Metodo de estudo avancado");
    java.util.List var13 = var10.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var10.removeDisciplina("");
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
    assertNotNull(var13);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    int var8 = var1.intervalo();
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var10.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var10.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Cronograma var8 = var1.getCronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    java.util.List var2 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    Stude.Usuario var1 = new Stude.Usuario("hi!");
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var4 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


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
    Stude.Cronograma var14 = var1.getCronograma();
    java.util.List var15 = var14.getDisciplinas();
    Stude.Disciplina var18 = new Stude.Disciplina("hi!", 30);
    var18.setCor(2);
    var14.addDisciplina(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.addHorasDeEstudo((-1.0d));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


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
    var15.setMetodoAvancado();
    Stude.MetodoDeEstudo var17 = var15.getMetodoDeEstudo();
    java.util.HashMap var18 = var15.desempenho();
    var15.setMetodoRegular();
    Stude.MetodoDeEstudo var20 = var15.getMetodoDeEstudo();
    var15.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var23 = var15.getCronograma();
    java.util.List var24 = var15.getDisciplinas();
    java.util.HashMap var25 = var15.desempenho();
    boolean var26 = var7.equals((java.lang.Object)var25);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


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
    var17.setNome("Metodo de estudo regular");
    Stude.Disciplina var29 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    boolean var30 = var17.equals((java.lang.Object)"Metodo de estudo avancado");
    
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
    assertTrue(var30 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var7.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 10);
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

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("hi!");
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

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    double var12 = var11.getHorasEstudadas();
    var11.setNome("Metodo de estudo regular");
    var11.setCor(3);
    
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

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    int var14 = var11.getCor();
    var11.addHorasDeEstudo(1.0d);
    java.lang.String var17 = var11.getNome();
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 30);
    boolean var21 = var11.equals((java.lang.Object)var20);
    var0.addDisciplina(var11);
    var11.setCor((-1));
    
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
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.removeDisciplina("");
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.removeDisciplina("hi!");
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

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    Stude.Cronograma var8 = var7.getCronograma();
    Stude.Cronograma var9 = var7.getCronograma();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.setCor((-1));
    int var15 = var12.getCor();
    var12.addHorasDeEstudo(1.0d);
    java.lang.String var18 = var12.getNome();
    Stude.Disciplina var21 = new Stude.Disciplina("hi!", 30);
    boolean var22 = var12.equals((java.lang.Object)var21);
    java.lang.String var23 = var21.getNome();
    var21.setNome("hi!");
    var9.addDisciplina(var21);
    var4.addDisciplina(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.addHorasDeEstudo(0.0d);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNome("");
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var5);
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var5);
    java.util.HashMap var8 = Stude.Desempenho.tempoDeEstudo(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getNome();
    var11.setCor(0);
    java.lang.String var16 = var11.getNome();
    double var17 = var11.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


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
    Stude.Stude var28 = new Stude.Stude("hi!");
    var28.setMetodoAvancado();
    Stude.MetodoDeEstudo var30 = var28.getMetodoDeEstudo();
    java.util.HashMap var31 = var28.desempenho();
    var28.setMetodoRegular();
    java.util.List var33 = var28.getDisciplinas();
    java.util.HashMap var34 = var28.desempenho();
    int var35 = var28.intervalo();
    Stude.MetodoDeEstudo var36 = var28.getMetodoDeEstudo();
    boolean var37 = var21.equals((java.lang.Object)var36);
    var0.addDisciplina(var21);
    java.util.List var39 = var0.getDisciplinas();
    Stude.Cronograma var40 = new Stude.Cronograma();
    Stude.Disciplina var42 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var40.getDisciplina("");
    java.util.List var45 = var40.getDisciplinas();
    Stude.Stude var47 = new Stude.Stude("hi!");
    var47.setMetodoAvancado();
    Stude.MetodoDeEstudo var49 = var47.getMetodoDeEstudo();
    var47.setMetodoAvancado();
    var47.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var55 = var47.getDisciplina("Metodo de estudo regular");
    var40.addDisciplina(var55);
    double var57 = var55.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDisciplina(var55);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    java.lang.String var8 = var6.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setNome("");
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var14 = var12.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var14);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    int var5 = var1.intervalo();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    var6.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    java.util.List var3 = var2.getDisciplinas();
    int var4 = var2.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var2.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var4.removeDisciplina("hi!");
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

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    int var3 = var2.getCor();
    double var4 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


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
    java.lang.String var19 = var2.getNome();
    int var20 = var2.getCor();
    
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
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 15);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var6.addDisciplina(var9);
    java.lang.String var11 = var9.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.addHorasDeEstudo(0.0d);
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
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


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
    java.lang.String var28 = var20.getNome();
    var20.addHorasDeEstudo(20.0d);
    
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

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var13.removeDisciplina("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getNome();
    double var5 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    java.lang.String var8 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var6.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


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
    var20.addHorasDeEstudo(20.0d);
    
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

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


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
    Stude.Disciplina var16 = var1.getDisciplina("");
    
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
    assertNull(var16);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


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
    var13.setNome("Metodo de estudo regular");
    
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

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    int var14 = var11.getCor();
    java.lang.String var15 = var11.getNome();
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var18.setCor((-1));
    int var21 = var18.getCor();
    var18.addHorasDeEstudo(1.0d);
    java.lang.String var24 = var18.getNome();
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 30);
    boolean var28 = var18.equals((java.lang.Object)var27);
    var27.setNome("Metodo de estudo regular");
    Stude.Stude var32 = new Stude.Stude("hi!");
    var32.setMetodoAvancado();
    Stude.MetodoDeEstudo var34 = var32.getMetodoDeEstudo();
    java.util.HashMap var35 = var32.desempenho();
    var32.setMetodoRegular();
    Stude.MetodoDeEstudo var37 = var32.getMetodoDeEstudo();
    var32.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var40 = var32.getCronograma();
    Stude.Disciplina var42 = var32.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var43 = var32.getCronograma();
    Stude.Cronograma var44 = var32.getCronograma();
    java.util.List var45 = var44.getDisciplinas();
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var48.setCor((-1));
    var48.addHorasDeEstudo(10.0d);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var60 = var53.getDisciplina("");
    java.util.List var61 = var53.getDisciplinas();
    java.util.HashMap var62 = Stude.Desempenho.tempoDeEstudo(var61);
    java.util.HashMap var63 = Stude.Desempenho.tempoDeEstudo(var61);
    java.util.HashMap var64 = Stude.Desempenho.tempoDeEstudo(var61);
    java.util.HashMap var65 = Stude.Desempenho.tempoDeEstudo(var61);
    boolean var66 = var48.equals((java.lang.Object)var65);
    var44.addDisciplina(var48);
    boolean var68 = var27.equals((java.lang.Object)var44);
    Stude.Cronograma var69 = new Stude.Cronograma();
    java.util.List var70 = var69.getDisciplinas();
    Stude.Disciplina var72 = var69.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var74 = var69.getDisciplina("hi!");
    Stude.Disciplina var77 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var69.addDisciplina(var77);
    Stude.Disciplina var81 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var69.addDisciplina(var81);
    Stude.Disciplina var85 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var86 = var85.toString();
    var85.setCor(15);
    var85.setCor(10);
    var69.addDisciplina(var85);
    int var92 = var85.getCor();
    var44.addDisciplina(var85);
    boolean var94 = var11.equals((java.lang.Object)var85);
    var8.addDisciplina(var85);
    
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
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "Metodo de estudo avancado"+ "'", var86.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


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
    double var23 = var22.getHorasEstudadas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    int var9 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("hi!");
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


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
    var13.setNome("hi!");
    int var19 = var13.getCor();
    var13.setNome("hi!");
    
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
    assertTrue(var19 == 5);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Usuario var5 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.setCor((-1));
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var12 = var7.getNome();
    var7.setNome("Metodo de estudo regular");
    var4.addDisciplina(var7);
    double var16 = var7.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.addHorasDeEstudo(0.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    var1.addDisciplina("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("hi!");
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

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


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
    Stude.Disciplina var30 = new Stude.Disciplina("hi!", 5);
    double var31 = var30.getHorasEstudadas();
    var30.addHorasDeEstudo(10.0d);
    java.lang.String var34 = var30.toString();
    java.lang.String var35 = var30.toString();
    java.lang.String var36 = var30.getNome();
    var0.addDisciplina(var30);
    java.lang.String var38 = var30.toString();
    var30.setCor(15);
    
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
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    
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
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 5);
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 0);
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
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Usuario var10 = var1.getUsuario();
    java.lang.String var11 = var10.getNome();
    var10.setNome("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNome("");
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    java.util.List var6 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var6);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    java.util.List var3 = var2.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    var2.setNome("Metodo de estudo avancado");
    var2.addHorasDeEstudo(1.0d);
    double var10 = var2.getHorasEstudadas();
    java.lang.String var11 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


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
    int var13 = var1.intervalo();
    var1.addDisciplina("hi!", (-1));
    
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
    assertTrue(var13 == 5);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


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
    int var14 = var1.intervalo();
    
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
    assertTrue(var14 == 5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    var3.setNome("Metodo de estudo regular");
    java.lang.String var6 = var3.getNome();
    java.lang.String var7 = var3.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("hi!");
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

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


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
    java.util.List var35 = var7.getDisciplinas();
    Stude.Disciplina var38 = new Stude.Disciplina("hi!", 5);
    double var39 = var38.getHorasEstudadas();
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var42 = var38.toString();
    java.lang.String var43 = var38.toString();
    java.lang.String var44 = var38.getNome();
    var38.addHorasDeEstudo(10.0d);
    var38.setCor(5);
    var7.addDisciplina(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var51 = var7.removeDisciplina("");
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Usuario var12 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 10);
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
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


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
    int var23 = var16.getCor();
    
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
    assertTrue(var23 == 5);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


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
    Stude.Disciplina var30 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var30);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    java.util.HashMap var12 = var9.desempenho();
    var9.setMetodoRegular();
    Stude.MetodoDeEstudo var14 = var9.getMetodoDeEstudo();
    var9.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var17 = var9.getCronograma();
    Stude.Disciplina var19 = var9.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var20 = var9.getCronograma();
    Stude.Cronograma var21 = var9.getCronograma();
    java.util.List var22 = var21.getDisciplinas();
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var25.setCor((-1));
    var25.addHorasDeEstudo(10.0d);
    Stude.Cronograma var30 = new Stude.Cronograma();
    java.util.List var31 = var30.getDisciplinas();
    Stude.Disciplina var33 = var30.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var35 = var30.getDisciplina("hi!");
    Stude.Disciplina var37 = var30.getDisciplina("");
    java.util.List var38 = var30.getDisciplinas();
    java.util.HashMap var39 = Stude.Desempenho.tempoDeEstudo(var38);
    java.util.HashMap var40 = Stude.Desempenho.tempoDeEstudo(var38);
    java.util.HashMap var41 = Stude.Desempenho.tempoDeEstudo(var38);
    java.util.HashMap var42 = Stude.Desempenho.tempoDeEstudo(var38);
    boolean var43 = var25.equals((java.lang.Object)var42);
    var21.addDisciplina(var25);
    var0.addDisciplina(var25);
    var25.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    int var6 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
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
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    var5.setMetodoAvancado();
    Stude.Cronograma var9 = var5.getCronograma();
    boolean var10 = var2.equals((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var5.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
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

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    var1.addDisciplina("hi!", 15);
    java.util.List var13 = var1.getDisciplinas();
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var13);
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


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
    var15.setNome("Metodo de estudo avancado");
    var15.setCor(5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setNome("");
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var14 = var7.getDisciplina("");
    java.util.List var15 = var7.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    java.util.HashMap var17 = Stude.Desempenho.tempoDeEstudo(var15);
    java.util.HashMap var18 = Stude.Desempenho.tempoDeEstudo(var15);
    java.util.HashMap var19 = Stude.Desempenho.tempoDeEstudo(var15);
    boolean var20 = var2.equals((java.lang.Object)var19);
    var2.setNome("Metodo de estudo regular");
    var2.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
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
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    int var5 = var2.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


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
    java.util.List var30 = var7.getDisciplinas();
    java.util.List var31 = var7.getDisciplinas();
    java.util.HashMap var32 = Stude.Desempenho.tempoDeEstudo(var31);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


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
    var11.setCor(0);
    Stude.Stude var21 = new Stude.Stude("hi!");
    int var22 = var21.intervalo();
    Stude.Usuario var23 = var21.getUsuario();
    int var24 = var21.tempoDeEstudo();
    java.util.HashMap var25 = var21.desempenho();
    Stude.MetodoDeEstudo var26 = var21.getMetodoDeEstudo();
    java.util.List var27 = var21.getDisciplinas();
    java.util.HashMap var28 = Stude.Desempenho.tempoDeEstudo(var27);
    boolean var29 = var11.equals((java.lang.Object)var28);
    
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
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 30);
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    boolean var8 = var2.equals((java.lang.Object)(byte)100);
    var2.addHorasDeEstudo(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    
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

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var7 == 5);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    int var3 = var0.tamanhoDisciplinas();
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var4);
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    boolean var10 = var1.removeDisciplina("hi!");
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
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var6);
    java.util.HashMap var8 = Stude.Desempenho.tempoDeEstudo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getNome();
    var2.addHorasDeEstudo(10.0d);
    var2.setCor(5);
    int var13 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
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

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var1.removeDisciplina("Metodo de estudo avancado");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Disciplina var3 = var1.getDisciplina("");
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    java.util.List var3 = var1.getDisciplinas();
    int var4 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    
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
    assertTrue(var7 == 15);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    int var10 = var1.tempoDeEstudo();
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    int var8 = var7.tamanhoDisciplinas();
    java.util.List var9 = var7.getDisciplinas();
    
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
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var7.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var7.removeDisciplina("Metodo de estudo avancado");
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
    assertNull(var9);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


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
    var10.setMetodoRegular();
    int var20 = var10.tempoDeEstudo();
    java.util.List var21 = var10.getDisciplinas();
    java.util.List var22 = var10.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var10.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var9.getDisciplinas();
    java.util.List var11 = var9.getDisciplinas();
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var11);
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var11);
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


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
    java.lang.String var20 = var15.getNome();
    Stude.Stude var22 = new Stude.Stude("hi!");
    int var23 = var22.intervalo();
    Stude.MetodoDeEstudo var24 = var22.getMetodoDeEstudo();
    Stude.Disciplina var26 = var22.getDisciplina("Metodo de estudo avancado");
    var22.setMetodoAvancado();
    Stude.Usuario var28 = var22.getUsuario();
    Stude.Cronograma var29 = var22.getCronograma();
    java.util.List var30 = var29.getDisciplinas();
    boolean var31 = var15.equals((java.lang.Object)var30);
    
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
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    java.util.List var3 = var1.getDisciplinas();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    Stude.Cronograma var0 = new Stude.Cronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var11 = var1.getUsuario();
    
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
    assertNotNull(var11);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


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
    int var18 = var13.getCor();
    
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
    assertTrue(var18 == 5);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var43 = var13.removeDisciplina("");
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

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


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
    java.util.List var12 = var1.getDisciplinas();
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

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    java.util.HashMap var7 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var0.removeDisciplina("");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    int var8 = var0.tamanhoDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    Stude.Disciplina var12 = new Stude.Disciplina("hi!", 1);
    var0.addDisciplina(var12);
    Stude.Stude var15 = new Stude.Stude("hi!");
    int var16 = var15.intervalo();
    Stude.MetodoDeEstudo var17 = var15.getMetodoDeEstudo();
    Stude.Disciplina var19 = var15.getDisciplina("Metodo de estudo avancado");
    var15.setMetodoAvancado();
    Stude.Usuario var21 = var15.getUsuario();
    Stude.Cronograma var22 = var15.getCronograma();
    var15.setMetodoRegular();
    Stude.Usuario var24 = var15.getUsuario();
    var24.setNome("Metodo de estudo regular");
    boolean var27 = var12.equals((java.lang.Object)"Metodo de estudo regular");
    var12.setCor(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


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
    int var24 = var16.getCor();
    
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
    assertTrue(var24 == 10);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    java.lang.String var5 = var2.getNome();
    var2.setNome("Metodo de estudo avancado");
    var2.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertNotNull(var7);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.removeDisciplina("");
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

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


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
    double var31 = var2.getHorasEstudadas();
    Stude.Stude var33 = new Stude.Stude("hi!");
    var33.setMetodoAvancado();
    Stude.MetodoDeEstudo var35 = var33.getMetodoDeEstudo();
    var33.setMetodoAvancado();
    var33.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var41 = var33.getDisciplina("Metodo de estudo regular");
    var41.setCor(100);
    Stude.Cronograma var44 = new Stude.Cronograma();
    java.util.List var45 = var44.getDisciplinas();
    Stude.Disciplina var47 = var44.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var49 = var44.getDisciplina("hi!");
    Stude.Disciplina var51 = var44.getDisciplina("");
    boolean var52 = var41.equals((java.lang.Object)"");
    double var53 = var41.getHorasEstudadas();
    var41.setNome("Metodo de estudo regular");
    boolean var56 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.setCor(3);
    
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
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 0);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.HashMap var7 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("");
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

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var3.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    
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
    assertTrue(var8 == 10);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    int var15 = var0.tamanhoDisciplinas();
    int var16 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var0.removeDisciplina("hi!");
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
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    int var8 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


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
    Stude.Disciplina var60 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var61 = var60.toString();
    Stude.Stude var63 = new Stude.Stude("hi!");
    var63.setMetodoRegular();
    Stude.MetodoDeEstudo var65 = var63.getMetodoDeEstudo();
    var63.setMetodoAvancado();
    Stude.Cronograma var67 = var63.getCronograma();
    boolean var68 = var60.equals((java.lang.Object)var63);
    int var69 = var60.getCor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.addDisciplina(var60);
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
    assertTrue("'" + var61 + "' != '" + "Metodo de estudo avancado"+ "'", var61.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    Stude.Disciplina var7 = var1.getDisciplina("hi!");
    java.util.List var8 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


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
    Stude.Stude var29 = new Stude.Stude("hi!");
    int var30 = var29.intervalo();
    Stude.Usuario var31 = var29.getUsuario();
    Stude.Cronograma var32 = var29.getCronograma();
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var35.addHorasDeEstudo(10.0d);
    java.lang.String var38 = var35.toString();
    java.lang.String var39 = var35.getNome();
    java.lang.String var40 = var35.getNome();
    var32.addDisciplina(var35);
    var0.addDisciplina(var35);
    Stude.Disciplina var44 = var0.getDisciplina("Metodo de estudo avancado");
    
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
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Disciplina var3 = var1.getDisciplina("");
    Stude.Cronograma var4 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var4.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


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
    Stude.Disciplina var30 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var30.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var30);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var11.removeDisciplina("hi!");
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
    assertNotNull(var12);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
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
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var11.getNome();
    var11.setCor(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setNome("");
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    int var2 = var0.tamanhoDisciplinas();
    int var3 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    int var10 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var7.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var8 = var1.desempenho();
    Stude.Disciplina var10 = var1.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var10 = var1.getUsuario();
    java.lang.String var11 = var10.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNome("");
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


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
    var2.addHorasDeEstudo(20.0d);
    
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

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      Stude.Disciplina var2 = new Stude.Disciplina("", 3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    int var8 = var1.intervalo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo regular");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    
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
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    java.util.List var5 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    var1.setNome("hi!");
    var1.setNome("Metodo de estudo avancado");
    var1.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


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
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var1.removeDisciplina("Metodo de estudo regular");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


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
    var16.addHorasDeEstudo(10.0d);
    
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

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.lang.String var4 = var3.getNome();
    java.lang.String var5 = var3.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


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
    java.util.List var20 = var19.getDisciplinas();
    java.util.HashMap var21 = Stude.Desempenho.tempoDeEstudo(var20);
    
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

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var6);
    
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
    assertNotNull(var7);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    var1.setNome("hi!");
    var1.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


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
    java.util.List var78 = var28.getDisciplinas();
    java.util.List var79 = var28.getDisciplinas();
    
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
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var7 = var1.desempenho();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var12.removeDisciplina("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var10 = var8.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var12 = var8.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var8.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


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
    boolean var29 = var0.removeDisciplina("Metodo de estudo regular");
    int var30 = var0.tamanhoDisciplinas();
    
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(1.0d);
    int var14 = var2.getCor();
    var2.addHorasDeEstudo(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.setMetodoAvancado();
    Stude.Disciplina var7 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Usuario var12 = var1.getUsuario();
    var12.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    var1.addDisciplina("Metodo de estudo avancado", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    java.util.List var14 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
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

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("Metodo de estudo regular", 100);
    int var15 = var1.intervalo();
    
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
    assertTrue(var15 == 5);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    var2.setCor(15);
    var2.addHorasDeEstudo(10.0d);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var9.removeDisciplina("Metodo de estudo regular");
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
    assertTrue(var10 == 1);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


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
    Stude.Disciplina var30 = new Stude.Disciplina("hi!", 5);
    double var31 = var30.getHorasEstudadas();
    var30.addHorasDeEstudo(10.0d);
    java.lang.String var34 = var30.toString();
    java.lang.String var35 = var30.toString();
    java.lang.String var36 = var30.getNome();
    var0.addDisciplina(var30);
    java.lang.String var38 = var30.getNome();
    
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
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 15);
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

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    var8.setCor(5);
    double var12 = var8.getHorasEstudadas();
    java.lang.String var13 = var8.toString();
    var8.setNome("Metodo de estudo regular");
    
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

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    java.lang.String var5 = var2.getNome();
    int var6 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    int var9 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
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
    assertNotNull(var12);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    var2.setNome("Metodo de estudo regular");
    var2.setCor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


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
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 0);
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


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
    Stude.Disciplina var16 = var1.getDisciplina("");
    java.util.HashMap var17 = var1.desempenho();
    int var18 = var1.intervalo();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 0);
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
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

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    Stude.Disciplina var21 = var0.getDisciplina("Metodo de estudo avancado");
    int var22 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    java.lang.String var5 = var4.getNome();
    java.lang.String var6 = var4.getNome();
    java.lang.String var7 = var4.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


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
    var79.addDisciplina("Metodo de estudo regular", 3);
    int var90 = var79.intervalo();
    
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
    assertTrue(var90 == 5);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.removeDisciplina("");
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

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    java.util.HashMap var8 = Stude.Desempenho.tempoDeEstudo(var7);
    
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

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 2);
    Stude.Disciplina var5 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var6 = var5.toString();
    var5.setCor(15);
    var5.setNome("Metodo de estudo regular");
    int var11 = var5.getCor();
    java.lang.String var12 = var5.toString();
    boolean var13 = var2.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    double var13 = var2.getHorasEstudadas();
    java.lang.String var14 = var2.toString();
    Stude.Stude var16 = new Stude.Stude("hi!");
    Stude.Cronograma var17 = var16.getCronograma();
    Stude.Usuario var18 = var16.getUsuario();
    java.lang.String var19 = var18.getNome();
    boolean var20 = var2.equals((java.lang.Object)var19);
    double var21 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 20.0d);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


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
    double var31 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    var2.addHorasDeEstudo(10.0d);
    
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
    assertTrue(var31 == 0.0d);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    boolean var10 = var1.removeDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var14 = var1.getDisciplina("hi!");
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


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
    java.util.List var17 = var7.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var7.removeDisciplina("Metodo de estudo avancado");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("hi!", 0);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


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
    boolean var21 = var0.removeDisciplina("Metodo de estudo regular");
    
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
    assertTrue(var21 == true);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


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
    Stude.Disciplina var30 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var30);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    java.lang.String var3 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.HashMap var10 = var1.desempenho();
    int var11 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    var5.setMetodoAvancado();
    Stude.Cronograma var9 = var5.getCronograma();
    boolean var10 = var2.equals((java.lang.Object)var5);
    int var11 = var2.getCor();
    var2.setCor((-1));
    int var14 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
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
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    int var14 = var11.getCor();
    var11.addHorasDeEstudo(1.0d);
    java.lang.String var17 = var11.getNome();
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 30);
    boolean var21 = var11.equals((java.lang.Object)var20);
    var0.addDisciplina(var11);
    double var23 = var11.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.addHorasDeEstudo(0.0d);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    int var8 = var0.tamanhoDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var13 = var12.getCor();
    double var14 = var12.getHorasEstudadas();
    double var15 = var12.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDisciplina(var12);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    double var13 = var2.getHorasEstudadas();
    java.lang.String var14 = var2.toString();
    int var15 = var2.getCor();
    double var16 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 20.0d);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    int var8 = var1.tempoDeEstudo();
    java.util.HashMap var9 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
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

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("hi!");
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

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


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
    var10.setNome("Metodo de estudo avancado");
    double var20 = var10.getHorasEstudadas();
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
    assertTrue(var20 == 0.0d);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.Cronograma var6 = new Stude.Cronograma();
    Stude.Disciplina var8 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var9 = new Stude.Cronograma();
    java.util.List var10 = var9.getDisciplinas();
    Stude.Disciplina var12 = var9.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var14 = var9.getDisciplina("hi!");
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var9.addDisciplina(var17);
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var9.addDisciplina(var21);
    int var23 = var9.tamanhoDisciplinas();
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var27 = var26.toString();
    var26.setCor(15);
    var26.setNome("Metodo de estudo regular");
    int var32 = var26.getCor();
    var9.addDisciplina(var26);
    var6.addDisciplina(var26);
    var5.addDisciplina(var26);
    java.util.List var36 = var5.getDisciplinas();
    java.util.HashMap var37 = Stude.Desempenho.tempoDeEstudo(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
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

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    double var10 = var8.getHorasEstudadas();
    var8.setCor(2);
    java.lang.String var13 = var8.getNome();
    double var14 = var8.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.addHorasDeEstudo((-1.0d));
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
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


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
    var16.addHorasDeEstudo(100.0d);
    
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

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("");
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

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Usuario var12 = var1.getUsuario();
    java.lang.String var13 = var12.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


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
    Stude.Cronograma var15 = var1.getCronograma();
    Stude.Usuario var16 = var1.getUsuario();
    Stude.Disciplina var18 = var1.getDisciplina("hi!");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var21 = var1.tempoDeEstudo();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


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
    int var16 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.addHorasDeEstudo(0.0d);
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

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


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
    java.util.HashMap var13 = var1.desempenho();
    Stude.Disciplina var15 = var1.getDisciplina("");
    java.util.HashMap var16 = var1.desempenho();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var20 = var1.getDisciplina("");
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var9 = var1.desempenho();
    int var10 = var1.intervalo();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    Stude.Disciplina var8 = var1.getDisciplina("hi!");
    var1.setMetodoAvancado();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    var6.setNome("hi!");
    var6.setNome("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setNome("");
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


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
    double var24 = var9.getHorasEstudadas();
    
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
    assertTrue(var24 == 0.0d);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


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
      var1.setNomeUsuario("");
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

}
