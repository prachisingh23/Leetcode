class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
        return "0";
        int[] result = new int[num1.length() + num2.length()];
        for(int i =num1.length()-1; i>=0; i--){
            for(int j =num2.length()-1;j>=0;j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int multiply = digit1*digit2;
                int posright = i+j+1;
                int posleft = i+j;
                int sum = multiply + result[posright];
                result[posright] = sum%10;
                result[posleft] += sum/10;
            }
        }    
        StringBuilder product = new StringBuilder();
        for(int i=0;i<result.length;i++){
            int num = result[i];
            if(!(product.length() == 0 && num == 0)){
                product.append(num);
            }
        }
        return product.toString();
    }
}