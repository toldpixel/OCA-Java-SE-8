import javax.swing.*;

class Operation{			 
	int square(int n){			  
		return n*n;			 
	}			
}			

class Circle{			 
	Operation op;			 
	double pi=3.14;			  			 
	
	double area(int radius){			   
		op=new Operation();			   
		int rsquare=op.square(radius);		   
		return pi*rsquare;			 
	}		
}	

class kreis1 {		

	public void main(String args[]){			   
		Circle c=new Circle();			   
		double result=c.area(5);			   
		System.out.println(result);			 
	}

}