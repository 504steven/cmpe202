 

public class GumballMachineTwo extends GumballMachine
{

    public GumballMachineTwo( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.sum = 0;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.sum += 25;
        else 
            System.out.println( "Invalid coin. Quarter ONLY." ) ;
    }
    
    public void turnCrank()
    {
    	if ( this.sum >= 50 )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.sum -= 50 ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert quarter. 2 quarters are needed." ) ;
    	}        
    }
}
