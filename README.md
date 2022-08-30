import javax.swing.*;
public class App {
    public static void main(String[]args) throws Exception {
      Pessoa p = new Pessoa();

     JOptionPane.showMessageDialog( null,"Ola!");

     String nome = JOptionPane.showInputDialog("Digite seu nome");

     JOptionPane.showMessageDialog(null, "Olá " +nome+", tudo bem??");
     
     int idade = Integer.parseInt(JOptionPane.showInputDialog( "Digite sua idade: "));
     
     JOptionPane.showMessageDialog(null, idade + " x 2 = " +idade  *2);

     p.idade = idade;
     p.nome = nome;

     JOptionPane.showMessageDialog(null, "O valor do objeto pessoa é"+p);
     JOptionPane.showMessageDialog( null, "nome de pessoa"+p.nome+"\n sua idade: "+p.idade+ "\n sua renda");

     Pessoa p1 = new 

    }
    

}
