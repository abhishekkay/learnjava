class Text9
{
public static void main(String args[ ])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
if(a>b){
  if(a>c)
{
System.out.println(a);
}
else 
{
System.out.println(b);
}
}
else 
{
if(b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}
}

