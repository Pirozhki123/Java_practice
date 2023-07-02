// Heroクラスを継承してSuperHeroを作成する
public class SuperHero extends Hero { // extends~で「基本的にはHeroと同じ」と宣言
  boolean flying; // 追加したflying
  public void fly() { // 追加したfly()
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() { // 追加したland()
    this.flying = false;
    System.out.println("着地した！");
  }
}