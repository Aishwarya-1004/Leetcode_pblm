class Solution {
    public String removeDigit(String number, char digit) {
        char d=digit;
        for(int i=0;i<number.length()-1;i++){
            if(number.charAt(i)==d && number.charAt(i)<number.charAt(i+1)){
                return number.substring(0,i)+number.substring(i+1);
            }
        }
        int index=number.lastIndexOf(d);
        return number.substring(0,index)+number.substring(index+1);
    }
}