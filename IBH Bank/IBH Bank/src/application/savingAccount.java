package application;

public class savingAccount extends Account
{
	public savingAccount()
	{
		super();
	}
	
	public void withdrawSaving(int amount)
	{
		saving = saving - amount;
	}
	
	public void depositSaving(int amount) 
	{
		saving = saving + amount;
	}
	
	public void savingToChecking(int amount)
	{
		saving = saving - amount;
		checking = checking + amount;
	}
}