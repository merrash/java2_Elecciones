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
	
		Scanner sc = new Scanner(System.in);

		int num;
		String cadena;


		//************************************** MENU ********************************************
		
		int eleccion=0;

		do
		{
			System.out.print("\n\nMENU:");
			System.out.print("\n1.Añadir un habitante");
			System.out.print("\n2.Añadir un inmueble");
			System.out.print("\n3.Añadir un espacio publico");
			System.out.print("\n4.Añadir un ayuntamiento");
			System.out.print("\n5.Añadir un partido politico");
			System.out.print("\n6.Leer lista de partidos politicos");
			System.out.print("\n7.Leer lista de censo");
			System.out.print("\n8.SALIR");

			System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");

			eleccion=sc.nextInt();	
			
			System.out.println("****************************************************************");
			
			switch (eleccion) 
			{
				case 1:
				{

					
					//*************************************HABITANTE***************************************

					//creamos el objeto habitante de la clase Habitante y le damos los parametros
					Habitante habitante = new Habitante("0","","",0,"",0,"");

					//pide el nombre del habitante y lo asigna a nombre de Habitante
					System.out.print("\nNombre del habitante: ");
					cadena = sc.next();
					habitante.setNombre(cadena);

					//pide el apellido del habitante y lo asigna a apellido de Habitante
					System.out.print("\nApellido del habitante: ");
					cadena = sc.next();
					habitante.setApellido(cadena);

					//pide el dni del habitante y lo asigna a dni de Habitante
					System.out.print("\nDNI del habitante: ");
					cadena = sc.next();
					habitante.setDni(cadena);

					//pide la edad del habitante y lo asigna a edad de Habitante
					System.out.print("\nEdad del habitante: ");
					num = sc.nextInt();
					habitante.setEdad(num);

					//pide el sexo del habitante y lo asigna a sexo de Habitante
					System.out.print("\nSexo del habitante: ");
					cadena = sc.next();
					habitante.setSexo(cadena);

					//pide el telefono del habitante y lo asigna a telefono de Habitante
					System.out.print("\nTelefono del habitante: ");
					num = sc.nextInt();
					habitante.setTelefono(num);

					//pide la poblacion del habitante y lo asigna a poblacion de Habitante
					System.out.print("\nPoblacion del habitante: ");
					cadena = sc.next();
					habitante.setPoblacion(cadena);

					//muestra el contenido de los atributos de Habitante
					System.out.println("****************************************************************");
					System.out.print("\n****INFORMACION DEL HABITANTE****\n");
					System.out.print("\nEl nombre del habitante es: " + habitante.getNombre()+ "");
					System.out.print("\nEl apellido del habitante es: " + habitante.getApellido()+ "");
					System.out.print("\nEl DNI del habitante es: " + habitante.getDni()+ "");
					System.out.print("\nLa edad del habitante es: " + habitante.getEdad()+ "");
					System.out.print("\nEl sexo del habitante es: " + habitante.getSexo()+ "");
					System.out.print("\nEl telefono del habitante es: " + habitante.getTelefono()+ "");
					System.out.print("\nLa poblacion del habitante es: " + habitante.getPoblacion()+ "\n");
					System.out.println("****************************************************************");

					break;

				}
				

				case 2:
				{

															
					//*************************************** INMUEBLE **************************************

					Inmueble inmueble = new Inmueble(0,"","",0);

					//pide el ID del inmueble y lo asigna a id de Inmueble
					System.out.print("\nID del inmueble: ");
					num = sc.nextInt();
					inmueble.setId(num);

					//pide el tipo de inmueble y lo asigna a tipo de Inmueble
					System.out.print("\nTipo de inmueble: ");
					cadena = sc.next();
					inmueble.setTipo(cadena);
				
					//pide la direccion del inmueble y lo asigna a direccion de Inmueble
					System.out.print("\nLa direccion del inmueble: ");
					cadena = sc.next();
					inmueble.setDireccion(cadena);

					//pide los metros del inmueble y lo asigna a metros de Inmueble
					System.out.print("\nMetros del inmueble: ");
					num = sc.nextInt();
					inmueble.setMetros(num);

					//muestra el contenido de los atributos de Inmueble
					System.out.println("****************************************************************");
					System.out.print("\n****INFORMACION DEL INMUEBLE****\n");
					System.out.print("\nEl ID del inmueble es: " + inmueble.getId()+ "");
					System.out.print("\nEl tipo de inmueble es: " + inmueble.getTipo()+ "");
					System.out.print("\nLa dirrecion del inmueble es: " + inmueble.getDireccion()+ "");
					System.out.print("\nLos metros del inmueble son: " + inmueble.getMetros()+ "\n");
					System.out.println("****************************************************************");
					
					break;
				
				}

				case 3:
				{

					
					//***********************************ESPACIO PUBLICO*******************************************

					EspacioPublico espaciopublico = new EspacioPublico(0,"","","","",0);

					//pide el ID del espacio publico y lo asigna a id de EspacioPublico
					System.out.print("\nID del espacio publico: ");
					num = sc.nextInt();
					espaciopublico.setId(num);

					//pide el nombre del espacio publico y lo asigna a nombre de EspacioPublico
					System.out.print("\nNombre del espacio publico: ");
					cadena = sc.next();
					espaciopublico.setNombre(cadena);

					//pide el tipo de espacio publico y lo asigna a tipo de EspacioPublico
					System.out.print("\nTipo de espacio publico: ");
					cadena = sc.next();
					espaciopublico.setTipo(cadena);
				
					//pide la direccion del espacio publico y lo asigna a direccion de EspacioPublico				
					System.out.print("\nLa direccion del espacio publico: ");
					cadena = sc.next();
					espaciopublico.setDireccion(cadena);

					//pide la poblacion del espacio publico y lo asigna a poblacion de EspacioPublico
					System.out.print("\nLa poblacion del espacio publico: ");
					cadena = sc.next();
					espaciopublico.setPoblacion(cadena);
					
					//pide los metros del espacio publico y lo asigna a metros de EspacioPublico
					System.out.print("\nMetros del espacio publico: ");
					num = sc.nextInt();
					espaciopublico.setMetros(num);

					//muestra el contenido de los atributos de EspacioPublico
					System.out.println("****************************************************************");
					System.out.print("\n****INFORMACION DEL ESPACIO PUBLICO****\n");
					System.out.print("\nEl ID del espacio publico es: " + espaciopublico.getId()+ "");
					System.out.print("\nEl nombre del espacio publico es: " + espaciopublico.getNombre()+ "");
					System.out.print("\nEl tipo del espacio publico es: " + espaciopublico.getTipo()+ "");
					System.out.print("\nLa direccion del espacio publico es: " + espaciopublico.getDireccion()+ "");
					System.out.print("\nLa poblacion del espacio publico es: " + espaciopublico.getPoblacion()+ "");
					System.out.print("\nLos metros del espacio publico es: " + espaciopublico.getMetros()+ "\n");
					System.out.println("****************************************************************");
					
					break;
				
				}


				case 4:
				{

					
					//**************************** AYUNTAMIENTO ****************************************

					Ayuntamiento ayuntamiento = new Ayuntamiento(0,"","","");

					//pide el ID del ayuntamiento y lo asigna a id de Ayuntamiento
					System.out.print("\nID del ayuntamiento: ");
					num = sc.nextInt();
					ayuntamiento.setId(num);

					//pide la poblacion del ayuntamiento y lo asigna a poblacion de Ayuntamiento
					System.out.print("\nPoblacion del ayuntamiento: ");
					cadena = sc.next();
					ayuntamiento.setPoblacion(cadena);
					
					//pide la direccion del ayuntamiento y lo asigna a direccion de Ayuntamiento
					System.out.print("\nLa direccion del ayuntamiento: ");
					cadena = sc.next();
					ayuntamiento.setDireccion(cadena);

					//pide el nombre del alcalde y lo asigna a nombrealcalde de Ayuntamiento
					System.out.print("\nEl nombre del alcalde: ");
					cadena = sc.next();
					ayuntamiento.setNombreAlcalde(cadena);

					//muestra el contenido de los atributos de Ayuntamiento
					System.out.println("****************************************************************");
					System.out.print("\n****INFORMACION DEL AYUNTAMIENTO****\n");
					System.out.print("\nEl ID del ayuntamiento es: " + ayuntamiento.getId()+ "");
					System.out.print("\nLa poblacion del ayuntamiento es: " + ayuntamiento.getPoblacion()+ "");
					System.out.print("\nLa direcciondel ayuntamiento es: " + ayuntamiento.getDireccion()+ "");
					System.out.print("\nEl nombre del alcalde es: " + ayuntamiento.getNombreAlcalde()+ "\n");
					System.out.println("****************************************************************");
					
					break;

				}

				case 5:
				{

					
					//*************************************PARTIDO POLITICO*****************************************

					Partido partido = new Partido(0,"","",0,"");

					//pide el ID del partido y lo asigna a id de Partido
					System.out.print("\nId del partido");
					num = sc.nextInt();
					partido.setId(num);

					//pide el nombre del partido y lo asigna a nombre de Partido
					System.out.print("\nNombre del partido: ");
					cadena = sc.next();
					partido.setNombre(cadena);

					//pide las siglas del partido y lo asigna a siglas de Partido
					System.out.print("\nSiglas del partido: ");
					cadena = sc.next();
					partido.setSiglas(cadena);

					//pide el numero de afiliados del partido y lo asigna a afiliados de Partido
					System.out.print("\nNumero de afiliados en el partido: ");
					num = sc.nextInt();
					partido.setAfiliados(num);
					//pide el nombre del secretario general del partido y lo asigna a secretario de Partido
					System.out.print("\nNombre del secretario general: ");
					cadena = sc.next();
					partido.setSecretario(cadena);

					//muestra el contenido de los atributos de Partido
					System.out.println("****************************************************************");
					System.out.print("\n****INFORMACION DEL PARTIDO****\n");	
					System.out.print("\nEl id del partido es: " + partido.getId()+ "");
					System.out.print("\nEl nombre del partido es: " + partido.getNombre()+ "");
					System.out.print("\nLas siglas del partido son" + partido.getSiglas()+ "");
					System.out.print("\nEl numero de afiliados es: " + partido.getAfiliados()+ "");
					System.out.print("\nEl nombre del secretario general es: " + partido.getSecretario()+ "\n");
					System.out.println("****************************************************************");
							
					break;

				}

				case 6:
				{

															
					//*****************LEER ARCHIVO PARTIDO Y GUARDARLO EN EL ARRAYLIST*************************************
					
					try
					{
					
			        	File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");
			        	//File archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/listadoPartidos.txt");
			        	
			        	//FileReader lector = new FileReader (archivo);
			        	//BufferedReader bufer = new BufferedReader(lector);
			 			Scanner linea = new Scanner(archivo);
			        	
			        	//ArrayList <String> lista = new ArrayList <String>() ;

			        	//Cremos el objeto Arraylist del tipo partido
			        	ArrayList <Partido> partido = new ArrayList <Partido>() ; 
			        	
			        	if (linea.hasNextLine())
			        		System.out.print("\n****INFORMACION DE LOS PARTIDOS****\n");
						
						while (linea.hasNextLine())
						{     

							//obtenemos la linea
			 				String concoma = linea.nextLine();

			 				//asigno al array los atributos de la fila leida sin comas
							String[] separadas = concoma.split(",");

							//creamos el nuevo partido y le asignamos los datos obtenido en el String separadas.
							Partido aux = new Partido(Integer.parseInt(separadas[0]),separadas[1],separadas[2],Integer.parseInt(separadas[3]),
																															separadas[4]);
							
							/*
							//estas sentencias es lo mismo que poner la linea de arriba
							
							//ponemos los datos en los atributos del objeto
							aux.setId(Integer.parseInt(separadas[0]));
							aux.setNombre(separadas[1]);
							aux.setSiglas(separadas[2]);
							aux.setAfiliados(Integer.parseInt(separadas[3]));
							aux.setSecretario(separadas[4]);
							*/

							//añadimos el objeto aux al ArrayList
							partido.add(aux);

							//obtenemos los datos del ultimo partido añadido

							System.out.println("Este es el ID del partido: " + aux.getId());
							System.out.println("Nombre del partido: " + aux.getNombre());
							System.out.println("Siglas del partido: " + aux.getSiglas());
							System.out.println("Afiliados del partido: " + aux.getAfiliados());
							System.out.println("Secretario general: " + aux.getSecretario() + "\n");
							System.out.println("****************************************************************");
						
						}
								
						System.out.println("Numero de partidos politicos en el archivo: " + partido.size()) ; 		
						
						//vaciamos los ArryList
						partido.clear();
						
						System.out.println("despues del vaciado del arraylist PARTIDO: " + partido.size() + " elementos") ;
						System.out.println("****************************************************************");
						
			        }
			        
			        catch(Exception e)
			        {
			        	e.printStackTrace();
			        }
			        
			        break;

		    	}


				case 7:
				{

					
			        //************LEER FICHERO CENSO Y GUARDAR EN ARRAYLIST. IMPRIMIR SOLO A LOS MAYORES DE 18 AÑOS*************

			        try
					{
					
			        	File archivo = new File ("/home/zubiri/ProyectosJava/java2_Elecciones/src/censo.txt");
			        	//File archivo = new File ("/home/ibalenciaga/ProyectosJava/java2_Elecciones/src/censo.txt");
			        	
			        	//FileReader lector = new FileReader (archivo);
			        	//BufferedReader bufer = new BufferedReader(lector);
			 			Scanner linea = new Scanner(archivo);
			        	
			        	//ArrayList <String> lista = new ArrayList <String>() ;

			        	//Creamos el objeto Arraylist del tipo habitante
			        	ArrayList <Habitante> habitante = new ArrayList <Habitante>() ; 
			        	
			        	int cont=0;
			        	if (linea.hasNextLine())
			        		System.out.print("\n****INFORMACION DEL CENSO****\n");
			        	
						while (linea.hasNextLine())
						{     
							cont++;
							//obtenemos la linea
			 				String concoma = linea.nextLine();

			 				//asigna al array los atributos de la fila leida sin comas
							String[] separadas = concoma.split(",");

							//creamos el nuevo partido y le asignamos los datos obtenido en el String separadas.
							Habitante aux = new Habitante(separadas[0],separadas[1],separadas[2],Integer.parseInt(separadas[3]),separadas[4],
																								Integer.parseInt(separadas[5]),separadas[6]);
						
							/*
							//estas sentencias es lo mismo que poner la linea de arriba
							
							//ponemos los datos en los atributos del objeto
							aux.setNombre(separadas[0]);
							aux.setApellido(separadas[1]);
							aux.setDni(separadas[2]);
							aux.setEdad(Integer.parseInt(separadas[3]));
							aux.setSexo(separadas[4]);
							aux.setTelefono(Integer.parseInt(separadas[5]));
							aux.setPoblacion(separadas[6]);
							*/


							//Comprobamos si es mayor de edad
							if (aux.getEdad()>=18)
							{

								//añadimos el objeto aux al ArrayList
								habitante.add(aux);

								//obtenemos los datos del ultimo habitante añadido
								System.out.println("****************************************************************");
								System.out.println("Nombre del habitante: " + aux.getNombre());
								System.out.println("Apellido del habitante: " + aux.getApellido());
								System.out.println("DNI del habitante: " + aux.getDni());
								System.out.println("Edad del habitante: " + aux.getEdad());
								System.out.println("Sexo del habitante " + aux.getSexo());
								System.out.println("Telefono del habitante: " + aux.getTelefono());
								System.out.println("Poblacion del habitante: " + aux.getPoblacion() + "\n");
								System.out.println("****************************************************************");
						
							}

						}

								System.out.println("Total de habitantes en el archivo: " + cont) ;
								System.out.println("Habitantes mayores de 18 años: " + habitante.size()) ;
								System.out.println("****************************************************************");								

								//vaciamos los ArryList
								habitante.clear();
								
								System.out.println("despues del vaciado del arraylist HABITANTE: " + habitante.size() + " elementos") ;
								System.out.println("****************************************************************");
								
								

			        }
			        
			        catch(Exception e)
			        {
			        	e.printStackTrace();
			        }
			        
			        break;

		    	}

		    	case 8:
		    		
		    		break;

		    	default:
		    		System.out.println("No has elegido la opcion correcta");

		    }
	    
	    }while(eleccion != 8);
	}
}