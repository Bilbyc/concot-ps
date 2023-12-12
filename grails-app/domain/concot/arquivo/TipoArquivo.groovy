package concot.arquivo

enum TipoArquivo {
    ARQUIVO_CSV("Arquivo csv"),
    ARQUIVO_PLANILHA("Arquivo_planilha")

    String tipo

    TipoArquivo(String tipo) {
        this.tipo = tipo
    }
}