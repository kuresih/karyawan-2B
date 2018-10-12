public class karyawanTest{
	public static void main(String[] args) {
		ProjectManager pm = new ProjectManager();
		pm.SetNama("Desi");
		pm.SetAlamat("Pabean");
		pm.SetGaji(70,"project manager handal");

		desaigner d = new desaigner();
		d.SetNama("Rina");
		d.SetAlamat("Indramayu");
		d.SetGaji(60,"desaigner baik");

		programmer p = new programmer();
		p.SetNama("Mila");
		p.SetAlamat("Indramayu");
		p.SetGaji(70,"programmer hebat");

	}
}