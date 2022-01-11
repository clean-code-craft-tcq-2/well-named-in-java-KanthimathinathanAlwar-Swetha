package colorcoder;

public class ColorPairTest {

  static void testNumberToPair(final int pairNumber, final MajorColor expectedMajor, final MinorColor expectedMinor) {
    ColorPair colorPair = ColorCode.getColorFromPairNumber(pairNumber);
    System.out.println("Got pair " + colorPair.toString());
    assert (colorPair.getMajor() == expectedMajor);
    assert (colorPair.getMinor() == expectedMinor);
  }

  static void testPairToNumber(final MajorColor major, final MinorColor minor, final int expectedPairNumber) {
    int pairNumber = ColorCode.getPairNumberFromColor(major, minor);
    System.out.println("Got pair number " + pairNumber);
    assert (pairNumber == expectedPairNumber);
  }
}
