package aula11;

public class Main {
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa(); - não pode ser instaciada por ser uma classe abstrata
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Roberto");
        p1.setIdade(43);
        p1.setEspecialidade("História");
        p1.setSalario(2000);
        p1.receberAumento(550f);
        p1.setSexo("M");
        System.out.println(p1.getSalario());

        Tecnico t1 = new Tecnico();
        t1.setNome("Laís");
        t1.setIdade(24);
        t1.setRegistroProfissional(2222);
        t1.praticar();
        t1.setCurso("Jornalismo");
        System.out.println(t1.getRegistroProfissional() + " | " + t1.getCurso());
    }
}
