package br.senai.sp.jandira;
import java.util.*;

public class Voo {

    private String comecoVoo, fimVoo;
    private String horaSaida;
    private String dataSaida;
    private int numeroVoo, quantMaxPessoas;

    public Voo (String comecoVoo, String fimVoo, String dataSaida, String horaSaida, int numeroVoo, int quantMaxPessoas){
        
        this.comecoVoo = comecoVoo;
        this.fimVoo = fimVoo;
        this.horaSaida = horaSaida;
        this.dataSaida = dataSaida;
        this.numeroVoo = numeroVoo;
        this.quantMaxPessoas = quantMaxPessoas;
    }

    List <Voo> voos = new ArrayList<>();

    public void addVoo(Voo voo){
        voos.add(voo);
    }

    
    public String getcomecoVoo() {
        return comecoVoo;
    }

    public void setcomecoVoo(String comecoVoo) {
        this.comecoVoo = comecoVoo;
    }

    public String getfimVoo() {
        return fimVoo;
    }

    public void setfimVoo(String fimVoo) {
        this.fimVoo = fimVoo;
    }
    

    public String gethoraSaida() {
        return horaSaida;
    }

    public void sethoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getdataSaida() {
        return dataSaida;
    }

    public void setdataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getquantMaxPessoas() {
        return quantMaxPessoas;
    }

    public void setquantMaxPessoas(int quantMaxPessoas) {
        this.quantMaxPessoas = quantMaxPessoas;
    }

}