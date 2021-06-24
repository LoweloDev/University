package com.Bonusaufgaben;

public class Bonusaufgabe {

    // Teilaufgabe B und C Game of Life methods

    // coordinates and living neighbour count Game of Life cells
    int cellX, cellY, aliveNeighbourCount;

    Bonusaufgabe(int x, int y) {
        this.cellX = x;
        this.cellY = y;
    }

    Bonusaufgabe(int x, int y, int aliveNeighbourCount) {
        this.cellX = x;
        this.cellY = y;
        this.aliveNeighbourCount = aliveNeighbourCount;
    }

    private static Bonusaufgabe[] getCellCoords(char[][] golField) {
        Bonusaufgabe[] cellCoords = new Bonusaufgabe[golField.length * golField.length];
        int cellCoordsIndex = 0;

        for (int y = 0; y < golField[0].length; y++) {
            for (int x = 0; x < golField.length; x++) {
                cellCoords[cellCoordsIndex++] = new Bonusaufgabe(x, y);
            }
        }
        return cellCoords;
    }

    // avoiding Array out of bounds exception
    private static char cellInBounds(char[][] golField, int x, int y) {
        char golFieldCell = Character.MIN_VALUE;

        if (x > -1 && y > -1 && x < golField.length && y < golField.length) {
            golFieldCell = golField[x][y];
        }
        return golFieldCell;
    }

    private static Bonusaufgabe[] getLifeConditions(char[][] golField, boolean defaultRuleset) {
        Bonusaufgabe[] cellCoordinates = getCellCoords(golField);
        Bonusaufgabe[] cellLifeConditions = new Bonusaufgabe[cellCoordinates.length];

        for (int i = 0; i < cellLifeConditions.length; i++) {
            int x = cellCoordinates[i].cellX, y = cellCoordinates[i].cellY;
            int aliveNeighbourCount = 0;

            //checking cells around living cell
            if (defaultRuleset) {
                if (cellInBounds(golField, x - 1, y - 1) == '+') aliveNeighbourCount++;
                if (cellInBounds(golField, x, y - 1) == '+') aliveNeighbourCount++;
                if (cellInBounds(golField, x - 1, y) == '+') aliveNeighbourCount++;

                if (cellInBounds(golField, x + 1, y) == '+') aliveNeighbourCount++;
                if (cellInBounds(golField, x, y + 1) == '+') aliveNeighbourCount++;
                if (cellInBounds(golField, x + 1, y + 1) == '+') aliveNeighbourCount++;

                if (cellInBounds(golField, x + 1, y - 1) == '+') aliveNeighbourCount++;
                if (cellInBounds(golField, x - 1, y + 1) == '+') aliveNeighbourCount++;
            } else {
                // modified ruleset
                for (int n = 1; n <= 2; n++) {
                    if (cellInBounds(golField, x - n, y - n) == '+') aliveNeighbourCount++;
                    if (cellInBounds(golField, x, y - n) == '+') aliveNeighbourCount++;
                    if (cellInBounds(golField, x - n, y) == '+') aliveNeighbourCount++;

                    if (cellInBounds(golField, x + n, y) == '+') aliveNeighbourCount++;
                    if (cellInBounds(golField, x, y + n) == '+') aliveNeighbourCount++;
                    if (cellInBounds(golField, x + n, y + n) == '+') aliveNeighbourCount++;

                    if (cellInBounds(golField, x + n, y - n) == '+') aliveNeighbourCount++;
                    if (cellInBounds(golField, x - n, y + n) == '+') aliveNeighbourCount++;
                }
            }
            cellLifeConditions[i] = new Bonusaufgabe(x, y, aliveNeighbourCount);
        }
        return cellLifeConditions;
    }

    private static char[][] simulationOfLife(char[][] golField, int t, boolean defaultRuleset) {
        for (int generation = 0; generation < t; generation++) {
            Bonusaufgabe[] lifeConditions = getLifeConditions(golField, defaultRuleset);

            for (Bonusaufgabe cell : lifeConditions) {
                if (defaultRuleset) {
                    if (cell.aliveNeighbourCount < 2 || cell.aliveNeighbourCount > 3)
                        golField[cell.cellX][cell.cellY] = '-';
                    if (cell.aliveNeighbourCount == 3)
                        golField[cell.cellX][cell.cellY] = '+';
                } else {
                    // modified ruleset
                    if (cell.aliveNeighbourCount < 2 || cell.aliveNeighbourCount > 3)
                        golField[cell.cellX][cell.cellY] = '-';
                    if (cell.aliveNeighbourCount == 3)
                        golField[cell.cellX][cell.cellY] = '+';
                    if (generation > t/2) {
                        for (Bonusaufgabe deadCell : lifeConditions){
                            golField[deadCell.cellX][deadCell.cellY] = '-';
                        }
                    }
                }
            }
        }
        return golField;
    }

    // testing purposes
    private static char[][] setLivingCell(char[][] golField, int x, int y) {
        golField[x][y] = '+';

        return golField;
    }

    // testing purposes. You can obviously use it if you'd like so I kept it.
    private static void printGolField(char[][] golField) {

        for (int y = 0; y < golField[0].length; y++) {
            System.out.printf("\n %s", golField[0][y]);

            for (int x = 1; x < golField.length; x++) {
                System.out.printf(" %s", golField[x][y]);
            }
        }
    }

    private static char[][] gameOfLife(char[][] golField, int t) {
        char[][] teilaufgabeB = simulationOfLife(golField, t, true);

        return teilaufgabeB;
    }

    // calling the simulation with modified ruleset
    private static char[][] gameOfLife2(char[][] golField2, int t) {
        char[][] teilaufgabeC = simulationOfLife(golField2, t, false);

        return teilaufgabeC;
    }


    // Teilaufgabe A Initialen methods
    private static char[][] erstelleFeld(int n) {
        char initials[][] = new char[n][n];
        int nBreakpoint = n / 2;

        // setting name initial
        for (int col = 0; col < nBreakpoint; col++) {
            initials[col][1] = '+';
        }

        for (int row = 1; row < initials[nBreakpoint / 2].length; row++) {
            initials[nBreakpoint / 2][row] = '+';
        }

        // setting surname initial
        for (int col = 1; col < initials.length; col++) {
            initials[nBreakpoint + 1][col] = '+';
        }

        for (int col = nBreakpoint + 1; col < initials.length - 1; col++) {
            initials[col][1] = '+';
            initials[col][nBreakpoint] = '+';
            initials[col][initials.length - 1] = '+';
        }

        for (int col = 2; col < initials.length - 1; col++) {
            initials[initials.length - 1][col] = '+';
            initials[initials.length - 1][nBreakpoint] = Character.MIN_VALUE;
        }

        // Whitespace spacing fix
        for (int col = 0; col < initials.length; col++) {
            for (int row = 0; row < initials.length; row++) {
                if (initials[col][row] != '+') initials[col][row] = '.';
            }
        }
        return initials;
    }

    public static void main(String[] args) {
        // Note that every method directly changes the passed field, in whatever state it is.
        // Create 2 seperate fields, or test the methods in seperate runs.
        // e.g.:
        //    char[][] feld = erstelleFeld(11);
        //    char[][] gol = gameOfLife(feld, 11);
        //    printGolField(gol);
        //    System.out.println("\n ----------------------");
        //    char[][] feld3 = erstelleFeld(11);
        //    // cells will be set dead after t/2
        //    char[][] gol3 = gameOfLife2(feld3, 11);
        //    printGolField(gol3);
        char[][] feld = erstelleFeld(11);
        printGolField(feld);
    }
}
