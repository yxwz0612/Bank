package oop.demo05;

import oop.demo05.commonexception.NoBalance;
import oop.demo05.commonexception.OverLimit;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servers implements ServersInterface {//运行服务器
    public static void main(String[] args) {

        Servers servers = new Servers();
        Account account = new Account();
        Account.debitWallet debitwallet = account.new debitWallet();

        servers.createNew("dw",account);//创建一个新钱包
        servers.save(debitwallet,BigDecimal.valueOf(5000));//在该钱包存款5000
        servers.setLimit(debitwallet,10000);//设置上限为10000
        servers.deposite(debitwallet,BigDecimal.valueOf(2000));//取款6000

        System.out.println(debitwallet.balance);
        System.out.println(debitwallet.log);










    }




    @Override
    public void saveLog(Account.debitWallet wallet,String tips) {

        wallet.log.add(tips);//把tips添加到该钱包的log中

    }

    @Override
    public void createNew(String wallet,Account account) {
        switch (wallet){
            case "dw":
                Account.debitWallet newdebitwallet = account.new debitWallet();//创建一个实例
                account.debitwalletinformation.add(newdebitwallet);//把实例钱包的obj添加到账号的借记钱包信息中
                account.debitwalletsnum += 1;//账号的钱包数量+1
            case "pw":
                Account.payWallet newpaywallet = account.new payWallet();
                account.paywalletinformation.add(newpaywallet);//添加到支付钱包,其他同上
                account.paywalletsnum += 1;

            default:

        }




    }

    @Override
    public void save(Account.debitWallet wallet, BigDecimal money) {

        wallet.balance = wallet.balance.add(money);
        saveLog(wallet,"存入"+money+"元"+getFormatDate()+"\n");


    }

    @Override
    public void deposite(Account.debitWallet wallet,BigDecimal money){
        try{
            trydeposite(wallet,money);
        }catch (OverLimit e){
            System.out.println("取款金额超出每日上限请重新输入");
        }catch (NoBalance e){
            System.out.println("余额不足请重新输入");
        }
    }

    @Override
    public void trydeposite(Account.debitWallet wallet, BigDecimal money) throws OverLimit,NoBalance {

        if(wallet.limit.compareTo(BigDecimal.valueOf(-1))!=0){
            if(wallet.limit.compareTo(wallet.beused.add(money)) == -1){//如果已用额度+要取款金额>每日上限
                //   System.out.println("取款金额超出每日上限请重新输入");
                throw new OverLimit();
            }else if (wallet.balance.compareTo(money)==-1){//如果余额小于要取的钱
                //   System.out.println("余额不足请重新输入");
                throw new NoBalance();

            }else {
                wallet.balance = wallet.balance.subtract(money);//余额减去money
                wallet.beused = wallet.beused.add(money);//每日额度增加money
                saveLog(wallet, "取出" + money + "元" + getFormatDate()+"\n");//保存log
            }
        }
    }

    @Override
    public void checkLog(Account.debitWallet wallet) {

        for (int i = 0; i < wallet.log.size(); i++) {
            System.out.println(wallet.log.get(i));//逐条打印该钱包log日志
        }

    }

    @Override
    public void setLimit(Account.debitWallet wallet, int money) {

        if (money>=0) {
            wallet.limit = BigDecimal.valueOf(money);
        }else {
            System.out.println("每日取款上限需要大于等于0");
        }

    }


    @Override
    public void checkBanlance(Account.debitWallet wallet) {

        System.out.println(wallet.balance);//打印余额

    }

    @Override
    public String getFormatDate() {//获得格式化的当前系统时间

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        return sdf.format(date);
    }

}
