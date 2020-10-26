package api;

/**
 *
 * @author user
 *
 */
public class StringBufferDemo {
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * StringBuffer:就是字符串缓冲区。
		 * 用于存储数据的容器。
		 * 特点：
		 * 1.长度是可变的。
		 * 2.可以存储不同类型的数据。
		 * 3.最终要转成字符串进行使用。
		 * 4.可以对字符串进行修改。
		 *
		 *
		 * 既然是一个容器对象，应该具备什么功能呢？
		 * 1，添加：
		 * 		StringBuffer append(data);
		 * 		StringBuffer insert(index,data);
		 * 2：删除：
		 *			StringBuffer delate(start,end);包含头，不包含尾。
		 *			StringBuffer delateCharAt(ing index):删除指定位置的元素
		 *3：查找
		 *			char charAt(index);
		 *			int indexOf(string);
		 *			int lastIndexOf(string);
		 *4：修改
		 *			StringBuffer replace(start,end,string);
		 *			void setcharAt(index,char);
		 *
		 *增删改查 C（create）U（update）R(read) D（delate）
		 */
		bufferMEthodDemo();
		bufferMEthodDemo_1();
			
	}

	private static void bufferMEthodDemo_1() {
		StringBuffer sb = new StringBuffer("abce");
		//清空缓冲区
		//sb.delate(0,sb.length());
	}

	public static void bufferMEthodDemo() {
		//创建缓冲区对象。
		StringBuffer sb = new StringBuffer();

		StringBuffer s1 = sb.append(4);
		System.out.println(sb);
		System.out.println(sb == s1);
	}
}
