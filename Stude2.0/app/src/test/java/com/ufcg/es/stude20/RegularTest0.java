package randoop;

import junit.framework.*;

public class RegularTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRegularTest0.test1");


    models.Regular var0 = new models.Regular();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRegularTest0.test2");


    models.Regular var0 = new models.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempoDeEstudo();
    int var3 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRegularTest0.test3");


    models.Regular var0 = new models.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempoDeEstudo();
    int var3 = var0.getTempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRegularTest0.test4");


    models.Regular var0 = new models.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempoDeEstudo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));

  }

}
