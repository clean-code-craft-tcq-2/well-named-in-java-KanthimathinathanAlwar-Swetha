package colorcoder;

public class ColorCode {

  static ColorPair getColorFromPairNumber(final int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorPair.NUMBEROFMINORCOLORS);
    MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorPair.NUMBEROFMINORCOLORS);
    return new ColorPair(majorColor, minorColor);
  }

  static int getPairNumberFromColor(final MajorColor major, final MinorColor minor) {
    return (major.getIndex() * ColorPair.NUMBEROFMINORCOLORS) + minor.getIndex() + 1;
  }

}
