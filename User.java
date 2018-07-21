import java.util.Arrays;
import java.util.List;

class User{
    private String name;
    private int points;
    private boolean moderator;
    public User(String name, int points){
        this.moderator = false;
        this.points = points;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getPoints(){
        return this.points;
    }
    public void tornaModerador(){
        this.moderator = true;
    }
    public boolean isModerador(){
        return moderator;
    }
}
