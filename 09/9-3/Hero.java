// メソッド「座る」「転ぶ」「逃げる」を追加
public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は" + Sowrd.name + "で攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
}