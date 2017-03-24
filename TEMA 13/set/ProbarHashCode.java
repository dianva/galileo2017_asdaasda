import java.util.HashSet;

public class ProbarHashCode {
public static void main (String[]args){
	HashSet sh=new HashSet();
	sh.add("Pepe");
	sh.add("Ana");
	sh.add("Pedro");
	sh.add("Carmen");
	System.out.println("Esta vacio? "+sh.isEmpty());
	System.out.println("Cuantos elementos?"+sh.size());
	sh.add("Carmen");
	sh.add(null);
	System.out.println(sh);
	System.out.println("Cuantos elementos? "+sh.size());
	System.out.println("Esta Pepe? "+sh.contains("Pepe"));
	System.out.println("Esta Pepe? "+sh.contains("Juan"));
	sh.add(null);

	HashSet<String>hs2=new HashSet<String>();
	System.out.println("Esta vacio?"+hs2.isEmpty());
	System.out.println("Cuantos elementos?"+hs2.size());
	
	

}
}
