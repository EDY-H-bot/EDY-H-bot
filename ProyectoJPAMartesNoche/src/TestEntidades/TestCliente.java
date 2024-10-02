package TestEntidades;

import Daolmp.ClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		// INSTANCIAMOS LAS RESPECTIVAS CLASES...
		TblCliente tblcli=new TblCliente();
		ClienteImp cliimp=new ClienteImp();
		//
		//
   /*   tblcli.setNombre("odia");
		tblcli.setApellido("gomez gomez");
		tblcli.setSexo("F");
		tblcli.setDni("1045789");
		tblcli.setEmail("nayeli@gmail.com");
		tblcli.setTelef("3814785");
		//
		cliimp.RegistrarCliente(tblcli);
		//
		System.out.println("datos registros en BD....");
   */
		tblcli.setIdcliente(8);
		tblcli.setNombre("Arturo");
		tblcli.setApellido("Golazooooooo");
		tblcli.setSexo("M");
		tblcli.setDni("1111111");
		tblcli.setEmail("arturo@gmail.com");
		tblcli.setTelef("321212112");
		//
		cliimp.ActualizarCliente(tblcli);
		//
		System.out.println("dato actualizado....");
		

	}//FIN DEL METODO PARCIAL

} //FIN DE LA CLASE...
