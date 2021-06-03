package com.lec.ex_this;

public class ExAccount {
	private String accountNo;
	private String ownerName;
	private int balance;
	public ExAccount(String accountNo, String ownerName, int balance) { //神献楕 原酔什 > source > generate constructor using field
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	public ExAccount(String accountNo, String ownerName) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
	}
	public ExAccount(String accountNo) {
		this.accountNo=accountNo;
	}
	public ExAccount() {}; //神献楕 原酔什 > source> generate constructor using superclass
	
	
	public void deposit(int money) {
		this.balance+=money;
	}
	public void withdraw(int money) {
		if(this.balance>=money) {
			this.balance-=money;
		}else {
			System.out.println("接衝戚 採膳杯艦陥.ばば");
		}
	}
	public void info() {
		System.out.printf("域疎腰硲澗 %s, 森榎爽澗 %s, 接衝精 %d脊艦陥.\n",this.getAccontNo(),this.getOwnerName(),this.getBalance());
	}
	
	
	//神献楕 原酔什 > source > generate settergetter 適遣 魁せせせせせせせせせせせせせせせせせせせせせせせせせせせせせせ
	public void setAccountNo(String accountNo) { //SetA 脊径板 ctrl+ space 切疑刃失, sysout ctrl +space櫛 搾汁馬陥.
		this.accountNo=accountNo;                
		// accountNo研 脊径馬檎 敗呪 鎧税 accountNo研 胡煽 昔縦馬壱 益 陥製 適掘什 鎧税 accountNo研 昔縦廃陥. 
		                                            // 益君糠稽 適掘什税 accountNo研 紫遂馬形檎 this研 旋嬢層陥. 
	}
	public String getAccontNo() {//SetG 珍闘継什凪戚什
		return accountNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setBalance(int balance) {
		this.balance= balance;
	}
	public int getBalance() {
		return balance;
	}
	
}
