package entities;

public class PessoaJuridica extends Pessoa {
    private int funcionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public double getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double calcImposto() {
        if (getFuncionarios() > 10){
            return (getRendaAnual() * 0.14);
        }
        else {
            return (getRendaAnual() * 0.16);
        }
    }
    
    
    
}