public class task2 {
    public static void main(String[] args) {
//        a是百位，b是十位，c是各位
        int a,b,c;
        int num=0;
        for(a=1;a<=9;a++)
        {
            for(b=0;b<=9;b++)
            {
                for(c=0;c<=9;c++)
                {
                    if(a*100+b*10+c == a*a*a+b*b*b+c*c*c)
                    {
                        num++;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
