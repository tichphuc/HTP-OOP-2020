public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b){
            return a;
        }
        else if (a < b){    
            return b;
        }
        else return a;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = (weight)/(height * height);
        BMI = Math.round(BMI*100)/100;
		if (height <= 0 || weight <=0) {
            System.out.println ("Height and weight need to > 0");
		}
		else{
			if(BMI <= 18.5){
				System.out.println ("Thieu can");
			}
			else if (18.6 < BMI & BMI < 22.9){
				System.out.println ("Binh thuong");
			}
			else  if (23 < BMI & BMI < 24.9){
				System.out.println ("Thua can");
			}
			else if (BMI >= 25){
				System.out.println ("Beo phi");
			}
		}
		return "Other";
    }
}