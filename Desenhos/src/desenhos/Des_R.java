package desenhos;

public class Des_R implements Desenhar {
	
	private int SIZE = 0;
	
	@Override
	public void setSIZE(int a) {
		SIZE = a;	
	}

	public void desenhar() {
		for (int lin = 0;lin<SIZE;lin++){
			
			for (int col = 0;col<SIZE;col++){
				if (((lin) <= col) && (col <= ((SIZE-1) - lin))){
					if (col > (SIZE/2)) {
						System.out.print("x");
					} else {
						System.out.print(col + 1); //testegit
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