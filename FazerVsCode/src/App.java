import java.util.Scanner;

public class App {
/*
Nome Completo; Karina Oliveira Nunes
RA; 2920482121038
Idade; 27
Seu @gitHub; @k4rinanunes
Seu @LinkedIn; https://www.linkedin.com/in/karina-nunes-83a89325b/
Curso e Turma; ADS 4 semestre
*/

    public static void funcao_teste (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        //variável local 
        String v2;
        int v1;

        System.out.println("Comando de Saida de Dados");
        
        System.out.printf("Informe uma palavra: ");
        v2 = ler.next();

        System.out.printf("Informe um número: ");
        v1 = ler.nextInt();

        System.out.printf(v2+" "+v1);
    }
    public static void main(String[] args) throws Exception {
        funcao_teste();


    }
}
