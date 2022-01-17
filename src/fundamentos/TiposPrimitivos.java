package fundamentos;

public class TiposPrimitivos {
	
/*-Inteiros
 * byte -> 1 byte = 8 bits
 * short -> 2 bytes = 16 bits
 * int -> 4 bytes = 32 bits
 * long -> 8 bytes = 64 bits
 * 
 * -Ponto Flutuante
 * float -> 4 bytes
 * double -> 8 bytes
 * 
 * char -> um caractere = 'a'
 * boolean -> True or False
 * */
	
public static void main(String[] args) {
	
	char c1 = 'a';
	char c2 = 'b';
	char c3 = '\u0050';
	
	byte b = 127;
	short s = 32767;
	int i = 2_147_483_647;
	long l = 9_789_456_123_456_123L;
	
	float f = 4.523f;
	double d = 3.14159265;
	
	System.out.printf("%c, %c, %c \n",c1,c2,c3);
	
	System.out.printf("%d - %d - %d - %d\n",b,s,i,l);
	System.out.println(Integer.toBinaryString(b));
	System.out.println(Integer.toBinaryString(s));
	System.out.println(Integer.toBinaryString(i));
	System.out.println(Long.toBinaryString(l));
	
	System.out.printf("%.2f - %f", f,d);
}
	
}
