package testNgPratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 {

	
	@Test(dataProvider = "dataProvider_BookTickets")
	public void bookTickets(String src,String dest,int noOfPPl)
	{
		System.out.println("Book Tickets from"+src+ "to" +dest+","+noOfPPl+"");
	}
	
@DataProvider
	public Object[][] dataProvider_BookTickets()
	{
		Object[][] objArr = new Object[2][3];
		
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		objArr[0][2]=5;
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="mysore";
		objArr[1][2]=3;
		
		return objArr;
		
	}
}
