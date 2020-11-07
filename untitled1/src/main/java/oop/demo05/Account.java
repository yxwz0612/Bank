package oop.demo05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Account extends AccountMould{
    int ID;
    int debitwalletsnum;//借记钱包数
    int paywalletsnum;//支付钱包数
    List<Object> debitwalletinformation = new ArrayList<Object>();
    List<Object> paywalletinformation = new ArrayList<Object>();//支付钱包内容obj


    public class debitWallet  {
        BigDecimal balance = BigDecimal.valueOf(0);
        BigDecimal beused = BigDecimal.valueOf(0);
        BigDecimal limit = BigDecimal.valueOf(0);
        List<String> log = new LinkedList<String>();

    }
    public  class payWallet  {
        BigDecimal balance = BigDecimal.valueOf(0);
        BigDecimal beused = BigDecimal.valueOf(0);
        BigDecimal limit = BigDecimal.valueOf(-1);
        List<String> log = new LinkedList<String>();
    }

}
