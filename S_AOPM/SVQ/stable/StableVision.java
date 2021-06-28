package SVQ.stable;
public interface StableVision {
	//ģʽʶ��1 ʶ�����۾� 
	public static int[][] eyeHeart= new int[][] {
		{ 2, 0, 0, 1, 1, 2 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 2, 0, 0, 1, 1, 2 }
	};					
	//ģʽʶ��1 ʶ�����۾� 
	public static int[][] eye= new int[][] {
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9,11,11,11,11,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9,11,11,11,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9, 9, 9,11,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9, 9, 9, 9,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9, 9, 9, 9, 9},
		{12,12,12,12,12,12,12,12,12,14,14,14,14,14,14,19,19, 9, 9, 9, 9, 9, 9, 9, 9},
		{12,12,12,12,12,12,12,12,13,14,14,14,14,14,14,14,10,10, 9, 9, 9, 9, 9, 9, 9},
		{12,12,12,12,12,12,12,13,13,14,14,14,14,14,14,10,10,10,10,10, 9, 9, 9, 9, 9},
		{4 ,12,12,12,12,12,12,13,13,20,20, 1, 1,14,14,10,10,10,10,10,10,10, 9, 9, 9},
		{2 , 2, 2, 2, 2,12,13,13,20,20,20, 1, 1, 1, 10,10,10,10,10,10,10,10,10, 9, 9},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10,10,10, 9, 9, 9},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10,10, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10, 3, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10, 3, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2, 2,13,13,20,20,20, 1, 1, 1,10,10,10,10,10, 3, 3, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2, 2,13,13,13,20,20, 1, 1,15,15,10,10,10,10, 3, 3, 3, 3, 3, 3},
		{5 , 2, 2, 2, 2, 2, 2,13,13,15,15,15,15,15,15,15,10,10, 3, 3, 3, 3, 3, 3, 3},
		{5 , 2, 2, 2, 2, 2, 2, 2,13,15,15,15,15,15,15,15,10, 3, 3, 3, 3, 3, 3, 3, 3},
		{5 , 5, 2, 2, 2,22,22, 2, 2,15,15,15,15,15,15,15, 3, 3, 3, 3, 3, 3, 3, 3, 8},
		{5 , 5, 4, 2, 2,22,22,22, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
		{5 , 5, 5, 5, 2,22,22,22, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 3, 3},
		{5 , 5, 5, 5, 5,22,22,22, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 3, 3},
		{5 , 5, 5, 5, 5, 5,22, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 3},
		{5 , 5, 5, 5, 5, 5, 5, 6, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 7, 7},
		{5 , 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 7, 7, 7}
	};
}