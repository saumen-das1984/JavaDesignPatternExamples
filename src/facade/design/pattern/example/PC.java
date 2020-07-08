package facade.design.pattern.example;

public class PC extends Computer {
	
	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram=ram;
	}

	@Override
	public String getHDD() {
		return this.hdd=hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu=cpu;
	}

}
