public class firstOccurance {

    public static int findFirstOccurance(int arr[], int tar, int index) {

        if (index == arr.length) {
            return -1;
        }
        int cureentIndex = findFirstOccurance(arr, tar, index + 1);
        if (arr[index] == tar) {
            cureentIndex = index;
        } 
        return cureentIndex;

    }

    public static int findLastOccurance(int arr[],int tar,int index){
        if (index == arr.length) {
            return -1;
        }
        int curent=0;
        if (arr[index] == tar) {
            curent = index;
        } 
        findLastOccurance(arr,tar,index+1);
        return curent;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 7, 8, 9, 7, 5, 4 };
        int tar = 7;
        int index = 0;
        // System.out.println(findFirstOccurance(arr, tar, index));
        System.out.println(findLastOccurance(arr, tar, index));
        ;

    }
}
