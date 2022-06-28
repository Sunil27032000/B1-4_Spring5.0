package di1;

public class AntherStudent {
	Cheat c;
	//setters method for DI
	public void setC(Cheat c) {
		this.c = c;
	}

	public void cheating()
	{
		c.mathCheat();
	}


}
