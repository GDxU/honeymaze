/**
 * This is about Ways_4.java
 * 
 * @author liuray
 * @date 2015-1-17
 * @deprecated 
 */
package com.elf.ixxo.bean;

public class Ways_6 implements IWays{
    private static byte[][] ways ;
     
     public Ways_6(){
    	 if(ways==null){
    	 ways = new byte[][]{
    	    	 {2,3,4},//0
    	    	 {4,5},//1
    	    	 {3,4},//2
    	    	 {0,2},//3 way out
    	    	 {2,3,4,5},//4
    	    	 {3,4,5},//5
    	    	 {1,2,4},//6
    	    	 {0,1,2,5},//7
    	    	 {1,2,5},//8
    	    	 {0,2,5},//9
    	    	 {1,2,5},//10
    	    	 {0,1,2,5},//11
    	    	 {0,5},//12
    	    	 {1,2},//13
    	    	 {4,5},//14
    	    	 {2,3},//15
    	    	 {2,3,4,5},//16
    	    	 {2,3,4,5},//17
    	    	 {2,3,4,5},//18
    	    	 {2,3,4,5},//19
    	    	 {4,5},//20
    	    	 {2,4},//21 
    	    	 {1,2,3,4,5},//22
    	    	 {3,5},//23
    	    	 {0,1,2,3},//24
    	    	 {0,1,2,3,4,5},//25
    	    	 {0,1,4,5},//26
    	    	 {0,1},//27
    	    	 {0,1,4},//28
    	    	 {3},//29
    	    	 {1,3,4},//30
    	    	 {1,2,3},//31
    	    	 {0,4,5},//32
    	    	 {0,4},//33
    	    	 {0,1,3},//34
    	    	 {0,1,4},//35
    	    	 {2,4},//36
    	    	 {1,5},//37
    	    	 {2,3,4},//38
    	    	 {0,3,5},//39
    	    	 {1,2,3},//40
    	    	 {0,4,5},//41
    	    	 {0,1,3,4},//42
    	    	 {1,2,3},//43
    	    	 {4,5},//44
    	    	 {0,1,3,4},//45
    	    	 {1,2},//46
    	    	 {2,4,5},//47
    	    	 {1,2,3,4,5},//48
    	    	 {0,2,3,4,5},//49
    	    	 {0,5},//50
    	    	 {0,1,3},//51
    	    	 {1,2,3},//52
    	    	 {0,3,4,5},//53
    	    	 {0,1},//54
    	    	 {1,2,3,4},//55
    	    	 {0,3,4,5},//56
    	    	 {1},//57
    	    	 {1,2,3},//58 
    	    	 {0,1,3,5},//59
    	    	 {0,4},//60  
    	    	 {0,3},//61
    	    	 {0,1,2},//62
    	    	 {0,4,5},//63
    	    	 {1,2,4},//64
    	    	 {0,1,2,3,4,5},//65
    	    	 {0,3,5},//66
    	    	 {3,4},//67
    	    	 {0,3,4},//68
    	    	 {0,1,4},//69
    	    	 {0},//70
    	    	 {1,3,4},//71
    	    	 {1,2},//72
    	    	 {1,2,5},//73
    	    	 {0,2,5},//74
    	    	 {0,1,2,3,4,5},//75
    	    	 {0,2,3,4,5},//76
    	    	 {0,1,5},//77
    	    	 {1,3},//78
    	    	 {0,2,3,4},//79
    	    	 {2,3,4,5},//80
    	    	 {2,3,4,5},//81
    	    	 {1,2,3,4,5},//82
    	    	 {0,1,2,3,4,5},//83
    	    	 {0,4,5},//84 
    	    	 {0,1},//85
    	    	 {0,1},//86
    	    	 {0,1},//87
    	    	 {0,1},//88 
    	    	 {0,1},//89
    	    	 {0,1}//90 
    	    	 };}
     }
 
	 
	@Override
	public byte[][] getWays() {
		return ways;
	}
     
}
