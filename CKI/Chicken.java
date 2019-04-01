package CKI;

public class Chicken 
{
	private int x , y;
	private int HP;
	
	public Chicken(int x , int y) 
	{
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public void gotDamaged(int damage)
	{
		HP-=damage;
	}
	
	public boolean isAlive()
	{
		if(HP>0)
			return true;
		
		return false;
	}
}
