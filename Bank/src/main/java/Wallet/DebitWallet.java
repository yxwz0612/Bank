package Wallet;



import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import CommonException.*;


public class DebitWallet extends Wallet{

    BigDecimal balance = BigDecimal.valueOf(0);
    BigDecimal beused = BigDecimal.valueOf(0);
    BigDecimal limit = BigDecimal.valueOf(0);
    List<WalletLog> log = new LinkedList<WalletLog>();




    public void trydeposite(DebitWallet wallet, BigDecimal money) throws CommonException.OverLimit,CommonException.NoBalance {

        if(wallet.limit.compareTo(BigDecimal.valueOf(-1))!=0){
            if(wallet.limit.compareTo(wallet.beused.add(money)) == -1){//如果已用额度+要取款金额>每日上限

                throw new CommonException.OverLimit();

            }else if (wallet.balance.compareTo(money)==-1){//如果余额小于要取的钱

                throw new CommonException.NoBalance();

            }else {

                wallet.balance = wallet.balance.subtract(money);//余额减去money
                wallet.beused = wallet.beused.add(money);//每日额度增加money
                saveLog(wallet,"取出",money);//保存log
            }
        }
    }


    void setLimit(int money) throws CommonException.Limitis0,CommonException.NeedInt{//更改借记钱包每日取款上限

        if(money%1==0) {
            if (money >= 0) {
                limit = BigDecimal.valueOf(money);
            } else {
                throw new CommonException.Limitis0();
            }
        }else {
            throw new CommonException.NeedInt();
        }

    };


}
