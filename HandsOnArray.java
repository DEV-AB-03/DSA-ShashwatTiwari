import java.util.*;
public class HandsOnArray{

  public static void main(String args[])
  {
    // declaration type 1
    int arr[] = new int[10];
    Arrays.fill(arr,-1);
    // declaration type 2
    // int arr[] = {11,22,73,54,89,65,90,17};
      printArray(arr);
    insertionAtBegining(arr,5);
      printArray(arr);
    insertionAtEnd(arr,8);
      printArray(arr);
      insertionAtEnd(arr,8);
        printArray(arr);
    insertionAtMid(arr,9,6);
    printArray(arr);
  }
  static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  static void insertionAtBegining(int arr[],int element)
  {
    int lastIndex = arr.length-1;
    if(arr[lastIndex]!=-1)
    {
      System.out.println("Array is full");
      return;
    }

    if(arr[0]==-1)
    {
      arr[0]=element;
    }
    else
    {
      // shifting logic
      for(int i=lastIndex-1;i>=0;i--)
      {
        arr[i+1]=arr[i];
      }
      arr[0]=element;
    }
  }

  static void insertionAtEnd(int arr[],int element)
  {
    int lastIndex = arr.length-1;
    if(arr[lastIndex]!=-1)
    {
      System.out.println("Array is full");
      return;
    }
    else
    {
        arr[lastIndex]=element;
    }
    }

    static void insertionAtMid(int arr[],int element,int index)
    {
      int lastIndex = arr.length-1;
      if(arr[index]==-1)
      {
        arr[index]=element;
      }
      else if(arr[lastIndex]!=-1)
      {
        System.out.println("Array is full");
        return;
      }
      else
      {
        // shifting logic
        for(int i=lastIndex-1;i>=index;i--)
        {
          arr[i+1]=arr[i];
        }
        arr[index]=element;
      }
    }
  }
