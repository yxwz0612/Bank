package Account;

import Wallet.DebitWallet;
import Wallet.PayWallet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account extends AccountMould{





    public void saveLog(String type) {
        AccountLog accountLog = new AccountLog();
        accountLog.type = type;
        accountLog.date = getFormatDate();
        accountlog.add(accountLog);

    }

    public void createNewDebitwallet() {
        DebitWallet newdebitwallet = new DebitWallet();//创建一个实例
        debitwalletinformation.add(newdebitwallet);//把实例钱包的obj添加到账号的借记钱包信息中
        debitwalletsnum += 1;//账号的钱包数量+1
        saveLog("创建借记钱包");

    }


    public void createNewPayWallet() {
        PayWallet newpaywallet = new PayWallet();//创建一个实例
        paywalletinformation.add(newpaywallet);//把实例钱包的obj添加到账号的借记钱包信息中
        paywalletsnum += 1;//账号的钱包数量+1
        saveLog("创建支付钱包");

    }


    public String getFormatDate() {
        //获得格式化的当前系统时间

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        return sdf.format(date);

    }


    public void checkLog() {
        System.out.println(accountlog);

    }
}
