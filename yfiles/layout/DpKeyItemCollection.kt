// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.DpKeyBase
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * An item collection that allows to specify the data provider key the collection is registered with.
 * @param [T] The type of the items in the collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyItemCollection">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyItemCollection%23DpKeyItemCollection-constructor-DpKeyItemCollection">Online Documentation</a>
 */
external open class DpKeyItemCollection<T : IModelItem>  () : ItemCollection<T> {

/**
 * Gets or sets the data provider key that is used for the item collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DpKeyItemCollection%23dpKey">Online Documentation</a>
 */
final var dpKey: DpKeyBase<*, Boolean>?

companion object : ClassMetadata<DpKeyItemCollection<*>> {
}
}
