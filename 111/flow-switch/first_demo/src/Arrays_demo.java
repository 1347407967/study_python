public class Arrays_demo {
    public static void main(String[] args) {
        for (String i:args) {
            System.out.println(i);

        }

        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        int num=0;//人数
        int sum=0;//平均分
        for (int[] i:scores) {
            for (int n:i) {
                System.out.print(n+"\t");
                num++;
                sum=n+sum;
            }
            System.out.println();
        }
        System.out.println("总和是："+sum+"人数是："+num+"平均分是:"+sum/num);
    }
}
