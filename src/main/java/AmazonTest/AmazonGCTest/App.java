package AmazonTest.AmazonGCTest;


public class App implements RbiInterface, BankOfAmerica
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App obj=new App();
        obj.dMatAccount();
        
        int i=BankOfAmerica.interestrate;
        System.out.println("BankOfAmerica rate of interest is: "+i);
        
        System.out.println("Rbi rate of interest is: "+ RbiInterface.interest);
    }

	
	public void savingAccount() {
		// TODO Auto-generated method stub
		
	}

	public int currentAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void dMatAccount() {
		System.out.println("Dmat account needs to be open");
		
	}

	public void loan() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void creditCard() {
		// TODO Auto-generated method stub
		
	}

	public int BankAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void pinlessDebit() {
		// TODO Auto-generated method stub
		
	}

	public void personalloan() {
		// TODO Auto-generated method stub
		
	}
}
