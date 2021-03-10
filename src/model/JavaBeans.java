package model;

public class JavaBeans {
	
	private String ID;
	private String NOME;
	private String USUARIO;
	private String SENHA;
	private String EMAIL;
	
	
	public JavaBeans() {
		
	}


	public JavaBeans(String iD, String nOME, String uSUARIO, String sENHA, String eMAIL) {
		super();
		ID = iD;
		NOME = nOME;
		USUARIO = uSUARIO;
		SENHA = sENHA;
		EMAIL = eMAIL;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getNOME() {
		return NOME;
	}


	public void setNOME(String nOME) {
		NOME = nOME;
	}


	public String getUSUARIO() {
		return USUARIO;
	}


	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}


	public String getSENHA() {
		return SENHA;
	}


	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}


	public String getEMAIL() {
		return EMAIL;
	}


	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NOME == null) ? 0 : NOME.hashCode());
		result = prime * result + ((SENHA == null) ? 0 : SENHA.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBeans other = (JavaBeans) obj;
		if (NOME == null) {
			if (other.NOME != null)
				return false;
		} else if (!NOME.equals(other.NOME))
			return false;
		if (SENHA == null) {
			if (other.SENHA != null)
				return false;
		} else if (!SENHA.equals(other.SENHA))
			return false;
		return true;
	}

	
	
}
