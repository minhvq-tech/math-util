/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class MathUtility {
    
    //hàm tính n!=1.2.3.4....n
    //0! = 1! =1
    // âm giai thừa ko hợp lệ
    // long tối đa 18 số 0, 21! trần kiểu long -> 21!ko dc
    //do đó hàm này chỉ nhận n từ 0 -> 20
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument: it must be 0 to 20");
        if (n == 0 || n == 1)
            return 1;
        return n * getFactorial(n-1);
        //cách khác
        //dùng for nhân dồn vào biến product =1
        //for 2...n, product = product * i;
        
        
        
    }
    public static void main(String[] args) {
        long result= MathUtility.getFactorial(5);
        System.out.println("5! = " + result);
    }
}
