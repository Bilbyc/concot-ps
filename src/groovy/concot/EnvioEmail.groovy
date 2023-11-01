package concot

import grails.validation.Validateable

import java.lang.annotation.Annotation

class EnvioEmail implements Validateable {

    Fornecedor fornecedor
    String email
    String mensagem

    static constraints = {
        fornecedor nullable: false
        email nullable: false, blank: false, email: true
        mensagem nullable: false, blank: false
    }

    @Override
    boolean nullable() {
        return false
    }

    @Override
    Class<? extends Annotation> annotationType() {
        return null
    }
}
