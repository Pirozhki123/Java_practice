// キーボードから入力を受け付ける命令
public class Main {
  public static void main(String[] args) {
    System.out.println("あなたの名前を入力して下さい。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力して下さい。");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ" + age + "歳の" + name + "さん");
  }
}