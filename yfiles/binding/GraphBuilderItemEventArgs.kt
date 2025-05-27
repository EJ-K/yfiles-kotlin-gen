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
 * 
 * @property graph
 * Gets the graph that can be used to modify the [item][ItemEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilderItemEventArgs%23graph">Online Documentation</a>
 * 
 * @property dataItem
 * Gets the object the [item][ItemEventArgs] has been created from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilderItemEventArgs%23dataItem">Online Documentation</a>
 */
external class GraphBuilderItemEventArgs<TItem, TDataItem> (
final val graph: IGraph,
item: TItem,
final val dataItem: TDataItem) : ItemEventArgs<TItem> {
  
  companion object : ClassMetadata<GraphBuilderItemEventArgs<*, *>> {
  }
}
