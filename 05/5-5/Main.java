// 引数の例（渡す値が複数の場合）
public class Main {
  public static void main(String[] args) {
    add(100, 20);
    add(200, 50);
  }
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}