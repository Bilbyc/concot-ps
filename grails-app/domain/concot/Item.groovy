package concot

class Item {

    String nome
    byte[] file
    static belongsTo = [categoria: Categoria]

    static constraints = {
        nome nullable:false, blank:false, maxSize:128
        file nullable: true
        categoria nullable:false
    }
}
