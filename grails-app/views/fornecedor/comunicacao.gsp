<%--
  Created by IntelliJ IDEA.
  User: bilby
  Date: 19/10/2023
  Time: 16:18
--%>

<g:form action="enviarMensagem">
    <label for="fornecedor.id">Fornecedor</label><br/>
    <g:select from="${fornecedores}" name="fornecedor.id" optionKey="id"/>
    <br/>
    <label for="email">E-mail:</label><br/>
    <input type="email" name="email"/>
    <br/>
    <label for="mensagem">Mensagem:</label><br/>
    <textarea name="mensagem">${mensagem.mensagem}</textarea><br/>
    <input type="submit" value="Enviar"/>
</g:form>