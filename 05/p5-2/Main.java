public class Main {
  // public static String email(String title, String address, String text) { //戻り値不要なのでStringの部分はvoidが正しい
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void main(String[] args) {
    email("test", "test@test.com", "test");
  }
}