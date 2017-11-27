
public class InternateBankingSystem {
// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Account accountObj; 
	
		accountObj = new Account(10000);
			new Thread(new DepositThread(accountObj,1300)).start();
	
		new Thread(new WithdrawThread(accountObj,1500)).start();
	
		new Thread(new DepositThread(accountObj,1000)).start();
	
		new Thread(new DepositThread(accountObj,2000)).start();
	
		new Thread(new WithdrawThread(accountObj,3000)).start();
	
		new Thread(new WithdrawThread(accountObj,950)).start();
		
	}

}