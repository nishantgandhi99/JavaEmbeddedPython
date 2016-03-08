package method.jep;

import jep.Jep;
import jep.JepException;

public class Main {
	public static void main(String[] args) throws JepException {

		Jep jep = new Jep();
		jep.eval("import sys");
		jep.eval("s = 'Hello World'");
		jep.eval("print s");
		String java_string = jep.getValue("s").toString();
		System.out.println("Java String:" + java_string);
		jep.runScript("src/myscript.py");
	}
}
