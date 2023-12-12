package concot.arquivo

class Arquivo {

    String filename
    byte[] file
    TipoArquivo tipo =  TipoArquivo.ARQUIVO_CSV

    static constraints = {
        filename nullable: false, blank: false, maxSize: 128
        file nullable: false, maxSize: 65536
        tipo nullable: false
    }

    String toString(){
        this.filename
    }


}
