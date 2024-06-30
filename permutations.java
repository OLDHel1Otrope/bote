import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
    //return the indexes of occurances of a target element through recursion
    public static ArrayList<Integer> occurances(ArrayList<Integer> arl, int[] arr, int pos, int target) {
        if (pos == arr.length) return arl;
        else if (arr[pos] == target) arl.add(pos);
        return occurances(arl, arr, pos + 1, target);
    }

    //return the list without taking it in argument
    public static ArrayList<Integer> occurances2(int[] arr, int pos, int target){
        ArrayList<Integer> arl=new ArrayList<>();
        if (pos == arr.length) return arl;
        else if (arr[pos] == target) arl.add(pos);
        arl.addAll(occurances2(arr, pos + 1, target));
        return arl;
    }

    public static int RbsRecursion(ArrayList<Integer> a,int l, int r,int key){
        int left=a.get(l);
        int right=a.get(r);
        int mid=l+(r-l)/2;
        int m=a.get(mid);
        if(a.get(mid)==key) return mid;
        else if(left<=m){
            if(key>=left&&key<=m) r=mid-1;
            else l=mid+1;
        }
        else if(key>=m&&key<=right) l=mid+1;
        else r=mid-1;
        return RbsRecursion(a,l,r,key);
    }

    public static void printStars(int x, int y){
        if(x==0&&y==0) return;
        if(y==0) {
            System.out.println();
            printStars(x-1,x-1);
        }
        else {
            System.out.print("* ");
            printStars(x,y-1);
        }
    }

    public static void triangle(int r, int c){
        if(r==0) return;
        if(c<r){
            System.out.print("* ");
            triangle(r,c+1);
        } else{
            System.out.println();
            triangle(r-1,0);
        }
    }

    public static void bubbleSortRecursion(int[]arr, int r, int c){
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSortRecursion(arr,r,c+1);
        }
        else{
            bubbleSortRecursion(arr,r-1,0);
        }
    }

    public static void selectionSortRecursion(int[]arr,int r, int c, int max){
        if(r==0) return;
        if(c==r){
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionSortRecursion(arr,r-1,0,0);
        }
        else {
            if (arr[max] < arr[c]) {
                max = c;
            }
            selectionSortRecursion(arr, r, c + 1, max);
        }
    }

    public static void MergeSort(int []arr,int left, int right){
    //in place sorting
        int mid=left+(right-left)/2;
        if(left<right){
            MergeSort(arr,left,mid);
            MergeSort(arr,mid+1,left);
            merge(arr,left,mid, right);
        }
    }
    public static void merge(int []arr, int start,int mid, int end){
        int s1=start;
        int e1=mid;
        int s2=mid+1;
        int e2=end;
        int []merged=new int[end-start+1];
        int count=0;

        while(s1<=e1&&s2<=e2){

            if(arr[s1]>=arr[s2]){
                merged[count++]=arr[s2++];
            }
            else{
                merged[count++]=arr[s1++];
            }
        }
        while(s1<=e1){
            merged[count++]=arr[s1++];
        }
        while(s2<=e2){
            merged[count++]=arr[s2++];
        }
        count=0;
        for(int i=start;i<=end;i++){
            arr[i]=merged[count++];
        }

    }

    public static int[] mergeSort(int[] arr){
        //this creates new array object every time mergeSort is performed
        //at each level, n elements are being merged, i.e. n comparisons are being made, and there are log2n levels
        //complexity = O(nlog2n)
        if (arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge2(left,right);
    }
    private static int[] merge2(int []first, int [] second){
        int a=0;
        int as= first.length;
        int b=0;
        int bs=second.length;
        int[] result =new int[first.length+second.length];
        int i=0;
        while(a<as&&b<bs){
            if(first[a]<=second[b]){
                result[i++]=first[a++];
            }
            else{
                result[i++]=second[b++];
            }
        }
        while(a<as){
            result[i++]=first[a++];
        }
        while(b<bs){
            result[i++]=second[b++];
        }

        return result;
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        int s=lo;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while(s<=e){
            //if it is already sored then it won't swap again
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //now my pivot is at the correct position
        quickSort(arr,lo,e);
        quickSort(arr,s,hi);
    }

    public static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        //ek baar ch character ko select kiya, ek baar reject kiya, ye karte karte saare combinations ban jayenge
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    public static ArrayList <String> stringSubsets(String p,String up){
        //the pattern of taking some elements and removing some elements : subset pattern
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList <String> left=stringSubsets(p+ch,up.substring(1));
        ArrayList<String> right=stringSubsets(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static ArrayList <String> stringSubsetsAscii(String p,String up){
        //the pattern of taking some elements and removing some elements : subset pattern
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList <String> left=stringSubsetsAscii(p+ch,up.substring(1));
        ArrayList<String> mid=stringSubsetsAscii(p,up.substring(1));
        ArrayList<String> right=stringSubsetsAscii(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(mid);
        return left;
    }

    public static List<List<Integer>> subSetsIteration(int[] arr){
        //put all the subsets in the list, using iteration
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>>  subSetsDuplicateElements(int[] arr){
//        if(arr==null) return new ArrayList<>();
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i: arr){
            int x=outer.size();
            for(int j=0;j<x;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j));
                if(!inner.contains(i)){
                    inner.add(i);
                }
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void permuteString(ArrayList<Character> possibility, ArrayList<ArrayList<Character>> result, String source){
        if (possibility.size() == source.length()) {
//            System.out.println(possibility.toString());
            result.add(new ArrayList<>(possibility)); // Add a copy of tempList to the result
        } else {
            for (int i = 0; i < source.length(); i++) {
                if (possibility.contains(source.charAt(i))) continue; // Element already exists, skip
                possibility.add(source.charAt(i));
                permuteString(possibility,result,source);
                possibility.removeLast();// Remove last element (backtrack)
            }
        }
    }

    static void permutationsPrint(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            permutationsPrint(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
        //if you just want to return the number of permutations return 1 in the base condition
        //initialize count before the loop
        //count+= permutationList(...)
        //return count
    }

    public static void main(String[] args) {

//        ArrayList<Integer> arl = new ArrayList<>();
//        int[] a = {4,6,4};
//        System.out.println(occurances(arl, a, 0, 4));
//        int[]b={3,4,5,6,4,5,6,3,6,6,6};
//        System.out.println(occurances2( b, 0, 6));
//
//        int att[]={70,80,87,100,1,4,5,6,8,12,32,54,65};
//        Integer[] integerArray = Arrays.stream(att).boxed().toArray(Integer[]::new);
//        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(integerArray));
//        System.out.println(Rbs(a,0,a.size()-1,65));
//        printStars(4,4);
//        triangle(4,0);
//        bubbleSortRecursion(a,a.length-1,0);
//        selectionSortRecursion(a,a.length,0,0);
//        MergeSort(a,0,a.length-1);
//        quickSort(a,0,a.length-1);
//        for (int j : a) {
//            System.out.print(j+" ");
//        }
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        subSeq("","aezkl");
//        ArrayList<String> ar2=stringSubsetsAscii("","helio");
//        System.out.println(ar2);
//        List<List<Integer>> k=subSetsIteration(a);

//        char ch='Z';
//        System.out.println(subSetsDuplicateElements(a));

//        ArrayList<ArrayList<Character>> x=new ArrayList<>();
//        permuteString(new ArrayList<Character>(),x,"aesf");
//        System.out.println(x.toString());
//        for(ArrayList<Character> g:x){
//            System.out.println(g.toString());
//            System.out.println();
//        }

//        permutationsPrint("","aezkm");

//        System.out.println(permutationList("","helio"));
    }

}
