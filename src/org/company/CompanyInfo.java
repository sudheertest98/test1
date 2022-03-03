package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("The Name of the company is:");

	}
	private void companyName(int a) {
		System.out.println("Company number"+a);
	}
	private void companyName(String s) {
		System.out.println(s);

	}
	private void companyName(String s,String d) {
		System.out.println(d);
		System.out.println(s);

	}
	
	
	public static void main(String[] args) {
		CompanyInfo cI=new CompanyInfo();
		cI.companyName();
		cI.companyName(1);
		cI.companyName("Datamatics pvt. LTD.");
		cI.companyName("sem", "done");
	}

}
