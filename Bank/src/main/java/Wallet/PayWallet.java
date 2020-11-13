package Wallet;


import CommonException.CommonException;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class PayWallet extends Wallet{


    BigDecimal beused = BigDecimal.valueOf(0);
    List<WalletLog> log = new LinkedList<WalletLog>();



    public void deposite(BigDecimal money)  {
        try {
            trydeposite(money);
        }catch (CommonException.NoBalance e){

        }

    }

    private void trydeposite(BigDecimal money)throws CommonException.NoBalance{
        if (this.balance.compareTo(money)==-1){//如果余额小于要取的钱
            throw new CommonException.NoBalance();

        }else {
            this.balance = this.balance.subtract(money);//余额减去money
            this.beused = this.beused.add(money);//每日额度增加money
            saveLog(this, "取出",money);//保存log
        }

    }

}
