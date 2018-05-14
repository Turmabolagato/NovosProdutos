<%-- 
    Document   : cadastroproduto
    Created on : 14/05/2018, 18:37:43
    Author     : Jojo
--%>

<%@page import="produto.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processamento de dados</title>
    </head>
    <body>
        <%
                String nome = request.getParameter("txtNome");
                float preco = Float.parseFloat(request.getParameter("txtpreco"));
                try{
                       Produto produto = new Produto();
                       produto.setNome(nome);
                       produto.setPreco(preco);
                       out.print("Nome: "+produto.getNome());
                       out.print("Salario: "+produto.getPreco());
                }catch(IllegalArgumentException erro){
                    out.print(erro.getMessage());
                }
          %>
    </body>
</html>
