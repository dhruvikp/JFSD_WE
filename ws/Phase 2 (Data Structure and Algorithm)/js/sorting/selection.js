

function selectionSort(arr) {

    let n = arr.length;

    for(let i=0; i<n-1; i++) {

        let minIndex = i;

        for(let j=i+1; j<n; j++) {

            if(arr[j] < arr[minIndex]) {
                minIndex = j;
            }

        }

        if(minIndex != i) {
            let temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }
    return arr;
}

let numbers = [5,2,9,1,5,6]
console.log("Original:", numbers);
let sorted = selectionSort(numbers);
console.log("Sorted", sorted)