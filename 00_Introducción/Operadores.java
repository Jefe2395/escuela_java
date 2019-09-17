class  Operadores
{
	public static void main(String[] args)
	{
		System.out.println( 5 != 5 ? "Pues si" : "Pues no ");
		if (args[0].equals("aa"))
		{
			System.out.println("Quieres dos AA");
		}
		else
		{
			System.out.println("Quieres otra cosa");
		}
		
		System.out.println(args[0].equals("aa") ? "Es la AA" : "No es la AA");
		int i = 1, j = 2;
		String resultado =
			(34/43) > 1 ? "--"
			: (i==j) ? "i = j "
			: (i == j+1) ? " 1 = j+1"
			: "por defecto";
		System.out.println(resultado);
		
		byte resil = 113 & 199;
		System.out.println("AND binario = "+ resil);
	}
}