package study_09_12;
//����ʽ����ģʽ
public class SmallDragon {
    //˽�л����캯��
	private SmallDragon() {
		
	}
	//Ԥ��׼��һ��������
	private static SmallDragon instance;
	//����һ���෽�����ṩ��������һ�е������ԴӶ�ʵ��������
	public static SmallDragon getInstance() {
		if(instance==null) {
			//��һ�η���û�ж������Դ���һ��
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
