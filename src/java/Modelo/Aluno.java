
package Modelo;
 
public class Aluno {
    int id;
    String email;
    String nom;

    public Aluno() {
    }

    public Aluno(String email, String nom) {
        this.email = email;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
