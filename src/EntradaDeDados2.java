import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Entrada de dados do tipo texto usando nextLine*/
        int x;/* Quando for declarado uma variavel do tipo int, deve-se utilizar um sr.nextLine para evitar a perca do espaço*/
        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine();/*Aqui usou-se o sc.nextLine para não deixar o espaço vazio e quebra de linha pendente*/
        s1 = sc.nextLine();/* O nextLine lê uma palavra ou frase completa*/
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}