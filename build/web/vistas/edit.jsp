
<%@page import="Modelo.Aluno"%>
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
            <div class="col-lg-6">
              <%
              AlunoDAO dao = new AlunoDAO();
              int id=Integer.parseInt((String)request.getAttribute("id-a"));
              Aluno a = (Aluno)dao.list(id);
          %>
            <h1>Modificar</h1>
            <form action="Controlador">
<!--                Email:<br>
                <input class="form-control" type="text" name="txtEmail" value="<%= a.getEmail()%>"><br>-->
                Nomes: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= a.getNom()%>"><br>

                Email:<br>
                <input class="form-control" type="text" name="txtEmail" value="<%= a.getEmail()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= a.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Atualizar"> 
                <a href="Controlador?accion=listar">Voltar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
