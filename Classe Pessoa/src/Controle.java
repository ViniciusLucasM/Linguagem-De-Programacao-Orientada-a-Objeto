import java.util.ArrayList;

public class Controle {
    private ArrayList<Empregado> listEmp;
    private ArrayList<Departamento> listDep;

    public Controle()
    {
        listEmp = new ArrayList<>();
        listDep = new ArrayList<>();
    }

    public void cadastraEmpregado(String nome,
                                  double salario)
    {
        //criar objeto empregado
        Empregado emp = new Empregado(nome,salario);
        //inserir objeto empregado na lista listEmp
        listEmp.add(emp);
    }

    public void cadastraDepartamento(String nome)
    {
        //criar objeto departamento
        Departamento dep = new Departamento(nome);
        //inserir objeto departamento na lista listDep
        listDep.add(dep);
    }

    public String listarEmpregado()
    {
        //percorrer listEmp e retornar nome e
        //salario de todos os empregados cadastrados
        String saida="";
        Empregado empAux;
        for(int i=0; i<listEmp.size(); i++)
        {
            empAux = listEmp.get(i);
            saida = saida + empAux.getNome() + " " +
                    empAux.getSalario() + '\n';
        }
        return saida;
    }

    public void adicionaEmpDep(String departamento,
                               int matricula)
    {
        //localizar departamento e funcionario
        //se achou adiciona empregado ao departamento
        //chamar metodo adicionaEmpregado() da classe Departamento
        Departamento auxDep;
        for(int i=0; i<listDep.size();i++){
            auxDep = listDep.get(i);
            if (auxDep.getNome().equals(departamento)){
                for(int j=0; j < listEmp.size();j++){
                    Empregado auxEmp = listEmp.get(j);
                    if(auxEmp.getMatricula() == matricula){
                        auxDep.addEmpregado(auxEmp);
                        break;
                    }
                }
                break;
            }
        }
    }

    public void removeEmpDep(String departamento,
                             int matricula){                //implementação do aluno
        //localizar departamento e funcionario
        //se achou remove empregado do departamento
        //chamar metodo removeEmpregado() da classe Departamento
        Departamento auxDep;
        for(int i = 0; i < listDep.size(); i++){
            auxDep = listDep.get(i);
            if(auxDep.getNome().equals(departamento)){
                for(int j = 0; j < listEmp.size(); j++){
                    Empregado auxEmp = listEmp.get(j);
                    if(auxEmp.getMatricula() == matricula){
                        auxDep.removeEmpregado(auxEmp);
                        break;
                    }
                }
                break;
            }
        }
    }

    public String listarEmpregadoDep(String departamento){     //implementação do aluno
        //retorne os empregados do departamento informado como parâmetro
        String saida = "";
        Departamento auxDep;
        for (int i = 0; i < listDep.size(); i++){
            auxDep = listDep.get(i);
            if (auxDep.getNome().equals(departamento)){
                saida = saida + auxDep.listarEmpregado();
            }
        }
        return saida;
    }

    public String listarDepartamento(){                     //implementação do aluno
        //retorne o nome dos departamentos cadastrados no ArrayList listDep
        String saida="";
        Departamento auxDep;
        for(int i = 0; i < listDep.size(); i++){
            auxDep = listDep.get(i);
            saida = saida + auxDep.getNome() + " " + '\n';
        }
        return saida;
    }
}

