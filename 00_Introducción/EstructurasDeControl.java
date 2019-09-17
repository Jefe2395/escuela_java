class  EstructutasDeControl
{
	public static void main(String[] args)
	{
		// for(int i = 0; i< args.length ; i++)
		// {
			//System.out.println("Arg " + i);
			// System.out.println("Arg " + args[i]);
		// }
		int i = 0;
		while(i<args.length)
		{
			System.out.println("Arg " + i);
			System.out.println("Arg " + args[i]);
			i++;
		}
		//Bucle infinito
		// for(;;)
		// {
			// System.out.println("Arg " + i);
			// System.out.println("Arg " + args[i]);
			// i++;
		// }
		
		do
		{
			System.out.println("Siempre se ejecuta");
		}
		while (false);
			System.out.println("EEEE");
			
		boolean siEjecurar = (5 < 3) && (20==20);
		if(siEjecurar)
			System.out.println("Cuando la cond es verdadera");
		else
			System.out.println("Cuando la cond es falsa");
		int valor = 9;
		switch(valor)
		{
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			default:
				System.out.println("Defecto");
				break;
		}
		
	}
}