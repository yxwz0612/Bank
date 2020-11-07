package oop.demo05;

import oop.demo05.commonexception.NoBalance;
import oop.demo05.commonexception.OverLimit;

import java.math.BigDecimal;
import java.util.List;

public interface ServersInterface {
    void saveLog(Account.debitWallet wallet,String tips);//保存日志

    void createNew(String wallet,Account account);//创建新钱包

    //   void creatPayWallet();//创建支付钱包
    void save(Account.debitWallet wallet,BigDecimal money);//存钱
    void deposite(Account.debitWallet wallet,BigDecimal money);//进行取款捕获异常
    void trydeposite(Account.debitWallet wallet,BigDecimal money) throws OverLimit, NoBalance;//尝试取款抛出异常
    void checkLog(Account.debitWallet wallet);//显示操作记录
    void setLimit(Account.debitWallet wallet,int money);//更改借记钱包每日取款上限
    void checkBanlance(Account.debitWallet wallet);//查询余额
    String getFormatDate();//获取格式化时间





}
