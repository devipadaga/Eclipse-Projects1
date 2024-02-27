package Three;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Malaysia {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SPURGE\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bursamalaysia.com/");
		
		WebElement table=driver.findElement(By.xpath("//div[@id='pills-active']"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
				
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>cols= rows.get(i).findElements(By.tagName("td"));
			
			//System.out.println(cols.size());
			for(int j=0;j<cols.size();j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
//		
//		String [] str = { "-0.010","-0.005","-", "-0.015", "+0.005", "-0.010","-0.005","-"};
//        //String [] str ={"-", "-0.010", "-", "-0.005", "-0.015", "+0.005", "-0.010", "-", "-0.005", "-"};
//        int size = str.length;
//        Double [] arr1 = new Double [size];
//        for(int i=0; i<size; i++) {
//            try {
//           arr1[i] =  Double.parseDouble(str[i]);
//            }catch(NumberFormatException nfe)
//            {
//                System.out.println("NumberFormat Exception: invalid input string");
//            }
//        }
//
//        
//        List<Double> names = Arrays.asList(arr1);
//        Collections.sort(names, new Comparator<Double>() {
//
//            @Override
//            public int compare(Double str1, Double str2) {
//                if(null == str1) {
//                    return null == str2 ? 0 : 1;
//                }
//                else if(null == str2) {
//                    return -1;
//                }
//                return str1.compareTo(str2);
//            }
//        });
//
//        // 2.2 print to console
//        names.forEach(System.out::println);
//		

	}

}
