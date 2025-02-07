class Operation{			 
	int square(int n){			  
		return n*n;			 
	}			
}			

class Circle{			 
	Operation opp;			 
	double pi=3.14;			  			 
	
	double area(int radius){			   
		opp=new Operation();			   
		int rsquare=opp.square(radius);		   
		return pi*rsquare;			 
	}		
}	

class kreis1 {		

	public void main(String args[])
	{			   
		Circle c=new Circle();			   
		double result=c.area(5);			   
		System.out.println(result);			 
	}

}