

/**
 * Kruscal法. wは昇順になっていることが前提.
 */
fun kruskal(from: IntArray, to: IntArray, w: IntArray): Long {
    val n = from.size
    val uf = UnionFind(n)
    var ret = 0L
    for (i in 0..n - 1) {
        if (!uf.same(from[i], to[i])) {
            uf.union(from[i], to[i])
            ret += w[i]
        }
    }
    return ret
}
