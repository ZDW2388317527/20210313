import java.util.Calendar;
import java.util.Date;

//Calendar-万年历
//a.作用：专门用来做时间推算或时间跳转，是一个抽象类，所以不能直接new
//b.：是abstract修饰的类
public class Demo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 48);
        calendar.add(Calendar.DATE,-7);
        calendar.set(Calendar.DAY_OF_WEEK,5);
        Date time = calendar.getTime();//Calendar和Date之间的转换getTime（）
        System.out.println(time);
    }
}
/*DateFormat
a.使用指定格式将时间格式化（date->String）
 */
 
