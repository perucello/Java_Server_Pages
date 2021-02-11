package ModeloDAO;

import Config.Conexao;
import Intefaces.CRUD_EVOLUA;
import Modelo.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements CRUD_EVOLUA{
    Conexao cn=new Conexao();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Aluno a = new Aluno();
    
    @Override
    public List listar() {
        ArrayList<Aluno>list = new ArrayList<>();
        String sql="select * from aluno";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Aluno a = new Aluno();
                a.setId(rs.getInt("Id"));
                a.setNom(rs.getString("Nombres"));
                a.setEmail(rs.getString("Email"));
                list.add(a);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public Aluno list(int id) {
        String sql="select * from aluno where Id=" + id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                a.setId(rs.getInt("Id"));
                a.setNom(rs.getString("Nombres"));
                a.setEmail(rs.getString("Email"));
                
            }
        } catch (SQLException e) {
        }
        return a;
    }

    @Override
    public boolean add(Aluno a) {
       String sql="insert into aluno ( Nombres, Email) values ('"+ a.getNom() + " ',' " + a.getEmail() + "')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            //rs=ps.executeQuery();
            ps.executeUpdate();
        } catch (SQLException e) {
        }
       return false;
    }

    @Override
    public boolean edit(Aluno a) {
        String sql="update aluno set email='" + a.getEmail()+"',Nombres='" + a.getNom()+"'where Id=" + a.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from aluno where Id=" + id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }
 }
