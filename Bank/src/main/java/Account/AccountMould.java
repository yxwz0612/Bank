package Account;

import Wallet.DebitWallet;
import Wallet.PayWallet;

import java.util.ArrayList;
import java.util.List;

public abstract class AccountMould implements AccountInterfase {
    int ID;
    int debitwalletsnum;//借记钱包数
    int paywalletsnum;//支付钱包数
    List<AccountLog> accountlog;
    List<DebitWallet> debitwalletinformation = new ArrayList<DebitWallet>();
    List<PayWallet> paywalletinformation = new ArrayList<PayWallet>();//
}
