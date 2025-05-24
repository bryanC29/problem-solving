#include <math.h>

int reverse(int x) {
    int positiveBoundary = pow(2, 31) - 1;
    int negativeBoundary = pow(2, 31) * (-1);
    if (x >= positiveBoundary || x <= negativeBoundary) {
        return 0;
    }
    double num = 0;
    int isNegative = 0;
    if (x < 0) {
        x = x * (-1);
        isNegative = 1;
    }
    while (x > 0) {
        num = (num * 10) + (x % 10);
        x = x / 10;
    }
    if (isNegative) {
        num = num * (-1);
    }
    if (num <= negativeBoundary || num >= positiveBoundary) {
        return 0;
    }
    return num;
}