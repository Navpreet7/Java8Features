package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
	public static void main(String[] args) {
		
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		try {
			se.eval(new FileReader("/Users/e-kawakami/eclipse-workspace/B+Tree/src/main/res/sample.js"));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
