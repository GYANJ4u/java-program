
    #include <stdio.h>

int main() {
    int a;
    printf("Enter the number of Process :");
    scanf("%d",&a);
    int at[a],wt[a],bt[a],tat[a],ct[a];

    // Enter the Arrival time for processes
    for(int i=0;i<a;i++){
        printf("Enter the Arrival time for Process %d :",i);
        scanf("%d",&at[i]);
    }

    // Enter the Burst time for processes
    for(int i=0;i<a;i++){
        printf("Enter the Burst time for Process %d :",i);
        scanf("%d",&bt[i]);
    }

    // Completion time for process
    for(int i=0;i<a;i++){
        if(i==0){
            printf("Completion time for Process %d : %d \n",i,at[i]+bt[i]);
            ct[i]=at[i]+bt[i];
        }
        else{
            if(at[i]>at[i-1]+bt[i-1]){
                printf("Completion time for Process %d : %d \n",i,at[i]+bt[i]);
                ct[i]=at[i]+bt[i];
            }
            else{
                printf("Completion time for Process %d : %d \n",i,ct[i-1]+bt[i]);
                ct[i]=ct[i-1]+bt[i];
            }
        }
    }

    // Turn Around Time
    for(int i=0;i<a;i++){
        tat[i]=ct[i]-at[i];
    }

    // Waiting time 
    wt[0]=0;
    for(int i=1;i<a;i++){
        wt[i]=tat[i]-bt[i];
    }

    // Average Turn Around Time
    int sum=0;
    for(int i=0;i<a;i++){
        sum+=tat[i];
    }
    printf("Average Turn Around Time : %d \n",sum/a);


    // Average Waiting Time
    sum=0;
    for(int i=0;i<a;i++){
        sum+=wt[i];
    }
    printf("Average Waiting Time : %d \n",sum/a);

    return 0;
}
    

