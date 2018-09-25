import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class ExemploEnum {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente(1345, "Cliente 1", TipoCliente.ESPECIAL);
        Cliente cliente2 = new Cliente(6789, "Cliente 2", TipoCliente.COMUM);
        Cliente cliente3 = new Cliente(9999, "Cliente 3", TipoCliente.DEVEDOR);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getTipoCliente().mensagem);
        }



       /** for(Cliente cliente : clientes) {
            if (cliente.getTipoCliente().equals(TipoCliente.ESPECIAL)) {
                System.out.println("Cliente: " + cliente.getNome() +" " + cliente.getTipoCliente().mensagem);
            } else if (cliente.getTipoCliente().equals(TipoCliente.COMUM)) {
                System.out.println("Cliente: " + cliente.getNome() +" " + cliente.getTipoCliente().mensagem);
            } else if(cliente.getTipoCliente().equals(TipoCliente.DEVEDOR)) {
                System.out.println("Cliente: " + cliente.getNome() +" " + cliente.getTipoCliente().mensagem);
            }
        }
        **/
    }
}
