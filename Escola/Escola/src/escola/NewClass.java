package escola;

public class NewClass {
    
    public static void main(String[] args) {
        Curso c1 = new Curso("", "", 0);
        c1.setNome("O curso");
        c1.setEndereco("no curso");
        c1.setCargaHoraria(50);
        
        CursoTecnico t1 = new CursoTecnico("", "", 0, true);
        t1.setNome("Curso tecnico");
        t1.setEndereco("no tecnico");
        t1.setCargaHoraria(40);
        t1.setModalidade(true);
        
        c1.exibirInformacoes();
                System.out.println("\n");
        t1.exibirInformacoes();
    }
}
