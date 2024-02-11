import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar (){
        if (this.aprovado){
            System.out.println("#### Desafiado ####");
            this.desafiado.apresentar();
            System.out.println("##### Desafiante ####");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(); // 0 1 2
            System.out.println("=========== RESULTADO DA LUTA ============");
            switch (vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLutas();
                    this.desafiante.empatarLutas();
                    break;
                case 1:
                    System.out.println("Vitorio do " +this.getDesafiado());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLura();
                    break;
                case 2:
                    System.out.println("Vitoria do " +getDesafiante());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLura();
                    break;

            }
            System.out.println("==========================================");

        } else {
            System.out.println("A luta nao pode acontecer!");
        }

    }
    // metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
