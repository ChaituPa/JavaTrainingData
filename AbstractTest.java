public class AbstractTest {
	public static void main(String[] args) {
		//Instrument i = new Instrument();
	//	MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		System.out.println("--------------------------------------");
		Violin v= new Violin();
		v.utilize();
		v.play();
		v.tuneStrings();
		v.bow();
		System.out.println("--------------------------------------");

		Sitar s= new Sitar();
		s.utilize();
		s.play();
		s.tuneStrings();
		s.pluck();
		System.out.println("--------------------------------------");

	}
}
abstract class Instrument {
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar strings");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar....");
	}
	
	void pluck() {
		System.out.println("Plucking the guitar....");
	}
}

class ElectronicGuitar extends Guitar
{
	
}

class Violin extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Violin strings");
		
	}

	@Override
	void play() {
		System.out.println("Playing the Violin...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Violin....");
		
	}
	
	void bow()
	{
		System.out.println("Bowing the Violin....");
	}
}

class Sitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Sitar strings");
	}

	@Override
	void play() {
		
		System.out.println("Playing the Sitar...");
	}

	@Override
	void utilize() {
		
		System.out.println("Utilizing the Sitar....");
	}
	
	void pluck()
	{
		System.out.println("Plucking the Sitar....");
	}
}


abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blow();
}

class Flute extends AirBasedMusicalInstrument
{

	@Override
	void blow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}

}

class Saxophone extends AirBasedMusicalInstrument
{

	@Override
	void blow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}

}

class Bagpiper extends AirBasedMusicalInstrument
{

}



abstract class MedicalInstrument extends Instrument
{
	abstract void diagnose();
}
abstract class SurgicalMedicalInstrument extends MedicalInstrument
{
	abstract void tuneStrings();
}
class Needle extends SurgicalMedicalInstrument
{
	
}
