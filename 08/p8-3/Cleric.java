public class Cleric {
  String name;
  int HP = 50;
  final int maxHP = 50;
  int mp = 10;
  final int maxMP = 10;
  public void selfAid() {
    this.mp -= 5;
    this.hp = this.maxMP
  }
}