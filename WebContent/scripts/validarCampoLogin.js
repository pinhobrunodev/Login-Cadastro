/*
@author  Bruno Pinho

*/


function validarLogin(){

    let usuarioLogin = formLogin.nomecadastro.value
    let senhaLogin = formLogin.usuariocadastro.value
 
    if(usuarioLogin === ""){
		alert('Preencha o campo usuario!')
		formLogin.usuarioLogin.focus()
		return false
	}
		if(senhaLogin === ""){
		alert('Preencha o campo senha!')
		formLogin.senhaLogin.focus()
		return false
	}
	else{
		document.forms["formLogin"].submit()
	}
}

