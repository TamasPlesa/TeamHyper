package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
    try {
        StarWars.spaceShips("./ship.txt)");
        StarWars.hangar();
    } catch (Exception e) {
        System.out.println("The droids have rebelled");
    }

    }
}

//Írj egy Urhajo interfészt, ami egy legyorsuljaE metódust tartalmaz. A metódus paramétere egy Urhajo objektum,
// és egy logikai értékkel tér vissza. Legyen egy milyenGyors
//metódusa is, ami nem kér paramétert, és az Urhajo gyorsaságát fogja visszaadni.
//• Írj Hiperhajtomu interfészt, ami egy visszatérés nélküli hiperUgras() metódust tartalmaz
//• Írj egy LazadoGep absztrakt osztályt, ami implementálja az Urhajo interfészt.
//– Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpontos sebesség,
// és egy logikai meghibasodhatE.
//– Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat.
// Legyen egy public elkapjaAVonosugar absztrakt metódusa, ami egy logikai értékkel tér
//vissza. Valósítsd meg továbbá az interfész metódusait. A gyorsaság lekérdezésekor
//add vissza a LazadoGep sebességét. Egy LazadoGep egy másik LazadoGep objektumot akkor tud legyorsulni,
// ha az meghibásodhat, és a gyorsasága kisebb, mint az övé.
//A MilleniumFalcon objektumot csak akkor tudja legyőzni, ha gyorsasága kétszer nagyobb.
//– Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen
//szöveges formára alakítható, kiírva az adattagok értékét.


//Egy minta fájl felépítése az alábbi:
//XWing 4
//MilleniumFalcon 18
