
public class Problem3
{
  public static void main(String[] args)
  {
 double decimalnum = 50.12421433442;

 double temp = (decimalnum*1000);
 int num1 = (int)(temp % 10);
 double temp2 = (temp/10);
 int num2 = (int)(temp2 % 10);
 double temp3 = (temp2/10);
 int num3 = (int)(temp3 % 10);
 System.out.print(num3+(" ")+num2+(" ")+num1);
  }
}

