package application;

public class checkingAccount extends Account
{
	public checkingAccount()
	{
		super();
	}
	
	public void withdrawChecking(int amount)
	{
		checking = checking - amount;
	}
	
	public void depositChecking(int amount) 
	{
		checking = checking + amount;
	}
	
	public void checkingToSaving(int amount)
	{
		checking = checking - amount;
		saving = saving + amount;
	}
}