/*package oop.demo04;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public abstract class Account {
    int ID;//账号
    int debitwalletsnum;//借记钱包数
    int paywalletsnum;//支付钱包数
    List<String> data = new LinkedList<String>();//操作日志
    Account account = new Account() {
    };




    class debitWallet implements WalletFunction {
//每日清零 没实现
        BigDecimal balance = BigDecimal.valueOf(0);
        BigDecimal beused = BigDecimal.valueOf(0);
        int limit = 1000;
        List<String> log = new LinkedList<String>();





        @Override
        public void createNew() {

        }

        @Override
        public void save(BigDecimal money) {
            balance = balance.add(money);
            log.add("存入"+money);

        }

        @Override
        public void deposite(BigDecimal money) {
            balance = balance.subtract(money);
            beused = beused.add(money);
            log.add("提取"+money);

        }

        @Override
        public void checkLog() {

        }

        @Override
        public void setLimit(int money) {
            this.limit = money;
            log.add("修改每日消费额度为"+money);


        }

        @Override
        public void checkBanlance() {

        }
    }

    class payWallet implements WalletFunction {


        BigDecimal balance = BigDecimal.valueOf(0);



        @Override
        public void createNew() {

        }

        @Override
        public void save(BigDecimal money) {

        }

        @Override
        public void deposite(BigDecimal money) {

        }

        @Override
        public void checkLog() {

        }


        @Override
        public BigDecimal display() {
            return balance;

        }
    }
}*/
