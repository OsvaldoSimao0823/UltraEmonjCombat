public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria,derrotas, empates;

    //Metodos publico
    public void apresentar (){
        System.out.println("----------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentar o lutador: " +this.getNome());
        System.out.println("Diretamente de: " +this.getNacionalidade());
        System.out.println("com" +this.getPeso() + "Kg");
        System.out.println(this.getVitoria() + "Vitorias");
        System.out.println(this.getEmpates() + "Empates");
        System.out.println(this.getDerrotas() + "Derrotas");
    }
    public void status(){
        System.out.println(this.getNome() +"e um peso" +this.getCategoria());
        System.out.println("Ganhou" + this.getVitoria()+ "Vezes");
        System.out.println("perdeu" +this.getDerrotas()+ "Vezes");
        System.out.println("Empatou" +this.getEmpates()+ "vezes");

    }
    public void ganharLuta (){
        this.setVitoria(this.getVitoria() +1);

    }
    public void perderLura (){
        this.setDerrotas(this.getDerrotas() +1);

    }
    public void empatarLutas() {
        this.setEmpates(this.getEmpates() +1);

    }

    // Metodos especiais


    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Categoria Invalida";
        } else if (this.peso<=70.3) {
            this.categoria="Peso leve";

        } else if (this.peso<= 83.9) {
            this.categoria ="Peso medio";

        } else if (this.peso<= 120.2) {
            this.categoria = "Peso pesado";

        }else {
            this.categoria = "Categorira invalida";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
