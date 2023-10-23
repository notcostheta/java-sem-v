/*Slip7 - Write a program in Java to create a player class. Inherit the classes Cricket_player, Football_player 
and Hockey_player from player class. The objective of this assignment is to learn the concepts of inheritance
in Java. */

class Player
{
	String gname;
	Player(String gname)
	{
	    this.gname = gname;
	}
}
class Cricket_player extends Player
{
	int no_of_player;
	Cricket_player(String gname, int no_of_player)	
	{
	      super(gname);
	      this.no_of_player = no_of_player;
	}
	void display()
	{
	     System.out.println("Game name = " + gname);
	     System.out.println("Number of Player = " + no_of_player);
	}
}
class Football_player extends Player
{
	int no_of_player;
	Football_player(String gname, int no_of_player)	
	{
	      super(gname);
	      this.no_of_player = no_of_player;
	}
	void display()
	{
	     System.out.println("Game name = " + gname);
	     System.out.println("Number of Player = " + no_of_player);
	}
}
class Hockey_player extends Player
{
	int no_of_player;
	Hockey_player(String gname, int no_of_player)	
	{
	      super(gname);
	      this.no_of_player = no_of_player;
	}
	void display()
	{
	     System.out.println("Game name = " + gname);
	     System.out.println("Number of Player = " + no_of_player);
	}
}

class Slip7
{
    public static void main(String args[])	
    {
	Cricket_player c = new Cricket_player ("Cricket", 11);
	Football_player d = new Football_player ("Football",11);
	Hockey_player e = new Hockey_player ("Hockey",6);
	c.display();
	d.display();
	e.display();			
    }
}