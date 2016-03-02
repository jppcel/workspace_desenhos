package desenhos;

public class Des_H implements Desenhar {

	private int SIZE = 0;
	
	@Override
	public void setSIZE(int a) {
		SIZE = a;	
	}

	@Override
	public void desenhar() {
		for (int lin = 0;lin<SIZE;lin++){
			
			for (int col = 0;col<SIZE;col++){
				if ((lin + (SIZE - 1) == (SIZE - 1)) || (lin == (SIZE - 1) || (((col + lin) == (SIZE - 1) || (lin == col))))) {
					System.out.print("*");					
				
				} else {
					System.out.print(" ");
				}
				
				if (col == (SIZE - 1))
					System.out.println();			
				
			}
		}
		
	}

}
