



public class Esercizio4 {
public static void main(String[] args){
double[] seq = new double[args.length];
for (int i=0; i<seq.length; i++)
seq[i] = Double.parseDouble(args[i]);
double somma, media, min, max;
min = max = somma = seq[0];
for (int i=1; i<seq.length; i++){
somma += seq[i];
if (seq[i] < min)
min = seq[i];
if (seq[i] > max)
max = seq[i];
}
media = somma/seq.length;
System.out.println("Somma = " + somma);
System.out.println("Media = " + media);
System.out.println("Min = " + min);
System.out.println("Max = " + max);
}

}

	

