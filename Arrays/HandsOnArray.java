import java.util.*;
public class HandsOnArray{

  public static void main(String args[])
  {
    // declaration type 1
    int arr[] = new int[10];
    // Arrays.fill(arr,-1);
    // declaration type 2
    // int arr[] = {11,22,73,54,89,65,90,17};

    // traversing the array
    // update
    insertionAtBegining(arr,5);
    insertionAtBegining(arr,6);
    insertionAtBegining(arr,7);
    insertionAtBegining(arr,8);
    insertionAtBegining(arr,9);
    insertionAtMid(arr,9,6);
    insertionAtEnd(arr,8);
    update(arr,3,8);
    // access
    System.out.println(arr[3]);
    traverse(arr);
    deletionAtBegining(arr);
    deletionAtMid(arr,2);
    deletionAtEnd(arr);
  }
  static void traverse(int arr[]){
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  static void deletionAtBegining(int arr[])
  {
    int lastIndex=arr.length-1;
    if(arr.length<=0)
    {
      System.out.println("Array is Empty");
      return;
    }
    // shifting logic
    for(int i=1;i<arr.length;i++)
    {
      arr[i-1] = arr[i];
    }
    arr[lastIndex] = -1;
  }

  static void deletionAtEnd(int arr[])
  {
    int lastIndex=arr.length-1;
    if(arr.length<=0)
    {
      System.out.println("Array is Empty");
      return;
    }
    arr[lastIndex] = -1;
  }

  static void deletionAtMid(int arr[], int index)
  {
    int lastIndex=arr.length-1;
    if(arr.length<=0)
    {
      System.out.println("Array is Empty");
      return;
    }
    // shifting logic
    for(int i=index+1;i<arr.length;i++)
    {
      arr[i-1] = arr[i];
    }
    arr[lastIndex] = -1;
  }

  static void update(int arr[], int index,int val)
  {
    if(arr.length<=0)
    {
      System.out.println("Array is Empty");
      return;
    }
    if(index>=arr.length || index<0)
    {
      System.out.println("Index is incorrect");
      return;
    }
    arr[index] = val;
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
