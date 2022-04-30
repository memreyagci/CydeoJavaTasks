package day43_Abstraction.car;

public interface AutoPilot extends AutoPark {
    boolean hasAutoPilot = true;

    void selfDrive();
}

/*
	3. Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
 */