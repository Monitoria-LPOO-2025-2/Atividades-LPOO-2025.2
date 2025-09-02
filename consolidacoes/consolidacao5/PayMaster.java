package consolidacoes.consolidacao5;;

/*
    A plataforma PayMaster quer criar um sistema para processar diferentes formas de pagamento.
    Implemente uma classe abstrata Pagamento com o atributo protegido valor e o metodo abstrato processarPagamento().
    Crie uma interface Reembolsável com o metodo reembolsar ().
    Em seguida, implemente duas classes concretas: PagamentoCartao e PagamentoBoleto, ambas herdando de Pagamento e implementando a interface Reembolsavel.
    Cada classe deve ter sua própria lógica para processar e reembolsar pagamentos.
    Caso o valor informado seja negativo ou igual a zero, o sistema deve lançar uma exceção personalizada ValorInvalidoException.
    No programa principal, crie objetos das duas classes, processe pagamentos válidos, tente processar um pagamento inválido (tratando a exceção) e realize reembolsos.
 */