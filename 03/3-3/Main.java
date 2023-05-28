// 波カッコを省略した記述
public class Main {
  public static void main(String[] args) {
    boolean tenki = true;
    if (tenki == true) {
      // 内容が2行なので波カッコ省略は不可能
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else
      // 内容が1行なので波カッコは省略可能
      System.out.println("DVDを見ます");
  }
}
