import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

class TaskMaster
{
	public static void main(String[] args)
	{
		Scanner gin = new Scanner(System.in);
		
		String texter = gin.nextLine();
		
		texter = texter.substring(1,texter.length());
		List<Integer> tasks = new ArrayList<Integer>();
		for(int task = 0; task < 2; task++)
		{	
			while(true)
			{
				//System.out.println(texter);
				int end1 = texter.indexOf("}"),
				    end2 = texter.indexOf(",");
				if(end1 < 0)
				{
					break;
				}

				if(end2 >= 0 && end2 < end1)
				{	
					// cut to ,
					tasks.add(Integer.parseInt(texter.substring(0,end2)));
					texter = texter.substring(end2+1,texter.length());
				}
				else
				{
					// cut to }
					tasks.add(Integer.parseInt(texter.substring(0,end1)));
					if(texter.indexOf("{") > 0)
						texter = texter.substring(end1+2,texter.length());
					else
						texter = texter.substring(end1+1,texter.length());
				}
			}
		}
		Collections.sort(tasks, Collections.reverseOrder());
		int a = 0, b = 0;
		for(int task : tasks)
		{
			if(a <= b)
			{
				a += task;
			}
			else
			{
				b += task;
			}
			//System.out.println(task);
		}
		System.out.println(Math.max(a,b));
	}
}
