package meeting3.ex2;


class JMoney {}
class JBigMoney extends JMoney {}

class JEmployee {
    public void getMoney(JMoney money) {
        System.out.println("I've got money");
    }
}

class JManager extends JEmployee {
    public void getMoney(JBigMoney bigMoney) {
        System.out.println("I've got BIG money");
    }
}
public class MultiMethodsJava {
    public static void main(String[] args) {
        JEmployee e1 = new JEmployee();
        JEmployee e2 = new JManager();
        e1.getMoney(new JMoney());
        e2.getMoney(new JBigMoney());
    }
}
