class  AriExer
{
	public static void main(String[] args) 
	{
		int num = 145;
		int bai = num / 100;
		int shi = num / 10 % 10;
		int ge = num % 10;
		
		System.out.println("百位:" + bai);
		System.out.println("十位:" + shi);
		System.out.println("个位:" + ge);
	}
}
