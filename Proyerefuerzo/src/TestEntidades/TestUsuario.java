package TestEntidades;

import Daolmp.UsuarioImp;
import model.TblUsuario;

public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblUsuario tblusu=new TblUsuario();
		UsuarioImp usuimp=new UsuarioImp();
		//
		
		tblusu.setNousuario("3");
		tblusu.setClaveusario("3603");
		
		usuimp.RegistarUsuario(tblusu);
		
		System.out.println("Se guardo correctamente");
		

	}

}
