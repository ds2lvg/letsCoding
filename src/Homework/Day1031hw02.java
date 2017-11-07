package Homework;

class Day1031hw02 {
	public static void main(String[] args) {
		CheckingAccount p1 = new CheckingAccount("111-22-33333333", "홍길동", 0);
		BonusPointAccount p2 = new BonusPointAccount("333-33-333333", "김미영", 0);
		CreditLineAccount p3 = new CreditLineAccount("000-11-111111", "김선달", 10000);
		
		Day1031hw02 obj = new Day1031hw02();
		
		obj.print(p1);
		obj.print(p2);
		obj.print(p3);	
	}
	void print(CheckingAccount p1) {
		System.out.println(" ===== CheckingAccount ===== ");
		System.out.println("계좌번호:" + p1.accountNo);
		System.out.println("계좌이름:" + p1.ownerName);
		System.out.println("잔액:" + p1.balance);		
	}	
	void print(BonusPointAccount p2) {
		System.out.println(" ===== BonusPointAccount =====  ");
		System.out.println("계좌번호:" + p2.accountNo);
		System.out.println("계좌이름:" + p2.ownerName);
		System.out.println("잔액:" + p2.balance);	
	}
	void print(CreditLineAccount p3) {
		System.out.println(" ===== CreditLineAccount ===== ");
		System.out.println("계좌번호:" + p3.accountNo);
		System.out.println("계좌이름:" + p3.ownerName);
		System.out.println("잔액:" + p3.balance);		
	}	
}
 
class CheckingAccount extends Account{
 
	CheckingAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}

}
 
class BonusPointAccount extends Account{
 
	BonusPointAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}

}
 
class CreditLineAccount extends Account{
 
	CreditLineAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}
	
}
 
 
class Account {
    String accountNo; // 번호
    String ownerName; // 이름
    int balance;      // 잔액
    Account(String accountNo, String ownerName, int balance) {   
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    void deposit(int amount) {
        balance += amount;
    }
    
    int withdraw(int amount) throws Exception {
        if (balance < amount)
            throw new Exception("잔액이 부족합니다.");
        balance -= amount;
        return amount;
    }

}