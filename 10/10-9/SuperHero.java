// 親クラスのattack()を呼び出す
public class SuperHero extends Hero {
  boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
  public void attack(Matango m) {
    super.attack(m); // 親インスタンス部分のattack()を呼び出し
    if(this.flying) {
      super.attack(m); // 親インスタンス部分のattack()を呼び出し
    }
  }
}