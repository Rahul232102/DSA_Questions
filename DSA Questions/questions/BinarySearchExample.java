package questions;

public class BinarySearchExample {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == target)
            {
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Not Found");
    }
}
