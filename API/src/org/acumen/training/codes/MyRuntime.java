package org.acumen.training.codes;

import java.io.IOException;

public class MyRuntime {
	//runtime can run non-java apps
	// need muna instantiate factory method
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		
		/*creates txt file
		try {
			Process process = runtime.exec(new String[] { "notepad", "./Helloword.java" });
			process.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		//checks available processors in the VM // Profiling
		System.out.println(runtime.availableProcessors());
		
		//checks memory
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		
		runtime.gc(); //garbage collection for devs

	}

}
