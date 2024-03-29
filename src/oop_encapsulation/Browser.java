package oop_encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launching browser");// ui enter username and password
		checkbrowserVersion();
		checkbrowserOSCompatibility();
		checkRAMSpace();
		checkOSBrowserServices();
		System.out.println("browser is launched.....");//transaction successfull.
	}
	
	private void checkbrowserVersion() {
		System.out.println("checking browser version");
	}
	
	private void checkbrowserOSCompatibility() {
		System.out.println("checking browser OS Compatibility");
	}
	
	
	private void checkRAMSpace() {
		System.out.println("checking RAM Space");
	}
	
	private void checkOSBrowserServices() {
		System.out.println("check OS Browser Services");
	}

}
