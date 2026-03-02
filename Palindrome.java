class Palindrome
{
public static void main(String[] args)
{
int a = 5005;
int b = a%10;
int c = a/10;
int d = c%10;
int e = c/10;
int f = e%10;
int g = e/10;
int h = b*1000+d*100+f*10+g*1;
System.out.println(h);
boolean result = h==a;
System.out.println(result);

}
}