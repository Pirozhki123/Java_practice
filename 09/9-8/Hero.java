// 生まれた直後の動作を定義したHeroクラス
public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は" + Sowrd.name + "で攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero() { // newされた直後時自動実行される処理を書いたメソッド
    this.hp = 100; // hpフィールドを100で初期化
  }
}