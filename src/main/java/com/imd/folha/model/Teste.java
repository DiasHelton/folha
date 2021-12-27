package com.imd.folha.model;

public class Teste{
    public static void main(String[] args) {
        
        Contratante orgao = new Contratante();
        orgao.setCnpj("0098880001-01");
        orgao.setNome("DETRAN-RN");
        orgao.setRazao("DEPARTAMENTO ESTADUAL DE TRÂNSITO DO RIO GRANDE DO NORTE");
    
        Contratado servidor = new Contratado();
        servidor.setMatricula("221707-4");
        servidor.setNome("HELTON J D CORDEIRO");
     
        Lancamento l1 = new Lancamento();
        l1.setDescricao("RENDIMENTO");
        l1.setValor(4300f);

        Lancamento l2 = new Lancamento();
        l2.setDescricao("IR        ");
        l2.setValor(-700f);
        
        Lancamento l3 = new Lancamento();
        l3.setDescricao("INSS      ");
        l3.setValor(-350f);

        //Juntando os lançamentos numa coleção
        Lancamento[] lancamentos = new Lancamento[3];
        lancamentos[0] = l1;
        lancamentos[1] = l2;
        lancamentos[2] = l3;

        Contracheque contra = new Contracheque();
        contra.setContratante(orgao);
        contra.setContratado(servidor);
        contra.setLancamentos(lancamentos);


        //Imprimindo dos Lançamentos
        // System.out.println("");
        // System.out.println("--- --- --- --- --- --- --- --- --- ---");
        // System.out.println("--- --- " + c.getNome() + " --- --- ---");
        // System.out.println("--- --- --- --- --- --- --- --- --- ---");
        // System.out.println("");
        // System.out.println("Mat. " + c.getMatricula());
        // System.out.println(l1.getDescricao() + " --- --- --- " + l1.getValor() );
        // System.out.println(l2.getDescricao() + "          --- --- --- " + l2.getValor() );
        // System.out.println("");
        
        //Imprimindo do Contracheque
        System.out.println("");
        System.out.println("--- --- --- --- --- --- --- --- --- ---");
        System.out.println("--- --- " + contra.getContratado().getNome() + " --- --- ---");
        System.out.println("--- --- --- --- --- --- --- --- --- ---");
        System.out.println("");
        System.out.println("Mat. " + contra.getContratado().getMatricula());
        
        System.out.println();
        for (Lancamento l : contra.getLancamentos()){
            System.out.println(l.getDescricao() + " *** *** " + l.getValor());
        } 
            
        // System.out.println(l1.getDescricao() + " --- --- --- " + l1.getValor() );
        // System.out.println(l2.getDescricao() + "          --- --- --- " + l2.getValor() );
        // System.out.println("");
        System.out.println("");
        System.out.println("");
        
    }
}

