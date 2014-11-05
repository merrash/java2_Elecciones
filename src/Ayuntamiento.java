public class Ayuntamiento
{

	private int id;
	private String poblacion;
	private String direccion;
	private String nombrealcalde;
	

	public Ayuntamiento(int i, String p, String d, String n)
	{
		id=i;
		poblacion=p;
		direccion=d;
		nombrealcalde=n;
	}

	
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}

	public void setPoblacion(String p)
	{
		this.poblacion=p;
	}
	public String getPoblacion()
	{
		return poblacion;
	}

	public void setDireccion(String d)
	{
		this.direccion=d;
	}
	public String getDireccion()
	{
		return direccion;
	}

	public void setNombreAlcalde(String n)
	{
		this.nombrealcalde=n;
	}

	public String getNombreAlcalde()
	{
		return nombrealcalde;
	}
}