
public class UnaCoppia {

	public static void main(String[] args) {
		int vett1[] = { 4, 3728329, 99, 5, 3, 77, 8, 12, 4, 21 };
		//int control = 0;
		int doppio = 0;
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				if (i!=k) {
					if (vett1[i] == vett1[k]) {
						doppio++;
					}
				}
			}
		}
		if (doppio == 2) {
			System.out.println("una coppia soltanto");
		} else {
			System.out.println("errore");
		}
	}
		
	}

