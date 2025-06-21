function insertionSort(arr) {

    let n = arr.length;


    for(let i=1 ; i<n; i++) {
        let key = arr[i];

        let j = i-1;

        while (j>=0 && arr[j]>key) {
            arr[j+1] = arr[j];
            j=j-1;
        }

        arr[j+1] = key;
             

    }
    return arr;
}

let numbers = [5,2,9,1,5,6]
console.log("Original:", numbers);
let sorted = insertionSort(numbers);
console.log("Sorted", sorted)