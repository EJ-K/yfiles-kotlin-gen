// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.ICollection
import yfiles.collections.IEnumerator
import yfiles.collections.IListEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents an ordered or unordered collection of [IModelItem][yfiles.graph.IModelItem]s that is part of a result of running a graph analysis algorithm.
 * @param [T] The type of items in this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemCollection">Online Documentation</a>
 */
external  class ResultItemCollection<T : YObject> 
private constructor () : IListEnumerable<T> {

/**
 * Determines whether a given `item` is contained in this collection.
 * @param [item] The item to look for.
 * @return `true` if `item` is contained in this collection, `false` if not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemCollection%23ResultItemCollection-method-contains">Online Documentation</a>
 */
 final  operator fun contains( item: T ):Boolean
/**
 * Copies the contents of this collection to another collection.
 * @param [collection] The collection to add the items from this collection to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemCollection%23ResultItemCollection-method-copyTo">Online Documentation</a>
 */
 final   fun copyTo( collection: ICollection<in T> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemCollection%23ResultItemCollection-method-get">Online Documentation</a>
 */
 override  operator fun get( index: Int ):T
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResultItemCollection%23ResultItemCollection-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<T>

companion object : ClassMetadata<ResultItemCollection<*>> {
}
}
