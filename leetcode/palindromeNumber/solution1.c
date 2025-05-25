bool isPalindrome(int x) {
    int y = x;
    double num = 0;
    while (x > 0) {
        num = (num*10) + (x%10);
        x = x/10;
    }
    if(y == num) {
        return true;
    } else {
        return false;
    }
}