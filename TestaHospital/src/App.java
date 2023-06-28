import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Cardiologista> cardios=new ArrayList<>();
        ArrayList<Dermatologista> derma=new ArrayList<>();

        File f=new File("Médicos.txt");

        Scanner scan1= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\n1-CRIAR MÉDICO"+"\n2-LISTAR MÉDICOS"+"\n3-CARREGAR MÉDICOS PARA ARQUIVO"+"\n4-LER ARQUIVO"+"\n5-SAIR");
            opcao=scan1.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("NOME: ");
                    String nome=scan2.nextLine();
                    System.out.println("CPF: ");
                    String cpf=scan2.nextLine();
                    int optipo=0;

                    while((optipo!=1)&&(optipo!=2)){
                        System.out.println("ESCOLHA A ÁREA DE ATUAÇÃO DO MÉDICO");
                        System.out.println("1-CARDIOLOGISTA"+"\n2-DERMATOLOGISTA");
                        optipo=scan1.nextInt();
                    }

                    System.out.println("CRM: ");
                    String crm=scan2.nextLine();

                    if (optipo==1){
                        Cardiologista c=new Cardiologista(nome, cpf, crm);
                        cardios.add(c);
                    }

                    if(optipo==2){
                        Dermatologista d=new Dermatologista(nome, cpf, crm); 
                        derma.add(d);
                    }
                    break;

                case 2:
                    optipo=0;
                    while((optipo!=1)&&(optipo!=2)){
                        System.out.println("ESCOLHA A ÁREA DE ATUAÇÃO DO MÉDICO");
                        System.out.println("1-CARDIOLOGISTA"+"\n2-DERMATOLOGISTA");
                        optipo=scan1.nextInt();
                    }
                    if(optipo==1){
                        if(cardios.isEmpty()){System.out.println("NÃO HÁ MÉDICOS CARDIOLOGISTAS PARA LISTAR");}
                        else{
                            for(Cardiologista c: cardios){
                                System.out.println("---------------"+"\n"+c+"\n"+"---------------");
                            }
                        }
                    }
                    else if(optipo==2){
                        if(derma.isEmpty()){System.out.println("NÃO HÁ MÉDICOS DERMATOLOGISTAS PARA LISTAR");}
                        else{
                            for(Dermatologista d: derma){
                                System.out.println("---------------"+"\n"+d+"\n"+"---------------");
                            }
                        }
                    }
                    break;
                
                case 3:
                    FileWriter fw=new FileWriter(f, true);
                    PrintWriter pw=new PrintWriter(fw);

                    optipo=0;
                    while((optipo!=1)&&(optipo!=2)){
                        System.out.println("ESCOLHA A ÁREA DE ATUAÇÃO DO MÉDICO PARA CARREGAR PARA O ARQUIVO");
                        System.out.println("1-CARDIOLOGISTA"+"\n2-DERMATOLOGISTA");
                        optipo=scan1.nextInt();
                    }
                    if(optipo==1){
                        pw.println("\nCARDIOLOGISTAS:");
                        for(Cardiologista e: cardios){pw.println(e);}
                        pw.close();
                    }
                    else if(optipo==2){
                        pw.println("\nDERMATOLOGISTAS:");
                        for(Dermatologista d: derma){pw.println(d);}
                        pw.close();
                    }

                case 4:
                    FileReader fr=new FileReader(f);
                    BufferedReader br=new BufferedReader(fr);
                    String linha= null;

                    while((linha=br.readLine())!=null){
                        System.out.println(linha);
                    }

            }

        }while(opcao!=5);

    }
}
