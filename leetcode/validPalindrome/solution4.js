/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.replace(/[^a-zA-Z0-9]/g, '');
    
    let l=0, r=s.length-1

    while(l<r) {
        if(s[l].toLowerCase()!==s[r].toLowerCase())
            return false
        l++
        r--
    }

    return true
};