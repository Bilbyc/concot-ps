import concot.*
import org.eclipse.jdt.internal.compiler.ast.ForeachStatement

new Categoria(nome:"Materiais")
        .addToItens(new Item(nome:"Cimento"))
        .addToItens(new Item(nome:"Argamassa"))
        .addToItens(new Item(nome:"Brita"))
        .save()

new Categoria(nome:"Alimentos")
    .addToItens(new Item(nome:"Arroz"))
    .save()

new Fornecedor(nome: "Mat LTDA")
    .save()