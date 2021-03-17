public class manana1 {	
	public static String tipoDificultad(){
			
			int tipo =(int)(Math.random()*2+1);
			
			if(tipo == 1){return "@";}
			if(tipo == 2){return "^";}
		return " ";
	}
		
	public static void main (String[] args) {
				
		int dificultad;
		String tipoDificultad;
		int posicion;
		int parar;
		
		while(true){
			dificultad=(int)(Math.random()*2+1);

			if(dificultad == 1){
				
				tipoDificultad=tipoDificultad();
				posicion=(int)(Math.random()*4+1);
				
				if(tipoDificultad=="@"){
					if(posicion== 1){System.out.println("|@   |");}
					if(posicion== 2){System.out.println("| @  |");}
					if(posicion== 3){System.out.println("|  @ |");}
					if(posicion== 4){System.out.println("|   @|");}
				}else if(tipoDificultad=="^"){
					if(posicion== 1){System.out.println("|^   |");}
					if(posicion== 2){System.out.println("| ^  |");}
					if(posicion== 3){System.out.println("|  ^ |");}
					if(posicion== 4){System.out.println("|   ^|");}
					}
			}else{
				System.out.println("|    |");
System.out.println("Error");
			}		
		}
	}
}


