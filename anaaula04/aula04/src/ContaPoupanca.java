public class ContaPoupanca {
    String agencia;
    String numero;
    float saldo;
    float taxa;

    public ContaPoupanca() {
          //metodo construtor vazio
    }

    /* metodo  construtor com atributos*/
    
     public ContaPoupanca(String a, String n, float s, float t){
         agencia = a;
         numero = n;
         saldo = s;
         taxa = t;
     }
     /* Metodo sem retorno*/
     /* alt shif pra baixo pra copiar*/


     void imprimeDados(){
     System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
     System.out.println("bem vindo ao Banco seu dinheiro");
     System.out.println("Agencia:"+ agencia);
     System.out.println("numero:"+ numero);
     System.out.println("saldo:"+saldo);
     System.out.println("taxa:"+ taxa);
     System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");


     }

     /* método sem retorno com parametro*/

     void depositar(float valor){
     saldo = saldo+valor;
     }
     // método com retorno sem parametro
     float calculaRendimento() {
         float rendimento;
         rendimento = saldo * taxa/100;
         return rendimento;
         
     }


}
