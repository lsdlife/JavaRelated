package com.java_bean;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();
        while (true) {
            System.out.println("欢迎进入ATM系统");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            Scanner sc=new Scanner(System.in);
            System.out.println("请您选择操作");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    //1.账户登录
                    Login(accounts,sc);
                    break;
                case 2:
                    //2.账户开户
                    Register(accounts,sc);
                    break;
                default:
                    System.out.println("指令有误");
            }
        }
    }

    /**
     * 开户功能
     * @param accounts
     */
    private static void Register(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("系统开户操作");
        Account acc=new Account();
        System.out.println("请输入用户名：");
        String userName=sc.next();
        acc.setUserName(userName);
        while (true) {
            System.out.println("请输入你的密码");
            String password = sc.next();
            System.out.println("再次确认你的密码");
            String okpassWord = sc.next();
            if (okpassWord.equals(password)) {
                acc.setPassWord(okpassWord);
                System.out.println( "账户注册成功");
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }

        //输入账户限额
        System.out.println("请输入账户限额");
        double quatoMoney=sc.nextInt();
        acc.setQuatoMoney(quatoMoney);

        //生成卡号
        String CardNo = getRandomNo(accounts);
        acc.setCardNo(CardNo);
        accounts.add(acc);
        System.out.println("开户成功，用户名:"+acc.getUserName() +"卡号为：" + acc.getCardNo());
    }

    /**
     * 创建卡号
     * @param accounts
     * @return
     */
    private static String getRandomNo(ArrayList<Account> accounts) {
        Random r=new Random();
        String cardNo="";
        while(true) {
            for (int i = 0; i < 8; i++) {
                cardNo += r.nextInt(10);    //左闭右开，得到随机数
            }
            Account acc = getAccountByCardNo(cardNo, accounts);
            if (acc == null) {
                return cardNo;
            }
        }
    }

    /**
     * 登录功能
     * @param accounts
     * @param sc
     */
    private static void Login(ArrayList<Account> accounts, Scanner sc) {
        if(accounts.size()==0){
            System.out.println("当前系统内没有一个用户");
            return ;
        }
        while(true) {
            System.out.println("请输入账户卡号");
            String scCardNo = sc.next();
            Account acc = getAccountByCardNo(scCardNo, accounts);
            if (acc != null) {
                System.out.println("请输入该账户密码");
                String password = sc.next();
                while(true) {
                    if (acc.getPassWord().equals(password)) {
                        System.out.println(acc.getUserName() + "登录成功,卡号为：" + acc.getCardNo());
                        //展示用户操作界面
                        showUserCommand(accounts,sc,acc);
                        return ;

                    } else {
                        System.out.println("输入的密码有误");
                    }
                }
            } else {
                System.out.println("没有此账户请重新输入");
            }
        }
    }

    /**
     * 用户操作界面
     * @param accounts
     * @param sc
     * @param acc
     */

    private static void showUserCommand(ArrayList<Account> accounts,Scanner sc,Account  acc) {
        System.out.println("欢迎进入用户操作界面，请输入你要进行的操作");
        while(true){
            System.out.println("1.查询当前账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.删除账户");
            int userint=sc.nextInt();
            switch(userint) {
                case 1:
                    //查询账户
                    QueryAccount(acc);
                    break;
                case 2:
                    //存钱
                    SaveMoney(acc,sc);
                    break;
                case 3:
                    //取钱
                    TakeMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    Transfer(accounts,acc,sc);
                    break;
                case 5:
                    //修改密码
                    UpdatePassWord(acc,sc);
                    return ;
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次使用");
                    return ;
                case 7:
                    //删除账户
                    DeleteAccount(accounts,acc,sc);
                    return ;
            }
        }
    }

    /**
     * 删除账户
     * @param accounts
     * @param acc
     * @param sc
     */
    private static void DeleteAccount(ArrayList<Account> accounts, Account acc, Scanner sc) {
        while (true) {
            System.out.println("请输入你要删除的账户密码");
            String password=sc.next();
            if(acc.getPassWord().equals(password)){
                accounts.remove(acc);
                System.out.println("删除账户成功");
                return ;
            }else{
                System.out.println("输入密码有误，请重新输入");
            }
        }
    }

    /**
     * 存钱
     * @param acc
     * @param sc
     */
    private static void SaveMoney(Account acc, Scanner sc) {
        System.out.println("请输入你要存入的金额");
        double moneyCount=sc.nextDouble();
        acc.setMoney(acc.getMoney()+moneyCount);
        System.out.println("成功存入金额："+moneyCount);
    }

    /**
     * 修改密码
     * @param acc
     * @param sc
     */
    private static void UpdatePassWord(Account acc, Scanner sc) {
        System.out.println("当前登录账户："+acc.getUserName());
        while (true) {
            System.out.println("请输入旧密码");
            String oldpassword=sc.next();
            if(acc.getPassWord().equals(oldpassword)){
                while (true) {
                    System.out.println("请输入新密码");
                    String newpassword=sc.next();
                    System.out.println("再次输入新密码");
                    String oknewpassword=sc.next();
                    if(newpassword.equals(oknewpassword)){
                        System.out.println("修改密码成功");
                        acc.setPassWord(oknewpassword);
                        return ;    //结束方法
                    }else{
                        System.out.println("两次密码不一致，重新输入");
                    }
                }
            }else{
                System.out.println("输入密码不正确，重新输入");
            }
        }
    }

    /**
     * 转账操作
     * @param accounts
     * @param acc
     * @param sc
     */
    private static void Transfer(ArrayList<Account> accounts, Account acc, Scanner sc) {
        if (accounts.size() < 2) {
            System.out.println("不允许转账，账户数量不够");
            return;
        }
        System.out.println("你的账户余额：" + acc.getMoney() + "账户限额为：" + acc.getQuatoMoney());
        if (acc.getMoney() == 0) {
            System.out.println("余额不足，无法转账，先去存款");
            return;
        }
        while (true) {
            System.out.println("请输入你要转账的账户卡号");
            String CardNotranfer = sc.next();
            Account acctranfer = getAccountByCardNo(CardNotranfer, accounts);
            if (acctranfer == null) {
                System.out.println("输入卡号不存在，请重新输入");
                return;
            }else if(acctranfer.equals(acc)){
                System.out.println("不能输入自己的卡号");
                continue;
            }else{
                String tipname="*"+acctranfer.getUserName().substring(1);
                System.out.println("请核对接收转账的账户信息:"+tipname+",输入对方的姓氏");
                String scanname = sc.next();
                if(acctranfer.getUserName().startsWith(scanname)){
                    while (true) {
                        System.out.println("请输入你的转账金额：");
                        double tranferMoney = sc.nextDouble();
                        if (tranferMoney > acc.getMoney()) {
                            System.out.println("余额不足，请重新输入");
                        } else if(tranferMoney>acc.getQuatoMoney()){
                            System.out.println("超出当前限额，请调整转账金额");
                        }else {
                            acctranfer.setMoney(acctranfer.getMoney() + tranferMoney);
                            acc.setMoney(acc.getMoney() - tranferMoney);
                            System.out.println("转账成功，你的余额为：" + acc.getMoney());
                            return ;
                        }
                    }
                }

            }
        }
    }



    /**
     * 取钱
     * @param acc
     * @param sc
     */
    private static void TakeMoney(Account acc, Scanner sc) {
        System.out.println("你正在进行取钱操作");
        if(acc.getMoney()<100){
            System.out.println("你的余额不足100元，无法取钱");
            return ;
        }

        while (true) {
            System.out.println("请输入你的取款金额");
            double moneytake=sc.nextDouble();
            if(moneytake>acc.getQuatoMoney()){
                System.out.println("超过当前限额，请重新输入取款金额");
            }else{
                acc.setMoney(acc.getMoney()-moneytake);
                System.out.println("取款成功，你的余额是："+acc.getMoney());
                return ;
            }
        }
    }


    /**
     * 查询当前账户
     * @param acc
     */
    private static void QueryAccount(Account acc) {
        System.out.println("当前账户信息如下：");
        System.out.println("用户名"+acc.getUserName());
        System.out.println("卡号"+acc.getCardNo());
        System.out.println("余额"+acc.getMoney());
        System.out.println("账户限额"+acc.getQuatoMoney());
    }

    /**
     * 查找账户
     * @param CardNo
     * @param accounts
     * @return
     */
    private static Account getAccountByCardNo(String CardNo,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if(CardNo.equals(acc.getCardNo())){
                return acc;
            }
        }
        return  null;
    }
}
