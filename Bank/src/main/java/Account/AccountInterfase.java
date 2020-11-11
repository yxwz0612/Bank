package Account;

public interface  AccountInterfase  {
    void saveLog(String type);//保存日志

    void createNewDebitwallet();//创建新钱包

    void createNewPayWallet();//创建支付钱包


    void checkLog();//显示操作记录


    String getFormatDate();//获取格式化时间


}
