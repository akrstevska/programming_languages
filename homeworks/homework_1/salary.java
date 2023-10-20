
public class salary {

	public static void main(String[] args) {
		String name = "Angela Krstevska";
		double grossSalary = 20000;
		double stateTaxes = 28.4/100 * grossSalary;
		double personalTax;
		
		if((grossSalary-stateTaxes-7000)>0) {
			personalTax = 0.10*(grossSalary-stateTaxes-7000);
		}
		else {
			personalTax = 0;
		}
		double netSalary = grossSalary-stateTaxes-personalTax;
		
		stateTaxes = Math.round(stateTaxes);
		personalTax = Math.round(personalTax);
		netSalary = Math.round(netSalary);
		
		System.out.println("Empolyee: " + name+" with gross salary: "+ grossSalary +" MKD, will get NET salary: " + netSalary + " MKD.");
		
		System.out.println("State taxes are: " + stateTaxes);
		System.out.println("Personal tax is: " + personalTax);
	}

}
