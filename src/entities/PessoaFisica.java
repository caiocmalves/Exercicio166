package entities;

public class PessoaFisica extends Pessoa {
    private double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcImposto() {
        double taxabasica;
       
        if (getRendaAnual() < 20000.00){
            taxabasica = getRendaAnual() * 0.15;
        }
        else{ 
            taxabasica = getRendaAnual() * 0.25;
        }

        taxabasica -= getGastoSaude() * 0.5;
       
        if (taxabasica < 0){
            taxabasica = 0;
        }
       
        return taxabasica; 
    }
    
    
    
}
