package interfaces;

public class MySqlCustomerDal extends SqlDal implements ICustomerDal, IRepository{
	//classes can implement more than one interface, but
	//they can't extend(inherit) multiple classes. 
	//Also a class can inherit and implement an interface at the same time. 

	@Override
	public void add() {
		System.out.println("added to My Sql");
	}

}
