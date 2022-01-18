package colorcoder;

public class ColorCodeTest {

  public static void main(final String[] args) {
    ColorPairTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    ColorPairTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

    ColorPairTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    ColorPairTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

    System.out.println(colorCodeManual());
  }


  static String colorCodeManual() {
    System.out.println("\n");
    System.out.println("-----25 Pair Color Code Manual-----");
    StringBuilder colorCodeManual = new StringBuilder();

    for (int i = 1; i <= 25; i++) {
      colorCodeManual.append(i + " " + ColorCode.getColorFromPairNumber(i).toString() + "\n");
    }
    return colorCodeManual.toString();
  }

}
