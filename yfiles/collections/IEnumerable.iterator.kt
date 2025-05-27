// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.collections

operator fun <T> IEnumerable<T>.iterator(): Iterator<T> =
    EnumeratorIterator(getEnumerator())
    
fun <T> IEnumerable<T>.asSequence(): Sequence<T> =
    iterator().asSequence()

private class EnumeratorIterator<T>(
    private val source: IEnumerator<T>
) : Iterator<T> {

    private var validCurrent = source.moveNext()

    override fun hasNext(): Boolean =
        validCurrent

    override fun next(): T {
        val result = source.current
        validCurrent = source.moveNext()
        return result
    }
}        
