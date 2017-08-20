package lbenvenutoc.com.singleton;

public class InstitutoEducativo {

	private static InstitutoEducativo instance;
	private String nombreInstituto;

	private InstitutoEducativo() {

	}

	public static InstitutoEducativo getInstance() {
		if (instance == null) {
			instance = new InstitutoEducativo();
		}
		return instance;
	}

	public String getNombreInstituto() {
		return nombreInstituto;
	}

	public void setNombreInstituto(String nombreInstituto) {
		this.nombreInstituto = nombreInstituto;
	}

}
