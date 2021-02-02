import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        int min=0;
        //先正序从小到大排序
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        int[] nss=ns;
        //输出验证是否赋值成功
        System.out.println("nss:"+Arrays.toString(nss));
        //倒序把数组从大到小排序
        System.out.println("从大到小排序：");
        for (int i = nss.length-1; i >=0 ; i--) {
            System.out.print(nss[i]+" ");
        }



        /*数组倒序*/
        for (int i = ns.length-1; i>=0; i--) {
            System.out.print(ns[i]+";");
        }

        for (int i = 4; i>=0; i--) {
            int n=ns[i];
            System.out.println(n);
        }
        max_num(ns);
        System.out.println("冒泡结果："+Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.println("直接方法排序"+Arrays.toString(ns));


//        for (int i = 0; i < ns.length; i++) {
//            int n=ns[i];
//            System.out.print(n);
//
//        }
//        for (int n:ns) {
//
//            System.out.print(n);
//
//        }


    }

    public static void max_num(int num[]) {
        for (int i = 0; i < num.length-1; i++) {
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]<num[j+1]){
                    int t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }
    }
}
