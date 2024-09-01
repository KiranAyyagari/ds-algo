function findTriplets(arr, target){
    arr.sort()
    
    for(let current=0;current<=arr.length-2;current++){
        let low = current+1;
        let high = arr.length-1;
        while(low<high){
            let sum = arr[low]+arr[high]+arr[current];
            if(sum === target){
                return true;
            }
            if(sum < target)
                low++;
            else if(sum > target)
                high--;
        }
        
    }

    return false;
}

console.log(findTriplets(
    [3,7,1,2,8,4,5], 21));
