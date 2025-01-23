class MergeSort() {

    fun mergeSort(array: IntArray): IntArray {
        if (array.size <= 1) return array

        val middle = array.size / 2
        val left = mergeSort(array.sliceArray(0 until middle))
        val right = mergeSort(array.sliceArray(middle until array.size))

        return merge(left, right)
    }

    fun merge(left: IntArray, right: IntArray): IntArray {
        var i = 0
        var j = 0
        val merged = mutableListOf<Int>()

        while (i < left.size && j < right.size) {
            if (left[i] <= right[j]) {
                merged.add(left[i])
                i++
            } else {
                merged.add(right[j])
                j++
            }
        }

        while (i < left.size) {
            merged.add(left[i])
            i++
        }
        while (j < right.size) {
            merged.add(right[j])
            j++
        }

        return merged.toIntArray()
    }
}