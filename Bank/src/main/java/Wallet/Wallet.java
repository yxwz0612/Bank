package Wallet;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Wallet implements WalletInterfase{
    int walletID;
    BigDecimal balance;
    BigDecimal beused;
    List<WalletLog> log = new LinkedList<WalletLog>();



    public void save(Wallet wallet, BigDecimal money) {

        wallet.balance = wallet.balance.add(money);
        saveLog(wallet,"存入",money);


    }
    public void saveLog(Wallet wallet,String type,BigDecimal money) {

        WalletLog walletLog = new WalletLog();
        walletLog.type = type;
        walletLog.money = money;
        walletLog.date = getFormatDate();
        wallet.log.add(walletLog) ;

    }

    public void checkLog(Wallet wallet) {
        for (int i = 0; i < wallet.log.size(); i++) {
            System.out.println(wallet.log.get(i));//逐条打印该钱包log日志
        }

    }


    public void checkBanlance(Wallet wallet) {

        System.out.println(wallet.balance);//打印余额

    }


    public String getFormatDate() {
        //获得格式化的当前系统时间

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        return sdf.format(date);

    }


}


