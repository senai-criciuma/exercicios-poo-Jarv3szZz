package att04;

public class att01ContaBancaria {


        private String numeroConta;
        private double saldo;


        public String titular;


        public att01ContaBancaria(String numeroConta, String titular, double saldoInicial) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = saldoInicial;
        }


        public String getNumeroConta() {
            return numeroConta;
        }


        public void setNumeroConta(String numeroConta) {
            this.numeroConta = numeroConta;
        }


        public double getSaldo() {
            return saldo;
        }


        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }


        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }


        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de saque inválido ou saldo insuficiente.");
            }
        }


        public void exibirDadosConta() {
            System.out.println("Titular: " + titular);
            System.out.println("Número da Conta: " + numeroConta);
            System.out.println("Saldo: R$ " + saldo);
        }
    }


