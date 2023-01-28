public class P0074_RelationalEx2 {
	public static void main(String[] args) {
		// ex2
		boolean x = true;
		boolean y = false;
		short z = 46;
		if((z++ == 46) && (y = true)) {
			z++;
		}
		//z++==46 t,z=47,y=true t,t&&t=t,z=48
		if((x = false) || (++z == 49)) {
			z++;
		}
		//x=false t,noafter,z=49,t||?=t,z=50
		System.out.println("z=" + z);
		//z=50
	}	
}