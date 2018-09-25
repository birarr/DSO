public enum TipoCliente {
    ESPECIAL("Pode vender com desconto"),
    COMUM("Pode vender"),
    DEVEDOR("Verificar saldo devedor");

    public final String mensagem;

    TipoCliente(String mensagemRecebida) {
        mensagem = mensagemRecebida;
    }
}
