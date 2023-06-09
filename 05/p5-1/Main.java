public class Main {
  // public static void introduceOneself() { //voidの部分がStringになっていた。戻り値が無いのでvoidが正解
  //   String name = "湊";
  //   int age = 20;
  //   double hight = 170;
  //   char eto = '虎'; //''が""になっていたせいでエラーが出ていた。
  //   System.out.println("私の名前は" + name + "です。年齢は"+ age + "歳。身長は" + hight + "。干支は" + eto + "です。");
  // }
  public static void main(String[] args) {
    introduceOneself();
  }
  // 以下回答を見ての修正
  public static void introduceOneself() {
    String name = "Minato";
    int age = 22;
    double height = 169.9;
    char zodiac = '辰';
    System.out.println("私の名前は" + name + "です");
    System.out.println("歳は" + age + "です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("十二支は" + zodiac + "です");
  }
}