
function bubbleSort(arr) {
    let n = arr.length;

    for(let i=0; i<n-1; i++) {
        for(let j=0; j<n-1; j++) {
            if(arr[j] > arr[j+1]) {
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
    return arr;
}

let numbers = [5,2,9,1,5,6]
console.log("Original:", numbers);
let sorted = bubbleSort(numbers);
console.log("Sorted", sorted)