// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Provides a way to define a mapping from a collection of items to a common value for each item for usage in conjunction with class [LayoutData].
 * @param [TItem] The type of the items that are mapped.
 * @param [TValue] The type of the values the items are mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollectionMapping">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ItemCollectionMapping].
 * @param [keyType] The type of the items that are mapped.
 * @param [valueType] The type of the values the items are mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollectionMapping%23ItemCollectionMapping-constructor-ItemCollectionMapping">Online Documentation</a>
 */
external open class ItemCollectionMapping<TItem : IModelItem, TValue : Any>  ( keyType: YClass<TItem> ,
 valueType: YClass<TValue> ) : YObject {

/**
 * Adds the specified value which will be associated to all items in the returned item collection.
 * @param [collectionValue] The value the items of the returned collection are mapped to.
 * @return The items that are mapped to the given value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollectionMapping%23ItemCollectionMapping-method-add">Online Documentation</a>
 */
 final   fun add( collectionValue: TValue ):ItemCollection<TItem>

/**
 * Adds the specified value which will be associated to all items in the returned item collection.
 * @param [collectionValue] The value the items of the returned collection are mapped to.
 * @return The items that are mapped to the given value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollectionMapping%23ItemCollectionMapping-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plus( collectionValue: TValue ):ItemCollection<TItem>
/**
 * Clears all mappings that were defined using [add].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollectionMapping%23ItemCollectionMapping-method-clear">Online Documentation</a>
 */
 final   fun clear()

companion object : ClassMetadata<ItemCollectionMapping<*, *>> {
}
}
