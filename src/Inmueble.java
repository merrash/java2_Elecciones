public class Inmueble
{

	private int id;
	private String tipo;
	private String direccion;
	private int metros;
	

	public Inmueble(int i, String t, String d, int m)
	{
		id=i;
		tipo=t;
		direccion=d;
		metros=m;
	}

	
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}

	public void setTipo(String t)
	{
		this.tipo=t;
	}
	public String getTipo()
	{
		return apellido;
	}

	public void setDireccion(String d)
	{
		this.direccion=d;
	}
	public String getDireccion()
	{
		return dni;
	}

	public void setMetros(int m)
	{
		this.metros=m;
	}

	public int getMetros()
	{
		return metros;
	}
}