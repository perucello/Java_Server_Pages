
package Intefaces;

import Modelo.Aluno;
import java.util.List;


public interface CRUD_EVOLUA {
    public List listar();
    public Aluno list(int id);
    public boolean add(Aluno a);
    public boolean edit(Aluno a);
    public boolean eliminar(int id);
}
