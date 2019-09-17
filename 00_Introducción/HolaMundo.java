public class HolaMundo
{
	public static void main(String[] args)
	{
		System.out.println("Hola mundo");
		
		String nombre= "Jaime";
		System.out.println("Hola " + nombre);
		
		byte unByte = 127; // Hasta -128
		System.out.println("Byte: " + unByte);
		
		int numero = 1234567890; // 4 bytes 
		System.out.println("Numero " + numero);
		
		float decimal = 0.000012345678901f; //4 Bytes
		System.out.println("Decimal " + decimal);
		
		double decimalDoble = 0.12345678901234567890; // 8 bytes
		System.out.println("DecimalDoble " + decimalDoble);
		
		long enteroLargo= 1234567890123456789L; // 8 bytes - Trillones
		System.out.println("Numero largo: " + enteroLargo);
		
		char caracter = 65; // 'A' Si es un numero sale el equivalente en ASCII
		System.out.println("Caracter " + caracter); // 2 bytes

		char[] texto ={'a','b','c','d','e','f','g'};		
		System.out.println("Texto " + texto[1]); // 2 bytes
		
		for(int i = 0; i<texto.length;i++)
		{
			System.out.println("Letra " + texto[i]);
		}
	}

}