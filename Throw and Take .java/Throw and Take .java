import java.util.*;

import java.lang.*;

import java.io.*;



class Codechef

{static class FastReader 

    { 

        BufferedReader br; 

        StringTokenizer st; 

  

        public FastReader() 

        { 

            br = new BufferedReader(new

                     InputStreamReader(System.in)); 

        } 

  

        String next() 

        { 

            while (st == null || !st.hasMoreElements()) 

            { 

                try

                { 

                    st = new StringTokenizer(br.readLine()); 

                } 

                catch (IOException  e) 

                { 

                    e.printStackTrace(); 

                } 

            } 

            return st.nextToken(); 

        } 

  

        int nextInt() 

        { 

            return Integer.parseInt(next()); 

        } 

  

        long nextLong() 

        { 

            return Long.parseLong(next()); 

        } 

  

        double nextDouble() 

        { 

            return Double.parseDouble(next()); 

        } 

  

        String nextLine() 

        { 

            String str = ""; 

            try

            { 

                str = br.readLine(); 

            } 

            catch (IOException e) 

            { 

                e.printStackTrace(); 

            } 

            return str; 

        } 

    } 

    static int mod =  998244353 ;

    static int N = 300005;

    static long factorial_num_inv[] = new long[N+1];

    static long natual_num_inv[] = new long[N+1];

    static long fact[] = new long[N+1];

    static void InverseofNumber() 

{ 

    natual_num_inv[0] = 1;

    natual_num_inv[1] = 1; 

    for (int i = 2; i <= N; i++) 

        natual_num_inv[i] = natual_num_inv[mod % i] * (mod - mod / i) % mod; 

} 

static void InverseofFactorial() 

{ 

    factorial_num_inv[0] = factorial_num_inv[1] = 1; 

  

    for (int i = 2; i <= N; i++) 

        factorial_num_inv[i] = (natual_num_inv[i] * factorial_num_inv[i - 1]) % mod; 

} 

static long nCrModP(long N, long R) 

{ 

    long ans = ((fact[(int)N] * factorial_num_inv[(int)R]) % mod * factorial_num_inv[(int)(N - R)]) % mod; 

    return ans%mod; 

}

    static boolean prime[];

    static void sieveOfEratosthenes(int n)

    {

        prime = new boolean[n+1];

        

        for (int i = 0; i <= n; i++)

            prime[i] = true;

 

        for (int p = 2; p * p <= n; p++)

        {

            // If prime[p] is not changed, then it is a

            // prime

            if (prime[p] == true)

            {

                // Update all multiples of p

                for (int i = p * p; i <= n; i += p)

                    prime[i] = false;

            }

        }

 

        

    }

   

   static long dp[][][];

	public static void main (String[] args) 

	{

   

    

		FastReader scan = new FastReader();

		PrintWriter pw = new PrintWriter(System.out);

        

               int t =scan.nextInt();

               while(t-->0){

                int n = scan.nextInt();      

                int a[] = new int[n];

                int b[] = new int[n];

                for(int i=0;i<n;i++){

                    a[i] = scan.nextInt();

                }

                for(int i=0;i<n;i++){

                    b[i] = scan.nextInt();

                }

                List<Integer> arr = new ArrayList<>();

                for(int i=n-1;i>=0;i--){

                    if(a[i]%2==1)

                    arr.add(b[i]);

                }

                int m = arr.size();

                if(m==0){

                    pw.println(0);

                }

                else{

                int dp[] = new int[m];

                dp[0] = arr.get(0);

                for(int i=1;i<m;i++){

                    dp[i] = Math.max(dp[i-1],arr.get(i)-dp[i-1]);

                }

                pw.println(dp[m-1]);

                }

                pw.flush();

               }

        }

        

      

       

       

     
   static long gcd(long a,long b){

       if(a==0)

       return b;

       return gcd(b%a,a);

   }

//   static long lcm(long a,long b){

//       return (a/gcd(a,b))*b;

//   }

}



class Pair{

    int x,y;

    Pair(int x,int y){

        this.x = x;

        this.y = y;

       

    }



    

    



class Compar implements Comparator<Pair>{

   public int compare(Pair p1,Pair p2){

       if(p1.y==p2.y)

       return 0;

       else if(p1.y<p2.y)

       return -1;

       else

       return 1;

   }

}

