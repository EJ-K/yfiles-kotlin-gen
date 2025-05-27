// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.InterfaceMetadata

/**
 * A read-write list- or array-like collection of objects of the same type.
 * @param [T] The type of objects in the list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList">Online Documentation</a>
 */
external interface IList<T> : ICollection<T> {
  /**
   * Gets the item at the given index.
   * @param [index] The index of the item to access.
   * @return The item at the given index.
   * @see [set]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-method-get">Online Documentation</a>
   */
  operator fun get(
    index: Int,
  ): T
  
  /**
   * Inserts the given `item` at the given `index`.
   * @param [index] The index to insert the item at.
   * @param [item] The item to insert.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-method-insert">Online Documentation</a>
   */
  fun insert(
    index: Int,
    item: T,
  )
  
  /**
   * Removes and returns the last value in this list.
   * @return The removed value. `undefined` if the list was empty.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-defaultmethod-pop">Online Documentation</a>
   */
  final fun pop(): T = definedExternally
  
  /**
   * Adds one or more elements to this list and returns the new length.
   * @param [values] The values to append to the list.
   * @return The new length of the list.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-defaultmethod-push">Online Documentation</a>
   */
  final fun push(
    vararg values: T,
  ): Int = definedExternally
  
  /**
   * Removes the item at the given index from the list.
   * @param [index] The index of the item to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-method-removeAt">Online Documentation</a>
   */
  fun removeAt(
    index: Int,
  )
  
  /**
   * Sets the item at the given index.
   * @param [index] The index of the item to access.
   * @param [value] The item at the given index.
   * @see [get]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-method-set">Online Documentation</a>
   */
  operator fun set(
    index: Int,
    value: T,
  )
  
  /**
   * Removes and returns the first value in this list.
   * @return The removed value. `undefined` if the list was empty.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-defaultmethod-shift">Online Documentation</a>
   */
  final fun shift(): T = definedExternally
  
  /**
   * Adds one or more elements to the beginning of this list and returns the new length.
   * @param [values] The values to prepend to this list. The first argument will become the new first element in the list
   * @return The new length of the list.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IList%23IList-defaultmethod-unshift">Online Documentation</a>
   */
  final fun unshift(
    vararg values: T,
  ): Int = definedExternally

  
  companion object : InterfaceMetadata<IList<*>> {
  }
}
