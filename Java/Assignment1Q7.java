package com.practicejava;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        boolean test= false;
        for (int i : arr) {
            if (i == toCheckValue) {
                test = true;
                break;
            }

        }


        return (test);
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int valueToCheck = 19;
        SearchArray obj1 = new SearchArray();
        System.out.println(obj1.searchArray(arr, valueToCheck));

    }
}