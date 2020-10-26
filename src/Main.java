import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Creates the Objects
        Prisoner prisoner = new Prisoner("stone", LocalDate.of(2012,10,20), 10);
        Prisoner prisoner2 = new Prisoner("john", LocalDate.of(2012,10,20), 8);
        Cell cell = new Cell(101);
        Prison prison = new Prison();

        //add prisoners and cell
        cell.addPrisoner(prisoner);
        cell.addPrisoner(prisoner2);
        prison.addCellToPrison(cell);

        System.out.println(cell.getPrisonersInCell());
        System.out.println(cell.getFirstRelease());

        prison.printCellDetailsByGuard(101);
        prison.getPrisonerToBeReleasedFirst(101);
    }
}
