package Controller;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Controle {
	String Leitura;
	String texto;
	String Caminho;	

		public void ler(){
			{Path caminho = Paths.get("C:\\TEMP/wiki.json.txt");
				try {	
					byte[] texto = Files.readAllBytes(caminho);
					String Leitura = new String (texto);
					String linha_array[] = Leitura.split(",");
			
						int i = 0;
			
							while (i <= linha_array.length) {
				
								if (linha_array[i].contains("timestamp")) {
									String a[] = linha_array[i].split("");
									System.out.println(a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9]+a[11]+a[13]+a[14]+a[15]+a[16]+"/"+a[17]+a[18]+"/"+a[19]+a[20]);
				
								}
				
				
									if (linha_array[i].contains("views")) {
									String b[] = linha_array[i].split("");
									System.out.println(b[1]+b[2]+b[3]+b[4]+b[5]+b[7]+b[8]+b[9]+b[10]+b[11]);
									}
				
				
								i++;
						
			}
			
		} 		catch (Exception erro) {
		
	}

	}

}

}