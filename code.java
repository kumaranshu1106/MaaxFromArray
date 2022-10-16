
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of element you want to store: ");
int n = sc.nextInt();

 System.out.println("Enter element for Array: ");
for(int i=0; i<n; i++){
array[i]=sc.nextInt();
}
System.out.println("Element of array are: ");
for(int i=0;i<n;i++){
    System.out.println(array[i]);
}
System.out.print("maximum among the enterd elememrnts is: "+ max(array));

    }
}
