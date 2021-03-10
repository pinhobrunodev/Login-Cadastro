/**
 * @author Bruno Pinho
 */



function validarRegistro(){

    let nomecadastro = registrarContato.nomecadastro.value
    let usuariocadastro = registrarContato.usuariocadastro.value
    let senhacadastro = registrarContato.senhacadastro.value
    let emailcadastro = registrarContato.emailcadastro.value


    if(nomecadastro === ""){
		alert('Preencha o campo nome!')
		registrarContato.nomecadastro.focus()
		return false
	}
		if(usuariocadastro === ""){
		alert('Preencha o campo usuario!')
		registrarContato.usuariocadastro.focus()
		return false
	}
		if(senhacadastro === ""){
		alert('Preencha o campo senha!')
		registrarContato.senhacadastro.focus()
		return false
	}
    if(emailcadastro === ""){
		alert('Preencha o campo email!')
		registrarContato.emailcadastro.focus()
		return false
	}
	else{
		document.forms["registrarContato"].submit()
	}
}