public class Leet {
    public static void main(String[] args) throws Exception {
        System.out.println(transformarAlenguajeHacker("Leet"));
        System.out.println(transformarAlenguajeHacker("Hola padrino"));
        System.out.println(transformarAlenguajeHacker("Lucas"));
        System.out.println(transformarAlenguajeHacker("Ludwing"));
    }

    public static String transformarAlenguajeHacker(String cadena) {
        System.out.println();
        String a = "4", b = "I3", c = "[", d = ")", e = "3", f = "|=", g = "&", h = "#", i = "1", j = ",_|", k = ">|",
        l = "1", m = "/\\/\\", n = "^/", o = "0", p = "|*", q = "(_,)", r = "I2", s = "5", t = "7", u = "(_)", v = "\\/",
        w = "\\/\\/", x = "><", y = "j", z = "2";
        cadena = cadena.toLowerCase();
        String[] stringArray = cadena.split("");
        for (String string : stringArray) {
            switch (string) {
                case "a":
                    cadena = cadena.replace("a", a);
                    break;
                case "b":
                    cadena = cadena.replace("b", b);
                    break;   
                case "c":
                    cadena = cadena.replace("c", c);
                    break;
                case "d":
                    cadena = cadena.replace("d", d);
                    break; 
                case "e":
                    cadena = cadena.replace("e", e);
                    break;
                case "f":
                    cadena = cadena.replace("f", f);
                    break; 
                case "g":
                    cadena = cadena.replace("g", g);
                    break;
                case "h":
                    cadena = cadena.replace("h", h);
                    break;   
                case "i":
                    cadena = cadena.replace("i", i);
                    break;
                case "j":
                    cadena = cadena.replace("j", j);
                    break; 
                case "k":
                    cadena = cadena.replace("k", k);
                    break;
                case "l":
                    cadena = cadena.replace("l", l);
                    break; 
                case "m":
                    cadena = cadena.replace("m", m);
                    break;
                case "n":
                    cadena = cadena.replace("n", n);
                    break;   
                case "o":
                    cadena = cadena.replace("o", o);
                    break;
                case "p":
                    cadena = cadena.replace("p", p);
                    break; 
                case "q":
                    cadena = cadena.replace("q", q);
                    break;
                case "r":
                    cadena = cadena.replace("r", r);
                    break; 
                case "s":
                    cadena = cadena.replace("s", s);
                    break;
                case "t":
                    cadena = cadena.replace("t", t);
                    break;   
                case "u":
                    cadena = cadena.replace("u", u);
                    break;
                case "v":
                    cadena = cadena.replace("v", v);
                    break; 
                case "w":
                    cadena = cadena.replace("w", w);
                    break;
                case "x":
                    cadena = cadena.replace("x", x);
                    break; 
                case "y":
                    cadena = cadena.replace("y", y);
                    break;
                case "z":
                    cadena = cadena.replace("z", z);
                    break; 
                default:
                    break;
            }
        }
        return cadena;
    }
}
