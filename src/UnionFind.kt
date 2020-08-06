/**
 * UnionFind. 親のparは個数が負で入っている
 */
class UnionFind(size: Int) {
    val par = IntArray(size) { -1 }

    fun same(x: Int, y: Int) = root(x) == root(y)

    fun union(x: Int, y: Int) {
        val rx = root(x)
        val ry = root(y)
        if (rx == ry) return
        par[rx] += par[ry]
        par[ry] = x
    }

    fun root(x: Int): Int {
        if (par[x] < 0) return x
        par[x] = root(par[x])
        return par[x]
    }
}
