public class programmer extends karyawan{
	
	//Method overiding

	private void SetGaji(int uang, String pesan){
		if(gaji==90){
			System.out.println("Gaji Anda Sudah Maksimal");
		}else if(gaji>=90){
			System.out.println("Selamat Anda sudah mendapatkan gaji");
		}
	}

}