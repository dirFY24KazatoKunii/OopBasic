package Company;

public class PartTimeWorker implements Workable {
    // フィールド
    protected final String name;
    private final Department department;

    // コンストラクター
    public PartTimeWorker(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    
    // 働くメソッドを実装
    public void work() {
        System.out.println("アルバイトとして働きます。名前：" + name + slogan);
    }
}
