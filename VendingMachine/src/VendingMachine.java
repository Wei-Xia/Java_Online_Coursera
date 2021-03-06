
public class VendingMachine 
{
	
	int price = 90;
	int balance;
	int total;
	int function = f();
	
	VendingMachine()    // 构造函数
	{
		total = 0;
	}
	
	VendingMachine(int price)    // Overload
	{
		this.price = price;
	}
	
	int f()
	{
		return 10000000;
	}

	void setPrice(int price)
	{
		this.price = price;
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount)
	{
		balance = amount + balance;
		showBalance();
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if (balance >= price){
			System.out.println("Here you are.");
			balance = balance - price;
			total = total + price;
		}
	}
	
	public static void main(String[] args) 
	{
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		
		VendingMachine vm1 = new VendingMachine(1);
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
		
	}

}
