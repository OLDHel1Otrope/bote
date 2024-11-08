public static int jobSeq(Job[] jobs){
        //the problem is to do a set of jobs in certain way that it maximizes profit, but each job has a deadline,
        //and you can only do one job at a time

        //sort the jobs in decreasing order of profit
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);

        int maxdeadline=0;
        for (Job job : jobs) {
            if (job.deadline > maxdeadline) {
                maxdeadline = job.deadline;
            }
        }

        int[] result=new int[maxdeadline];
        boolean[] slotOccupied=new boolean[maxdeadline];

        int totalProfit=0;

        for(Job job: jobs){
            for (int j = Math.min(job.deadline, maxdeadline) - 1; j >= 0; j--) {
                //we want to do the current job just before its deadline, if we cant, then do before it
                if (!slotOccupied[j]) {
                    result[j] = job.id;
                    slotOccupied[j] = true;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.print("Scheduled Jobs: ");
        for (int i = 0; i < maxdeadline; i++) {
            if (slotOccupied[i]) {
                System.out.print(STR."Job \{result[i]} ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);

        return totalProfit;
    }
