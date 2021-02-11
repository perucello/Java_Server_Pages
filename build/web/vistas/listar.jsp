
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.AlunoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Aluno Evolua</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Adicionar</a>
            <a class="btn btn-success" href="index.jsp">Voltar</a>            
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
<!--                        <th class="text-center">EMAIL</th>-->
                        <th class="text-center">NOME</th>
                        <th class="text-center">EMAIL</th>
                        <th class="text-center">AÇÃO</th>
                    </tr>
                </thead>
                <%
                    AlunoDAO dao = new AlunoDAO();
                    List<Aluno>list=dao.listar();
                    Iterator<Aluno>iter=list.iterator();
                    Aluno a = null;
                    while(iter.hasNext()){
                        a=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= a.getId()%></td>
                        <td><%= a.getNom()%></td>
                        <td class="text-center"><%= a.getEmail()%></td>
<!--                        <td><%= a.getNom()%></td>-->
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= a.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= a.getId()%>">Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
