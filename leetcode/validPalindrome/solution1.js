/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    s2 = '';

    for(let i = s.length - 1; i >= 0; i--) {
        s2 = s2 + s[i];
    }

    if(s === s2) {
        return true;
    } else {
        return false;
    }
};