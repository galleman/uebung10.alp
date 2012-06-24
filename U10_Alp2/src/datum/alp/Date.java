package datum.alp;

public interface Date {
	public	int getDay();
	public	int getMonth();
	public	int getYear();
	public	Date getDate();
	
		
	/* Das Datum verändert sich zum nächsten Tag */
	public void nextDay();
	
	/* Bei falschen Eingaben des Datums wird ein Ausnahme-Objekt
	erzeugt und das Datum bleibt unverändert, sonst wird das
	neue Datum gesetzt */
	public void setDate( int day, int month, int year )
	throws IllegalDateException;
	
	/* testet, ob das Datum-Objekt selber (this) nach date ist */
	public boolean after( Date date );
	
	/* testet, ob das Datum-Objekt selber (this) vor date ist */
	public boolean before( Date date);
	
	/* gibt das Datum in Textform zurück */
	public String toString();

}
