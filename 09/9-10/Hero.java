// コンストラクタで引数を追加情報として受け取る
public class Hero {
  String name;
  int hp;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  public Hero(String name) { // 引数として文字列を１つ受け取る
    this.hp = 100; // hpフィールドを100で初期化
    this.name = name; // 引数の値でnameフィールドを
  }
}