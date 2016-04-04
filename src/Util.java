import java.util.Locale;
import java.util.ResourceBundle;

public class Util {
	private static ResourceBundle bnu;
	private static Conta conta;
	
	//Metodos set's
	public static void setBnu(ResourceBundle bnu) {
		Util.bnu = bnu;
	}
	
	public static void setConta(Conta conta) {
		Util.conta = conta;
	}
	// Metodos get's
	
	public static ResourceBundle getBnu() {
		if (bnu == null){
			bnu = ResourceBundle.getBundle("NOPRANT", new Locale("pt", "BR"));
		}
		return bnu;
	}
	
	public static Conta getConta(){
		return Util.conta;
	}

}