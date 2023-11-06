package concot

class AcessoFilters {

    def filters = {
        acesso(controller:'*', action:'*') {
            before = {
                if(session['usuario']){
                    return true
                } else {
                    if (controllerName == null || actionName == 'autenticar'){
                        return true
                    }
                    redirect(uri:'/')
                }
            }

            after = {
                if(session['usuario'] && controllerName == null) {
                    redirect(uri:'/home')
                }
            }
        }
    }
}
