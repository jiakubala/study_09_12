package study_09_12;
//懒汉式单例模式
public class SmallDragon {
    //私有化构造函数
	private SmallDragon() {
		
	}
	//预先准备一个类属性
	private static SmallDragon instance;
	//创建一个类方法，提供调用者上一行的类属性从而实例化对象
	public static SmallDragon getInstance() {
		if(instance==null) {
			//第一次访问没有对象，所以创建一个
			instance = new SmallDragon();
		}
		return instance;
	}
	public static void main(String[] args) {

		SmallDragon s1 = SmallDragon.getInstance();
		SmallDragon s2 = SmallDragon.getInstance();
		SmallDragon s3 = SmallDragon.getInstance();
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}

}
