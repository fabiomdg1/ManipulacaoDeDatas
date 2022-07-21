import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExercicioData_01 exercicioData_01 = new ExercicioData_01();
        exercicioData_01.calculoDeDatas();
    }
}

class ExercicioData_01 {
    Scanner scanner = new Scanner(System.in);

    Calendar calendar = Calendar.getInstance();
    DateTimeFormatter dataTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM:ss");
    String opcao;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void calculoDeDatas() {

        do{
            System.out.println("");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Digite uma opcao");
            System.out.println("1 - Alterar dias    2 - Alterar mes         3 - Alterar anos");
            System.out.println("4 - Alterar horas   5 - Alterar minutos     6 - Sair");
            opcao = scanner.next();


            switch (opcao){
                case "1":
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Adicionar dias     2 - Subtrair dias");
                    String opcaoDia = scanner.next();

                    if(opcaoDia.equals("1")) {
                        System.out.print("Informe a quantidade de dias que deseja adicionar: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),somarDia(qtdDias));

                    } else if(opcaoDia.equals("2")){
                        System.out.print("Informe a quantidade de dias que deseja subtrair: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),subtrairDia(qtdDias));
                    }
                    break;

                case "2":
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Adicionar mes     2 - Subtrair mes");
                    String opcaoMes = scanner.next();

                    if(opcaoMes.equals("1")) {
                        System.out.print("Informe a quantidade de meses que deseja adicionar: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),somarMes(qtdDias));

                    } else if(opcaoMes.equals("2")){
                        System.out.print("Informe a quantidade de meses que deseja subtrair: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),subtrairMes(qtdDias));
                    }
                    break;

                case "3":
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Adicionar anos     2 - Subtrair anos");
                    String opcaoAnos = scanner.next();

                    if(opcaoAnos.equals("1")) {
                        System.out.print("Informe a quantidade de anos que deseja adicionar: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),somarAno(qtdDias));

                    } else if(opcaoAnos.equals("2")){
                        System.out.print("Informe a quantidade de anos que deseja subtrair: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),subtrairAno(qtdDias));
                    }
                    break;

                case "4":
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Adicionar horas     2 - Subtrair horas");
                    String opcaoHoras = scanner.next();

                    if(opcaoHoras.equals("1")) {
                        System.out.print("Informe a quantidade de horas que deseja adicionar: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),somarHora(qtdDias));

                    } else if(opcaoHoras.equals("2")){
                        System.out.print("Informe a quantidade de horas que deseja subtrair: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),subtrairHora(qtdDias));
                    }
                    break;

                case "5":
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Adicionar minutos     2 - Subtrair minutos");
                    String opcaoMinutos = scanner.next();

                    if(opcaoMinutos.equals("1")) {
                        System.out.print("Informe a quantidade de minutos que deseja adicionar: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),somarMinuto(qtdDias));

                    } else if(opcaoMinutos.equals("2")){
                        System.out.print("Informe a quantidade de minutos que deseja subtrair: ");
                        int qtdDias = scanner.nextInt();
                        resultado(dataAtual(),subtrairMinuto(qtdDias));
                    }
                    break;

                case "6":
                    limparTela();
                    break;
            }

        }while (opcao != "6");

    }

    private String dataAtual(){
        LocalDateTime localDateTime = LocalDateTime.now();
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String somarDia(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().plusDays(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String subtrairDia(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }


    private String somarMes(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().plusMonths(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String subtrairMes(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().minusMonths(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String somarAno(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().plusYears(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String subtrairAno(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().minusYears(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String somarHora(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().plusHours(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String subtrairHora(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().minusHours(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String somarMinuto(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().plusMinutes(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private String subtrairMinuto(int quantidade){
        LocalDateTime localDateTime = LocalDateTime.now().minusMinutes(quantidade);
        String data = localDateTime.format(dataTimeFormatter);
        return data;
    }

    private void limparTela(){
        for (int i = 0 ; i<30; i++){
            System.out.println("");
        }
    }

    private void resultado(String dataAtual, String dataAtualizada){
        System.out.println("\nA data e hora atual e:      " + dataAtual);
        System.out.println("A data e hora atualizada é: " + dataAtualizada);
    }
}

