package pekan7_2511532025;

public class Akun_2511532025 {

		private String username;
		private String password;
		private String email;
		private int pin;

	public void setUsername (String username) {
		this.username = username;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public void setPIN (int pin) {
		this.pin = pin;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int getPIN() {
		return pin;
	}
	public boolean isPasswordValid() {
		return password.length() == 8;
	}
	public boolean isEmailValid() {
		return email.contains("@") && email.contains(".");
	}
	
	}

