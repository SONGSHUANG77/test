实验四 字符串实验

一、实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
二、业务要求
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
三、过程
1.代码

	public static StringBuffer FormatOutput(StringBuffer str) {
		StringBuffer str2=new StringBuffer();//带有缓冲的字符串
		for(int i=0;i<str.length()/7;i++) {
			str2.append(str.substring(7*i, 7*(i+1)));//截取字符串
			if((i+1)%2!=0) {
				str2.append(",");//奇数加逗号
			}
			else {
				str2.append("。").append("\n");//偶数加句号
			}
		}
		return str2;//返回
	}
}
2.运行结果
 
四、编程感想
这次编程让我对string类和字符串构造方法有了一定的理解，了解了如何给一段字符串加标点，以及统计出现次数，还有异常处理程序try...catch...。在编程过程中遇到问题时候自己也在不断学习改正，希望自己能加强练习，更加熟练掌握。

