package application;

import java.util.ArrayList;
import java.util.List;
import application.model.Compromisso;
import application.model.AbstractAtividade;
import application.model.Tarefa;

public class App {
    public static void main(String[] args) {

        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDetalhes());

        Tarefa t2 = new Tarefa("Segundo Teste");

        System.out.println(t2.getDetalhes());

        Compromisso comp = new Compromisso();
        comp.setDescricao("2 viu");
        comp.setDataInicial(4,5 , 2004);
        comp.setDataFinal(20, 3 , 2024);
        
        System.out.println(comp.getDetalhes());

        List<AbstractAtividade> listaAtividades = new ArrayList<AbstractAtividade>();
        listaAtividades.add(t);
        listaAtividades.add(comp);

        System.out.println("-------------[Lista]-------------");
        for(AbstractAtividade a: listaAtividades) {
            System.out.println(a.getDetalhes());
        }
    }
}