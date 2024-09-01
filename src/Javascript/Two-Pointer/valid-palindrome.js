function isPalindrome(str){
    let ptr1 = 0;
    let ptr2 = str.length-1;

    while(ptr2>ptr1){
        if(str.charAt(ptr2)!==str.charAt(ptr1))
            return false;

        ptr2--;
        ptr1++;
    }

    return true;
}

console.log(isPalindrome('PAPA'));