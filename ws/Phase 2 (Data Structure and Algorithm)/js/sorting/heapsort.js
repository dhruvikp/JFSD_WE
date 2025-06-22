

function heapSort(arr) {

    const n = arr.length;

    // Step 1: Build Max heap from input array
    for(let i=Math.floor(n/2)-1; i>=0; i--) {
        heapify(arr,n,i);
    }

    // Step 2: Extract elements from the heap
    for(let i=n-1; i>0; i--) {
        [arr[0], arr[i]] = [arr[i], arr[0]]; // Swap root with end
        heapify(arr, i, 0); // Shrink heap 
    }

    return arr;
}


function heapify(arr, n, i) {
    let largest = i;
    const left = 2*i +1;
    const right = 2*i +2;

    if(left < n && arr[left] > arr[largest]) largest = left;
    if(right < n && arr[right]> arr[largest]) largest = right;

    if(largest != i) {
        [arr[i], arr[largest]] = [arr[largest], arr[i]]
        heapify(arr, n, largest);
    }
}


let numbers = [5,2,9,1,6]
console.log("Original:", numbers);
let sorted = heapSort(numbers);
console.log("Sorted", sorted)