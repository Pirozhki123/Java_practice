// attack()をオーバーライドしたSuperHero
public class SuperHero extends Hero {
  boolean flying; // 追加したflying
  public void fly() { // 追加したfly()
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() { // 追加したland()
    this.flying = false;
    System.out.println("着地した！");
  }
  public void run() { // 親クラスにも定義してあるが、子クラスで再定義（上書き）するメソッド
    System.out.println(this.name + "は撤退した");
  }
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
    if(this.flying) {
      System.out.println(this.name + "の攻撃！");
      m.hp -= 5;
      System.out.println("5ポイントのダメージをあたえた！");
    }
  }
}