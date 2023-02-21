public class GestoreLogin {
    private ListaCredenziali listaCredenziali;

    public GestoreLogin(ListaCredenziali listaCredenziali) {
        this.listaCredenziali = listaCredenziali;
    }

    public Integer login(Credenziali c){
        if(listaCredenziali.chechkCredenziali(c)==true){
            int cliente=listaCredenziali.getCliente(c);
            System.out.println("credenziali giuste"+" "+cliente);
            return cliente;
        }
        else System.out.println("credenziali non trovate");
        return null;
    }

    public void registra(Credenziali c){
        listaCredenziali.addCredenziali(c);
    }
}
