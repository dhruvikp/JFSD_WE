

function countSort(arr) {
    if(arr.length === 0 ) return arr;

    // Step 1: Find max value
    const max = Math.max(...arr);

    // Step 2: Create count array
    const count = Array(max+1).fill(0);

    // Step 3: Count each number's frequency
    for(let num of arr) {
        count[num]++;
    }

    //Step 4: Build result sorted array
    const sorted = [];
    for(let i=0; i<count.length; i++) {
        while(count[i]>0) {
            sorted.push(i);
            count[i]--;
        }
    }

    return sorted;
}



let numbers = [5,2,9,1,6]
console.log("Original:", numbers);
let sorted = countSort(numbers);
console.log("Sorted", sorted)