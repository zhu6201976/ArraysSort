/**
���Ǵ�ѧʱѧ����ν��ð�ݷ�����
����Ҳһֱʹ�ã�
���ٶȰٿ���ʾ��ð�ݷ������������ġ�
*/
import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("������6��������");
		int[] numbers = new int[6];
		// ��������6������
		for(int i=0;i<numbers.length;i++){
			numbers[i]=input.nextInt();
		}
		System.out.println("�����6������Ϊ��"+Arrays.toString(numbers));
		// ��С��������
		// ��ѭ������������6�����Ƚ�5��
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<numbers[i]){
					numbers[j] = numbers[j]+numbers[i];
					numbers[i] = numbers[j]-numbers[i];
					numbers[j] = numbers[j]-numbers[i];
				}
			}
		}
		// ��ӡ���
		System.out.println("��С��������"+Arrays.toString(numbers));
		
		
		
	}
	
	
}

