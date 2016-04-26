package randoop;

import junit.framework.*;

public class AvancadoTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nAvancadoTest0.test1");


    models.Avancado var0 = new models.Avancado();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nAvancadoTest0.test2");


    models.Avancado var0 = new models.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempoDeEstudo();
    int var3 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nAvancadoTest0.test3");


    models.Avancado var0 = new models.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempoDeEstudo();
    int var3 = var0.getTempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nAvancadoTest0.test4");


    models.Avancado var0 = new models.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempoDeEstudo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));

  }

}
