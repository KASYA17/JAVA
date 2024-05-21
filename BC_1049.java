
    import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            if(a.equals("vertebrado")){
                String b = sc.nextLine();
                if(b.equals("ave")){
                    String c = sc.nextLine();
                    if(c.equals("carnivoro"))
                        System.out.println("aguia");
                    else if(c.equals("onivoro"))
                        System.out.println("pomba");
                }
                if(b.equals("mamifero")){
                    String c = sc.nextLine();
                    if(c.equals("onivoro"))
                        System.out.println("homem");
                    else if(c.equals("herbivoro"))
                        System.out.println("vaca");
                }
            }
            else if(a.equals("invertebrado")){
                String b = sc.nextLine();
                if(b.equals("inseto")){
                    String c = sc.nextLine();
                    if(c.equals("hematofago"))
                        System.out.println("pulga");
                    else if(c.equals("herbivoro"))
                        System.out.println("lagarta");
                }
                if(b.equals("anelideo")){
                    String c = sc.nextLine();
                    if(c.equals("hematofago"))
                        System.out.println("sanguessuga");
                    else if(c.equals("onivoro"))
                        System.out.println("minhoca");
                }
            }
        }
    }