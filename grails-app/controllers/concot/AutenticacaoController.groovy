package concot

class AutenticacaoController {

    def autenticar(Usuario usuario) {
        def registro = Usuario.findByLoginAndSenha(usuario.login, usuario.senha)

        if (registro) {
            session['usuario'] = registro
            redirect(uri:'/home')
        } else {
            flash.message = "Acesso negado"
            redirect(uri:'/')
        }

    }
}
