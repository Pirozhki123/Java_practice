// 別のコンストラクタを呼び出す
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
    this("ダミー"); // コンストラクタ1を呼び出すようにJVMに依頼する
  }
}