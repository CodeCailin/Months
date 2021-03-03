//variables
//constructors
//setters
//process
//getters

public class Months{

	//variables
	private int month;
	private int days;

	//Consturctors

	public Months() {

		month=0;
		days=0;

		}



	//setters
	public void setMonth(int month){
		this.month=month;
	}


		//Process
	public void compute(){
	if(month==2){
	days=28;
	}


	if(month==4 || month==6 || month==9 || month==11 ) {
	days=30;
	}

	else{
	days=31;
	}
	}

	//getters
	public int getDays(){

		return days;

		}

}