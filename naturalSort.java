		public static ArrayList<ArrayList<Integer>> naturalMerge(ArrayList<Integer> x) {
		int temp=x.get(0);
	        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
	        ArrayList<Integer> list1 = new ArrayList<>();
			for(int i=0;i<x.size();i++) {
				if(x.get(i)>=temp) {
					temp=x.get(i);
					list1.add(x.get(i));
				}
				else { 
					listOfLists.add(new ArrayList<>(list1));
					temp=x.get(i);
					list1 = new ArrayList<>();
					list1.add(x.get(i));
				}
			}
			return listOfLists;
		}
		
		public static ArrayList<Integer> Merge(ArrayList<ArrayList<Integer>> arr) {
			int size=arr.size();
			int PointerPosition[]= new int[size];
		    ArrayList<Integer> merged = new ArrayList<>();
			
			while(true) {
				int minval=Integer.MAX_VALUE;
				int bucketmin=-1;
				boolean allEmpty=true;
				for(int p=0;p<size;p++) {
					if(PointerPosition[p]!=arr.get(p).size()&&minval>arr.get(p).get(PointerPosition[p])) {
						minval=arr.get(p).get(PointerPosition[p]);
						bucketmin=p;
						allEmpty = false;
					}				
				}
				if(allEmpty) {
					break;
				}
				merged.add(minval);
				PointerPosition[bucketmin]++;
				//agar ye koi bucket khaali ho gayi to usko remove kardo list se
				if (PointerPosition[bucketmin] == arr.get(bucketmin).size()) {
	                arr.remove(bucketmin);
	                PointerPosition[bucketmin] = 0;
	                size--;
	            }
			}
			return merged;
		}

System.out.println( Merge(naturalMerge(arrayList)));//calling it like this
