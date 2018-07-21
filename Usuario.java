import java.util.Arrays;
import java.util.List;

class Usuario{
    private String nome;
    private int pontos;
    private boolean moderador;
    public Usuario(String nome, int pontos){
        this.moderador = false;
        this.pontos = pontos;
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPontos(){
        return this.pontos;
    }
    public void tornaModerador(){
        this.moderador = true;
    }
    public boolean isModerador(){
        return moderador;
    }
}
public class SecondLesson{
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Marco Ferreira", 150);
        Usuario user2 = new Usuario("Joshua Block", 160);
        Usuario user3 = new Usuario("James Gosling", 220);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }    
    }
}