package interfaceDemo;

public class Worker implements IWorkable, IEatable, IPayable {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Banka Çalışanları Çalıştı");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("İçeriye Yemek Var.");
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Maaşları Öde");
	}
}
