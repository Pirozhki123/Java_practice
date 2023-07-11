public class PoisonMatango extends Matango {
  // int poison = 5;
  // 引数付きのコンストラクタを定義する必要あり
  // public void attack(Hero h) {
  //   super attack(h); // super.attack~が正しい書き方
  //   if (poison <= 0) { // <=ではなく<でないと0でも動作する
  //     System.out.println("さらに毒の胞子をばらまいた！");
  //     System.out.println(h.hp * 0.4 + "ポイントのダメージ！");
  //     h.hp = h.hp * 0.4; // つど計算するよりは変数を宣言してそこにダメージを代入すると良い
  //     this.poison -= 1;
  //   }
  // }
  // 以下回答
  int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    }
  }
}