public class Main {
    public static void main(String[] args) {
       Credenziali c1= new Credenziali("user1","1",1);
       Credenziali c2= new Credenziali("user2", "2",2);
       Credenziali c3= new Credenziali("user3", "3", 3);

       ListaCredenziali listaCredenziali = new ListaCredenziali();

       GestoreLogin gestoreLogin= new GestoreLogin(listaCredenziali);

       gestoreLogin.registra(c1);
       gestoreLogin.registra(c2);
       //gestoreLogin.registra(c3);

       gestoreLogin.login(c1);
       gestoreLogin.login(c2);
       gestoreLogin.login(c3);
    }
}