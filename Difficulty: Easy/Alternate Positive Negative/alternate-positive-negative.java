class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
         ArrayList<Integer> nev=new ArrayList<>();
    
          
          for(int i=0;i<arr.size();i++){
              if(arr.get(i)>=0){
                  pos.add(arr.get(i));
              }else{
                  nev.add(arr.get(i));
              }
          }
        arr.clear();

        int i = 0, j = 0;

        while(i < pos.size() && j < nev.size()){
            arr.add(pos.get(i++));
            arr.add(nev.get(j++));
        }

        while(i < pos.size()){
            arr.add(pos.get(i++));
        }

        while(j < nev.size()){
            arr.add(nev.get(j++));
        }
    }
}