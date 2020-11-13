import Account.Account;

import java.math.BigDecimal;


public class App {
    public static void main(String[] args) {

        Account account = new Account();//新账号
        account.createNewDebitwallet();//账号中新建一个借记钱包

        account.debitwalletinformation.get(0).save(BigDecimal.valueOf(10000));//钱包存入10000
        account.debitwalletinformation.get(0).deposite(BigDecimal.valueOf(3000));//钱包取出3000
        account.debitwalletinformation.get(0).setLimit(10000);//修改为每日取款金额10000
        account.debitwalletinformation.get(0).deposite(BigDecimal.valueOf(1000));//钱包取出1000

        account.debitwalletinformation.get(0).checkBanlance();//查询余额
        account.debitwalletinformation.get(0).checkLog();//查询日志



        account.createNewPayWallet();//新建一个支付钱包
        account.paywalletinformation.get(0).save(BigDecimal.valueOf(2000));
        account.paywalletinformation.get(0).deposite(BigDecimal.valueOf(500));
        account.paywalletinformation.get(0).checkBanlance();//查询余额
        account.paywalletinformation.get(0).checkLog();//查询日志







    }
}
