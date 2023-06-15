// 勇者インスタンスを生成して初期値を代入
public class Main {
  public static void main(String[] args) {
    // 勇者を生成し初期化
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;

    // お化けキノコA（1匹目）を生成し初期化
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    // お化けキノコB（2匹目）を生成し初期化
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    // 3.勇者のメソッドを呼び出してゆく
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}