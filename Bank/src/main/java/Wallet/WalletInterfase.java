package Wallet;

import Account.Account;

import java.math.BigDecimal;

public interface  WalletInterfase {



    void saveLog(Wallet wallet,String type,BigDecimal money);//保存日志

    void checkLog(Wallet wallet);//显示操作记录



    void checkBanlance(Wallet wallet);//查询余额


    String getFormatDate();//获取格式化时间
}
