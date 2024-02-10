import java.util.Scanner;
public class jurosCalculator {
    public static void main(String[] args){
        Scanner value  = new Scanner(System.in);

        int whyMonthly ;
        float initialValue, monthlyValue, actualyValue, totalInvest, juros, lucroJuros;

        System.out.println("Valor inicial: " );
        initialValue = value.nextFloat();

        System.out.println("Valor mensal: " );
        monthlyValue = value.nextFloat();

        System.out.println("Taxa de juros:");
        juros = value.nextFloat();

        System.out.println("Quantos meses ?");
        whyMonthly = value.nextInt();

        actualyValue = initialValue;
        totalInvest = initialValue;

        for ( int i = 1 ; i <= whyMonthly; i++){
            actualyValue = actualyValue + actualyValue * (juros / 100) ;
            actualyValue = actualyValue + monthlyValue ;
            totalInvest = totalInvest + monthlyValue;

            System.out.println("O valor do " + i + "º mês é: " +actualyValue);
        }
        System.out.println("Valor total: " + actualyValue);
        System.out.println("Investimento total: " + totalInvest);
        lucroJuros = actualyValue - totalInvest;
        System.out.println("Lucro em juros " + lucroJuros);
    }
}