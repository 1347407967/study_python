public class demo_test {
    public static void main(String[] args) {
        String fruit="orange";
        int opt=switch (fruit){
            case "apple"-> 1;
            case "pear"-> 2;
            default -> {
                int code=fruit.hashCode();
                yield code;

            }
        };//注意赋值语句要以“;”结束
        System.out.println("您要买的商品是"+opt);
    }
}
