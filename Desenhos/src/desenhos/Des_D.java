package desenhos;

public class Des_D implements Desenhar{

private int SIZE = 0;
	
	@Override
	public void setSIZE(int a) {
		SIZE = a;
	}

	public void desenhar() {
	
		for(int lin = 0;lin<SIZE;lin++){
		
			for(int col = 0;col<SIZE;col++){
				
				if (col < ((SIZE - lin)-1))
					System.out.print(" ");
				
				if ((col == SIZE) || (col >=((SIZE - lin)-1)))
					System.out.print("#");			
				
				if (col == (SIZE - 1))
					System.out.println();
				
			}
		}
			
	}

}