package desenhos;

public class Des_Q implements Desenhar {

	private int SIZE = 0;
	
	@Override
	public void setSIZE(int a) {
		SIZE = a;	
	}

	public void desenhar() {
		for (int lin = 0;lin<SIZE;lin++){			
			for (int col = 0;col<SIZE;col++){
				if ((((SIZE/2) - lin) <= col) && (col <= ((SIZE/2) + lin)) && (lin < SIZE/2)){
					int print = (col - SIZE/2 + 1 + lin);
					if (print < (lin + 2)){
					System.out.print(Math.abs(print));
					} else {
						System.out.print(SIZE - col - ((SIZE/2) - lin));
					}
				} else {
					System.out.print(" ");
				}
				
				if (col == (SIZE - 1))
					System.out.println();			
				
			}
		}
		
	}

}
