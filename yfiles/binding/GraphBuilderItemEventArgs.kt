// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.collections.ItemEventArgs
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * Event arguments for item events in [GraphBuilder], [AdjacencyGraphBuilder], and [TreeBuilder].
 * @param [TItem] The type of the item contained in the argument.
 * @param [TDataItem] The type of object that the item was created from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilderItemEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [GraphBuilderItemEventArgs] class with the given graph, item, and source object.
 * @param [graph] The graph that can be used to modify `item`.
 * @param [item] The item created from `dataItem`.
 * @param [dataItem] The object `item` was created from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilderItemEventArgs%23GraphBuilderItemEventArgs-constructor-GraphBuilderItemEventArgs">Online Documentation</a>
 */
external open class GraphBuilderItemEventArgs<TItem : IModelItem, TDataItem>  ( graph: IGraph ,
 item: TItem ,
 dataItem: TDataItem? ) : ItemEventArgs<TItem> {

/**
 * Gets the object the [ItemEventArgs.item] has been created from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilderItemEventArgs%23dataItem">Online Documentation</a>
 */
final val dataItem: TDataItem
/**
 * Gets the graph that can be used to modify the [ItemEventArgs.item].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilderItemEventArgs%23graph">Online Documentation</a>
 */
final val graph: IGraph

companion object : ClassMetadata<GraphBuilderItemEventArgs<*, *>> {
}
}
