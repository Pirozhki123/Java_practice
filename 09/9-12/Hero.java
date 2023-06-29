// コンストラクタのオーバーロード
public class Hero {
  String name;
  int hp;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero(String name) { // 以前からあったコンストラクタ1
    this.hp = 100;
    this.name = name;
  }
  public Hero() { // 新しく作ったコンストラクタ2
    this.hp = 100;
    this.name = "ダミー"; // ダミーの名前を設定する
  }
}