public class ContaBanco {
   public Integer NumConta;
   protected String Tipo;
   private String Dono;
   private Float Saldo;
   private Boolean Status;

public void estadoAtual(){
    System.out.println("------------------------------------");
    System.out.println("Conta: "+ this.getNumConta());
    System.out.println("Tipo: "+ this.getTipo());
    System.out.println("Dono: "+ this.getDono());
    System.out.println("Saldo: "+ this.getSaldo());
    System.out.println("Status: "+ this.getStatus());
}
//Métodos Especiais
public ContaBanco() {
    Saldo = 0f;
    Status = false;
}
public Integer getNumConta() {
    return NumConta;
}
public void setNumConta(Integer n) {
    //NumConta = n;
    this.NumConta = n;
}
public String getTipo() {
    return Tipo;
}
public void setTipo(String t) {
    //Tipo = t;
    this.Tipo = t;
}
public String getDono() {
    return Dono;
}
public void setDono(String d) {
    //Dono = d;
    this.Dono = d;
}
public Float getSaldo() {
    return Saldo;
}
public void setSaldo(Float s) {
    //Saldo = s;
    this.Saldo = s;
}
public Boolean getStatus() {
    return Status;
}
public void setStatus(Boolean s) {
    //Status = s;
    this.Status = s;
}

//Métodos
public void abrirConta(String t) {
    setTipo(t);
    setStatus(true);
    
    if (getTipo() == "CC") {
        this.Saldo = 50f;
        System.out.println("A conta de Jubileu foi aberta com sucesso!");
    } else  if (getTipo() == "CP"){
        this.Saldo = 150f;
        System.out.println("A conta de Creuza foi aberta com sucesso!");
    }
}

public void fecharconta() {
    if (Saldo > 0) {
        System.out.println("A conta de "+getDono()+" nao foi fechada pois ainda esta com dinheiro");
    } else if (Saldo < 0) {
        System.out.println("A conta de "+getDono()+" nao foi fechada pois esta em debito");
    } else {
        setStatus(false);
        System.out.println("A conta de "+getDono()+" foi fechada com sucesso");
    }
    
}

public void depositar(Integer v){
    if (getStatus() == true) {
        this.Saldo = this.Saldo + v;
        System.out.println("Deposito de "+ v+" reais realizado com sucesso na conta de "+getDono());
    } else {
        System.out.println("Impossível depositar");
    }
}

public void sacar(Integer f) {
    if (getStatus() == true) {
        if (Saldo >= f) {
            this.Saldo = this.Saldo - f;
            System.out.println("Saque de "+f+" reais de "+getDono()+" realizado com sucesso");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    } else {
        System.out.println("Impossível Sacar");
    }
}

public void pagarMensal(float v) {  
    if (this.getTipo() == "CC") {
        v= 12;
    } else if (this.getTipo() == "CP"){
        v = 20;
    }

    if (this.Status = true) {
            if (this.Saldo > v) {
                Saldo = getSaldo() - v;
                System.out.println("Mensalidade de "+getDono()+" foi paga no valor de: "+v+" Reais");
            }
            else {
             System.out.println("Nao foi possivel pagar a mensalidade de "+getDono()+" pois o saldo e insuficiente");
             }
    }else {
        System.out.println("Impossível Pagar");
    }
}
}