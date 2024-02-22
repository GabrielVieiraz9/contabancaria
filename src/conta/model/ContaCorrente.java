package conta.model;

public class ContaCorrente extends Conta {
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) { //todas as variáveis devem estar inclusas, incluindo as da classe mae e classe filho
		super(numero, agencia, tipo, titular, saldo);
		// TODO Auto-generated constructor stub
		this.limite = limite;

	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
    @Override
    public boolean sacar(float valor) {
    	
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
    }

    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
	
	
	
}
