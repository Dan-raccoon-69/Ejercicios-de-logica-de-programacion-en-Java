public class Leet {
    public static void main(String[] args) throws Exception {
        String cadena = "Hola";
        String cadena2 = "Leet";
        String cadena3 = "Hola padrino";
        String cadena4 = "Ludwing";
        /* 
        Encriptador e1 = new Encriptador(cadena3);
        e1.transformarAlenguajeHacker();
        System.out.println("Encriptada: " + e1.transformarAlenguajeHacker());
        
        Encriptador e2 = new Encriptador(cadena3);
        */
        //System.out.println("Desencriptada: " + e2.desencriptar("#014 |*4)121^/0"));
        // #014 |*4)I21^/0
        // #014
    }

    public static String transformarAlenguajeHacker(String cadena) {
        System.out.println();
        String a = "4", b = "I3", c = "[", d = ")", e = "3", f = "|=", g = "&", h = "#", i = "1", j = ",_|", k = ">|",
                l = "1", m = "/\\/\\", n = "^/", o = "0", p = "|*", q = "(_,)", r = "I2", s = "5", t = "7", u = "(_)",
                v = "\\/",
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

    public String desencriptar(String cadena) {
        System.out.println();
        String cuatro = "a", corcheteAbierto = "c", parentesisCerrado = "d", tres = "e", ampersab = "g",
                numeral = "h", uno = "i", uno2 = "l", cero = "o", p = "|*",
                cinco = "s", siete = "t", jota = "y", dos = "z";
        cadena = cadena.toLowerCase();
        String[] stringArray = cadena.split("");

        for (String string : stringArray) {
            switch (string) {
                case "4":
                    cadena = cadena.replace("4", cuatro);
                    break;
                case "[":
                    cadena = cadena.replace("[", corcheteAbierto);
                    break;
                case ")":
                    cadena = cadena.replace(")", parentesisCerrado);
                    break;
                case "3":
                    cadena = cadena.replace("3", tres);
                    break;
                case "&":
                    cadena = cadena.replace("&", ampersab);
                    break;
                case "#":
                    cadena = cadena.replace("#", numeral);
                    break;
                case "1":
                    cadena = cadena.replace("1", uno);
                    break;
                case "0":
                    cadena = cadena.replace("0", cero);
                    break;
                case "s":
                    cadena = cadena.replace("s", cinco);
                    break;
                case "t":
                    cadena = cadena.replace("t", siete);
                    break;
                case "y":
                    cadena = cadena.replace("y", jota);
                    break;
                case "z":
                    cadena = cadena.replace("z", dos);
                    break;
                default:
                    break;
            }
        }
        if (cadena.contains("i3"))
            cadena = cadena.replaceAll("i3", "b");
        if (cadena.contains("|*"))
            cadena = cadena.replace("|*", "p");
        if (cadena.contains("|="))
            cadena = cadena.replaceAll("|=", "f");
        if (cadena.contains(",_|"))
            cadena = cadena.replaceAll(",_|", "j");
        if (cadena.contains(">|"))
            cadena = cadena.replaceAll(">|", "k");
        if (cadena.contains("|*"))
            cadena = cadena.replace("/\\/\\", "m");
        if (cadena.contains("^/"))
            cadena = cadena.replace("^/", "n");
        if (cadena.contains("(_,)"))
            cadena = cadena.replaceAll("(_,)", "q");
        if (cadena.contains("i2"))
            cadena = cadena.replaceAll("i2", "r");
        if (cadena.contains("(_)"))
            cadena = cadena.replaceAll("(_)", "u");
        if (cadena.contains("\\\\/"))
            cadena = cadena.replaceAll("\\\\/", "v");
        if (cadena.contains("\\\\/\\\\/"))
            cadena = cadena.replaceAll("\\\\/\\\\/", "w");
        if (cadena.contains("><"))
            cadena = cadena.replaceAll("><", "x");
        if (cadena.contains("(_)"))
            cadena = cadena.replaceAll("(_)", "u");
        if (cadena.contains("\\\\/"))
            cadena = cadena.replaceAll("\\\\/", "v");

        return cadena;
    }
}
