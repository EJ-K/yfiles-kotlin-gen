// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.collections.ICollection
import yfiles.lang.YObject

/**
 * Provides utility methods for working with [cursors][ICursor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursors">Online Documentation</a>
 */
external object Cursors {
/**
 * Creates a new cursor that provides a logical view on the concatenation of the two given cursors.
 * @param [c1] - first concatenation argument
 * @param [c2] - second concatenation argument
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursors%23Cursors-method-concatenate">Online Documentation</a>
 */
 final   fun <T : YObject>concatenate( c1: ICursor<T> ,
 c2: ICursor<T> ):ICursor<T>
/**
 * Creates a cursor view of the given collection.
 * @param [c] The collection.
 * @return The cursor view of the given collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursors%23Cursors-method-createCursor">Online Documentation</a>
 */
 final   fun <T : YObject>createCursor( c: ICollection<out T> ):ICursor<T>
/**
 * Creates a cursor view of the given collection.
 * @param [c] The collection.
 * @return an [IEdgeCursor] view of the given collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursors%23Cursors-method-createEdgeCursor">Online Documentation</a>
 */
 final   fun <T : Edge>createEdgeCursor( c: ICollection<out T> ):IEdgeCursor
/**
 * Creates a cursor view of the given collection.
 * @param [c] The collection.
 * @return an [INodeCursor] view of the given collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursors%23Cursors-method-createNodeCursor">Online Documentation</a>
 */
 final   fun <T : Node>createNodeCursor( c: ICollection<out T> ):INodeCursor
/**
 * Creates or fills an array with the values provided by the cursor
 * @param [cursor] the cursor
 * @param [dest] the array to fill with the values or `null` if the method should create the array itself
 * @return dest or a newly created array filled with the values from cursor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cursors%23Cursors-method-toArray">Online Documentation</a>
 */
 final   fun <T : YObject>toArray( cursor: ICursor<T> ,
 dest: Array<in T>  = definedExternally):ReadonlyArray<T>
}
