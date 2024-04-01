package src;

public class Condicional {
    
    public void Maior(int idade){

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }else{
            dados();
        }
       
    }
    void dados(){
        System.out.println("Você é menor de idade");
    }
}
