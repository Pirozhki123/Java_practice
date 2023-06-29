// 練習9-1
public class Thief {
  String name;
  int hp;
  int mp;
  public Thief(String name, int HP, int MP) {
    this.name = name;
    this.hp = HP;
    this.mp = MP;
  }
  public Thief(String name, int HP) {
    this(name, HP, 5);
  }
  public Thief(String name) {
    this(name, 40, 5);
  }
}