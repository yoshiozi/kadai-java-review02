package sample;

public class Review01 {
    //価格と消費税額の呼び出し
    public static void main(String[] args) {
    int price = 1500;
    int tax = 10;
    int result;
    result = Method(price, tax);
    System.out.println(price + "の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。");
}

        // taxメゾット戻り値あり
        public static int Method(int price, int tax) {
            int result= price / tax;
            return result;

    }

}
