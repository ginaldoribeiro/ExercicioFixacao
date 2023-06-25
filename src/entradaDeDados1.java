import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados1 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);/*Usamos esse comando para digitar o valor com o ponto em vez da virgula,
        ou seja, usado para localidae dos Estados Unidos*/
        Scanner sc = new Scanner(System.in);/*Aqui foi declarado a variavel "sc" do tipo Scanner, para receber dados atraves do teclado*/

        String S;/*Declarando a variavel "S" do tipo String*/
        int x;
        double y;
        char c;
        S = sc.next();/*Recebendo uma palavra por meio da declaração da variavel S*/
        x = sc.nextInt();/*Recebendo um valor inteiro por meio da declaração da variavel X*/
        y = sc.nextDouble();/*Recebendo um valor poonto flutuante por meio da declaração da variavel y*/
        /*O tipo de Variavel Double declarado desta forma pela a localidade do sistema, ou seja, brasileira,
        onde o numero aparece no resultado com um ponto*/
        /*Ou seja, aqui no Brasil o separador é a virgula, para aparecer o "." como casa decimal devemos usar um comando chamado Locale antes o Scanner*/
        c = sc.next().charAt(0);/* aqui a variavel C será chamada para imprimir uma so letra,
        ou seja, a função "charAt" mostrara so uma letra mesmo que digite uma palavra*/

        System.out.println("Você Digitou: " + S);
        System.out.println("Você Digitou: " + x);
        System.out.printf("Você Digitou: %.2f%n ", y);/* Para digitar o valor e usar a virgula devemos utilizar o comando "%.2f%n"*/
        System.out.println("Vodê Digitou: " + c);

        sc.close();
    }
}
