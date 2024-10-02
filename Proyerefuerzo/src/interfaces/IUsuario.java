package interfaces;

import java.util.List;

import model.TblUsuario;

public interface IUsuario {
	//
	void RegistarUsuario (TblUsuario usuario);
	void ActualizarUsuario (TblUsuario usuario);
	void EliminarUsuario (TblUsuario usuario);
	List<TblUsuario> ListadoUsuario();
	TblUsuario BucarUsuario (TblUsuario usuario);
}
