// コンストラクタの動作を
public class Hero {
  String name = "ミナト";
  int hp = 100;
  public Hero() {
    System.out.println("Heroのコンストラクタが動作");
  }
  // public void attack(Matango m) {
  //   System.out.println(this.name + "の攻撃！");
  //   m.hp -= 5;
  //   System.out.println("5ポイントのダメージをあたえた！");
  // }
  public final void slip() { // finalが付いているslipメソッドは子クラスでオーバーライド禁止
    System.out.println(this.name + "は転んだ！");
    System.out.println("5のダメージ");
  }
  public void run() { // run メソッドは子クラスでオーバーライド可能
    System.out.println(this.name + "は逃げ出した！");
  }
}