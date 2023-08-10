public class Main {
  public static void main(String[] args) {
    double bottom = 10.0;
    double height = 5.0;
    double radius = 5.0;
    double cTA = calcTriangleArea(bottom, height);
    double cCA = calcCircleArea(radius);
    System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "の場合、面積は" + cTA + "㎠");
    System.out.println("円の半径が" + radius + "の場合、面積は" + cCA + "㎠");
  }
  public static double calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2.0;
    return area;
  }
  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}