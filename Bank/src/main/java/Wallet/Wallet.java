package Wallet;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Wallet implements WalletInterfase{
    int walletID;
    BigDecimal balance = BigDecimal.valueOf(0);
    BigDecimal beused;
    List<WalletLog> log = new LinkedList<WalletLog>();



    public void save(BigDecimal money) {

        this.balance = this.balance.add(money);
        saveLog(this,"存入",money);


    }
    public void saveLog(Wallet wallet,String type,BigDecimal money) {

        WalletLog walletLog = new WalletLog();
        walletLog.type = type;
        walletLog.money = money;
        walletLog.date = getFormatDate();
        wallet.log.add(walletLog) ;

    }

    public void checkLog() {
        for (int i = 0; i < log.size(); i++) {
            System.out.println(log.get(i).type+"\t"+log.get(i).money+"\t"+log.get(i).date);//逐条打印该钱包log日志
        }

    }


    public void checkBanlance() {

        System.out.println(this.balance);//打印余额

    }


    public String getFormatDate() {
        //获得格式化的当前系统时间

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        return sdf.format(date);

    }


}


