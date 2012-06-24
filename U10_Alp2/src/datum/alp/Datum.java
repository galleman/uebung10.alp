package datum.alp;

public class Datum implements Comparable, Date {
	
	int day;
	int month;
	int year;
	Date d;
	//test
	public Datum (int day, int month, int year, Date d) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	

	@Override
	public int getDay() {
		return this.day;
	}

	@Override
	public int getMonth() {
		return this.month;
	}

	@Override
	public int getYear() {
		return this.year;
	}

	@Override
	public Date getDate() {
		return this.d;
	}
	
	public void theDaybefore() {
		if (this.month==1 && this.day==1) {
			this.day=31;
			this.month=12;
			this.year-=1;
		}
		if (this.day==1) {
			if (this.month==2 || this.month==4 || this.month==6 || this.month==8 || this.month==11) {
				this.day=31;
				this.month-=1;
			}
			if (this.month==5 || this.month==7 || this.month==10 || this.month==12) {
				this.day=30;
				this.month-=1;
			}
			if (this.month==3) {
				if ((this.year%4==0 && this.year%100!=0) || (this.year%400==0)) {
					this.day=29;
					this.month-=1;
				}
				this.day=28;
				this.month-=1;
			}
		}
		
	}
	
	
	
	@Override
	public void nextDay() {
		if (this.month==12 && this.day==31) {
			this.day=1;
			this.month=1;
			this.year+=1;
			}
		if ((this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10) && (this.day==31)) {
			this.day=1;
			this.month+=1;
			}
		if ((this.month==4 || this.month==6 || this.month==9 || this.month==11) && (this.day==30)) {
			this.day=1;
			this.month+=1;
		}
		if (this.month==2) {
			if ((this.year%4==0 && this.year%100!=0) || (this.year%400==0)) {
				if (this.day==29) {
					this.day=1;
					this.month+=1;
				}
			}
			if (this.day==28) {
				this.day=1;
				this.month+=1;
			}
		}
		this.day+=1;

	}

	@Override
	public boolean after(Date date) {
		return false;		
	}

	@Override
	public boolean before(Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDate(int day, int month, int year)
			throws IllegalDateException {
		
		// TODO Auto-generated method stub
		
	}

}
