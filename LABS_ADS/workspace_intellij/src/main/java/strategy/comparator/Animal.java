package strategy.comparator;

public class Animal extends Object {

    private long id;

    private String nome;

    public Animal(long id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
