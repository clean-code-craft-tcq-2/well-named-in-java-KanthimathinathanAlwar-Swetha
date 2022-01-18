package colorcoder;

public class ColorPair {

  private final MajorColor majorColor;
  private final MinorColor minorColor;

  static final String[] MAJORCOLORNAMES = { "White", "Red", "Black", "Yellow", "Violet" };
  static final int NUMBEROFMAJORCOLORS = MAJORCOLORNAMES.length;
  static final String[] MINORCOLORNAMES = { "Blue", "Orange", "Green", "Brown", "Slate" };
  static final int NUMBEROFMINORCOLORS = MINORCOLORNAMES.length;

  public ColorPair(final MajorColor major, final MinorColor minor) {
    this.majorColor = major;
    this.minorColor = minor;
  }

  public MajorColor getMajor() {
    return this.majorColor;
  }

  public MinorColor getMinor() {
    return this.minorColor;
  }

  @Override
  public String toString() {
    String colorPairStr = MAJORCOLORNAMES[this.majorColor.getIndex()];
    colorPairStr += " ";
    colorPairStr += MINORCOLORNAMES[this.minorColor.getIndex()];
    return colorPairStr;
  }

}
