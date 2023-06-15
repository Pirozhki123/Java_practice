public class Cleric {
  String name;
  int HP = 50;
  final int maxHP = 50;
  int MP = 10;
  final int maxMP = 10;
  public void selfAid() {
    this.MP -= 10;
    this.HP = this.maxMP;
  }
  public int pray(int sec) {
    // int prayMP = praySec * random(2);
    // return prayMP;
    // 以下回答の内容
    int System.out.println(this.name + "は" + sec "秒間天に祈った！");
    int recover = new Random().nextInt(3) + sec; //理論上の回復量を乱数を用いて決定する
    int recoverActua; = Math.min(this.MAX_MP - this.mp, recover);
    this.mp += recoverActurel;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}