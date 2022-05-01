
public class AbstractTest {
	public static void main(String[] args) {
		// Instrument i = new Instrument();
		// MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		ElectronicGuitar e = new ElectronicGuitar();

		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		e.playGuitar();
		System.out.println("--------------------------------------");
		Violin v = new Violin();
		v.utilize();
		v.play();
		v.tuneStrings();
		v.bow();
		System.out.println("--------------------------------------");

		Sitar s = new Sitar();
		s.play();
		s.tuneStrings();
		s.pluck();
		System.out.println("--------------------------------------");

		Saxophone se = new Saxophone();
		se.blow();
		se.play();
		Bagpiper b = new Bagpiper();
		b.blow();

		Glucometer gc = new Glucometer();
		gc.diagnose();

		Cutter ct= new Cutter();
		ct.steralise();
	}
}

abstract class Instrument {
	abstract void utilize();
}

abstract class MusicalInstrument extends Instrument {
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument {

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

class ElectronicGuitar extends Guitar {
	void playGuitar() {
		System.out.println("Oh!!! How nicely playing Guitar!!!!!!!");
	}
}

class Violin extends StringBasedMusicalInstrument {

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

	void bow() {
		System.out.println("Bowing the Violin....");
	}
}

class Sitar extends StringBasedMusicalInstrument {

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

	void pluck() {
		System.out.println("Plucking the Sitar...Its so nice to listen to the composition!!\n");
	}
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument {
	abstract void blow();
}

class Flute extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		System.out.println(" Blow the air....................");
	}

	@Override
	void play() {
		System.out.println(" Play it....................");
	}

	@Override
	void utilize() {
		System.out.println(" Utilise....................");
	}

}

class Saxophone extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		System.out.println(" Blow the air...SAXOPHONE.................");

	}

	@Override
	void play() {
		System.out.println(" Play it now....................");

	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub

	}

}

class Bagpiper extends AirBasedMusicalInstrument {

	@Override
	void blow() {
		System.out.println(" Blow the air...its Bagpiper.................");

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

abstract class MedicalInstrument extends Instrument {
	abstract void diagnose();
}

abstract class SurgicalMedicalInstrument extends MedicalInstrument {
	abstract void steralise();
}

class Needle extends SurgicalMedicalInstrument {
	@Override
	void utilize() {

	}

	@Override
	void steralise() {
		System.out.println("Always Steralise the Needle before using it....");
	}

	@Override
	void diagnose() {

	}
}

class Cutter extends SurgicalMedicalInstrument {

	@Override
	void steralise() {
		System.out.println(" Cutter is very important in the Surgery.....");
		}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub

	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub

	}

}

class PathologicalMedicalInstrument extends MedicalInstrument {

	@Override
	void diagnose() {
		System.out.println("Diagnosing ------");

	}

	@Override
	void utilize() {
		System.out.println("Utilising----");
	}

}

class Glucometer extends PathologicalMedicalInstrument {

	@Override
	void diagnose() {
		super.diagnose();
		System.out.println("Glucometer is used to check the Sugar Level in the Blood");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		super.utilize();
	}

}
