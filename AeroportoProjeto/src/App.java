public class App {
    public static void main(String[] args) throws Exception {

        Administrativo func = new Administrativo("589", "Joao", 50, "M");

        Cliente cli = new ClienteNormal("4", "Joao", 43, "M");

        Voucher voucher = new Voucher("A467", "VPO", "PMW", "11:00", "15:00", "B15");


         func.cadastrarPassageiro(cli, voucher);

        
        //func.Registrar_Ponto();
        


        
        

    }
}
