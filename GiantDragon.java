package study_09_12;
//����ʽ����ģʽ
//����ģʽ��Ҫ�أ�
//1. ���췽��˽�л�
//2. ��̬����ָ��ʵ��
//3. public static�� getInstance���������صڶ����ľ�̬����
public class GiantDragon {
	//˽�л����췽����ʹ���޷����ⲿ���ù��췽��ʵ��������
    private GiantDragon() {
    	
    }
	//׼��һ��������ʵ��������ֻ��ʵ����һ��
    private static GiantDragon instance = new GiantDragon();
    //����һ���������ṩ�����߻�ȡ��һ�е������ԴӶ�ʵ�������󣬵���ʼ�ն�����һ������
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
