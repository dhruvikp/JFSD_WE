const arr = [1,4,2,7,9]

const target = 17;


function linearSearch (arr, target) {
    for(let i=0; i<arr.length; i++) {
        if(arr[i]==target) return i; // Found at index i
    }

    return -1;
}


function binarySearch(arr, target) {
    let left = 0, right = arr.length-1;
    while(left <= right) {
        const mid = Math.floor((left+right)/2);

        if(arr[mid] === target) return mid;

        else if (arr[mid] < target) left = mid +1;
        else right = mid -1;
    }
    return -1;
}

function exponentialSearch(arr, target) {

    let n = arr.length;

    if(arr[0] === target) return 0;

    let i =1;
    while(i<n && arr[i]<=target) {
        i*=2;
    }

    const start = Math.floor(i/2);
    const end = Math.min(i,n-1);
    const subarray = arr.slice(start, end+1);
    
    const result = binarySearch(subarray, target);

    console.log(result);
    return result === -1 ? -1 : start+result;

}


console.log(linearSearch(arr,7))
console.log(binarySearch(arr,7))
console.log(exponentialSearch(arr,7))
