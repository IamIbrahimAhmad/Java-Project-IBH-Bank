package application;

abstract class Account 
{
	protected int checking;
	protected int saving;
  
	//making checking account
	public int getChecking()
	{
		return checking;
	}
  
	//making saving account
	public int getSaving()
	{
		return saving;
	}
	
	//checking account w/d/t
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
  	
	//saving account w/d/t
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