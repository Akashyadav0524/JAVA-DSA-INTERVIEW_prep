#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {
    int first, second;
    cin >> first >> second;
    
    if (second == 0) {
        cout << first << endl;
    }
    else {
        int ans = first - second;
        int result = ans / (second + 1);
        
        if (ans % (second + 1) != 0) {
            result++;
        }
        
        cout << result << endl;
    }

    return 0;
}
