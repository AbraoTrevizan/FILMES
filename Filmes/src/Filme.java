public class Filme {
    // criando os atributos da classe
    private String titulo;
    private int duracao; 
    private String genero;

    // fazendo a classe
    public Filme(String titulo, int duracao, String genero) {
        setTitulo(titulo);
        setDuracao(duracao);
        setGenero(genero);
    }

    // Faz com que seja obrigado a colocar um titulo
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode estar vazio.");
        }
        this.titulo = titulo;
    }

    // Faz com que seja obrigado a colocar um tempo 
    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        }
        this.duracao = duracao;
    }

    // Faz com que seja obrigado a colocar um genero
    public void setGenero(String genero) {
        if (!genero.equals("Romance") && !genero.equals("Terror") && !genero.equals("Comédia")) {
            throw new IllegalArgumentException("O gênero deve ser Romance, Terror ou Comédia.");
        }
        this.genero = genero;
    }
    // Vai retornar o valor do atributo
    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    // vai estar mostrando ao usuario as respostas
    public static void main(String[] args) {
        try {
            Filme filme = new Filme("A FACULDADE", 140, "Terror");
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("Duração: " + filme.getDuracao() + " minutos");
            System.out.println("Gênero: " + filme.getGenero());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
