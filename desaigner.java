public class desaigner extends karyawan{
	int tambah_gaji;
	
	//Method overiding

	private void SetGaji(int uang, String pesan){
		System.out.println(pesan);
		if(gaji==70){
			System.out.println("Gaji Anda Sudah Maksimal");
		}else if(gaji>=70){
			System.out.println("Selamat Anda sudah mendapatkan gaji");
		}
	}

}