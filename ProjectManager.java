public class ProjectManager extends karyawan{
	int tambah_gaji;
	
	//Method overiding

	private void SetGaji(int uang, String pesan){
		if(gaji==100){
			System.out.println("Gaji Anda Sudah Maksimal");
		}else if(gaji>=100){
			System.out.println("Selamat Anda sudah mendapatkan gaji");
		}
	}

}