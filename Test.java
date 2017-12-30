/**
这是大学时学的所谓的冒泡法排序，
本人也一直使用，
但百度百科显示的冒泡法排序不是这样的。
*/
import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入6个整数：");
		int[] numbers = new int[6];
		// 键盘输入6个整数
		for(int i=0;i<numbers.length;i++){
			numbers[i]=input.nextInt();
		}
		System.out.println("输入的6个整数为："+Arrays.toString(numbers));
		// 从小到大排序
		// 外循环控制轮数，6个数比较5轮
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<numbers[i]){
					numbers[j] = numbers[j]+numbers[i];
					numbers[i] = numbers[j]-numbers[i];
					numbers[j] = numbers[j]-numbers[i];
				}
			}
		}
		// 打印结果
		System.out.println("从小到大排序："+Arrays.toString(numbers));
		
		
		
	}
	
	
}

