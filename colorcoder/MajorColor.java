package colorcoder;

enum MajorColor {
                 WHITE(0),
                 RED(1),
                 BLACK(2),
                 YELLOW(3),
                 VIOLET(4);

  private final int index;

  private MajorColor(final int index) {
    this.index = index;
  }

  int getIndex() {
    return this.index;
  }

  public static MajorColor fromIndex(final int index) {
    for (MajorColor color : MajorColor.values()) {
      if (color.getIndex() == index) {
        return color;
      }
    }
    return null;
  }
}
