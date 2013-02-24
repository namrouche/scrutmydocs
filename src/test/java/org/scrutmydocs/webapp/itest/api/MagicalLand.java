package org.scrutmydocs.webapp.itest.api;
// http://zeroturnaround.com/fun/magical-java-puzzle-pat-the-unicorns/
public class MagicalLand {
	public static void main(String[] args) {
	    for (int i = 0; i < (Math.random() * 500) + 2; i++) {
	    	System.out.println("1  ---"+(Math.random() * 500) + 2);
	      if (Unicorn.pat()) {
	        System.out.println("UNICORN #1: PAT THIS UNICORN ONCE");
	      }
	    }
	 
	    for (int i = 0; i < (Math.random() * 500) + 2; i++) {
	    	System.out.println("2  ---"+(Math.random() * 500) + 2);
	      if (Unicorn.pat()) {
	        System.out.println("UNICORN #2: PAT THIS UNICORN ONCE");
	      }
	    }
	    System.out.println("END OF PROGRAM");
	  }
}
