package com.kayu.loveapps;

public class Calculate {
	
	
	
	
	

	public static  int getYValue() {
		
		String pname[] = love.Yname.trim().toLowerCase().split("(?!^)");		
		
		int calculteVal = 0 ;
		
		
		
		
		for (int y=0;y<pname.length;y++){
			if (pname[y].equals("a")  || pname[y].equals("j")  || pname[y].equals("s") )
			{
				calculteVal = calculteVal+1;
								
			}
			
			else {
				calculteVal = calculteVal +0;
			      }
			
			if (pname[y].equals("b")  || pname[y].equals("k")  || pname[y].equals("t") )
			{
				calculteVal = calculteVal+2;
				
			}
			
			else {
				calculteVal = calculteVal +0;
			      }
			
			 if (pname[y].equals("c")  || pname[y].equals("l")  || pname[y].equals("u") )
			{
				calculteVal = calculteVal+3;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (pname[y].equals("d")  || pname[y].equals("m")  || pname[y].equals("v") )
			{
				calculteVal = calculteVal+4;
				
			}
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (pname[y].equals("e")  || pname[y].equals("n")  || pname[y].equals("w") )
			{
				calculteVal = calculteVal+5;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (pname[y].equals("f") || pname[y].equals("o") || pname[y].equals("x") )
			{
				calculteVal = calculteVal+6;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			 if (pname[y].equals("g")  || pname[y].equals("p")  || pname[y].equals("y") )
			{
				calculteVal = calculteVal+7;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			if (pname[y].equals("h")  || pname[y].equals("q")  || pname[y].equals("z") )
			{
				calculteVal = calculteVal+8;
				
			}
			
			else {
				calculteVal = calculteVal +0;
			      }
			
			 if (pname[y].equals("i")  || pname[y].equals("r")  )
			{
				calculteVal = calculteVal+9;
				
			}
			 
			 else {
					calculteVal = calculteVal +0;
				      }
			
			
			
		}
		
		while (calculteVal > 9)
		{
			String val = Integer.toString(calculteVal);
			int z = checkValue(val);
			calculteVal = z;
				
			
			
		}
		
		
		return calculteVal;
		
	
	}
	
	public static  int getPValue() {
		String yname[] = love.Pname.trim().toLowerCase().split("(?!^)");
        int calculteYVal = 0 ;
		
		
		
		
		for (int y=0;y<yname.length;y++){
			if (yname[y].equals("a")  || yname[y].equals("j")  || yname[y].equals("s") )
			{
				calculteYVal = calculteYVal+1;
								
			}
			
			else {
				calculteYVal = calculteYVal +0;
			      }
			
			if (yname[y].equals("b")  || yname[y].equals("k")  || yname[y].equals("t") )
			{
				calculteYVal = calculteYVal+2;
				
			}
			
			else {
				calculteYVal = calculteYVal +0;
			      }
			
			 if (yname[y].equals("c")  || yname[y].equals("l")  || yname[y].equals("u") )
			{
				 calculteYVal = calculteYVal+3;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (yname[y].equals("d")  || yname[y].equals("m")  || yname[y].equals("v") )
			{
				 calculteYVal = calculteYVal+4;
				
			}
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (yname[y].equals("e")  || yname[y].equals("n")  || yname[y].equals("w") )
			{
				 calculteYVal = calculteYVal+5;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (yname[y].equals("f") || yname[y].equals("o") || yname[y].equals("x") )
			{
				 calculteYVal = calculteYVal+6;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			 if (yname[y].equals("g")  || yname[y].equals("p")  || yname[y].equals("y") )
			{
				 calculteYVal = calculteYVal+7;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			if (yname[y].equals("h")  || yname[y].equals("q")  || yname[y].equals("z") )
			{
				calculteYVal = calculteYVal+8;
				
			}
			
			else {
				calculteYVal = calculteYVal +0;
			      }
			
			 if (yname[y].equals("i")  || yname[y].equals("r")  )
			{
				 calculteYVal = calculteYVal+9;
				
			}
			 
			 else {
				 calculteYVal = calculteYVal +0;
				      }
			
			
			
		}
		
		while (calculteYVal > 9)
		{
			String val = Integer.toString(calculteYVal);
			int z = checkValue(val);
			calculteYVal = z;
				
			
			
		}
		
		
		return calculteYVal;
		
	
	
	
	}
	
	
	
	
	public static int checkValue(String x)
	{
		String val = x;
		String value[]=val.split("(?!^)");
		int t = 0;
		for (int y=0 ;y<value.length;y++)
		{
			t= t+ Integer.parseInt(value[y]);
		}
		
		return t;
		
	}
	
	

}
