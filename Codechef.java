// public class Code codechef {
    class Codechef{
        public static void main(String[] args) throws java.lang.Exception{

            Scanner sc = new Scanner(System.in);

            int v = sc.nextInt();
            int e = sc.nextInt();

            ArrayList<Integer>[] adj = newArrayList[v+1];

            for(int i = 0; i<=v; i++){
                adj[i] = newArrayList<> ();
            }

           
             for(int i = 0; i<2; i++){
                int v1 = sc.nextInt();
                int e1 = sc.nextInt();


                adj[v1].add(e1);
                adj(e1).add(v1);
             }
        }
    }