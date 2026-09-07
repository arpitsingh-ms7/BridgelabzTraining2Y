class Grade 
{
static int[][] marks(int n)
{
int[][] m=new int[n][3];
for(int i=0;i<n;i++)
for(int j=0;j<3;j++)
m[i][j]=(int)(Math.random()*90)+10;
return m;
}
static double[][] calc(int[][] m)
{
double[][] r=new double[m.length][3];
for(int i=0;i<m.length;i++)
{
int t=m[i][0]+m[i][1]+m[i][2];
r[i][0]=t;
r[i][1]=Math.round((t/3.0)*100)/100.0;
r[i][2]=Math.round((t/300.0)*10000)/100.0;
}
return r;
}
static String grade(double p)
{
if(p>=90) return "A";
if(p>=75) return "B";
if(p>=60) return "C";
return "D";
}
public static void main(String[] args)
{
int[][] m=marks(5);
double[][] r=calc(m);
System.out.println("P C M T AVG % GRADE");
for(int i=0;i<m.length;i++)
System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]+" "+(int)r[i][0]+" "+r[i][1]+" "+r[i][2]+" "+grade(r[i][2]));
}
}


