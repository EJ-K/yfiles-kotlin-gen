// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.lang.YFlags

/**
 * An enumeration for use in various properties that can take a bitwise combination of item types that make up an [IGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes">Online Documentation</a>
 */
external class GraphItemTypes 
    private constructor(): YFlags<GraphItemTypes> {
    companion object {
    /**
 * Constant for no item type.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23NONE">Online Documentation</a>
 */
val NONE: GraphItemTypes
/**
 * Constant for nodes.
 * 
 * Value - `1`
 * @see [INode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23NODE">Online Documentation</a>
 */
val NODE: GraphItemTypes
/**
 * Constant for edges.
 * 
 * Value - `2`
 * @see [IEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23EDGE">Online Documentation</a>
 */
val EDGE: GraphItemTypes
/**
 * Constant for node labels.
 * 
 * Value - `4`
 * @see [ILabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23NODE_LABEL">Online Documentation</a>
 */
val NODE_LABEL: GraphItemTypes
/**
 * Constant for edge labels.
 * 
 * Value - `8`
 * @see [ILabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23EDGE_LABEL">Online Documentation</a>
 */
val EDGE_LABEL: GraphItemTypes
/**
 * Constant for ports.
 * 
 * Value - `16`
 * @see [IPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23PORT">Online Documentation</a>
 */
val PORT: GraphItemTypes
/**
 * Constant for all kinds of [ILabelOwner].
 * 
 * Value - `19`
 * @see [ILabelOwner]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23LABEL_OWNER">Online Documentation</a>
 */
val LABEL_OWNER: GraphItemTypes
/**
 * Constant for port labels.
 * 
 * Value - `32`
 * @see [ILabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23PORT_LABEL">Online Documentation</a>
 */
val PORT_LABEL: GraphItemTypes
/**
 * Constant for all kinds of labels.
 * 
 * Value - `44`
 * @see [ILabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23LABEL">Online Documentation</a>
 */
val LABEL: GraphItemTypes
/**
 * Constant for edge bends.
 * 
 * Value - `64`
 * @see [IBend]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23BEND">Online Documentation</a>
 */
val BEND: GraphItemTypes
/**
 * Constant for all item types.
 * 
 * Value - `127`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23ALL">Online Documentation</a>
 */
val ALL: GraphItemTypes
/**
 * Determines whether the specified items collection contains any of the types described by `types`.
 * @param [types] The types.
 * @param [items] The items.
 * @return `true` if the specified items contains any of the types; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23GraphItemTypes-defaultmethod-enumerableContainsTypes">Online Documentation</a>
 */
   fun enumerableContainsTypes( types: GraphItemTypes ,
 items: IEnumerable<IModelItem> ):Boolean
/**
 * Determines whether the specified items collection contains none of the types described by `types`.
 * @param [types] The types.
 * @param [items] The items.
 * @return `true` if the specified items contains none of the types; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23GraphItemTypes-defaultmethod-enumerableNotContainsTypes">Online Documentation</a>
 */
   fun enumerableNotContainsTypes( types: GraphItemTypes ,
 items: IEnumerable<IModelItem> ):Boolean
/**
 * Gets the type of the item.
 * @param [item] The item.
 * @return The type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23GraphItemTypes-defaultmethod-getItemType">Online Documentation</a>
 */
   fun getItemType( item: IModelItem? ):GraphItemTypes
/**
 * Determines the types of the items contained in the collection of items.
 * @param [items] The items.
 * @return The types of the items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23GraphItemTypes-defaultmethod-getItemTypes">Online Documentation</a>
 */
   fun getItemTypes( items: IEnumerable<IModelItem> ):GraphItemTypes
/**
 * Determines whether the `item` is of the specified `types`.
 * @param [types] The type.
 * @param [item] The item.
 * @return `true` if the `item` is of the specified `types`; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphItemTypes%23GraphItemTypes-defaultmethod-itemIsOfTypes">Online Documentation</a>
 */
   fun itemIsOfTypes( types: GraphItemTypes ,
 item: IModelItem? ):Boolean

    }
}
