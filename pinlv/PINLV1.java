
package pinlv;

public class PINLV1 
{
	static String t ="汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>";
	public static double prob(String s,char c)
	{
		int time=0;
		int i;
		for(i=0;i<s.length();i++)
		{
			String a1=new String(String.valueOf(s.charAt(i)));
			String a2=new String(String.valueOf(s.charAt(c)));
			//System.out.println(Character.toString(s.charAt(i)));
			//System.out.println(Character.toString(c));
			if(a1.equals(a2))
			{
				time++;
				//System.out.println("shi");
			}
		}
		System.out.println("汉 出现的频率是："+time);
		return time;
	}
	public static void main(String[]args)
	{	StringBuffer t1 =new StringBuffer("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>");
		char a= 'b';
		System.out.println(FormatOutput(t1));
		System.out.println(prob(t,a));
	}
	public static StringBuffer FormatOutput(StringBuffer str2) {
		
		int last = str2.length();
		int a= last/7+last/14;
		for(int i = 14; i < last+a; i+=14) {
		str2.insert(i-7,',');
		i++;
		
		str2.insert(i,'\n');
		str2.insert(i,'.');
		
		i=i+2;}
		
		return str2;
	
	}
}

