import java.util.*;
public class Compile{
	public HashMap UnitToFormula(String x){
		HashMap<Integer,Character>UnitTree=new HashMap<Integer,Character>();
		char UnitCharArr=x.toCharArray();
		int b=0;
		for(char a:UnitCharArr){
			HashMap.set(b,(Character)a);
			b++;		
		};
		return UnitTree;
	}


	public static void main(String[]args){
		HashMap tree=new Compile().UnitToFormula("ms^-1");
		System.out.println(tree);
			

	} 

}
