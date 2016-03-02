package desenhos;

public class Des_M implements Desenhar {

	private int SIZE = 0;
	
	@Override
	public void setSIZE(int a) {
		SIZE = a;
	}

	public void desenhar() {
	
		for(int lin = 0;lin<SIZE;lin++){
			for(int col = 0;col<SIZE;col++){
				if(col<=lin){
					System.out.print(col + 1);
				}
				if ((col == lin) && (lin < SIZE)) {
					System.out.println();
				}			
			}
		}
			
	}
		

}
