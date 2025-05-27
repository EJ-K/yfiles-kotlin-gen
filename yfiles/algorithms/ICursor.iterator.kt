// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.algorithms

import yfiles.lang.YObject

operator fun <T : YObject> ICursor<T>.iterator(): Iterator<T> =
    CursorIterator(this)
    
fun <T : YObject> ICursor<T>.asSequence(): Sequence<T> =
    iterator().asSequence()

private class CursorIterator<T : YObject>(
    private val source: ICursor<T>
) : Iterator<T> {
    
    override fun hasNext(): Boolean =
        source.ok

    override fun next(): T {
        val result = source.current
        source.next()
        return result
    }
}        
