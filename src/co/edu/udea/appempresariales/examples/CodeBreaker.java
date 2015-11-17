package co.edu.udea.appempresariales.examples;

public class CodeBreaker {
	public String adivinarNumero(String numero)
	{
		
		String respuesta;
		String numeroCorrecto = "3184";
		Character a,b;
		String[] vector = new String[4];
		vector[0] = "3";
		vector[1] = "1";
		vector[2] = "8";
		vector[3] = "4";	
		String[] vectorRespuesta = new String[4];
		String aux = "";
		String aux2 = "";
		Character caracterSalvado;
		
		for(int i=0;i<numero.length();i++){
			a = (Character)numero.charAt(i);
			b = (Character)numeroCorrecto.charAt(i);
			
			if(vector[i].equals(a.toString())){
				vectorRespuesta[i] = "x";
			}
			else
			{
				vectorRespuesta[i] = "";
			}

		}
		for(int i = 0; i < numero.length(); i++)
		{
			aux = aux + vectorRespuesta[i];
			if(vectorRespuesta[i].equals(""))
			{
				caracterSalvado = (Character)numero.charAt(i);
				vectorRespuesta[i] = caracterSalvado.toString();
			}
			aux2 = aux2 + vectorRespuesta[i];
		}
		for(int i = 0; i < aux2.length(); i++)
		{
			a = (Character)aux2.charAt(i);
			for(int j = 0; j < numeroCorrecto.length(); j++)
			{
				b = (Character)numeroCorrecto.charAt(j);
				if(a.toString().equals(b.toString()))
				{
					aux = aux + "_";
					break;
				}
			}
			
		}
		return aux;
		/*
		for(int i=0;i<numero.length();i++){
			a = (Character)numero.charAt(i);
			b = (Character)numeroCorrecto.charAt(i);
			
			if(vector[i].equals(a)){
				vectorRespuesta[i] = "x";
			}
			
			for(int j = 0; j < numero.length() ; j++)
			{
				if(!vectorRespuesta[j].equals(""))
				{
					if(vectorRespuesta[j].equals(a))
					{
						
					}
				}
			}
		}
		if (numero.equals(numeroCorrecto)){
			respuesta= "xxxx";
		}
		else{
			respuesta = "";
		}
		
		return respuesta;*/
	}
}
