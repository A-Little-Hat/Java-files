import java.util.*;
import java.util.regex.*;

public class Tag_content_extractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
            Pattern p = Pattern.compile("<(.+)>([^<]+)<(/\\1)>");
            Matcher m = p.matcher(line);

            boolean f = false;
            while(m.find()) {
                System.out.println(m.group(2));
                f = true;
            }

            if(!f) {
                System.out.println("None");
            }
			testCases--;
		}
	}
}

