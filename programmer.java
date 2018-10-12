public class programmer extends karyawan{
	
	//Method overiding

	public void SetGaji(int uang, String pesan){
		System.out.println(pesan);
		if(uang==80){
			System.out.println("Gaji Anda Sudah Maksimal");
		}else if(uang>=80){
			System.out.println("Selamat Anda sudah mendapatkan gaji");
		}else{
			System.out.println("gaji anda = "+uang);
		}
	}

}