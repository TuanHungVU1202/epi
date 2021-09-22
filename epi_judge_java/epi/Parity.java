package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class Parity {
  @EpiTest(testDataFile = "parity.tsv")
  public static short parity(long x) {
    // TODO - you fill in here.
    short ret = 0;
    while (x != 0) {
      ret = (short) (ret ^ (x & 1));
      x = x >>> 1;
    }
    return ret;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "Parity.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
