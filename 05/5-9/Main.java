//戻り値をそのまま使う
public class Main {
  public static int add(int x, int y) {
    return ans;
    int ans = x + y;
  }
  public static void main(String[] args) {
    System.out.println(add(add(10, 20), add(30, 40)));
  }
}