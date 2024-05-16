package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {



    public static int[] findEvenOdd(String input) {
        String[] s=input.split(",");
        int[] rezultat=new int [4];

        rezultat[0]=200;    //min odd number
        rezultat[2]=0;     //max even number

        for(int i=0;i< s.length;i++)
        {
            int numar=Integer.parseInt(s[i]);
            if(numar%2==1)
                if(rezultat[0]>numar) {
                    rezultat[0] = numar;
                    rezultat[1]=i;
                }
             if(numar%2==0)
                    if(rezultat[2]<numar) {
                        rezultat[2] = numar;
                        rezultat[3] = i;
                    }
        }
        return rezultat;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int []result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }

    }
}
