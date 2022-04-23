
public class Alamat {
	private String provinsi;
	private String kota;
	private String kecamatan;
	private String kelurahan;

	public Alamat() {
		super();
	}

	public Alamat(String provinsi, String kota, String kecamatan, String kelurahan) {
		super();
		this.provinsi = provinsi;
		this.kota = kota;
		this.kecamatan = kecamatan;
		this.kelurahan = kelurahan;
	}

	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	public String getKecamatan() {
		return kecamatan;
	}
	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}
	public String getKelurahan() {
		return kelurahan;
	}
	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}
	
	@Override
	public String toString() {
		return  "Alamat: " + kelurahan + ", " + kecamatan + ", " + kota + ", " + provinsi;
	}
	
}