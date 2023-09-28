package superheroes;

public class UnabilityException extends Throwable{
    public UnabilityException(){
        super("your hero cannot perform suck skill!");
    }
}
