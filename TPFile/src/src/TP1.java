package src;

import java.util.Scanner;

public class TP1 {
	public static int readNumber(String line) {
		int note = 0 ;

		try {
			note = Integer.parseInt(line);
			
			if(note > -1 && note <= 20) {
				return note;
			} else {
				System.out.println("Veuillez saisir un nombre entre 1 et 20");
				return -1;
			}
			
		} 
		
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		
		System.out.println("Veuillez saisir un nombre.");
		return -1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue dans Note++, veuillez inscrire les notes de vos élèves.");
		Scanner scan = new Scanner(System.in);
		String  line = null;
		double total = 0;
		int nbNote = 0 ;
		int statusNumber = 0;
        boolean end = false;
		
		
		
			
		while(!end) {
			while(!(line = scan.next()).equals("fini")) {
				statusNumber = readNumber(line);

				if(statusNumber != -1) {
					total = total + statusNumber;
					nbNote++;
				}

			}
			
			if(nbNote !=0) {
				//TODO gérer la division
				System.out.println("La moyenne est de " + (total/nbNote)+ "." );
			} else {
				System.out.println("Entrez at least une note");
				
			}
		}
	}

}
