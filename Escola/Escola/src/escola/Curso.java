package escola;

public class Curso extends Escola {

    protected int cargaHoraria;

    public Curso(String nome, String endereco, int cargaHoraria) {
        super(nome, endereco);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("endereco: " + endereco);
        if (cargaHoraria < 0) {
            System.out.println("error");
        } else {
            System.out.println("carga horaria: " + cargaHoraria + "h");
        }
    }
    @Override
        public int calcularMensalidade(){
            return 0;
        }
}
