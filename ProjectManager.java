public class ProjectManager extends karyawan{
	
	//Method overiding

	public void SetGaji(int uang, String pesan){
		System.out.println(pesan);
		if(uang==100){
			System.out.println("Gaji Anda Sudah Maksimal");
		}else if(uang>=100){
			System.out.println("Selamat Anda sudah mendapatkan gaji");
		}else{
			System.out.println("gaji anda = "+uang);
		}
	}

}