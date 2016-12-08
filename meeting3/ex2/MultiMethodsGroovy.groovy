package meeting3.ex2


class GMoney {}
class GBigMoney extends GMoney {}

class GEmployee {
    public void getMoney(GMoney money) {
        println "I've got money"
    }
}

class GManager extends GEmployee {
    public void getMoney(GBigMoney bigMoney) {
        println "I've got BIG money"
    }
}

GEmployee e1 = new GEmployee()
GEmployee e2 = new GManager()
e1.getMoney(new GMoney())
e2.getMoney(new GBigMoney())