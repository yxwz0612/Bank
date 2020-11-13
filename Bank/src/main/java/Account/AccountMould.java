package Account;

import Wallet.DebitWallet;
import Wallet.PayWallet;

import java.util.ArrayList;
import java.util.List;

public abstract class AccountMould implements AccountInterfase {
    public int ID;
    public int debitwalletsnum;//借记钱包数
    public int paywalletsnum;//支付钱包数
    public List<AccountLog> accountlog = new ArrayList<AccountLog>();
    public List<DebitWallet> debitwalletinformation = new ArrayList<DebitWallet>();
    public List<PayWallet> paywalletinformation = new ArrayList<PayWallet>();//
}
