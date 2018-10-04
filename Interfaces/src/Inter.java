interface Animal
{
	public static void eat()
	{
		System.out.println("using java 8 version static method is created");
	}
	void run();
}

//interface Cat extends Animal
//{
//	public static void eat()//in this method not getting an error but not possible for override
//	{
//		System.out.println("using java  static method is created");//while static is not be override.
//	} 
//}
class SubClass 
{
	public void derived()
	{
		System.out.println("i am derived class");
	}
}
//class Demo extends SubClass
//{
//	public void der()
//	{
//		derived();
//	}
//}
public class Inter extends SubClass implements Animal{
	public void run()
	{
		System.out.println("hi! i am executing interface programe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter i=new Inter();
		i.run();
		Animal.eat();
		i.derived();
		//i.der();//here we are getting an error bcz more 
		//than one class not be extend
		
	}

}
