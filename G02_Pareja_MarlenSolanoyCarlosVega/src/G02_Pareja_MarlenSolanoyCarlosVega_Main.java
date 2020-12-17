import java.util.Scanner;

import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.ACReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.AbrirCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.ApagarCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.AumentarCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.CerrarCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.Command;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.DisminuirCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.EncenderCommand;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.Invoker;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.LucesReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.MusicaReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.PuertaReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.Receiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand.VentiladorReceiver;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator.Aeropuerto;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator.Avion;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator.IUsuario;
import G02_Pareja_MarlenSolanoyCarlosVega_Caso06_PatronMediator.TorreControl;

public class G02_Pareja_MarlenSolanoyCarlosVega_Main {
  public static void subMenuCaso1(final Scanner in) {
    int opt;
    Invoker invoker = new Invoker();
    do {
      System.out.println("*".repeat(10) + " MENÚ CASO 1 " + "*".repeat(10));
      System.out.println("Indique el componente al que desea realizar un:");
      System.out.println("1. Música");
      System.out.println("2. Luces");
      System.out.println("3. Ventilación");
      System.out.println("4. Puerta");
      System.out.println("5. Salir");
      opt = in.nextInt();
      in.nextLine();
      switch (opt) {
        case 1:
          Receiver musicaReceiver = new MusicaReceiver();
          System.out.println("Indique la operación que desea realizar:");
          System.out.println("1. Encender música");
          System.out.println("2. Apagar música");
          System.out.println("3. Aumentar volumen música");
          System.out.println("4. Disminuir volumen música");
          int musica = in.nextInt();
          in.nextLine();
          switch (musica) {
            case 1:
              Command encenderMusica = new EncenderCommand(musicaReceiver);
              invoker.setCommando(encenderMusica);
              invoker.invoke();
              break;
            case 2:
              Command apagarMusica = new ApagarCommand(musicaReceiver);
              invoker.setCommando(apagarMusica);
              invoker.invoke();
              break;
            case 3:
              Command aumentarMusica = new AumentarCommand(musicaReceiver);
              invoker.setCommando(aumentarMusica);
              invoker.invoke();
              break;
            case 4:
              Command disminuirMusica = new DisminuirCommand(musicaReceiver);
              invoker.setCommando(disminuirMusica);
              invoker.invoke();
              break;
          }
          break;
        case 2:
          Receiver lucesReceiver = new LucesReceiver();

          System.out.println("Indique la operación que desea realizar:");
          System.out.println("1. Encender luces");
          System.out.println("2. Apagar luces");
          System.out.println("3. Aumentar intensidad de luces");
          System.out.println("4. Disminuir intensidad de luces");
          int luces = in.nextInt();
          in.nextLine();
          switch (luces) {
            case 1:
              Command encenderLuces = new EncenderCommand(lucesReceiver);
              invoker.setCommando(encenderLuces);
              invoker.invoke();
              break;
            case 2:
              Command apagarLuces = new ApagarCommand(lucesReceiver);
              invoker.setCommando(apagarLuces);
              invoker.invoke();
              break;
            case 3:
              Command aumentarLuces = new AumentarCommand(lucesReceiver);
              invoker.setCommando(aumentarLuces);
              invoker.invoke();
              break;
            case 4:
              Command disminuirLuces = new DisminuirCommand(lucesReceiver);
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
          switch (ventilacion) {
            case 1:
              if (ventilacionComponente == "Si") {
                Command encenderAC = new EncenderCommand(ACReceiver);
                invoker.setCommando(encenderAC);
                invoker.invoke();

              } else {
                Command encenderVentilador = new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(encenderVentilador);
                invoker.invoke();
              }
              break;
            case 2:
              if (ventilacionComponente == "Si") {
                Command apagarAC = new ApagarCommand(ACReceiver);
                invoker.setCommando(apagarAC);
                invoker.invoke();
              } else {
                Command apagarVentilador = new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(apagarVentilador);
                invoker.invoke();
              }
              break;
            case 3:
              if (ventilacionComponente == "Si") {
                Command aumentarAC = new AumentarCommand(ACReceiver);
                invoker.setCommando(aumentarAC);
                invoker.invoke();
              } else {
                Command aumentarVentilador = new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(aumentarVentilador);
                invoker.invoke();
              }
              break;
            case 4:
              if (ventilacionComponente == "Si") {
                Command disminuirAC = new DisminuirCommand(ACReceiver);
                invoker.setCommando(disminuirAC);
                invoker.invoke();
              } else {
                Command disminuirVentilador = new EncenderCommand(ventiladorReceiver);
                invoker.setCommando(disminuirVentilador);
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
          switch (puerta) {
            case 1:
              Command abrirPuerta = new AbrirCommand(puertaReceiver);
              invoker.setCommando(abrirPuerta);
              invoker.invoke();
              break;
            case 2:
              Command cerrarPuerta = new CerrarCommand(puertaReceiver);
              invoker.setCommando(cerrarPuerta);
              invoker.invoke();
              break;
          }
          break;
      }
    } while (opt != 5);
  }

  public static void subMenuCaso6(final Scanner in) {
    TorreControl torreControl = new TorreControl();
    int opt;

    do {
      System.out.println("*".repeat(10) + " MENÚ CASO 6 " + "*".repeat(10));
      System.out.println("1. Registrar en canal de comunicaciones");
      System.out.println("2. Enviar mensaje");
      System.out.println("3. Salir");
      opt = in.nextInt();
      in.nextLine();
      switch (opt) {
        case 1:
          System.out.println("Indique la opción que desea registrar");
          System.out.println("1. Aeropuerto");
          System.out.println("2. Avion");

          int tipoUsuario = in.nextInt();
          in.nextLine();
          System.out.println("Ingrese el código:");
          String codigo = in.next();
          if (tipoUsuario == 1) {
            Aeropuerto aeropuerto = new Aeropuerto(codigo, torreControl);
            torreControl.registrar(aeropuerto);
          } else {
            Avion avion = new Avion(codigo, torreControl);
            torreControl.registrar(avion);
          }
          break;
        case 2:
          System.out.println("Ingrese su código:");
          String codigoRemitente = in.next();
          System.out.println("Ingrese el código del destinatario:");
          String codigoDestinatario = in.next();

          System.out.println("Ingrese el mensaje a enviar");
          String mensaje = in.next();

          IUsuario usuario = torreControl.getUsuario(codigoRemitente);
          usuario.enviar(codigoDestinatario, mensaje);
          break;
      }

    } while (opt != 3);

  }

  public static void main(final String[] args) throws Exception {
    final Scanner in = new Scanner(System.in);

    int opt;

    do {
      System.out.println("*".repeat(10) + " MENÚ PRINCIPAL " + "*".repeat(10));
      System.out.println("1. Caso 1 - Aplicacion Inteligente");
      System.out.println("2. Caso 6 - Aeropuerto");
      System.out.println("3. Salir");
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

    } while (opt != 3);
    in.close();
  }
}
