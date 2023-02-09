import javax.swing.JOptionPane;

public class Cuestionario {
    int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0, r9 = 0, r10 = 0, r11 = 0, total;
    String nombre;
    float temperatura;

    public void cuestions() {

        nombre = JOptionPane.showInputDialog("                     BIENVENIDO\n"
                + "Ingresa tu nombre: ");
        int n = JOptionPane.showConfirmDialog(null, "¿Cuentas con tu pruba de covid?",
                "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            r1 = 1;
            JOptionPane.showInputDialog(null, "Selecciona la prueba que utilizaste",
                    "Ingreso a la ESIME unidad culhuacan", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "COVID-19 PCR", "PRUEBA RÁPIDA ANTÍGENO\n"
                            + "SARS-COV-2 (COVID-19)", "COVID-19 Serológica IgG e IgM", "Anticuerpos anti-S", "Otra" },
                    "Seleccione");
        } else if (n == JOptionPane.NO_OPTION) {
            r1 = 0;
        }
        // 2da pregunta
        int n1 = JOptionPane.showConfirmDialog(null, "¿Cuentas con la vacuna puesta?",
                "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n1 == JOptionPane.YES_OPTION) {
            r2 = 1;
            Object color = JOptionPane.showInputDialog(null, "Selecciona la vacuna que te aplicaron",
                    "Ingreso a la ESIME unidad culhuacan", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Pfizer y BioNTech", "Oxford-AstraZeneca\n"
                            + "Sputnik V", "Sinovac(CoronoVac)", "CanSinoBIO", "Moderna (ARNm-1273)",
                            "Curevac (CVnCoV)", "Avimex (Patria)", "Otra" },
                    "Ingreso a la ESIME unidad culhuacan");
        } else if (n1 == JOptionPane.NO_OPTION) {
            r2 = 0;
        }
        // 3er pregunta
        int n2 = JOptionPane.showConfirmDialog(null, "¿Portaras el cubreboca dentro de la institucion?",
                "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n2 == JOptionPane.YES_OPTION) {
            r3 = 1;
        } else if (n2 == JOptionPane.NO_OPTION) {
            r3 = 0;
        }
        // 4ta pregunta
        int n3 = JOptionPane.showConfirmDialog(null, "En caso de presentar algun síntoma. \n¿Estas dispuesto"
                + " a recibir ayuda del personal de enfermeria?", "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n3 == JOptionPane.YES_OPTION) {
            r4 = 1;
        } else if (n3 == JOptionPane.NO_OPTION) {
            r4 = 0;
        }

        // 5ta pregunta
        int n4 = JOptionPane.showConfirmDialog(null, "Antes de entrar a la institucion. \n¿Permitiras que te tomen"
                + " la temperatura y recibir amablemente el gel antibacterial?", "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n4 == JOptionPane.YES_OPTION) {
            r5 = 1;
        } else if (n3 == JOptionPane.NO_OPTION) {
            r5 = 0;
        }
        // 6ta pregunta
        int n5 = JOptionPane.showConfirmDialog(null, "¿Cuentas con servicio medico?",
                "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n5 == JOptionPane.YES_OPTION) {
            r6 = 1;
            Object color = JOptionPane.showInputDialog(null, "Selecciona tu seguro medico",
                    "Ingreso a la ESIME unidad culhuacan", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "IMSS", "ISSSTE/ISSSTE Estatal", "Seguro Popular",
                            "SSEelS(IPN)", "Otra" },
                    "Ingreso a la ESIME unidad culhuacan");
        } else if (n5 == JOptionPane.NO_OPTION) {
            r6 = 0;
        }
        // 7ma pregunta
        int n6 = JOptionPane.showConfirmDialog(null, "¿Padeces de alguna enfermedad a la cual puedes ser vulnerable"
                + " a contagiarte de COVID-19?", "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n6 == JOptionPane.YES_OPTION) {
            r7 = 0;
            Object color = JOptionPane.showInputDialog(null, "Selecciona el padecimiento",
                    "Ingreso a la ESIME unidad culhuacan", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Asma a largo plazo(cronica), enfermedad pulmonar Obstructiva Crónica (EPOC)",
                            "Enfermedad cardíaca crónica", "Enfermedad renal,Parkinson", "Diabetes",
                            "Un sistema inmunológico débil,VIH,SIDA",
                            "Un índice de masa corporal (IMC) de 40 o más (tiene sobrepeso grave)",
                            "Otro" },
                    "Ingreso a la ESIME unidad culhuacan");
        } else if (n6 == JOptionPane.NO_OPTION) {
            r7 = 1;
        }

        // 8va pregunta
        int n7 = JOptionPane.showConfirmDialog(null,
                "¿Tardas mas de 30 minutos en transladarte de tu casa a la ESIME culhuacan?",
                "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n7 == JOptionPane.YES_OPTION) {
            r8 = 0;
            Object color = JOptionPane.showInputDialog(null, "Selecciona el rango de tiempo de tu traslado",
                    "Ingreso a la ESIME unidad culhuacan", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "30 min a 1 hora", "1 hora a 2 horas", "2 horas a 3 horas", "Mas de 3 horas" },
                    "Ingreso a la ESIME unidad culhuacan");
        } else if (n7 == JOptionPane.NO_OPTION) {
            r8 = 1;
        }
        // 9na pregunta
        int n8 = JOptionPane.showConfirmDialog(null,
                " Alumno: " + nombre
                        + "\n ¿Cuentas con los requerimientos económicos para el regreso a clases presenciales?",
                "Ingreso a la ESIME unidad culhuacan",
                JOptionPane.YES_NO_OPTION);
        if (n8 == JOptionPane.YES_OPTION) {
            r9 = 1;
        } else if (n8 == JOptionPane.NO_OPTION) {
            r9 = 0;
        }
        // 10ma pregunta
        int n9 = JOptionPane.showConfirmDialog(null, "¿Tus familiares ya fueron vacunados contra el COVID-19?",
                "Ingreso a la ESIME unidad culhuacan", JOptionPane.YES_NO_OPTION);
        if (n9 == JOptionPane.YES_OPTION) {
            r10 = 1;
        } else if (n9 == JOptionPane.NO_OPTION) {
            r10 = 0;
        }
        // 11va pregunta
        do {
            temperatura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de tu temperatura"));
            if (temperatura < 35.2 || temperatura > 39) {
                JOptionPane.showMessageDialog(null, "La temperatura que estas ingresando no es posible.\n"
                        + "Vuelve a ingresarla de nuevo.");
            }
        } while (temperatura < 35.2 || temperatura > 39);
        if (temperatura > 35.7) {
            r11 = 0;
        } else {
            r11 = 1;
        }
    }

    public void resultado() {
        // suma
        total = r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9 + r10 + r11;
        if (total == 11) {
            JOptionPane.showMessageDialog(null,
                    " Estimado alumno: " + nombre + "\n Debido a que tienes todos los requisitos y condiciones.\n"
                            + " Te hacemos saber que puedes ingresar a la ESIME unidad Culhuacan"
                            + "\n siempre y cuando sigas tomando todas las medidas de prevencion."
                            + "\n                                               BIENVENIDO!!!");
        } else {
            JOptionPane.showMessageDialog(null, " Estimado alumno: " + nombre
                    + "\n No tienes todos los requisitos o condiciones para ingresar a la \n ESIME culhuacan.");
        }
        if (r1 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar,"
                    + " no tienes tu prueba negativa de COVID-19.");
        }
        if (r2 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar,"
                    + " no te han aplicado la vacuna del COVID-19.");
        }
        if (r3 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar,"
                    + " no aceptaste colocarte el cubrebocas dentro de la institucion.");
        }
        if (r4 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar,"
                    + " no estas de acuerdo al recibir la ayuda en caso de sistomas.");
        }
        if (r5 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar, "
                    + " no estas de acuerdo con tomarte la temperatura o con usar el gel antibacterial.");
        }
        if (r6 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar, "
                    + " es necesario tener un servicio medico,\n sin embargo la ESIME culhuacan "
                    + " ofrece un servicio medico.\n"
                    + " Mayor informacion:\n"
                    + " http://sseeis.esimecu.ipn.mx/sseis/servicio-medico");
        }
        if (r7 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar, "
                    + " tu padecimiento te vuelve muy vulnerable a contraer COVID-19"
                    + "\n pones en riesgo la salud de tus compañeros y tu salud.");
        }
        if (r8 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no te recomendamos ingresar.\n"
                    + " El gran tiempo de trayecto de tu casa a la ESIME culhuacan"
                    + "\n te vuelve vulnerable a contraer COVID-19"
                    + "\n pones en riesgo la salud de tus compañeros la de tus seres queridos y la tuya.");
        }
        if (r9 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no te recomendamos ingresar.\n"
                    + " Segun tu respuesta, no tienes los requerimientos economicos.");
        }
        if (r10 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no te recomendamos ingresar.\n"
                    + " Segun tu respuesta, No toda tu familia a sido vacunada."
                    + "\n Son vulnerables a contraer COVID-19");
        }
        if (r11 == 0) {
            JOptionPane.showMessageDialog(null, "Por el momento no puedes ingresar.\n"
                    + "Tu temperatura es mayor a 35.7 grados.");
        }
    }

    public void recomedaciones() {
        // recomendaciones
        JOptionPane.showMessageDialog(null, "Mayor informacion sobre:\n"
                + "*Prevencion\n"
                + "*Vacunas contra el COVID-19\n"
                + "*Pruebas COVID-19\n"
                + "En:\n"
                + "https://coronavirus.gob.mx/");
    }

}
