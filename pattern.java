package test;

public class pattern {
	public static void main(String[] args) {
		
		// Initial for "TELUSKO"
		for(int i = 1; i<=7; i++) 
		{
			// Letter 'T'
			for(int j = 1; j<=7;j++)
			{
				if(i==1 || j==4)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'E'
			for(int j=1;j<=7;j++)
			{
				if(i==1 || i==4 || i==7 || j==1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}

			// Letter 'L'
			for(int j=1;j<=7;j++)
			{
				if(i==7 || j==1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'U'
			for(int j=1;j<=7;j++)
			{
				if(i==7 || j==1 || j==7)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'S'
			for(int j=1;j<=7;j++)
			{
				if(i==1 || (i==2&&j==1) || (i==3&&j==1) || (i==5&&j==7) || (i==6&&j==7) || i==4 || i==7 )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'K'
			for(int j=1;j<=7;j++)
			{
				if(j==1 || (i==4&&j==2) || (i==4&&j==3) || (i==3&&j==4) || (i==2&&j==5) || (i==1&&j==6) || (i==5&&j==4) || (i==6&&j==5) || (i==7&&j==6))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'O'
			for(int j=1;j<=7;j++)
			{
				if(i==1 || i==7 || j==1 || j==7)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		// Initial for 'INEURON'
		for(int i=1; i<=7;i++)
		{
			// Letter 'I'
			for(int j=1;j<=7;j++)
			{
				if(i==1 || i==7 || j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'N'
			for(int j=1;j<=7;j++)
			{
				if(j==1 || j==7 || (i==2&&j==2) || (i==3&&j==3) || (i==4&&j==4) || (i==5&&j==5) || (i==6&&j==6))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'E'
			for(int j=1;j<=7;j++)
			{
				if(i==1 || i==4 || i==7 || j==1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}

			// Letter 'U'
			for(int j=1;j<=7;j++)
			{
				if(i==7 || j==1 || j==7)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'R'
			for(int j=1; j<=7; j++)
			{
				if(i==1 || j==1 || (i==2&&j==7) || (i==3&&j==7) || i==4 || (i==5&&j==4) || (i==6&&j==5) || i==7&&j==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'O'
			for(int j=1;j<=7;j++)
			{
				if(i==1 || i==7 || j==1 || j==7)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			// Letter 'N'
			for(int j=1;j<=7;j++)
			{
//				System.out.print(" ");
				if(j==1 || j==7 || (i==2&&j==2) || (i==3&&j==3) || (i==4&&j==4) || (i==5&&j==5) || (i==6&&j==6))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		
	}
}
