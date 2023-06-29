// 別のコンストラクタを呼び出す（エラー）
public class Hero {
  String name;
  int hp;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero(String name) { // コンストラクタ1
    this.hp = 100;
    this.name = name;
  }
  public Hero() { // コンストラクタ2
    this.Hero("ダミー");
  }
}