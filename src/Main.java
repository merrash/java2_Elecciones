import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList; 

import java.util.Scanner;

public class Main 
{



	public static void main (String args[]) 
	{
	
		int num;
		String cadena;
		
		Scanner sc = new Scanner(System.in);

		/*

			//*****HABITANTE*****

		Habitante habitante = new Habitante("0","","",0,"",0,"");


		System.out.print("\nNombre del habitante: ");//pide el nombre del habitante
		cadena = sc.nextLine();
		habitante.setNombre(cadena);

		System.out.print("\nApellido del habitante: ");//pide el apellido del habitante
		cadena = sc.next();
		habitante.setApellido(cadena);

		System.out.print("\nDNI del habitante: ");//pide el DNI del habitante
		cadena = sc.next();
		habitante.setDni(cadena);

		System.out.print("\nEdad del habitante: ");//pide la edad el habitante
		num = sc.nextInt();
		habitante.setEdad(num);

		System.out.print("\nSexo del habitante: ");//pide el sexo del habitante
		cadena = sc.next();
		habitante.setSexo(cadena);

		System.out.print("\nTelefono del habitante: ");//pide el telefono del habitante
		num = sc.nextInt();
		habitante.setTelefono(num);

		System.out.print("\nPoblacion del habitante: ");//pide la poblacion del habitante
		cadena = sc.next();
		habitante.setPoblacion(cadena);


		System.out.print("\nEl nombre del habitante es: " + habitante.getNombre()+ "\n");//muestra el nombre del habitante
		System.out.print("\nEl apellido del habitante es: " + habitante.getApellido()+ "\n");//muestra el apellido del habitante
		System.out.print("\nEl DNI del habitante es: " + habitante.getDni()+ "\n");//muestra el DNI del habitante
		System.out.print("\nLa edad del habitante es: " + habitante.getEdad()+ "\n");//muestra la edad del habitante
		System.out.print("\nEl sexo del habitante es: " + habitante.getSexo()+ "\n");//muestra el sexo del habitante
		System.out.print("\nEl telefono del habitante es: " + habitante.getTelefono()+ "\n");//muestra el telefono del habitante
		System.out.print("\nLa poblacion del habitante es: " + habitante.getPoblacion()+ "\n");//muestra la poblacion del habitante


		//*****INMUEBLE*****

		Inmueble inmueble = new Inmueble(0,"","",0);


		System.out.print("\nID del inmueble: ");//pide el ID del inmueble
		num = sc.nextInt();
		inmueble.setId(num);

		System.out.print("\nTipo de inmueble: ");//pide el tipo de inmueble
		cadena = sc.next();
		inmueble.setTipo(cadena);
		
		System.out.print("\nLa direccion del inmueble: ");//pide la direccion del inmueble
		cadena = sc.next();
		inmueble.setDireccion(cadena);
		
		System.out.print("\nMetros del inmueble: ");//pide los metros que tiene el inmueble
		num = sc.nextInt();
		inmueble.setMetros(num);

		


		System.out.print("\nEl ID del inmueble es: " + inmueble.getId()+ "\n");//muestra el nombre del habitante
		System.out.print("\nEl tipo de inmueble es: " + inmueble.getTipo()+ "\n");//muestra el tipo de inmueble
		System.out.print("\nLa dirrecion del inmueble es: " + inmueble.getDireccion()+ "\n");//muestra la direccion del inmueble
		System.out.print("\nLos metros del inmueble son: " + inmueble.getMetros()+ "\n");//muestra los metros del inmueble
		



		//*****ESPACIO PUBLICO*****

		EspacioPublico espaciopublico = new EspacioPublico(0,"","","","",0);


		System.out.print("\nID del espacio publico: ");//pide el ID del espacio publico
		num = sc.nextInt();
		espaciopublico.setId(num);

		System.out.print("\nNombre del espacio publico: ");//pide el nombre del espacio publico
		cadena = sc.next();
		espaciopublico.setNombre(cadena);

		System.out.print("\nTipo de espacio publico: ");//pide el tipo de espacio publico
		cadena = sc.next();
		espaciopublico.setTipo(cadena);
		
		System.out.print("\nLa direccion del espacio publico: ");//pide la direccion del espacio publico
		cadena = sc.next();
		espaciopublico.setDireccion(cadena);


		System.out.print("\nLa poblacion del espacio publico: ");//pide la poblacion en la que esta
		cadena = sc.next();
		espaciopublico.setPoblacion(cadena);
		
		System.out.print("\nMetros del espacio publico: ");//pide los metros del espacio publico
		num = sc.nextInt();
		espaciopublico.setMetros(num);

		
		System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getId()+ "\n");//muestra el ID del espacio publico
		System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getNombre()+ "\n");//muestra el nombre del espacio publico
		System.out.print("\nEl tipo del espacio publico es: " + espaciopublico.getTipo()+ "\n");//muestra  el tipo de espacio publico
		System.out.print("\nLa direccion del espacio publico es: " + espaciopublico.getDireccion()+ "\n");//muestra la direccion del espacio publico
		System.out.print("\nLa poblacion del espacio publico es: " + espaciopublico.getPoblacion()+ "\n");//recoge la poblacion en la que esta el espacio publico
		System.out.print("\nLos metros del espacio publico es: " + espaciopublico.getMetros()+ "\n");//recoge los metros del espacio publico
		
		


		//*****AYUNTAMIENTO*****

		Ayuntamiento ayuntamiento = new Ayuntamiento(0,"","","");


		System.out.print("\nID del ayuntamiento: ");//pide el ID del ayuntamiento
		num = sc.nextInt();
		ayuntamiento.setId(num);

		System.out.print("\nPoblacion del ayuntamiento: ");//pide la poblacion del ayuntamiento
		cadena = sc.next();
		ayuntamiento.setPoblacion(cadena);
		
		System.out.print("\nLa direccion del ayuntamiento: ");//pide la direccion del ayuntamiento
		cadena = sc.next();
		ayuntamiento.setDireccion(cadena);


		System.out.print("\nEl nombre del alcalde: ");//pide el nombre del alcalde
		cadena = sc.next();
		ayuntamiento.setNombreAlcalde(cadena);

		
		System.out.print("\nEl ID del ayuntamiento es: " + ayuntamiento.getId()+ "\n");//muestra el ID del ayuntamiento
		System.out.print("\nLa poblacion del ayuntamiento es: " + ayuntamiento.getPoblacion()+ "\n");//muestra la poblacion del ayuntamiento
		System.out.print("\nLa direcciondel ayuntamiento es: " + ayuntamiento.getDireccion()+ "\n");//muestra la dirrecion del ayuntamiento
		System.out.print("\nEl nombre del alcalde es: " + ayuntamiento.getNombreAlcalde()+ "\n");//muestra el nombre del alcalde



		//*****PARTIDO*****

		Partido partido = new Partido(0,"","",0,"");


		System.out.print("\nId del partido");//pide el ID del partido
		num = sc.nextInt();
		partido.setId(num);

		System.out.print("\nNombre del partido: ");//pide el nombre del partido
		cadena = sc.next();
		partido.setNombre(cadena);

		System.out.print("\nSiglas del partido: ");//pide las siglas del partido
		cadena = sc.next();
		partido.setSiglas(cadena);

		System.out.print("\nNumero de afiliados en el partido: ");//pide el numero de afiliados en el partido
		num = sc.nextInt();
		partido.setAfiliados(num);

		System.out.print("\nNombre del secretario general: ");//pide el nombre del secretario general del partido
		cadena = sc.next();
		partido.setSecretario(cadena);

				
		System.out.print("\nEl id del partido es: " + partido.getId()+ "\n");//muestra el ID del partido
		System.out.print("\nEl nombre del partido es: " + partido.getNombre()+ "\n");//muestra el nombre del partido
		System.out.print("\nLas siglas del partido son" + partido.getSiglas()+ "\n");//muestra las siglas del partido
		System.out.print("\nEl numero de afiliados es: " + partido.getAfiliados()+ "\n");//muestra el numero de afiliados
		System.out.print("\nEl nombre del secretario general es: " + partido.getSecretario()+ "\n");//muestra el nombre del secretario
				
		*/

		
		try
		{
		
        	//File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/ListadoPartidos.txt");
        	File archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/ListadoPartidos.txt");
        	FileReader lector = new FileReader (archivo);
        	BufferedReader bufer = new BufferedReader(lector);
 
        	         
        	ArrayList <Partido> partido = new ArrayList <Partido>() ; 
        	//ArrayList <Habitante> habitante = new ArrayList <Habitante>() ; 
        	//ArrayList <String> lista = new ArrayList <String>() ; 
			


			int i=0;

			do{


 			String concoma = bufer.readLine();//obtenemos la linea

			String[] separadas = concoma.split(",");//asigno al array los atributos de la fila leida sin comas

			Partido aux = new Partido(0,"","",0,"");
			


			//ponemos los datos en los atributos del objeto
			aux.setId(Integer.parseInt(separadas[0]));
			aux.setNombre(separadas[1]);
			aux.setSiglas(separadas[2]);
			aux.setAfiliados(Integer.parseInt(separadas[3]));
			aux.setSecretario(separadas[4]);

			//añadimos el objeto aux al ArrayList
			partido.add(aux);
			
			}
			while (bufer.readLine() != null);
			
			for(i=0;i<partido.size();i++)
				{System.out.println(partido.get(i));} 

			
			/*
			lista.add(fila);
        	

       
            while (fila != null) 
            {

 
                System.out.println(lista.get(i));
                i++;
                fila = bufer.readLine();
                lista.add(fila);

            }
            */

				
			//System.out.println("antes del vaciado del arraylist:" + (partido.size()-1) + "elementos") ; 		

			//lista.clear();

			//System.out.println("despues del vaciado del arraylist:" + lista.size() + "elementos") ; 
			

        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }

	}
}