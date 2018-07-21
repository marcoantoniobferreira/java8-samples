import java.util.function.Consumer;
/**
 * @author Marco Ferreira <marcoantoniobferreira@gmail.com>
 */
class Shower implements Consumer<User>{
    public void accept(User u){
        System.out.println(u.getNome());
    }
}