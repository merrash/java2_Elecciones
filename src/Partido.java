public class Partido
{

	private int id;//id del partido
	private String nombre;//nombre del partido
	private String siglas;//siglas de partido
	private int afiliados;//numero de afiliados en el partido
	private String secretario;//nombre del secretario general del partido
		

	public Partido(int i, String n, String s, int a, String se)
	{
		id=i;
		nombre=n;
		siglas=s;
		afiliados=a;
		secretario=se;
	}

	
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}

	public void setNombre(String n)
	{
		this.nombre=n;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setSiglas(String s)
	{
		this.siglas=s;
	}
	public String getSiglas()
	{
		return siglas;
	}

	public void setAfiliados(int a)
	{
		this.afiliados=a;
	}

	public int getAfiliados()
	{
		return afiliados;
	}
	public void setSecretario(String se)
	{
		this.secretario=se;
	}
	public String getSecretario()
	{
		return secretario;
	}
	
}