class Arr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] arr = new int[] {1,2,3,4,5};;
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		arr[0] = 20;	
		for(int i =0 ; i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		System.out.println(" ");
		arr[4] = 100;
		for(int i =0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		
	}

}
