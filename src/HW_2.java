public class HW_2 {
        public static void main(String[] args) {
            int AgeHusband = 34;
            int AgeWife = 26;
            boolean credit;
            if (credit = AgeHusband < 35 & AgeWife < 35)
                System.out.println("9) Credit is allowed. " +  credit);
            else
                System.out.println("9) Credit is Not allowed. " + credit );


            double Familymoney=30000;
            boolean money;
            if ( money =Familymoney > 20000 & Familymoney < 50000)
                System.out.println( "10) Family income is more than 20000 and less then 50000: " + money );
            else
                System.out.println( "10) Family income is not appropriate to get a credit: " + money );

            double GoldenApple = 0;
            double AntonovkaApple = 0;
            boolean Apples;
            if ( Apples = GoldenApple > 0 | AntonovkaApple > 0)
                System.out.println( "11) There are apples in stock. " + Apples);
            else
                System.out.println( "11) There are NO apples in stock. " + Apples);

        }

}
