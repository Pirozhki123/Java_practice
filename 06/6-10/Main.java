// API利用の例
public class Main {
  public static void main(String[] args) {
    int[] heights = {172, 149, 152, 191, 155};

    // Javaが備える並び替え命令。
    // java.utilパッケージのArrayクラスにあるsortメソッドを呼び出している。
    // Java.util.ArrayはJavaが標準で提供するAPIの一部である。
    java.util.Arrays.sort(heights);

    for (int h : heights) {
      System.out.println(h);
    }
  }
}