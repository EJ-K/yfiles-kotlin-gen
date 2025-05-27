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
import yfiles.lang.ClassMetadata
import yfiles.lang.Predicate

/**
 * Default implementation of [IList].
 * @param [T] The type of the list's elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-constructor-List()">Online Documentation</a>
 */
external open class List<T>  () : IList<T>, IListEnumerable<T> {
/**
 * Creates a new instance and fills it with the elements of the given `enumerable`.
 * @param [enumerable] The enumerable to fill the list with.
 * @param [mapFunction] The optional function to call for each element to map the generate the elements in the newly created list. The first argument is the element, the second one the index and the third one is the `enumerable` itself (after possible conversion).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-constructor-List(IEnumerable,Selector,Object)">Online Documentation</a>
 */
 constructor( enumerable: IEnumerable<T> ,
 mapFunction: Selector<T, T>?  = definedExternally)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23isReadOnly">Online Documentation</a>
 */
override val isReadOnly: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-add">Online Documentation</a>
 */
 final override   fun add( item: T )
/**
 * Adds the elements of the given collection to this list.
 * @param [enumerable] The collection to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-addRange">Online Documentation</a>
 */
 final   fun addRange( enumerable: IEnumerable<T> )
/**
 * Searches the (sorted) list for the given `item`.
 * @param [item] The item to search for.
 * @param [comparer] The comparer to use for comparing the elements.
 * @return The index of the item in the list. -1 if the item is not found.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-binarySearch">Online Documentation</a>
 */
 final   fun binarySearch( item: T ,
 comparer: IComparer<T> ):Int
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-clear">Online Documentation</a>
 */
 final override   fun clear()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-copyTo">Online Documentation</a>
 */
 final override   fun copyTo( array: Array<in T> ,
 arrayIndex: Int )
/**
 * Shallow copies part of this list to another location in the same list and returns it.
 * @param [target] Index at which to copy the sequence to. If negative `target` will be counted from the end.
 * @param [begin] Index at which to start copying from, `0` if omitted. If negative `begin` will be counted from the end.
 * @param [end] The index of the element after the last element at which to end copying elements from. Defaults to the length of this list. If negative `end` will be counted from the end.
 * @return A new, shallow, independent copy of this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-copyWithin">Online Documentation</a>
 */
 final   fun copyWithin( target: Int ,
 begin: Int  = definedExternally,
 end: Int  = definedExternally):List<T>
/**
 * Fills the elements in this list from the `start` to the `end` index with `value`.
 * @param [value] The value to fill the elements with
 * @param [start] The index of the first cell in the list to fill with the value. `0` if not provided and `size+start` if negative.
 * @param [end] The index after the last cell in the list to fill with the value. `size-1` if not provided and `size+end` if negative.
 * @return The list itself for method chaining.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-fill">Online Documentation</a>
 */
 final   fun fill( value: T ,
 start: Int  = definedExternally,
 end: Int  = definedExternally):List<T>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-get">Online Documentation</a>
 */
 override  operator fun get( index: Int ):T
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<T>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-insert">Online Documentation</a>
 */
 final override   fun insert( index: Int ,
 item: T )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-remove">Online Documentation</a>
 */
 final override   fun remove( item: T ):Boolean
/**
 * Removes all elements for which `match` returns `true`.
 * @param [match] A predicate function with the signature `function(o:Object):boolean` which returns `true` if o matches the conditions of the element to search for.
 * @return The number of elements which were removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-removeAll">Online Documentation</a>
 */
 final   fun removeAll( match: Predicate<T> ):Int
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-removeAt">Online Documentation</a>
 */
 final override   fun removeAt( index: Int )
/**
 * Removes a given `count` of elements starting from the given `index`.
 * @param [index] The index of the first element to remove.
 * @param [count] The number of elements to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-removeRange">Online Documentation</a>
 */
 final   fun removeRange( index: Int ,
 count: Int )
/**
 * Reverses the order of the elements in this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-reverse">Online Documentation</a>
 */
 final   fun reverse()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-set">Online Documentation</a>
 */
 override  operator fun set( index: Int ,
 value: T )
/**
 * Returns a shallow copy of a portion of this list in the form of a new and independent list.
 * @param [begin] The start index for the copy, `0` if omitted
 * @param [end] The index of the element after the last element that will be copied. If omitted, the
 * @return A new, shallow, independent copy of this list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-slice">Online Documentation</a>
 */
 final   fun slice( begin: Int  = definedExternally,
 end: Int  = definedExternally):List<T>
/**
 * Sorts all elements in list using the default comparer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-sort()">Online Documentation</a>
 */
 final   fun sort()
/**
 * Sorts all elements in the list using the given `comparer`.
 * @param [comparer] The comparer to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-sort(IComparer)">Online Documentation</a>
 */
 final   fun sort( comparer: IComparer<T> )
/**
 * Sorts all elements in the list using the given `comparison` function.
 * @param [comparison] The optional comparison function to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-sort(ElementComparison)">Online Documentation</a>
 */
 final   fun sort( comparison: ElementComparison<T> )
/**
 * Alters the contents of this list like JavaScript's `Array.splice()` method.
 * @param [start] The index into the list at which elements should be removed and inserted.
 * @param [deleteCount] The number of items to remove starting at `start`. If omitted all elements after `start` will be removed.
 * @param [items] The items to insert. If omitted, no items will be added.
 * @return The elements that have been removed in the form of a [List].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-splice">Online Documentation</a>
 */
 final   fun splice( start: Int ,
 deleteCount: Int  = definedExternally,
vararg  items: T ):List<T>

companion object : ClassMetadata<List<*>> {
/**
 * Creates a new list similar in behavior to `Array.from()`.
 * @param [T] The type of the list's elements.
 * @param [enumerable] The enumerable to fill the list with.
 * @param [mapFunction] The optional function to call for each element to map the generate the elements in the newly created list
 * @return A new [List] initialized with the values of the given enumerable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-from">Online Documentation</a>
 */
 final   fun <TSource, T>from( enumerable: IEnumerable<TSource> ,
 mapFunction: Selector<TSource, T>?  = definedExternally):List<T>
/**
 * Creates a new list with the given array used as the live backing store.
 * @param [T] The type of the list's elements.
 * @param [array] The array to create a list view over from.
 * @return A list backed by the given array.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/List%23List-method-fromArray">Online Documentation</a>
 */
 final   fun <T>fromArray( array: ReadonlyArray<T> ):List<T>
}
}
