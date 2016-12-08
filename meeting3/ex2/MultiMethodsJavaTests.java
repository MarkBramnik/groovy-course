package meeting3.ex2;

class TMoney {}
class TBigMoney extends TMoney{}
public class MultiMethodsJavaTests {

    public void test(TMoney t) {
        System.out.println("money");
    }
    public void test(TBigMoney b) {
        System.out.println("big money");
    }

    public static void main(String[] args) {
        MultiMethodsJavaTests c = new MultiMethodsJavaTests();
        c.test(new TMoney());
        c.test(new TBigMoney());
    }
}
