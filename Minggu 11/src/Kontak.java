
public class Kontak {
	private String tlp;
	private String email;
	private String sosmed;

	public String getTlp() {
		return tlp;
	}
	public void setTlp(String tlp) {
		this.tlp = tlp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSosmed() {
		return sosmed;
	}
	public void setSosmed(String sosmed) {
		this.sosmed = sosmed;
	}

	public Kontak(String tlp, String email, String sosmed) {
		super();
		this.tlp = tlp;
		this.email = email;
		this.sosmed = sosmed;
	}

	public Kontak() {
		super();
	}
	
	public String toString() {
		return "Kontak: " + tlp + ", " + email + ", " + sosmed;
	}
	
}
