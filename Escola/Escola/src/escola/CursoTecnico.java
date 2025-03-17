package escola;

public class CursoTecnico extends Curso {

    public boolean modalidade;

    public CursoTecnico(String nome, String endereco, int cargaHoraria, boolean modalidade) {
        super(nome, endereco, cargaHoraria);
        this.modalidade = modalidade;
    }

    public boolean getModalidade() {
        return modalidade;
    }

    public void setModalidade(boolean modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("endereco: " + endereco);
        System.out.println("carga horaria: " + cargaHoraria + "h");

        if (!modalidade) {
            System.out.println("modalidade: online");
        } else {
            System.out.println("modalidade: presencial");
        }
    }

    @Override
    public int calcularMensalidade() {
        int mensalidade = 5;
        if(cargaHoraria <= 10){
            mensalidade = 10;
        }
        int conta = cargaHoraria * mensalidade;
        return conta;
    }
}
