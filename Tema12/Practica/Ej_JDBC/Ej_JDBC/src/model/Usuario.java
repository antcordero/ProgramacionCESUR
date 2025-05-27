package model;

public class Usuario {
	private int id;
	private String login;
	private String clave;
	
	public Usuario(){
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString(){
		return "[Id:"+this.getId()+" Login:"+this.getLogin()+" Clave:"+this.getClave()+"]";
	}
}
