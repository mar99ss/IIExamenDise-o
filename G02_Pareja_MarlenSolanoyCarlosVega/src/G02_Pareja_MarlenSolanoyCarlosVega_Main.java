import java.util.Scanner;

import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.ACReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.AbrirCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.ApagarCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.AumentarCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.Command;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.EncenderCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.Invoker;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.LucesReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.MusicaReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.PuertaReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.Receiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.VentiladorReceiver;

public class G02_Pareja_MarlenSolanoyCarlosVega_Main {
  public static void subMenuCaso1(final Scanner in) {
    int opt; 
    Invoker invoker = new Invoker();
    do {
      System.out.println("MENU CASO 1");
      System.out.println("Indique el componente al que desea realizar un:");
      System.out.println("1. Música");
      System.out.println("2. Luces"); 
      System.out.println("3. Ventilación"); 
      System.out.println("4. Puerta");
      System.out.println("5. Salir");
      opt = in.nextInt();
      in.nextLine(); 
      switch(opt){
        case 1:
          Receiver musicaReceiver= new MusicaReceiver();
          System.out.println("Indique la operación que desea realizar:");
          System.out.println("1. Encender música");
          System.out.println("2. Apagar música");
          System.out.println("3. Aumentar volumen música");
          System.out.println("4. Disminuir volumen música");
          int musica = in.nextInt();
          in.nextLine(); 
          switch(musica){
            case 1:
              Command encenderMusica= new EncenderCommand(musicaReceiver);
              invoker.setCommando(encenderMusica);
              invoker.invoke();
              break;
            case 2:
              Command apagarMusica= new ApagarCommand(musicaReceiver);
              invoker.setCommando(apagarMusica);
              invoker.invoke();
              break;
            case 3:
              Command aumentarMusica= new AumentarCommand(musicaReceiver);
              invoker.setCommando(aumentarMusica);
              invoker.invoke();
              break;
            case 4:
              Command disminuirMusica= new AumentarCommand(musicaReceiver);
              invoker.setCommando(disminuirMusica);
              invoker.invoke();
              break;
          }
        case 2:
          Receiver lucesReceiver = new LucesReceiver();

          System.out.println("Indique la operación que desea realizar:");
          System.out.println("1. Encender luces");
          System.out.println("2. Apagar luces");
          System.out.println("3. Aumentar intensidad de luces");
          System.out.println("4. Disminuir intensidad de luces");
          int luces = in.nextInt();
          in.nextLine(); 
          switch(luces){
            case 1:
              Command encenderLuces= new EncenderCommand(lucesReceiver);
              invoker.setCommando(encenderLuces);
              invoker.invoke();
              break;
            case 2:
              Command apagarLuces= new ApagarCommand(lucesReceiver);
              invoker.setCommando(apagarLuces);
              invoker.invoke();
              break;
            case 3:
              Command aumentarLuces= new AumentarCommand(lucesReceiver);
              invoker.setCommando(aumentarLuces);
              invoker.invoke();
              break;
            case 4:
              Command disminuirLuces= new AumentarCommand(lucesReceiver);
              invoker.setCommando(disminuirLuces);
              invoker.invoke();
              break;
            }
            break;
        case 3:
          Receiver ACReceiver = new ACReceiver();
          Receiver ventiladorReceiver = new VentiladorReceiver();
          System.out.println("Indique la operación que desea realizar:");
          System.out.println("1. Encender ventilación");
          System.out.println("2. Apagar ventilación");
          System.out.println("3. Aumentar ventilación");
          System.out.println("4. Disminuir ventilación");
          int ventilacion = in.nextInt();
          in.nextLine(); 

          System.out.println("¿Cuenta usted con AC?");
          System.out.println("Si o No");
          String ventilacionComponente = in.next();
          in.nextLine();
          switch(ventilacion){
            case 1:
            if (ventilacionComponente== "Si"){
              Command encenderLuces= new EncenderCommand(ACReceiver);
              invoker.setCommando(encenderLuces);
              invoker.invoke();
            } else {
              Command encenderLuces= new EncenderCommand(ventiladorReceiver);
              invoker.setCommando(encenderLuces);
              invoker.invoke();
            } 
            break;
            case 2:
              if (ventilacionComponente== "Si"){
                Command apagarLuces= new EncenderCommand(ACReceiver);
                invoker.setCommando(apagarLuces);
                invoker.invoke();
              } else {
                Command apagarLuces= new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(apagarLuces);
                invoker.invoke();
              }  
              break;
            case 3:
              if (ventilacionComponente== "Si"){
                Command aumentarLuces= new EncenderCommand(ACReceiver);
                invoker.setCommando(aumentarLuces);
                invoker.invoke();
              } else {
                Command aumentarLuces= new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(aumentarLuces);
                invoker.invoke();
              } 
              break;
            case 4:
              if (ventilacionComponente== "Si"){
                Command disminuirLuces= new EncenderCommand(ACReceiver);
                invoker.setCommando(disminuirLuces);
                invoker.invoke();
              } else {
                Command disminuirLuces= new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(disminuirLuces);
                invoker.invoke();
              } 
              break;
            }
            break;
        
        case 4:
          System.out.println("1. Abrir Puerta");
          System.out.println("2. Cerrar puerta");
          PuertaReceiver puertaReceiver = new PuertaReceiver();
          final int puerta = in.nextInt();
          in.nextLine(); 
          switch(puerta){ 
            case 1:
              Command abrirPuerta= new AbrirCommand(puertaReceiver);
              invoker.setCommando(abrirPuerta);
              invoker.invoke();
              break;
            case 2:
             /* Command cerrarPuerta= new CerrarCommand(puertaReceiver);
              invoker.setCommando(cerrarPuerta);
              invoker.invoke(); */
              break; 
            }
            break;
      }
    } while (opt != 5);       
  }

  public static void subMenuCaso6(final Scanner in) {

  }

public static void main(final String[] args) throws Exception {
    final Scanner in = new Scanner(System.in);

    int opt;

    do {
        System.out.println("*".repeat(10) + " MENÚ PRINCIPAL " + "*".repeat(10));
        System.out.println("1. Caso 1 - Aplicacion Inteligente");
        System.out.println("2. Caso 6 - Aeropuerto");
        opt = in.nextInt();
        in.nextLine();
        switch (opt) {
            case 1:
                subMenuCaso1(in);
                break;
            case 2:
                subMenuCaso6(in);
                break;  
        }
        
    }while (opt != 3);
    in.close();
  }
}
