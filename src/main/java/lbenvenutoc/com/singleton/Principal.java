package lbenvenutoc.com.singleton;

/**
 * Hello world!
 *
 */
public class Principal {
	public static void main(String[] args) {

		InstitutoEducativo instituto1 = InstitutoEducativo.getInstance();
		instituto1.setNombreInstituto("CIBERTEC");
		System.out.println("1: " + instituto1.getNombreInstituto());

		InstitutoEducativo instituto2 = InstitutoEducativo.getInstance();
		System.out.println("2: " + instituto2.getNombreInstituto());

		InstitutoEducativo instituto3 = InstitutoEducativo.getInstance();
		System.out.println("3: " + instituto3.getNombreInstituto());
		
		InstitutoEducativo instituto4 = InstitutoEducativo.getInstance();
		System.out.println("4: " + instituto4.getNombreInstituto());

		instituto3.setNombreInstituto("COMPUTRONIC");

		System.out.println("1 bis: " + instituto1.getNombreInstituto());
		
		

	}
}
