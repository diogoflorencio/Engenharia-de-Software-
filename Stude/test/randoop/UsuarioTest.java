package randoop;
import junit.framework.*;
import junit.textui.*;

public class UsuarioTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public UsuarioTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(UsuarioTest0.class));
    return result;
  }

}
