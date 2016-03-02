package desenhos;

public class Des_J implements Desenhar{
	
	private int SIZE = 0;
	
	@Override
	public void setSIZE(int a) {
		SIZE = a;	
	}

	public void desenhar() {
		for (int lin = 0;lin<SIZE;lin++){
			
			for (int col = 0;col<SIZE;col++){
				if (((lin) <= col) && (col <= ((SIZE-1) - lin))){
					System.out.print("#");					
				
				} else {
					System.out.print(" ");
				}
				
				if (col == (SIZE - 1))
					System.out.println();			
				
			}
		}
		
	}

}

