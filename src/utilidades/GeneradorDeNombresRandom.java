package utilidades;

public class GeneradorDeNombresRandom {

  private static String[] nombres = { 
      "Aarón",
      "Abril",
      "Adam",
      "Adara",
      "Adrián",
      "Adriana",
      "África",
      "Aina",
      "Ainara",
      "Ainhoa",
      "Aitana",
      "Aitor",
      "Alan",
      "Alba",
      "Alberto",
      "Aleix",
      "Alejandra",
      "Alejandro",
      "Álex",
      "Alicia",
      "Alma",
      "Alonso",
      "Álvaro",
      "Amaia",
      "Amir",
      "Amira",
      "Ana",
      "Anas",
      "Ander",
      "Andrea",
      "Andrés",
      "Ángel",
      "Ángela",
      "Antonio",
      "Ariadna",
      "Arlet",
      "Arnau",
      "Aroa",
      "Asier",
      "Aurora",
      "Axel",
      "Azahara",
      "Berta",
      "Biel",
      "Blanca",
      "Bruno",
      "Candela",
      "Carla",
      "Carlos",
      "Carlota",
      "Carmen",
      "Carolina",
      "Cayetana",
      "Celia",
      "Chloe",
      "Clara",
      "Claudia",
      "Cloe",
      "Cristina",
      "Daniel",
      "Daniela",
      "Darío",
      "David",
      "Diana",
      "Diego",
      "Dylan",
      "Elena",
      "Elia",
      "Elías",
      "Elsa",
      "Emma",
      "Enzo",
      "Eric",
      "Erik",
      "Eva",
      "Fabio",
      "Fátima",
      "Fernando",
      "Francisco",
      "Gabriel",
      "Gabriela",
      "Gael",
      "Gala",
      "Gonzalo",
      "Guillermo",
      "Héctor",
      "Helena",
      "Hugo",
      "Ian",
      "Ignacio",
      "Íker",
      "Imran",
      "India",
      "Inés",
      "Irene",
      "Iria",
      "Iris",
      "Isaac",
      "Isabel",
      "Isabella",
      "Ismael",
      "Iván",
      "Izan",
      "Jaime",
      "Jan",
      "Jana",
      "Javier",
      "Jesús",
      "Jimena",
      "Joel",
      "Jon",
      "Jorge",
      "José",
      "Juan",
      "Julen",
      "Julia",
      "Julieta",
      "Laia",
      "Lara",
      "Laura",
      "Leire",
      "Leo",
      "Leyre",
      "Lia",
      "Liam",
      "Lina",
      "Lola",
      "Luca",
      "Lucas",
      "Lucía",
      "Luis",
      "Luka",
      "Luna",
      "Macarena",
      "Malak",
      "Manuel",
      "Manuela",
      "Mar",
      "Mara",
      "Marc",
      "Marco",
      "Marcos",
      "María",
      "Marina",
      "Mario",
      "Marta",
      "Martí",
      "Martín",
      "Martina",
      "Mateo",
      "Matías",
      "Max",
      "Mia",
      "Miguel",
      "Mohamed",
      "Nahia",
      "Naia",
      "Natalia",
      "Neizan",
      "Nerea",
      "Nicolás",
      "Nil",
      "Noa",
      "Noah",
      "Nora",
      "Nour",
      "Nuria",
      "Oliver",
      "Olivia",
      "Ona",
      "Pablo",
      "Pau",
      "Paula",
      "Pedro",
      "Pol",
      "Rafael",
      "Raúl",
      "Rayan",
      "Rocío",
      "Rodrigo",
      "Rubén",
      "Samuel",
      "Santiago",
      "Sara",
      "Saúl",
      "Sergio",
      "Sofía",
      "Teo",
      "Thiago",
      "Triana",
      "Unai",
      "Valentina",
      "Valeria",
      "Vega",
      "Vera",
      "Víctor",
      "Victoria",
      "Yasmín",
      "Youssef",
      "Zoe" 
  };

  public static String GeneradorDeNombresRandom() {
      int numeroRandom = (int) Math.floor(Math.random() * GeneradorDeNombresRandom.nombres.length);
      return GeneradorDeNombresRandom.nombres[numeroRandom];
  }
  
  public static String GeneradorDeNombresRandom(int cantidadDePalabras) {
      String nombreGenerado = "";
      
      for(int i = 0; i < cantidadDePalabras; i++){
        int numeroRandom = (int) Math.floor(Math.random() * GeneradorDeNombresRandom.nombres.length);
        nombreGenerado += GeneradorDeNombresRandom.nombres[numeroRandom] + " ";
      }
      
      return nombreGenerado.trim();
  }
}