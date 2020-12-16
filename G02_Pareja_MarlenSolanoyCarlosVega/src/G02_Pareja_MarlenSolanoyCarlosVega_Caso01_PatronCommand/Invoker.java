package G02_Pareja_MarlenSolanoyCarlosVega_Caso01_PatronCommand;

public class Invoker {
  public Command command;

  public void setCommando(Command pCommand){
    command=pCommand;
  }

  public void invoke(){
    command.execute();
  }
}
