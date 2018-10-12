public class karyawan{

	String nama;
	String alamat;
	private int gaji;

	public int getGaji(){
		return this.gaji;
	}
	//overload
	public void SetGaji(int uang){
		this.gaji=uang;
	}

	public void SetNama(String nama){
		System.out.println("Nama Anda : "+nama);
	}

	public void SetAlamat(String alamat){
		System.out.println("Masukan Alamat : "+alamat);
	}
	//overload
	public void SetGaji(int uang, String pesan){
		System.out.println(uang);
		System.out.println(pesan);
	}


}

