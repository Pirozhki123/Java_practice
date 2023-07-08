public class Weapon extends Item {
  // このまま実行するとJVMで以下3行が自動で追加される
  // public Weapon() {
  //   super(); // 親クラスのコンストラクタを引数なしで呼び出す為エラーになる（親クラスには引数指定のコンストラクタ）
  // }
}