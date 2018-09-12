package study_09_12;
//饿汉式单例模式
//单例模式三要素：
//1. 构造方法私有化
//2. 静态属性指向实例
//3. public static的 getInstance方法，返回第二步的静态属性
public class GiantDragon {
	//私有化构造方法，使类无法从外部调用构造方法实例化对象
    private GiantDragon() {
    	
    }
	//准备一个类属性实例化对象，只能实例化一个
    private static GiantDragon instance = new GiantDragon();
    //创建一个方法，提供调用者获取上一行的类属性从而实例化对象，但是始终都是那一个对象
    public static GiantDragon getInstance() {
    	return instance;
    }
	public static void main(String[] args) {
		GiantDragon g1 = GiantDragon.getInstance();
		GiantDragon g2 = GiantDragon.getInstance();
		GiantDragon g3 = GiantDragon.getInstance();
		
		System.out.println(g1==g2);
		System.out.println(g3==g2);
	}

}
