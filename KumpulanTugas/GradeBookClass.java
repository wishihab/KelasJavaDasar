public class GradeBookClass
{	
	private String NamaPengajar, NamaMatkul, Seksi;	
		
	public GradeBookClass(String NamaPengajar, String NamaMatkul, String Seksi)
	{
		this.NamaPengajar= NamaPengajar;
		this.NamaMatkul= NamaMatkul;
		this.Seksi = Seksi;
	}
	
	public void setNamaPengajar (String NamaPengajar )
	{
		this.NamaPengajar=NamaPengajar;
	}
		
	public String getNamaPengajar()
	{
		return NamaPengajar;
	}
	public void setNamaMatkul (String NamaMatkul )
	{
		this.NamaMatkul=NamaMatkul;
	}
		
	public String getNamaMatkul()
	{
		return NamaMatkul;
	}
	public void setSeksi (String Seksi)
	{
		this.Seksi=Seksi;
	}
		
	public String getSeksi()
	{
		return Seksi;
	}
}
