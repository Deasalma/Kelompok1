
public class Customer {
	private int id;
	private String nama;
	private Kontak kontak;
	private Alamat alamat;
	private String pekerjaan;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Kontak getKontak() {
		return kontak;
	}
	public void setKontak(Kontak kontak) {
		this.kontak = kontak;
	}
	public Alamat getAlamat() {
		return alamat;
	}
	public void setAlamat(Alamat alamat) {
		this.alamat = alamat;
	}
	public String getPekerjaan() {
		return pekerjaan;
	}
	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public Customer(int id, String nama, Kontak kontak, Alamat alamat, String pekerjaan) {
		super();
		this.id = id;
		this.nama = nama;
		this.kontak = kontak;
		this.alamat = alamat;
		this.pekerjaan = pekerjaan;
	}

	public Customer() {
		super();
	}
	
	public String toString() {
		return id + " | " + nama + " | " + kontak.toString() + " | " + alamat.toString() + " | " + pekerjaan;
	}
	
}
