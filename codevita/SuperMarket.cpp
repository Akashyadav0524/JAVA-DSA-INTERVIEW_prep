#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int placementlelo(int n, int m, vector<pair<int, int>>& dealer, vector<pair<int, int>>& x) {
    sort(dealer.rbegin(), dealer.rend());
    sort(x.rbegin(), x.rend());

    int b = 0;
    int i = 0;

    for (const auto& c : dealer) {
        while (i < m && x[i].second > c.second) {
            i++;
        }

        if (i < m && x[i].first >= c.first) {
            b++;
            i++;
        }
    }

    return b;
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<pair<int, int>> dealer(n);
    for (int i = 0; i < n; i++) {
        cin >> dealer[i].first >> dealer[i].second;
    }

    vector<pair<int, int>> x(m);
    for (int i = 0; i < m; i++) {
        cin >> x[i].first >> x[i].second;
    }

    int ans = placementlelo(n, m, dealer, x);
    cout << ans << endl;

    return 0;
}
