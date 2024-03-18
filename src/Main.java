public class Main {
    public static void main(String[] args) {


        // Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        System.out.println("---------1 uzd------------");

        for (int i = 0; i < 11; i++) {
            System.out.println("labas");
        }
        System.out.println("-----------2uzd----------");

        //  Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------3uzd----------");

        //Sukurkite masyvą iš dešimties augalų pavadinimų.

        String[] plants = new String[10];
        plants[0] = "Papartis";
        plants[1] = "Tuja";
        plants[2] = "Klevas";
        plants[3] = "Maumedis";
        plants[4] = "Gluosnis";
        plants[5] = "Guoba";
        plants[6] = "Uosis";
        plants[7] = "Serbentas";
        plants[8] = "Agrastas";
        plants[9] = "Alksnis";


        System.out.println("-----------4uzd----------");
        //  Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        for (int j = 0; j < plants.length; j++) {
            System.out.println(plants[j]);
        }
        System.out.println("-----------5uzd----------");
// Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).
        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }
        System.out.println("-----------6uzd----------");
        //    Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);
        for (int k = 10; k <= 50; k += 2) {
            System.out.println(k);
        }
        System.out.println("----------7uzd----------");
        //Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos jo
        // nespausdinkite. ( naudokite continue.) (atspausdinti visus porinus skaičius,
        // išskyrus tuos kurie dalinasi iš 10 be liekanos)


        for (int i = 10; i <= 50; i += 2) {
            if (i % 2 == 0) {
                if (i % 10 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
        System.out.println("----------8uzd----------");
        int poriniuSkaiciuKiekis = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                poriniuSkaiciuKiekis++;
            }
        }
        System.out.println("Porinių skaičių kiekis nuo 0 iki 20: " + poriniuSkaiciuKiekis);

        System.out.println("----------9uzd----------");
        // Kintamieji trumpesniems ir ilgesniems žodžiams skaičiuoti
        int shorterWordsCount = 0;
        int longerWordsCount = 0;

        // Ciklas, kuris eina per visus masyvo elementus
        for (String plant : plants) {
            // Tikriname žodžio ilgį
            int wordLength = plant.length();
            if (wordLength < 5) {
                // Žodis trumpesnis nei 5 simboliai
                shorterWordsCount++;
            } else if (wordLength > 7) {
                // Žodis ilgesnis nei 7 simboliai
                longerWordsCount++;
            }
        }
        System.out.println("Trumpesnių nei 5 simboliai žodžių skaičius: " + shorterWordsCount);
        System.out.println("Ilgesnių nei 7 simboliai žodžių skaičius: " + longerWordsCount);

        System.out.println("----------10uzd----------");

//Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai.
// (tarp 5 ir 10 simbolių ilgio)

        // Kintamieji trumpesniems ir ilgesniems žodžiams skaičiuoti
        int shorterWordsCount1 = 0;
        int longerWordsCount1 = 0;

        // Ciklas, kuris eina per visus masyvo elementus
        for (String plant : plants) {
            // Tikriname žodžio ilgį
            int wordLength = plant.length();
            if (wordLength > 5 && wordLength < 10) {
                // Žodis ilgesnis nei 5 simboliai
                shorterWordsCount1++;
            }
        }
        System.out.println("> 5, bet < 10 simboliu žodžių skaičius masyve yra: " + shorterWordsCount1);

        System.out.println("----------S_1uzd----------");
//Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir suskaičiuokite
// kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

        int didesniuSkaiciuKiekis = 0;
        for (int i = 0; i < 300; i++) {
            int atsitiktinisSkaicius = (int) (Math.random() * 301);
            if (atsitiktinisSkaicius > 150) {
                didesniuSkaiciuKiekis++;
            }
            if (atsitiktinisSkaicius > 275) {
                System.out.print("[" + atsitiktinisSkaicius + "] ");
            } else {
                System.out.print(atsitiktinisSkaicius + " ");
            }
        }
        System.out.println("\nDidesnių nei 150 skaičių kiekis: " + didesniuSkaiciuKiekis);

        System.out.println("--- S_2uzd----");
        //Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
        // Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.

        boolean first = true;
        for (int i = 77; i <= 3000; i += 77) {
            if (i % 77 == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                first = false;
                System.out.print(i);
            }
        }
        System.out.println();

        System.out.println("--- S_3 uzd----");

        //Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *

        final int dydis = 25;
        char simbolis = '*';
        char istrizaine = '@';

        // Piešiame kvadratą
        for (int i = 0; i < dydis; i++) {
            for (int j = 0; j < dydis; j++) {
                //   System.out.print(simbolis);
            }
            // System.out.println();
        }

        // Piešiame istrižainę
        for (int i = 0; i < dydis; i++) {
            for (int j = 0; j < dydis; j++) {
                if (i == j || i + j == dydis - 1) {
                    System.out.print(istrizaine);
                } else {
                    System.out.print(simbolis);
                }
            }
            System.out.println();
        }
        System.out.println("-- S_5uzd ---");

        // I scenarijus: Stabdome iškritus herbui

        System.out.println("-s_6a uzd---");
        metimasIkiHerbo();
        System.out.println("-s_6b uzd---");
        // II scenarijus: Stabdome tris kartus iškritus herbui
        metimasTrisKartusHerbas();
        System.out.println("-s_6c uzd---");
        // III scenarijus: Stabdome tris kartus iš eilės iškritus herbui
        metimasTrisKartusEileHerbas();


        //  rombas();
        System.out.println("--- S_7 uzd -----");
        //  System.out.println( "abc");
        int dydis1 = 21;
        for (int i = 0; i < dydis1; i++) {
            // Print leading spaces for top half
            for (int j = 0; j < dydis1 - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks for top half
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print bottom half (reverse order)
        for (int i = dydis1 - 2; i >= 0; i--) {
            // Print leading spaces for bottom half
            for (int j = 0; j < dydis1 - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks for bottom half
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--- S_8 uzd----");


    }

    private static void metimasIkiHerbo() {
        System.out.println("Metimas iki herbo:");
        while (true) {
            double tikimybe = Math.random();
            rezultatas(tikimybe);
            if (tikimybe < 0.5) {
                break;
            }
        }
        System.out.println();
    }

    private static void metimasTrisKartusHerbas() {
        System.out.println("Metimas tris kartus herbas:");
        int herbuSkaicius = 0;
        while (herbuSkaicius < 3) {
            double tikimybe = Math.random();
            rezultatas(tikimybe);
            if (tikimybe < 0.5) {
                herbuSkaicius++;
            }
        }
        System.out.println();
    }

    private static void metimasTrisKartusEileHerbas() {
        System.out.println("Metimas tris kartus iš eilės herbas:");
        int herbuSkaicius = 0;
        boolean herbasEile = false;
        while (!herbasEile) {
            double tikimybe = Math.random();
            rezultatas(tikimybe);
            if (tikimybe < 0.5) {
                herbuSkaicius++;
                if (herbuSkaicius == 3) {
                    herbasEile = true;
                }
            } else {
                herbuSkaicius = 0;
            }
        }
        System.out.println();
    }

    private static void rezultatas(double tikimybe) {
        if (tikimybe < 0.5) {
            System.out.print("H ");
        } else {
            System.out.print("S ");
        }

    }

}

 //   private  static void rombas(){
     //   System.out.println("rombo vidus");




