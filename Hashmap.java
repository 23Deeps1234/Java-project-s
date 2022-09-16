package collection.java;
import java.util.HashMap;
import java.util.Set;
public class Hashmap {

		public static void main(String[] args) 
		{
			
			
				HashMap<Integer,String> map=new HashMap<>();
				map.put(101, "deeps");
				map.put(102, "pooja");
				map.put(103, "riya");
				map.put(104, "shalu");
				map.put(105, "khushi");
				map.put(106, "neha");
				System.out.println("values greater than 103 keys.....");
				Set<Integer> keys=map.keySet();
				for(Integer i:keys)
				{
					if( i.intValue()>103)
					{
					System.out.println(map.get(i));
				    }
				}
				
			}
		

	}

