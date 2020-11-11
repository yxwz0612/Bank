package Wallet;


import CommonException.CommonException;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class PayWallet extends Wallet{

    BigDecimal balance = BigDecimal.valueOf(0);
    BigDecimal beused = BigDecimal.valueOf(0);
    List<WalletLog> log = new LinkedList<WalletLog>();



    void deposite(PayWallet wallet, BigDecimal money)  throws CommonException.NoBalance{

        if (wallet.balance.compareTo(money)==-1){//如果余额小于要取的钱
            throw new CommonException.NoBalance();

        }else {
            wallet.balance = wallet.balance.subtract(money);//余额减去money
            wallet.beused = wallet.beused.add(money);//每日额度增加money
            saveLog(wallet, "取出",money);//保存log
        }

    }

}
