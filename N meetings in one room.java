import java.util.*;
class People{
    int start;
    int end;
    int pos;
    People(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
class Main{
    public static void meetings(int start[],int end[],int N){
        People arr[]=new People[N];
        for(int i=0;i<N;i++){
            arr[i]=new People(start[i],end[i],i+1);
        }
        Arrays.sort(arr,new Comparator<People>(){
            public int compare(People a,People b){
                return a.end - b.end;
                
            }
        });
        List<Integer> selectedMeetings = new ArrayList<>();
        selectedMeetings.add(arr[0].pos);
        int freeTime = arr[0].end;

        for (int i = 1; i < N; i++) {
            if (arr[i].start > freeTime) {
                selectedMeetings.add(arr[i].pos);
                freeTime = arr[i].end;
            }
        }

        System.out.println("Maximum number of non-overlapping meetings: " + selectedMeetings.size());
        System.out.println("Meetings selected (positions): " + selectedMeetings);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int start[]=new int[N];
        int end[]=new int[N];
        for (int i = 0; i < N; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
               
        
        meetings(start,end,N);
                
        
    }
}
tc:O(2n+nlogn)
sc:O(3n)