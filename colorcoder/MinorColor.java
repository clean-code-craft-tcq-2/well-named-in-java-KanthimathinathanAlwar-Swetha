package colorcoder;

enum MinorColor {
                 BLUE(0),
                 ORANGE(1),
                 GREEN(2),
                 BROWN(3),
                 SLATE(4);

  private final int index;

  private MinorColor(final int index) {
    this.index = index;
  }

  int getIndex() {
    return this.index;
  }

  public static MinorColor fromIndex(final int index) {
    for (MinorColor color : MinorColor.values()) {
      if (color.getIndex() == index) {
        return color;
      }
    }
    return null;
  }
}
