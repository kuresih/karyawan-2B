public class karyawan{

	String nama;
	String alamat;
	int gaji;

	public void gajidesaigner(int uang){
		System.out.println("gaji maksimal karyawan desaigner adalah = " +gaji);
		gaji=70;
	}

	public void gajiprogrammer(int uang){
		System.out.println("gaji maksimal karyawan programmer adalah =  " +gaji);
		gaji=90;
	}

	public void gajiproject_manager(int uang){
		System.out.println("gaji maksimal karyawanproject_manager adalah = " +gaji);
		gaji=100;
	}

	public void Nama(String nama){
		System.out.println("Masukan nama anda : "+nama);
	}
	
	public void Alamat(String alamat){
		System.out.println("Masukan Alamat anda tinggal :"+alamat);
	}

	public void show_karyawan();

	private void gaji(int uang, string pesan){
		System.out.println("Gaji anda sudah maksimal karena kereja anda bagus");
	}


}

