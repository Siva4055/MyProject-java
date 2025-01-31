
public class ArStr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String data="asfdfdffffsfFSAFSAFASFSFASSDSFDGsffssfdddd";
          data=data.toLowerCase();
          int []count =new int[30];
          System.out.println( "Data length is " + data.length());
         for(int i=0;i<data.length();i++) {
        	 // System.out.println(data.length());
        	char ch=data.charAt(i);
        	count [ch-97]++;
        	//System.out.print(ch);
         }
         for(int i=0;i<26;i++) {
        	System.out.println((char)(i+97)+"---------->"+count[i]);
          }
	}

}