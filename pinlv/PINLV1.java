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
			System.out.println(Character.toString(s.charAt(i)));
			if(Character.toString(s.charAt(i))==Character.toString(c));
			{
				time++;
			}
		}
		System.out.println("汉 出现的频率是："+time);
		return time;
	}
	public static void main(String[]args)
	{
		char a= 'a';
		System.out.println(prob(t,a));
	}
	public static StringBuffer FormatOutput(StringBuffer str) {
		StringBuffer str2=new StringBuffer();
		for(int i=0;i<str.length()/7;i++) {
			str2.append(str.substring(7*i, 7*(i+1)));
			if((i+1)%2!=0) {
				str2.append(",");
			}
			else {
				str2.append("。").append("\n");
			}
		}
		return str2;
	
	}
}