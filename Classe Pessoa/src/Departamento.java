import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Empregado> listEmp;

    public Departamento(String nome)
    {        //inicializar atributo nome e instanciar ArrayList
        this.nome = nome;
        listEmp = new ArrayList<>();
    }
    public String getNome()
    {//retorna nome
        return nome;
    }
    public void setNome(String nome)
    {//atualiza atributo nome
        this.nome = nome;
    }
    public void addEmpregado(Empregado emp)
    {//incluir empregado no ArrayList
        listEmp.add(emp);
    }
    public void removeEmpregado(Empregado emp)
    {//remover empregado do ArrayList
        listEmp.remove(emp);
    }
    public String listarEmpregado()
    {//retornar uma String com matricula e nome empregado
        String saida = "";
        Empregado empAux;
        for (int i = 0; i < listEmp.size(); i++)
        {
            empAux = listEmp.get(i);
            saida = saida + empAux.getNome() + " " +
                    empAux.getSalario() + '\n';
        }
        return saida;
    }

    public int qtdEmpregado(){
        return listEmp.size();
    }
}

