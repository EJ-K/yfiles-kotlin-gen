// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import js.array.ReadonlyArray
import yfiles.lang.InterfaceMetadata

/**
 * Defines methods to manipulate a collection of objects with the same type.
 * @param [T] The type of the elements in the collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection">Online Documentation</a>
 */
external interface ICollection<T> : IEnumerable<T> {
  /**
   * Whether this collection is read-only.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23isReadOnly">Online Documentation</a>
   */
  val isReadOnly: Boolean
  
  /**
   * Adds the given `item` to the collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23ICollection-method-add">Online Documentation</a>
   */
  fun add(
    item: T,
  )
  
  /**
   * Adds the given `item` to the collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23ICollection-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    item: T,
  ): Unit = definedExternally
  
  /**
   * Removes all items from this collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23ICollection-method-clear">Online Documentation</a>
   */
  fun clear()
  
  /**
   * Copies all elements of this collection into the given array.
   * @param [array] The array to copy the elements to.
   * @param [arrayIndex] The index in the given array where the first element should be copied to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23ICollection-method-copyTo">Online Documentation</a>
   */
  fun copyTo(
    array: Array<in T>,
    arrayIndex: Int,
  )
  
  /**
   * Removes the given `item` from this collection.
   * @param [item] The item to remove.
   * @return Whether the item was removed from the collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23ICollection-method-remove">Online Documentation</a>
   */
  fun remove(
    item: T,
  ): Boolean
  
  /**
   * Removes the given `item` from this collection.
   * @param [item] The item to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICollection%23ICollection-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    item: T,
  ): Unit = definedExternally

  
  companion object : InterfaceMetadata<ICollection<*>> {
  }
}
