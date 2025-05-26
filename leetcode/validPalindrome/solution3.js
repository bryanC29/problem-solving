/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    
    const recursivePalindrome = (s, i) => {
        if(i >= s.length/2) return true;

        if(s[i] != s[s.length-1-i]) {
            return false;
        }

        return recursivePalindrome(s, i+1);
    }

    return recursivePalindrome(s, 0);
};