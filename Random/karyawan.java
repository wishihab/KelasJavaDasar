public class karyawan
{	
	private String NIP, NamaDepan, NamaBelakang;	
		
	public karyawan()
	{
		
	}
	public karyawan(String NIP, String NamaDepan, String NamaBelakang)
	{
		this.NIP= NIP;
		this.NamaDepan= NamaDepan;
		this.NamaBelakang = NamaBelakang;
	}
	
	public void setNIP (String NIP )
	{
		this.NIP=NIP;
	}
		
	public String getNIP()
	{
		return NIP;
	}
	public void setNamaDepan (String NamaDepan)
	{
		this.NamaDepan=NamaDepan;
	}
		
	public String getNamaDepan()
	{
		return NamaDepan;
	}
	public void setNamaBelakang (String NamaBelakang)
	{
		this.NamaBelakang=NamaBelakang;
	}
		
	public String getNamaBelakang()
	{
		return NamaBelakang;
	}
}
