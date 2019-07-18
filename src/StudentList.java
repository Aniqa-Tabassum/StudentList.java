import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments

        System.out.println("1. Show  student list ");
        System.out.println("2. Show random student");
        System.out.println("3. Add student number");
        System.out.println("4. Search a student");

       System.out.println("5. Search word number");

        System.out.println("Enter Option (1-5):");
            Scanner obj = new Scanner(System.in);

        int Option = obj.nextInt();
		if(Option == 1) {
			System.out.println("Show student list");
			try {
			BufferedReader st = new BufferedReader(
                                new InputStreamReader(
							new FileInputStream("students.txt")));
			String r = st.readLine();
			String i[] = r.split(",");
			for(String j : i) { System.out.println(j); }
			} catch (Exception e){}
			System.out.println("End");
		}
		else if(Option == 2)
		{
			System.out.println("Enter student identity:");
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")));
			String r = s.readLine();
			System.out.println(r);
			String i[] = r.split(",");
			Random x = new Random				int y = x.nextInt();
					System.out.println(i[y]);
			} catch (Exception e){}
			System.out.println("End");
		}
		else if(Option == 3) {();

			System.out.println("Add student number:");
			try {
			BufferedWriter st = new BufferedWriter(
					new FileWriter("students.txt", true));
			String t = args[0].substring(1);
	        Date d = new Date();
	        String df = "date/month/year-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			st.write(", "+t+"\nList last updated on "+fd);
			st.close();
			} catch (Exception e){}

			System.out.println("End");
		}
		else if(Option == 4)
		{
			System.out.println("Search student:");
			try {
			BufferedReader st = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")));
			String r = st.readLine();
			String i[] = r.split(",");
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++) {
				if(i[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			} catch (Exception e){}
			System.out.println("End");
		}
		else if(Option == 5)
		{
			System.out.println("Search word number:");
			try {
			BufferedReader s = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")));
			String D = s.readLine();
			char a[] = D.toCharArray();
			boolean in_word = false;
			int count=0;
			for(char c:a) {
				if(c ==' ')
				{
					if (!in_word) {	count++; in_word =true;	}
					else { in_word=false;}
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} catch (Exception e){}
			System.out.println("End");
		}
	}
}
