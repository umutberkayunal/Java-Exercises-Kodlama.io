package interfaces;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new OracleCustomerDal();//interfaces can not be newed by theirselfs.
	}

}
