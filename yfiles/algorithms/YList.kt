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
import yfiles.collections.IComparer
import yfiles.collections.IEnumerable
import yfiles.collections.IEnumerator
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An implementation of a doubly linked list that provides direct access to the cells that store the elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList">Online Documentation</a>
 * 
 * @constructor Creates an empty doubly linked list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-constructor-YList()">Online Documentation</a>
 */
external open class YList<T : YObject>  () : IList<T> {
/**
 * Creates a list that is initialized with the elements provided by the given Collection object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-constructor-YList(IEnumerable)">Online Documentation</a>
 */
 constructor( c: IEnumerable<T> )
/**
 * Creates a list that is initialized with the elements provided by the given YCursor object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-constructor-YList(ICursor)">Online Documentation</a>
 */
 constructor( c: ICursor<T> )
/**
 * Creates a list that is initialized with the elements provided by the given array of objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-constructor-YList(Object[])">Online Documentation</a>
 */
 constructor( a: ReadonlyArray<T> )
/**
 * Creates a list that is initialized with those elements from the given YCursor object for which the given data provider returns `true` upon calling its [getBool][IDataProvider.getBoolean] method.
 * @param [c] A cursor providing objects that should be added to this list.
 * @param [predicate] A data provider that acts as a inclusion predicate for each object accessible by the given cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-constructor-YList(ICursor,IDataProvider)">Online Documentation</a>
 */
 constructor( c: ICursor<T> ,
 predicate: IDataProvider<T, Boolean> )

/**
 * Gets the first cell of this list.
 * ### Preconditions
 * - `!isEmpty()`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23firstCell">Online Documentation</a>
 */
final val firstCell: ListCell<T>?
/**
 * Gets the first element of this list.
 * ### Preconditions
 * - `!isEmpty()`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23firstObject">Online Documentation</a>
 */
final val firstObject: T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23isReadOnly">Online Documentation</a>
 */
final override val isReadOnly: Boolean
/**
 * Gets the last cell of this list.
 * ### Preconditions
 * - `!isEmpty()`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23lastCell">Online Documentation</a>
 */
final val lastCell: ListCell<T>?
/**
 * Gets the last element of this list.
 * ### Preconditions
 * - `!isEmpty()`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23lastObject">Online Documentation</a>
 */
final val lastObject: T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-add">Online Documentation</a>
 */
 final override   fun add( item: T )
/**
 * Appends all elements provided by the given collection to this list.
 * @return Whether there have been elements appended.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addAll(ICollection)">Online Documentation</a>
 */
 final   fun addAll( collection: ICollection<out T> ):Boolean
/**
 * Appends all elements provided by the given cursor to this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addAll(ICursor)">Online Documentation</a>
 */
 final   fun addAll( c: ICursor<T> )
/**
 * Adds all elements provided by the given collection to this list at the specified position.
 * @param [index] index at which the first element of the specified collection is placed
 * @param [c] the collection that contains the elements to be added
 * @return `true` if this list was changed, `false` otherwise
 * @throws IndexOutOfRangeError if the index is out of range, that is, negative or larger than the size of this list
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addAll(number,ICollection)">Online Documentation</a>
 */
 final   fun addAll( index: Int ,
 c: ICollection<out T> ):Boolean
/**
 * Inserts the given object at the head of this list.
 * @return The newly created ListCell object that stores the given object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addFirst">Online Documentation</a>
 */
 final   fun addFirst( o: T ):ListCell<T>
/**
 * Adds a formerly removed [ListCell] object at the head of this list.
 * @param [cell] A list cell which is not part of any list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addFirstCell">Online Documentation</a>
 */
 final   fun addFirstCell( cell: ListCell<T> )
/**
 * Inserts the given object at the tail of this list.
 * @return The newly created ListCell object that stores the given object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addLast">Online Documentation</a>
 */
 final   fun addLast( o: T ):ListCell<T>
/**
 * Adds a formerly removed [ListCell] object at the tail of this list.
 * @param [cell] A list cell which is not part of any list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-addLastCell">Online Documentation</a>
 */
 final   fun addLastCell( cell: ListCell<T> )
/**
 * Removes all elements from this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-clear">Online Documentation</a>
 */
 final override   fun clear()
/**
 * Whether or not this list contains all the elements in the given collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-containsAll">Online Documentation</a>
 */
 final   fun containsAll( collection: ICollection<out T> ):Boolean
/**
 * Copies the elements of this collection to an array, starting at the specified array index.
 * @param [array] The one-dimensional array that is the destination of the elements copied from this collection.
 * @param [arrayIndex] The zero-based index in `array` at which copying begins.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-copyTo">Online Documentation</a>
 */
 final override   fun copyTo( array: Array<in T> ,
 arrayIndex: Int )
/**
 * Returns a cursor for this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-cursor">Online Documentation</a>
 */
 final   fun cursor():ICursor<T>
/**
 * Returns the cyclic predecessor cell of the given list cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-cyclicPred">Online Documentation</a>
 */
 final   fun cyclicPred( c: ListCell<T> ):ListCell<T>
/**
 * Returns the cyclic successor cell of the given list cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-cyclicSucc">Online Documentation</a>
 */
 final   fun cyclicSucc( c: ListCell<T> ):ListCell<T>
/**
 * Returns the [ListCell] where object `o` is stored.
 * @return the ListCell that contains the element or `null` if no such ListCell was found
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-findCell">Online Documentation</a>
 */
 final   fun findCell( o: T ):ListCell<T>?
/**
 * Gets the element at the specified index.
 * @param [index] The zero-based index of the element to get or set.
 * @return The element at the specified index.
 * @see [set]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-get">Online Documentation</a>
 */
 override  operator fun get( index: Int ):T
/**
 * Gets the cell at the given index.
 * @param [index] the zero-based index of the cell in this list.
 * @return The cell.
 * @throws IndexOutOfRangeError if the index is negative or greater or equal than the [size]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-getCell">Online Documentation</a>
 */
 final   fun getCell( index: Int ):ListCell<T>
/**
 * Returns an enumerator that iterates through this collection.
 * @return An [IEnumerator] that can be used to iterate through this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-getEnumerator">Online Documentation</a>
 */
 override   fun getEnumerator():IEnumerator<T>
/**
 * Returns the element stored in the given list cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-getInfo">Online Documentation</a>
 */
 final   fun getInfo( c: ListCell<T> ):T?
/**
 * Inserts the given `element` into this list at the given `index`.
 * @param [index] The index that specifies the insertion position.
 * @param [item] The element to insert.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-insert">Online Documentation</a>
 */
 final override   fun insert( index: Int ,
 item: T )
/**
 * Inserts the given object into this list with respect to a given reference list cell.
 * ### Preconditions
 * - `refCell` must be part of this list.
 * @param [o] The object to be inserted.
 * @param [refCell] The list cell used to reference the position.
 * @return The newly created ListCell object that stores object `o`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-insertAfter">Online Documentation</a>
 */
 final   fun insertAfter( o: T ,
 refCell: ListCell<T>? ):ListCell<T>
/**
 * Inserts the given object into this list with respect to a given reference list cell.
 * ### Preconditions
 * - `refCell` must be part of this list.
 * @param [o] The object to be inserted.
 * @param [refCell] The list cell used to reference the position.
 * @return The newly created ListCell object that stores object `o`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-insertBefore">Online Documentation</a>
 */
 final   fun insertBefore( o: T ,
 refCell: ListCell<T>? ):ListCell<T>
/**
 * Inserts a formerly removed [ListCell] object into this list with respect to a given reference list cell.
 * ### Preconditions
 * - `refCell` must be part of this list.
 * @param [cellToInsert] A list cell which is not part of any list.
 * @param [refCell] The list cell used to reference the position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-insertCellAfter">Online Documentation</a>
 */
 final   fun insertCellAfter( cellToInsert: ListCell<T> ,
 refCell: ListCell<T>? )
/**
 * Inserts a formerly removed [ListCell] object into this list with respect to a given reference list cell.
 * ### Preconditions
 * - `refCell` must be part of this list.
 * @param [cellToInsert] A list cell which is not part of any list.
 * @param [refCell] The list cell used to reference the position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-insertCellBefore">Online Documentation</a>
 */
 final   fun insertCellBefore( cellToInsert: ListCell<T> ,
 refCell: ListCell<T>? )
/**
 * Checks whether this list contains elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-isEmpty">Online Documentation</a>
 */
 final   fun isEmpty():Boolean
/**
 * Returns the zero-based index of the last occurence of the given element in this list.
 * @param [o] The element.
 * @return The zero-based index of the last occurence of the given element in this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-lastIndexOf">Online Documentation</a>
 */
 final   fun lastIndexOf( o: T ):Int
/**
 * Equivalent to [firstObject].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-peek">Online Documentation</a>
 */
 final   fun peek():T?
/**
 * Returns the predecessor cell of the given list cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-predCell">Online Documentation</a>
 */
 final   fun predCell( c: ListCell<T> ):ListCell<T>?
/**
 * Removes the given object from this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-remove">Online Documentation</a>
 */
 final override   fun remove( item: T ):Boolean
/**
 * Removes the given collection of objects from this list.
 * @return Whether there have been elements removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-removeAll">Online Documentation</a>
 */
 final   fun removeAll( collection: ICollection<out T> ):Boolean
/**
 * Removes the element at the position specified by the given `index`.
 * @param [index] The index that specifies the element to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-removeAt">Online Documentation</a>
 */
 final override   fun removeAt( index: Int )
/**
 * Removes the element pointed to by the given YCursor object.
 * ### Preconditions
 * - The given cursor has been created by a call to this list's [cursor] method and the element pointed to by it is contained in this list.
 * @return The removed element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-removeAtCursor">Online Documentation</a>
 */
 final   fun removeAtCursor( c: ICursor<T> ):T?
/**
 * Removes the given list cell, and hence the element stored in it, from this list.
 * ### Preconditions
 * - The given list cell is part of this list.
 * @return The element that is stored in the removed cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-removeCell">Online Documentation</a>
 */
 final   fun removeCell( c: ListCell<T> ):T?
/**
 * Retains only those elements in this list which are contained in the given collection.
 * @return Whether there have been elements removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-retainAll">Online Documentation</a>
 */
 final   fun retainAll( collection: ICollection<out T> ):Boolean
/**
 * Reverses the sequence of elements in this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-reverse">Online Documentation</a>
 */
 final   fun reverse()
/**
 * Sets the element at the specified index.
 * @param [index] The zero-based index of the element to get or set.
 * @param [value] The element at the specified index.
 * @see [get]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-set">Online Documentation</a>
 */
 override  operator fun set( index: Int ,
 value: T )
/**
 * Updates the element stored in the given list cell with the given object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-setInfo">Online Documentation</a>
 */
 final   fun setInfo( c: ListCell<T> ,
 value: T )
/**
 * Sorts the elements in this list into ascending order, according to their natural ordering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-sort()">Online Documentation</a>
 */
 final   fun sort()
/**
 * Sorts the elements in this list according to the given comparator.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-sort(IComparer)">Online Documentation</a>
 */
 final   fun sort( comparer: IComparer<T> )
/**
 * Transfers the contents of the given list to the end of this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-splice">Online Documentation</a>
 */
 final   fun splice( list: YList<T> )
/**
 * Returns the successor cell of the given list cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YList%23YList-method-succCell">Online Documentation</a>
 */
 final   fun succCell( c: ListCell<T> ):ListCell<T>?

companion object : ClassMetadata<YList<*>> {
}
}
