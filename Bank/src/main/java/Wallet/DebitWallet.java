package Wallet;



import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import CommonException.*;


public class DebitWallet extends Wallet{


    BigDecimal beused = BigDecimal.valueOf(0);
    BigDecimal limit = BigDecimal.valueOf(0);





    public void deposite(BigDecimal money){
        try{
            trydeposite(money);

        }catch (CommonException.OverLimit e){

        }
            catch(CommonException.NoBalance e){

            }
    }




    public void trydeposite(BigDecimal money) throws CommonException.OverLimit,CommonException.NoBalance {



            if(limit.compareTo(BigDecimal.valueOf(-1))!=0){
                if(limit.compareTo(beused.add(money)) == -1){//如果已用额度+要取款金额>每日上限

                throw new CommonException.OverLimit();

                }else if (balance.compareTo(money)==-1){//如果余额小于要取的钱

                throw new CommonException.NoBalance();

                }else {

                balance = balance.subtract(money);//余额减去money
                beused = beused.add(money);//每日额度增加money
                saveLog(this,"取出",money);//保存log
                }
            }


    }


    public void setLimit(int money){
        try{
            trysetLimit(money);
        }catch (CommonException.Limitis0 e){

        }
    }



    private void trysetLimit(int money) throws CommonException.Limitis0{//更改借记钱包每日取款上限

            if (money >= 0) {
                limit = BigDecimal.valueOf(money);
            } else {
                throw new CommonException.Limitis0();
            }

    }




}
